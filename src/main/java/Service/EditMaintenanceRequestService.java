package Service;

import EssentialServiceRequest;
import NonEssentialServiceRequest;
import SensorEssentialServiceRequest;
import Repository.ServiceRequestRepository;

public class EditMaintenanceRequestService {
     private static EditMaintenanceRequestService instance = null;
     final ServiceRequestRepository requestRepository;

     public EditMaintenanceRequestService(ServiceRequestRepository requestRepository) {
          this.requestRepository = requestRepository;
     }
     public void update(int serviceRequestID, String description, String status, boolean isEssential, int roomID){
          if(isEssential){
               EssentialServiceRequest essentialServiceRequest = new EssentialServiceRequest(serviceRequestID, description, status, roomID);
               requestRepository.updateExistingServiceRequest(essentialServiceRequest);
          }
          else{
               NonEssentialServiceRequest nonEssentialServiceRequest = new NonEssentialServiceRequest(serviceRequestID, description, status, roomID);
               requestRepository.updateExistingServiceRequest(nonEssentialServiceRequest);
          }
          EvaluateRoomMaintenanceRelationshipService.getInstance().evaluateRoomMaintenanceRelationship(roomID);
     }

     public void promoteServiceRequest(int serviceRequestID, String description, String status, int roomID, String sensorId){
          if(!sensorId.equals("-1")){
               SensorEssentialServiceRequest sensorEssentialServiceRequest = new SensorEssentialServiceRequest(serviceRequestID, description, status, roomID, Integer.parseInt(sensorId));
               requestRepository.updateExistingServiceRequest(sensorEssentialServiceRequest);
          }
          else{
               EssentialServiceRequest essentialServiceRequest = new EssentialServiceRequest(serviceRequestID, description, status, roomID);
               requestRepository.updateExistingServiceRequest(essentialServiceRequest);
          }
          EvaluateRoomMaintenanceRelationshipService.getInstance().evaluateRoomMaintenanceRelationship(roomID);
     }

     public static EditMaintenanceRequestService getInstance(){
          if(instance == null){
               instance = new EditMaintenanceRequestService(ServiceRequestRepository.getInstance());
          }
          return instance;
     }
}
