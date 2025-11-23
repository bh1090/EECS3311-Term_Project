package Controller;

import Application.*;
import Model.*;
import Service.*;
import View.*;

import javax.swing.*;

public class SignupController {

    private  SignupView view;
    private  AuthenticationService  authService;
    private  AppNavigator navigator;

    public SignupController(SignupView view,AuthenticationService authService,AppNavigator navigator) {
        this.view= view;
        this.authService= authService;
        this.navigator= navigator;
        //user clicks create acc go to handlesignup()
        this.view.addSignupListener(e->handleSignup());
        //user clciks back, return to home page
        this.view.addBackListener(e->navigator.goToWelcome());
    }

    //signup button click
    private void handleSignup() {
        String name= view.getNameInput();
        String email= view.getEmailInput();
        String password= view.getPasswordInput();
        AccountType accountType= view.getSelectedAccountType();

        try {
        	
        	//creates user
            User user= authService.register(name,email,password,accountType);
            //checks if yorku email
            String lower= user.getEmail().toLowerCase();
            boolean isYork= lower.endsWith("@yorku.ca")||lower.endsWith("@my.yorku.ca");

            if (isYork) {
            	
                JOptionPane.showMessageDialog(view,"Account created.","Signup Successful",JOptionPane.INFORMATION_MESSAGE);
            } 
            
            else {
                JOptionPane.showMessageDialog(view,"Account created successfully.","Signup Successful",JOptionPane.INFORMATION_MESSAGE);
            }
            
            
            //after signup, go to welcome view
            navigator.goToWelcome();

        } 
        //if the signup failed
        catch (AuthenticationException ex) {
            JOptionPane.showMessageDialog(view,ex.getMessage(),"Signup Failed",JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    
}



