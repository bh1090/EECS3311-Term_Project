package Service;

import Model.EssentialServiceRequest;
import Model.NonEssentialServiceRequest;
import Model.ServiceRequest;
import Repository.ServiceRequestRepository;

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
               EssentialServiceRequest serviceRequest = new EssentialServiceRequest(0, description, "Ongoing");
               return requestRepository.save(serviceRequest);
         }
          else {
               NonEssentialServiceRequest serviceRequest = new NonEssentialServiceRequest(0, description, "Ongoing");
               return requestRepository.save(serviceRequest);
          }
     }
}
