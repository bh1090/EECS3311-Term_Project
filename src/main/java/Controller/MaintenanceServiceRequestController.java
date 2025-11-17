package Controller;

import Service.EditMaintenanceRequestService;

public class MaintenanceServiceRequestController {
     final EditMaintenanceRequestService editMaintenanceRequestService;

     public MaintenanceServiceRequestController(EditMaintenanceRequestService editMaintenanceRequestService) {
          this.editMaintenanceRequestService = editMaintenanceRequestService;
     }

     public void handleServiceRequestModification(String roomID, String description, boolean isEssential){
          ServiceRequest sr = editMaintenanceRequestService.update(roomID);
     }
}
