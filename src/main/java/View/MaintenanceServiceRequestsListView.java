package View;
import Controller.MaintenanceServiceRequestController;
import Model.ServiceRequest;

import java.util.List;
import javax.swing.*;
import javax.swing.table.*;

public class MaintenanceServiceRequestsListView extends javax.swing.JFrame {
 
     private javax.swing.JTable ServiceRequestsList;
     private javax.swing.JPanel jPanel1;
     private javax.swing.JScrollBar jScrollBar1;
     private javax.swing.JScrollPane jScrollPane3;
     private java.awt.Button updateButton;
                    
     private static MaintenanceServiceRequestsListView instance;
 
     public MaintenanceServiceRequestsListView() {
          initComponents();
          setupDropdown();
     }
     
     private void setupDropdown() {
          String[] statuses = {"To-do", "In Progress", "Completed"};
          TableColumn statusColumn = ServiceRequestsList.getColumnModel().getColumn(1);
          statusColumn.setCellEditor(new DefaultCellEditor(new JComboBox<>(statuses)));
     }
     
     @SuppressWarnings("unchecked")
                              
     private void initComponents() {
          jPanel1 = new javax.swing.JPanel();
          jScrollPane3 = new javax.swing.JScrollPane();
          ServiceRequestsList = new javax.swing.JTable();
          updateButton = new java.awt.Button();
          jScrollBar1 = new javax.swing.JScrollBar();

          setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

          jPanel1.setLayout(new java.awt.BorderLayout());

          ServiceRequestsList.setModel(new javax.swing.table.DefaultTableModel(
               new Object [][] {
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null}
               },
               new String [] {
                    "Request ", "Status", "Description"
               }
          ) {
               Class[] types = new Class []{
                    java.lang.Integer.class, java.lang.String.class, java.lang.String.class
               };

               @Override
               public Class getColumnClass(int columnIndex){
                    return types [columnIndex];
               }
          });
          
          jScrollPane3.setViewportView(ServiceRequestsList);

          jPanel1.add(jScrollPane3, java.awt.BorderLayout.CENTER);

          updateButton.setLabel("Update Status");
          updateButton.addActionListener(this::updateButtonActionPerformed);
          jPanel1.add(updateButton, java.awt.BorderLayout.PAGE_END);
          jPanel1.add(jScrollBar1, java.awt.BorderLayout.LINE_END);

          javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
          getContentPane().setLayout(layout);
          layout.setHorizontalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          );
          layout.setVerticalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          );

          pack();
     }              

     public void displayRequests(List<ServiceRequest> list) {
     DefaultTableModel model = (DefaultTableModel) ServiceRequestsList.getModel();
     model.setRowCount(0);  

     for (ServiceRequest req : list) {
          model.addRow(new Object[]{
               req.getServiceRequestID(),           
               req.getStatus(),
               req.getDescription(),
          });
     }
     }


     private void updateButtonActionPerformed(java.awt.event.ActionEvent evt){                                             
          int row = ServiceRequestsList.getSelectedRow();
          
          if (row >= 0){
               Integer requestId = (Integer) ServiceRequestsList.getValueAt(row, 0);
               String newStatus = (String) ServiceRequestsList.getValueAt(row, 1);
               String description = (String) ServiceRequestsList.getValueAt(row, 2);
               
               MaintenanceServiceRequestController controller = MaintenanceServiceRequestController.getInstance();
               controller.updateMaintenanceRequestStatus(requestId, newStatus, description);
          }
          else {
                    JOptionPane.showMessageDialog(this, "Please select a request");
                         }
     }                                            
     
     public static MaintenanceServiceRequestsListView getInstance(){
          if(instance == null){
               instance = new MaintenanceServiceRequestsListView();
          }
          return instance;
     }

}                 
