package Controller;

import java.util.ArrayList;

import Model.ServiceRequest;
import Service.EditMaintenanceRequestService;
import Service.getMaintenanceRequestService;
import View.MaintenanceServiceRequestsListView;

public final class MaintenanceServiceRequestController {

     private static MaintenanceServiceRequestController instance = null;
     private int roomID;

     public MaintenanceServiceRequestController(){};
 
     public ArrayList<ServiceRequest> handleServiceRequestListCompilation(){
          getMaintenanceRequestService maintenanceService = getMaintenanceRequestService.getInstance();
          ArrayList<ServiceRequest> requests = maintenanceService.getServiceRequests(this.roomID, true);
          View.MaintenanceServiceRequestsListView view = View.MaintenanceServiceRequestsListView.getInstance();
          view.displayRequests(requests);
          return requests;
     }

     public static MaintenanceServiceRequestController getInstance(){
          if (instance == null){
               instance = new MaintenanceServiceRequestController();
          }    
          return instance;
     }

     public void setRoomID(int roomID) {
          this.roomID = roomID;
     }

     public void updateMaintenanceRequestStatus(int requestId, String newStatus, String description){
          EditMaintenanceRequestService editService = EditMaintenanceRequestService.getInstance();
          editService.update(requestId, description, newStatus, true, roomID);
     }

     public static void main(String args[]) {

          try {
               for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                    if ("Nimbus".equals(info.getName())) {
                         javax.swing.UIManager.setLookAndFeel(info.getClassName());
                         break;
                    }
               }
          } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
               java.util.logging.Logger.getLogger(MaintenanceServiceRequestController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          }

          java.awt.EventQueue.invokeLater(() -> {
  
               MaintenanceServiceRequestController controller =
                         MaintenanceServiceRequestController.getInstance();

               controller.setRoomID(2);

               controller.handleServiceRequestListCompilation();

               MaintenanceServiceRequestsListView.getInstance().setVisible(true);
          });
      }
}


