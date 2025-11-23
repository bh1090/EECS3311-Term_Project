package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class LoginView extends JPanel {

    private JTextField emailField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JButton backButton;

    public LoginView() {
        buildUI();
    }

    private void buildUI() {
    	
    	//for top, mid, bottom
        setLayout(new BorderLayout());
        //title
        JLabel title= new JLabel("Login", SwingConstants.CENTER);
        title.setFont(title.getFont().deriveFont(Font.BOLD, 18f));
        add(title, BorderLayout.NORTH);
        //center
        JPanel formPanel= new JPanel(new GridBagLayout());
        formPanel.setBorder(BorderFactory.createEmptyBorder(20, 40, 20, 40));

        GridBagConstraints gbc= new GridBagConstraints();
        gbc.gridx= 0;
        gbc.gridy= 0;
        gbc.anchor= GridBagConstraints.LINE_END;
        //spacing
        gbc.insets= new Insets(5, 5, 5, 10);

        //email label
        formPanel.add(new JLabel("Email:"), gbc);
        //email field
        gbc.gridx= 1;
        gbc.anchor= GridBagConstraints.LINE_START;
        emailField= new JTextField(20);
        formPanel.add(emailField, gbc);
        //password label
        gbc.gridx= 0;
        gbc.gridy= 1;
        gbc.anchor= GridBagConstraints.LINE_END;
        formPanel.add(new JLabel("Password:"), gbc);
        //password  field
        gbc.gridx= 1;
        gbc.anchor= GridBagConstraints.LINE_START;
        passwordField= new JPasswordField(20);
        formPanel.add(passwordField, gbc);

        add(formPanel, BorderLayout.CENTER);

        //login/back, south
        JPanel buttonPanel= new JPanel();
        loginButton= new JButton("Login");
        backButton= new JButton("Back");
        buttonPanel.add(loginButton);
        buttonPanel.add(backButton);

        add(buttonPanel, BorderLayout.SOUTH);
    }

    
    //getters
    public String getEmail() {
        return emailField.getText().trim();
    }

    public String getPassword() {
        return new String(passwordField.getPassword());
    }

    public void addLoginListener(ActionListener l) {
        loginButton.addActionListener(l);
    }

    public void addBackListener(ActionListener l) {
        backButton.addActionListener(l);
    }
}
