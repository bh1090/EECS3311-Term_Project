package Service;
import java.util.ArrayList;
import Model.ServiceRequest.ServiceRequest;
import Repository.ServiceRequestRepository;

public final class GetMaintenanceRequestService {
    
    private static GetMaintenanceRequestService instance = null;

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

    public static GetMaintenanceRequestService getInstance(){
        if(instance == null){
            instance = new GetMaintenanceRequestService();
        }
        return instance;
    }   
}
