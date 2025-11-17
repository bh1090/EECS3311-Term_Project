package Controller;

import Model.ServiceRequest;
import Service.SubmitServiceRequestService;

public class AddServiceRequestController {
     final SubmitServiceRequestService submitServiceRequestService;

     public AddServiceRequestController(SubmitServiceRequestService submitServiceRequest) {
          this.submitServiceRequestService = submitServiceRequest;
     }

     public void handleServiceRequestSubmission(String roomID, String description, boolean isEssential){
          ServiceRequest sr = submitServiceRequestService.submit(roomID, description, isEssential);
     }
}
