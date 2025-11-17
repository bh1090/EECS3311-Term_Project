package View;

public class ServiceRequestsListView {
     final MaintenanceServiceRequestController maintenanceServiceRequestController;
     final AdminServiceRequestController adminServiceRequestController;

     public ServiceRequestsListView(MaintenanceServiceRequestController maintenanceServiceRequestController, AdminServiceRequestController adminServiceRequestController) {
          this.maintenanceServiceRequestController = maintenanceServiceRequestController;
          this.adminServiceRequestController = adminServiceRequestController;
     }

     public void getMaintenanceUserInput(){
          Scanner sc = new Scanner(System.in);

          System.out.print("Select service request: ");
          // Some code that grabs both essential and non-essential
          // list of service requests from a given room.  For now, use placeholder.
          ServiceRequest serviceRequest = null;
          System.out.print("Enter the status update: ");
          String statusUpdate = sc.nextLine();

          System.out.print("Enter whether or not it is essential:");
          boolean isEssential = sc.nextBoolean();

          maintenanceServiceRequestController.handleServiceRequestModification(serviceRequest, isEssential);
     }
}
