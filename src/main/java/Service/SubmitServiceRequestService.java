package Service;

import java.util.ArrayList;

import Model.ServiceRequest.EssentialServiceRequest;
import Model.ServiceRequest.NonEssentialServiceRequest;
import Model.ServiceRequest.SensorEssentialServiceRequest;
import Model.ServiceRequest.ServiceRequest;
import Repository.ServiceRequestRepository;

public class SubmitServiceRequestService {
    private static SubmitServiceRequestService instance = null;

    public ArrayList<ServiceRequest> submitServiceRequest(int roomID, String description, boolean isEssential, String sensorId){

        ArrayList<ServiceRequest> serviceRequests = new ArrayList<>();

        ServiceRequestRepository repository = ServiceRequestRepository.getInstance();
        if(isEssential && sensorId.equals("-1")){
               EssentialServiceRequest essentialServiceRequest = new EssentialServiceRequest(repository.generateNextId(roomID), description, "To-do", roomID);
               repository.addServiceRequest(essentialServiceRequest);
          }
          else if(isEssential){
               SensorEssentialServiceRequest sensorEssentialServiceRequest = new SensorEssentialServiceRequest(repository.generateNextId(roomID), description, "To-do", roomID, Integer.parseInt(sensorId));
               repository.addServiceRequest(sensorEssentialServiceRequest);
          }
          else{
               NonEssentialServiceRequest nonEssentialServiceRequest = new NonEssentialServiceRequest(repository.generateNextId(roomID), description, "To-do", roomID);
               repository.addServiceRequest(nonEssentialServiceRequest);
          }
          EvaluateRoomMaintenanceRelationshipService.getInstance().evaluateRoomMaintenanceRelationship(roomID);

        return serviceRequests;
    }

    public static SubmitServiceRequestService getInstance(){
        if(instance == null){
            instance = new SubmitServiceRequestService();
        }
        return instance;
    } 
}
