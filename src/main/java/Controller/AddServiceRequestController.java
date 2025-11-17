package Controller;

import Model.ServiceRequest;
import Service.SubmitServiceRequestService;

public class AddServiceRequestController {
     final SubmitServiceRequestService submitServiceRequest;

     public AddServiceRequestController(SubmitServiceRequestService submitServiceRequest) {
          this.submitServiceRequest = submitServiceRequest;
     }

     public void handleServiceRequestSubmission(String roomID, String description, boolean isEssential){
          ServiceRequest sr = submitServiceRequest.submit(roomID, description, isEssential);
     }
}
