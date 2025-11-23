package View;

import Controller.AdminServiceRequestController;
import Controller.MaintenanceServiceRequestController;
import Model.ServiceRequest;

import java.util.List;
import javax.swing.*;
import javax.swing.table.*;
import javax.swing.ButtonGroup;
import java.awt.GridLayout;

public class AdminServiceRequestsListView extends javax.swing.JFrame {
 
     private javax.swing.JTable ServiceRequestsList;
     private javax.swing.JPanel jPanel1;
     private javax.swing.JScrollBar jScrollBar1;
     private javax.swing.JScrollPane jScrollPane3;
     private java.awt.Button addNewServiceRequestButton;
     private java.awt.Button promoteToEssentialButton;
                    
     private static AdminServiceRequestsListView instance;

     
     public AdminServiceRequestsListView() {
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
        jScrollBar1 = new javax.swing.JScrollBar();
        addNewServiceRequestButton = new java.awt.Button();
        promoteToEssentialButton = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.BorderLayout());

        ServiceRequestsList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Request ", "Status", "Description", "Is Request Essential?"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(ServiceRequestsList);

        jPanel1.add(jScrollPane3, java.awt.BorderLayout.CENTER);
        jPanel1.add(jScrollBar1, java.awt.BorderLayout.LINE_END);

        addNewServiceRequestButton.setLabel("Add Service Request");
        addNewServiceRequestButton.addActionListener(this::addNewServiceRequestButtonActionPerformed);
        jPanel1.add(addNewServiceRequestButton, java.awt.BorderLayout.PAGE_START);

        promoteToEssentialButton.setLabel("Promote Request to Essential");
        promoteToEssentialButton.addActionListener(this::promoteToEssentialButtonActionPerformed);
        jPanel1.add(promoteToEssentialButton, java.awt.BorderLayout.PAGE_END);

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
               req.isEssential() ? "Yes" : "No"
          });
        }
     }


     private void addNewServiceRequestButtonActionPerformed(java.awt.event.ActionEvent evt){                                             
            JTextField descriptionField = new JTextField(15);
            JTextField sensorIdField = new JTextField(15);

            // Radio buttons
            JRadioButton essentialBtn = new JRadioButton("Essential");
            JRadioButton nonEssentialBtn = new JRadioButton("Nonessential");
            ButtonGroup group = new ButtonGroup();
            group.add(essentialBtn);
            group.add(nonEssentialBtn);

            // Arrange inputs in panel
            JPanel panel = new JPanel();
            panel.setLayout(new GridLayout(0, 1));
            panel.add(new JLabel("Description:"));
            panel.add(descriptionField);
            panel.add(new JLabel("Please enter the sensor ID. If not applicable, enter N/A."));
            panel.add(sensorIdField);
            panel.add(essentialBtn);
            panel.add(nonEssentialBtn);

            int result = JOptionPane.showConfirmDialog(this, panel, "Please provide details for the new service request.", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
                if (result == JOptionPane.OK_OPTION) {
                    if (descriptionField.getText() != null && !descriptionField.getText().trim().isEmpty()) {
                        String description = descriptionField.getText();
                        boolean isEssential = essentialBtn.isSelected();
                        String sensorIdInput = sensorIdField.getText();
                        if(!isEssential && !sensorIdInput.equals("N/A")){
                            JOptionPane.showMessageDialog(this, "Non-essential requests should not have a sensor ID.");
                        }   
                        else{
                            AdminServiceRequestController.getInstance().handleAddServiceRequest(description, isEssential, sensorIdInput);
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Description cannot be empty.");
                    }
                }
     }                                            
     
     private void promoteToEssentialButtonActionPerformed(java.awt.event.ActionEvent evt){                                             
          int row = ServiceRequestsList.getSelectedRow();
          
          if (row >= 0){
               Integer requestId = (Integer) ServiceRequestsList.getValueAt(row, 0);
               String newStatus = (String) ServiceRequestsList.getValueAt(row, 1);
               String description = (String) ServiceRequestsList.getValueAt(row, 2);
               String isEssential = (String) ServiceRequestsList.getValueAt(row, 3);

               if(isEssential.equals("Yes")){
                    JOptionPane.showMessageDialog(this, "The selected request is already essential.");
                    return;
               }
               else{
                    AdminServiceRequestController controller = AdminServiceRequestController.getInstance();
                    if(isEssential.equals("No"))
                        controller.promoteServiceRequest(requestId, description, "N/A");
                }
            }   
          else {
                JOptionPane.showMessageDialog(this, "Please select a request");
            }
     }

     public static AdminServiceRequestsListView getInstance(){
          if(instance == null){
               instance = new AdminServiceRequestsListView();
          }
          return instance;
     }
     
}                 
