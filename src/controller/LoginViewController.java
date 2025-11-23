package controller;

import application.*;
import model.*;
import service.*;
import view.*;

import javax.swing.*;

public class LoginViewController {

    private  LoginView view;
    private  AuthenticationService authService;
    private  AppNavigator navigator;

    public LoginViewController(LoginView view,AuthenticationService authService,AppNavigator navigator) {
        this.view= view;
        this.authService= authService;
        this.navigator= navigator;
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
            navigator.goToWelcome();

        } 
        
        catch (AuthenticationException ex) {
            JOptionPane.showMessageDialog(view,ex.getMessage(),"Login Failed",JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
}




