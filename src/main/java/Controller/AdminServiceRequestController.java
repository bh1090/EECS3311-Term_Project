package Controller;

import java.util.ArrayList;

import Model.ServiceRequest;
import Service.EditMaintenanceRequestService;
import Service.SubmitServiceRequestService;
import Service.getMaintenanceRequestService;
import View.AdminServiceRequestsListView;

public final class AdminServiceRequestController {

     private static AdminServiceRequestController instance = null;
     private int roomID;

     public AdminServiceRequestController(){};
 
     public ArrayList<ServiceRequest> handleServiceRequestListCompilation(){
          getMaintenanceRequestService maintenanceService = getMaintenanceRequestService.getInstance();
          ArrayList<ServiceRequest> requests = maintenanceService.getServiceRequests(this.roomID, true);
          requests.addAll(maintenanceService.getServiceRequests(this.roomID, false));
          View.AdminServiceRequestsListView view = View.AdminServiceRequestsListView.getInstance();
          view.displayRequests(requests);
          return requests;
     }

     public static AdminServiceRequestController getInstance(){
          if (instance == null){
               instance = new AdminServiceRequestController();
          }    
          return instance;
     }

     public void setRoomID(int roomID) {
          this.roomID = roomID;
     }

    public void handleAddServiceRequest(String description, boolean isEssential, String sensorId){
        // Assuming roomID is already set
        String sensorID = convertSensorId(sensorId);
        SubmitServiceRequestService.getInstance().submitServiceRequest(this.roomID, description, isEssential, sensorID);
        handleServiceRequestListCompilation(); 
    }

    public void promoteServiceRequest(int requestId, String description, String sensorId){
        EditMaintenanceRequestService editService = EditMaintenanceRequestService.getInstance();
        String sensorID = convertSensorId(sensorId);
        editService.promoteServiceRequest(requestId, description, "To-Do", this.roomID, sensorID);
        handleServiceRequestListCompilation(); 
    }

    /**
     * Converts a sensorId of "N/A" to "-1", otherwise returns the original sensorId.
     */
    private static String convertSensorId(String sensorId) {
        if ("N/A".equals(sensorId)) {
            return "-1";
        } else {
            return sensorId;
        }
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
               java.util.logging.Logger.getLogger(AdminServiceRequestController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          }
    
          java.awt.EventQueue.invokeLater(() -> {
          
               AdminServiceRequestController controller = AdminServiceRequestController.getInstance();

               controller.setRoomID(2);

               controller.handleServiceRequestListCompilation();

               AdminServiceRequestsListView view = AdminServiceRequestsListView.getInstance();
               view.setVisible(true);
          });
      }
}


