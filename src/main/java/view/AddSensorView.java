package view;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import view.*;

public class AddSensorView extends JFrame{
	private static final String[] TYPES = {"Badge Scanner", "Entry Sensor"};
	private static final String[] STATUSES = {"Enabled", "Disabled"};
	public JComboBox<String> typeComboBox = new JComboBox<String>(AddSensorView.TYPES);
	public JComboBox<String> statusComboBox = new JComboBox<String>(AddSensorView.STATUSES);
	public JTextField idTextField = new JTextField(1);
	public JButton backButton = new JButton("Back");
	public JButton submitButton = new JButton("Add Sensor");
	public AddSensorView() {
		setTitle("Add Sensor");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		setLayout(new GridLayout(4,2));
		add(new JLabel("Type:"));
		add(this.typeComboBox);
		add(new JLabel("Status:"));
		add(this.statusComboBox);
		add(new JLabel("Room ID:"));
		add(this.idTextField);
		add(this.backButton);
		add(this.submitButton);
		pack();
	}
}
