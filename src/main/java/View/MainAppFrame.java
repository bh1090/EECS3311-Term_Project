package View;

import Application.*;
import Controller.*;
import Service.*;

import javax.swing.*;
import java.awt.*;

//main window
public class MainAppFrame extends JFrame {

    private static final long serialVersionUID= 1L;
    
    private static MainAppFrame instance;

    //different screens
    public static String CARD_WELCOME= "WELCOME";
    public static  String CARD_LOGIN= "LOGIN";
    public static String CARD_SIGNUP= "SIGNUP";

    
    private JPanel cardsPanel;
    private CardLayout cardLayout;

    
    public static MainAppFrame getInstance() {
        if (instance== null) {
            instance= new MainAppFrame();
        }
        return instance;
    }

    private MainAppFrame() {
    	
    	//set window title
        super("Room Booking System");

        //top tile
        JLabel titleLabel = new JLabel("Room Booking System", SwingConstants.CENTER);
        titleLabel.setFont(titleLabel.getFont().deriveFont(Font.BOLD, 20f));
        JPanel north=  new JPanel(new BorderLayout());
        north.add(titleLabel, BorderLayout.CENTER);

        //the screens
        cardLayout= new CardLayout();
        cardsPanel= new JPanel(cardLayout);
        
        //create each view
        WelcomeView welcomeView= new WelcomeView();
        LoginView loginView= new LoginView();
        SignupView signupView= new SignupView();
        RoomService roomService = new RoomService();
        UserService userService = new UserService();
         //add screens
        cardsPanel.add(welcomeView, CARD_WELCOME);
        cardsPanel.add(loginView, CARD_LOGIN);
        cardsPanel.add(signupView, CARD_SIGNUP);
        //layout
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(north, BorderLayout.NORTH);
        getContentPane().add(cardsPanel, BorderLayout.CENTER);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);

        //contoller to  view
        AppNavigator navigator= new AppNavigator(this);
        AuthenticationService authService= new AuthenticationService();

        new WelcomeViewController(welcomeView, navigator);
        new LoginViewController(loginView, authService, navigator);
        new SignupController(signupView, authService, navigator);
        
    }

    //switch screen
    public void showCard(String cardName) {
        cardLayout.show(cardsPanel, cardName);
    }

    //lauch
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> MainAppFrame.getInstance().setVisible(true));
    }
}


