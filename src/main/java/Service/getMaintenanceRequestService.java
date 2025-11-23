package Service;
import java.util.ArrayList;

import Model.EssentialServiceRequest;
import Model.ServiceRequest;
import Repository.ServiceRequestRepository;

public final class getMaintenanceRequestService {
    
    private static getMaintenanceRequestService instance = null;

    public ArrayList<ServiceRequest> getServiceRequests(int roomID, boolean isEssential){

        ArrayList<ServiceRequest> serviceRequests = new ArrayList<>();

        ServiceRequestRepository repository = ServiceRequestRepository.getInstance();

        ArrayList<ServiceRequest> unfilteredRequests = new ArrayList<>();

        repository.loadAllServiceRequestsForRoom(roomID).forEach(request -> {
            unfilteredRequests.add(request);
        });
        
        for(ServiceRequest request : unfilteredRequests){
            if(isEssential == request.isEssential()){
                serviceRequests.add(request);
            }
        }
        return serviceRequests;
    }

    public static getMaintenanceRequestService getInstance(){
        if(instance == null){
            instance = new getMaintenanceRequestService();
        }
        return instance;
    }   
}
