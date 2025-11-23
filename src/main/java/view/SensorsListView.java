package view;
import javax.swing.*;
import java.awt.*;

import java.util.List;

public class SensorsListView extends JFrame{
	private final static String[] HEADERS = {"Sensor ID", "Type", "Status", "Room ID"};
	public JButton backButton = new JButton("Back");
	public SensorsListView(List<List<String>> sensorList) {
		setTitle("Sensor List");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(5, 5, 5, 5);
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 4;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		add(this.backButton, gbc);
		
		gbc.gridwidth = 1;
		gbc.fill = GridBagConstraints.NONE;
		
		gbc.gridy = 1;
		for (int i = 0; i < SensorsListView.HEADERS.length; i++) {
			gbc.gridx = i;
			add(new JLabel(SensorsListView.HEADERS[i]), gbc);
		}
		
		for (int i = 0; i < sensorList.size(); i++) {
			for (int j = 0; j < SensorsListView.HEADERS.length || j < sensorList.get(i).size(); j++) {
				gbc.gridx = j;
				gbc.gridy = i + 2;
				add(new JLabel(sensorList.get(i).get(j)), gbc);
			}
		}
		pack();
	}
}
