package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class WelcomeView extends JPanel {

    private JButton loginButton;
    private JButton signupButton;
    private JButton exitButton;

    public WelcomeView() {
    	
        buildUI();
    }

    private void buildUI() {
        setLayout(new BorderLayout());

        JLabel label = new JLabel("Welcome!",SwingConstants.CENTER);
        label.setFont(label.getFont().deriveFont(Font.BOLD, 18f));
        add(label, BorderLayout.NORTH);

        JPanel buttonsPanel= new JPanel(new GridLayout(3, 1, 10, 10));

        loginButton= new  JButton("Login");
        signupButton= new  JButton("Sign Up");
        exitButton= new  JButton("Exit");
        buttonsPanel.add(loginButton);
        buttonsPanel.add(signupButton);
        buttonsPanel.add(exitButton);

        add(buttonsPanel, BorderLayout.CENTER);
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
    }

    public void addLoginListener(ActionListener l) {
    	
         loginButton.addActionListener(l);
    }

    public void addSignupListener(ActionListener l) {
    	
         signupButton.addActionListener(l);
    }

    public void addExitListener(ActionListener l) {
    	
         exitButton.addActionListener(l);
    }
    
}
