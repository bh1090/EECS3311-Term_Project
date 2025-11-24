package Repository;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Map;

import Database.Database;

import java.util.List;
import java.util.HashMap;

import Model.EssentialServiceRequest;
import Model.NonEssentialServiceRequest;
import Model.SensorEssentialServiceRequest;
import Model.ServiceRequest;

public final class ServiceRequestRepository {
     private static ServiceRequestRepository instance = null;

     private Map<Integer, List<ServiceRequest>> serviceRequestMap = new HashMap<>();

     private ServiceRequestRepository() {
          serviceRequestMap = parseCsvFileToMap(Database.getInstance().getMaintenanceRequestsCsvPath(), false);
     }

     public ServiceRequest addServiceRequest(ServiceRequest serviceRequest) {
          int roomID = serviceRequest.getRoomID();
          if (!serviceRequestMap.containsKey(roomID)) {
               serviceRequestMap.put(roomID, new ArrayList<>());
          }
          serviceRequestMap.get(roomID).add(serviceRequest);
          saveMapToCsv(serviceRequestMap, Database.getInstance().getMaintenanceRequestsCsvPath());
          return serviceRequest;
     }

     public void updateExistingServiceRequest(ServiceRequest serviceRequest) {
          int index = -1;
          for (int i = 0; i < serviceRequestMap.get(serviceRequest.getRoomID()).size(); i++) {
               if (serviceRequestMap.get(serviceRequest.getRoomID()).get(i).getServiceRequestID() == serviceRequest.getServiceRequestID()) {
                    index = i;
                    break;
               }
          }
          if (index != -1) {
               serviceRequestMap.get(serviceRequest.getRoomID()).set(index, serviceRequest);
               saveMapToCsv(serviceRequestMap, Database.getInstance().getMaintenanceRequestsCsvPath());
          }
     }

     public static ServiceRequestRepository getInstance() {
          if(instance == null) {
               instance = new ServiceRequestRepository();
          }
          return instance;
     }
     public ArrayList<ServiceRequest> loadAllServiceRequestsForRoom(int roomID) {
          return new ArrayList<>(serviceRequestMap.getOrDefault(roomID, new ArrayList<>()));
     }

     public Map<Integer, List<ServiceRequest>> parseCsvFileToMap(String filePath, boolean isSensorData) {

     Map<Integer, List<ServiceRequest>> serviceRequestMap = new HashMap<>();
     String line;

     try (BufferedReader br = new BufferedReader(new java.io.FileReader(filePath))) {

          br.readLine(); 

          while ((line = br.readLine()) != null) {
               String[] values = line.split(",");

               int requestId     = Integer.parseInt(values[0]);  
               int roomId     = Integer.parseInt(values[1]);                  
               boolean isEssential = values[2].trim().equalsIgnoreCase("Essential"); 
               String status     = values[3];                    
               String description = values[4];  
               Integer sensorID = Integer.parseInt(values[5]);                  

               ServiceRequest serviceRequest;
               if(isEssential == false){
                    serviceRequest = new NonEssentialServiceRequest(requestId, description, status, roomId);
               }
               else if (sensorID == -1){
                    serviceRequest = new EssentialServiceRequest(requestId, description, status, roomId);
               }
               else{
                    serviceRequest = new SensorEssentialServiceRequest(requestId, description, status, roomId, sensorID);
                    ((SensorEssentialServiceRequest) serviceRequest).assignRoomID(roomId);
               }
               if (!serviceRequestMap.containsKey(roomId)) {
                    serviceRequestMap.put(roomId, new ArrayList<>());
                    }
               serviceRequestMap.get(roomId).add(serviceRequest);
          }

          return serviceRequestMap;

     } catch (Exception e) {
          e.printStackTrace();
          return null;
     }
     }

     public Integer generateNextId(int roomID) {
        int maxId = 0;
        for (ServiceRequest request : serviceRequestMap.get(roomID)) {
            try {
                // We assumed IDs are numbers like "1", "2", "100", etc
                int currentId = request.getServiceRequestID();
                if (currentId > maxId) {
                    maxId = currentId;
                }
            } catch (NumberFormatException e) {
                // Ignore weird IDs that aren't numbers (just in case)
            }
        }
        return maxId + 1;
    }

     public boolean saveMapToCsv(Map<Integer, List<ServiceRequest>> map, String filePath) {
     try (PrintWriter pw = new PrintWriter(new File(filePath))) {

          pw.println("requestId,roomId,isEssential,status,description,sensorID");

          for (List<ServiceRequest> list : map.values()) {
               for (ServiceRequest request : list) {
                    String isEssential = 
                    (request instanceof EssentialServiceRequest || request instanceof SensorEssentialServiceRequest)
                    ? "Essential" 
                    : "Nonessential";

                    if (request instanceof SensorEssentialServiceRequest) {
                    pw.println(
                         request.getServiceRequestID() + "," +
                         ((SensorEssentialServiceRequest) request).getRoomID() + "," +
                         isEssential + "," +
                         request.getStatus() + "," +
                         request.getDescription() + "," +
                         ((SensorEssentialServiceRequest) request).getSensorID()
                    );
                    } else {
                    pw.println(
                         request.getServiceRequestID() + "," +
                         request.getRoomID() + "," +
                         isEssential + "," +
                         request.getStatus() + "," +
                         request.getDescription() + ",-1"     
                    );
                    }
               }
          }
          return true; 

     } catch (IOException e) {
          e.printStackTrace();
          return false; 
          }    
     }
}