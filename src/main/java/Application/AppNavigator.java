package Application;

import View.*;

public class AppNavigator {

    private final  MainAppFrame frame;

    public AppNavigator(MainAppFrame frame) {
        this.frame= frame;
        
    }
    
    //go to welcome
    public void goToWelcome() {
         frame.showCard(MainAppFrame.CARD_WELCOME);
    }

    //go to login
    public void goToLogin() {
         frame.showCard(MainAppFrame.CARD_LOGIN);
    }

    //go to signup
    public void goToSignup() {
    	
        frame.showCard(MainAppFrame.CARD_SIGNUP);
    }

   
}




