package Controller;

import Application.*;
import Model.*;
import Service.*;
import View.*;

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




