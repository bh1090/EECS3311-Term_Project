package Controller;

import Application.*;
import Model.User.User;
import Service.*;
import View.*;

import javax.swing.*;

public class LoginViewController {

    private  LoginView view;
    private  AuthenticationService authService;
    private  AppNavigator navigator;
    private final RoomService roomService;
    private final UserService userService;

    public LoginViewController(LoginView view,
                               AuthenticationService authService,
                               AppNavigator navigator,
                               RoomService roomService,
                               UserService userService) {
        this.view= view;
        this.authService= authService;
        this.navigator= navigator;
        this.roomService = roomService;
        this.userService = userService;
         //when the user clicks  login, handlelogin()
        this.view.addLoginListener(e->handleLogin());
        //when the user  clicks back, gotowelcome()
        this.view.addBackListener(e->navigator.goToWelcome());
    }

    //the login buttton click
    private void handleLogin() {
    	
        String email=  view.getEmail();
        String password=  view.getPassword();

        try {
        	
            User user= authService.login(email, password);
            
            //verification
            String lower= email.toLowerCase();
            boolean isYork= lower.endsWith("@yorku.ca")||lower.endsWith("@my.yorku.ca");

            //logic for verificiation
            if (isYork) {

                //generates a  code
            	String code= String.valueOf((int)(Math.random()*900)+ 100);
                //print the code to console 
                System.out.println("Verification code for "+email+": "+code);
                //ask  the user to enter the code
                String enter= JOptionPane.showInputDialog(view,"Please enter the code to complete login:");
                //if user cancels or enters wrong code 
                if (enter==null|| !enter.equals(code)) {
                    JOptionPane.showMessageDialog(view,"Login cancelled.","Wrong Code.",JOptionPane.ERROR_MESSAGE);
                    return; 
                }
            }
            
            SessionData.setCurrentUser(user);

            JOptionPane.showMessageDialog(view,"Welcome, "+ user.getName()+ " (" +user.getAccountType() + ")","Login Successful",JOptionPane.INFORMATION_MESSAGE);

            //***LATER SEND TO SPECIFIC DASHBOARD
            //navigator.goToWelcome();
            switch (user.getRole().toUpperCase()) {
            //go to admin  view
            case "ADMIN": {
                AddRoomController addRoomCtrl= new AddRoomController(roomService);
                RoomsListController roomsListCtrl= new RoomsListController(roomService);
                AdminSelectActionController adminCtrl =new AdminSelectActionController(addRoomCtrl, roomsListCtrl);

                 AdminSelectActionView adminView = new AdminSelectActionView(adminCtrl);
                adminView.handleAdminAction();
                break;
            }
            //go to maintenance view
            case "MAINTENANCE": {
                MaintenanceServiceRequestsListView maintView=MaintenanceServiceRequestsListView.getInstance();
                maintView.setVisible(true);
                break;
            }
            //go to chief event coordinator view
            case "CHIEF": {
                ChiefEventCoordinatorController chiefCtrl= new ChiefEventCoordinatorController(userService);
                ChiefEventCoordinatorView chiefView= new ChiefEventCoordinatorView(chiefCtrl);
                chiefView.handleChiefCoordinatorAction();
                break;
            }
            //go to  guest view
            default: {
                RoomsListController roomsCtrl= new RoomsListController(roomService);
                RoomsListView roomsView= new RoomsListView(roomsCtrl);
                roomsView.getListOfRooms();
                break;
            }
        }

        
        }
        
        catch (AuthenticationException ex) {
            JOptionPane.showMessageDialog(view,ex.getMessage(),"Login Failed",JOptionPane.ERROR_MESSAGE);
        }
        
    
    } 
}




