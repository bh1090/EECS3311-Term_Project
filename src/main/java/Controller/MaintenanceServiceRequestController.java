package Controller;

import Service.EditMaintenanceRequestService;

public class MaintenanceServiceRequestController {
     final EditMaintenanceRequestService editMaintenanceRequestService;

     public MaintenanceServiceRequestController(EditMaintenanceRequestService editMaintenanceRequestService) {
          this.editMaintenanceRequestService = editMaintenanceRequestService;
     }
}
