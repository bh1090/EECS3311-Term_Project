package controller;

import application.*;
import view.*;

import javax.swing.*;

public class WelcomeViewController {

    private  WelcomeView view;
    private  AppNavigator  navigator;

    public WelcomeViewController(WelcomeView view, AppNavigator navigator) {
        this.view= view;
        this.navigator= navigator;
        //login button sends the user to the  login page.
        this.view.addLoginListener(e->navigator.goToLogin());
        //signup button sneds the user to the signup page.
        this.view.addSignupListener(e->navigator.goToSignup());
        //exit button close the app
        this.view.addExitListener(e-> {
        	
            int result= JOptionPane.showConfirmDialog(view,"Exit application?","Confirm",JOptionPane.YES_NO_OPTION);
            
            if (result==JOptionPane.YES_OPTION) {
                System.exit(0);
            }
            
        });
        
    }
}
