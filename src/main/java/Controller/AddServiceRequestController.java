package Controller;

import Service.SubmitServiceRequestService;

public class AddServiceRequestController {
     final SubmitServiceRequestService submitServiceRequestService;

     public AddServiceRequestController(SubmitServiceRequestService submitServiceRequestService) {
          this.submitServiceRequestService = submitServiceRequestService;
     }
}
