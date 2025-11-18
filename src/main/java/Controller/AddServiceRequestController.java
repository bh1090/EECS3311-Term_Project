package Controller;

import Model.ServiceRequest;
import Service.SubmitServiceRequestService;

public class AddServiceRequestController {
     final SubmitServiceRequestService submitServiceRequestService;

     public AddServiceRequestController(SubmitServiceRequestService submitServiceRequest) {
          this.submitServiceRequestService = submitServiceRequest;
     }

     public void handleServiceRequestSubmission(int roomID, String description, boolean isEssential){
          ServiceRequest sr = submitServiceRequestService.submit(roomID, description, isEssential);
     }
}
