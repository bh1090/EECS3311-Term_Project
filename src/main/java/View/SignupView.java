package View;

import model.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class SignupView extends JPanel {

    private JTextField nameField;
    private JTextField emailField;
    private JPasswordField passwordField;
    private JComboBox<AccountType> accountTypeCombo;
    private JButton  signupButton;
    private JButton  backButton;

    public SignupView() {
        buildUI();
    }

    private void buildUI() {
        setLayout(new BorderLayout());

        //titles
        JLabel title = new JLabel("Sign Up", SwingConstants.CENTER);
        title.setFont(title.getFont().deriveFont(Font.BOLD, 18f));
        add(title, BorderLayout.NORTH);

       
        JPanel centerWrapper=  new JPanel();
        //center
        centerWrapper.setLayout(new GridBagLayout());
        add(centerWrapper, BorderLayout.CENTER);

        JPanel formPanel= new JPanel(new GridLayout(4, 2, 10, 10));
        Dimension fieldSize= new Dimension(150, 26);

        //name
        formPanel.add(new JLabel("Name:"));
        
        JPanel nameWrapper= new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        nameField= new JTextField();
        nameField.setPreferredSize(fieldSize);
        nameWrapper.add(nameField);
        formPanel.add(nameWrapper);

        //email
        formPanel.add(new JLabel("Email:"));
        JPanel emailWrapper= new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        emailField= new JTextField();
        emailField.setPreferredSize(fieldSize);
        emailWrapper.add(emailField);
        formPanel.add(emailWrapper);

        //password
        formPanel.add(new JLabel("Password:"));
        JPanel passWrapper= new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        passwordField= new JPasswordField();
        passwordField.setPreferredSize(fieldSize);
        passWrapper.add(passwordField);
        formPanel.add(passWrapper);

        //accounttype
        formPanel.add(new JLabel("Account Type:"));
        JPanel typeWrapper= new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        accountTypeCombo= new JComboBox<>(AccountType.values());
        accountTypeCombo.setPreferredSize(fieldSize);
        typeWrapper.add(accountTypeCombo);
        formPanel.add(typeWrapper);

        
        centerWrapper.add(formPanel, new GridBagConstraints());

        //the buttons
        JPanel buttonPanel= new JPanel();
        signupButton= new JButton("Create Account");
        backButton= new JButton("Back");
        buttonPanel.add(signupButton);
        buttonPanel.add(backButton);

        add(buttonPanel, BorderLayout.SOUTH);
        setBorder(BorderFactory.createEmptyBorder(20, 40, 20, 40));
    }

    //getters
    public String getNameInput() {
    	
        return nameField.getText().trim();
    }

    public String getEmailInput() {
    	
        return emailField.getText().trim();
    }

    public String getPasswordInput() {
    	
        return new String(passwordField.getPassword());
    }

    public AccountType getSelectedAccountType() {
    	
        return (AccountType) accountTypeCombo.getSelectedItem();
    }

    public void addSignupListener(ActionListener l) {
    	
        signupButton.addActionListener(l);
    }

    public void addBackListener(ActionListener l) {
    	
        backButton.addActionListener(l);
    }
    
}
