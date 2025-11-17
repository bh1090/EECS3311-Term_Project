package Controller;

import Model.ServiceRequest;
import Service.EditMaintenanceRequestService;

public class MaintenanceServiceRequestController {
     final EditMaintenanceRequestService editMaintenanceRequestService;

     public MaintenanceServiceRequestController(EditMaintenanceRequestService editMaintenanceRequestService) {
          this.editMaintenanceRequestService = editMaintenanceRequestService;
     }

     public void handleServiceRequestModification(ServiceRequest serviceRequest, boolean isEssential){
          ServiceRequest sr = editMaintenanceRequestService.update(serviceRequest, isEssential);
     }
}
