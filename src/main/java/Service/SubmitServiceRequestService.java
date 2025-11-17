package Service;

import Model.EssentialServiceRequest;
import Model.NonEssentialServiceRequest;
import Model.ServiceRequest;

public class SubmitServiceRequestService {
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
