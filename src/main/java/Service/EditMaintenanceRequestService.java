package Service;

import Model.EssentialServiceRequest;
import Model.NonEssentialServiceRequest;
import Model.ServiceRequest;
import Repository.ServiceRequestRepository;

public class EditMaintenanceRequestService {
     final ServiceRequestRepository requestRepository;

     public EditMaintenanceRequestService(ServiceRequestRepository requestRepository) {
          this.requestRepository = requestRepository;
     }
     public ServiceRequest update(String roomID, String description, boolean isEssential){
          if(roomID == null){
               throw new IllegalArgumentException("No room ID.  ");
          }
          if(isEssential){
               EssentialServiceRequest serviceRequest = new EssentialServiceRequest(0, description, true);
               return requestRepository.update(serviceRequest);
          }
          else{
               NonEssentialServiceRequest serviceRequest = new NonEssentialServiceRequest(0, description);
               return requestRepository.update(serviceRequest);
          }
     }
}
