package Service;

import Model.EssentialServiceRequest;
import Model.NonEssentialServiceRequest;
import Model.ServiceRequest;

public class SubmitServiceRequestService {
     final ServiceRequestRepository requestRepository;

     public SubmitServiceRequestService(ServiceRequestRepository requestRepository){
          this.requestRepository = requestRepository;
     }
     public ServiceRequest submit(String roomID, String description, boolean isEssential){
         if(roomID == null || description == null){
              throw new IllegalArgumentException("No room ID and/or no description.  ");
         }
          if(isEssential){
               return new EssentialServiceRequest(0, description, false);
         }
          else{
               return new NonEssentialServiceRequest(0, description);
          }
     }
}
