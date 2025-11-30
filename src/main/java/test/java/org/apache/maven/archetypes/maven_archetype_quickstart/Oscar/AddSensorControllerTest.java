package test.java.org.apache.maven.archetypes.maven_archetype_quickstart.Oscar;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.*;

import Controller.AddSensorController;
import View.AddSensorView;
import Service.SensorService;

public class AddSensorControllerTest {
	private AddSensorController controller;
    private AddSensorView view;
    private SensorService service;
    
    @BeforeEach
    void setUp() {
        view = mock(AddSensorView.class);
        service = mock(SensorService.class);
        
        view.typeComboBox = new JComboBox<>(new String[]{"Badge Scanner", "Entry Sensor"});
        view.statusComboBox = new JComboBox<>(new String[]{"Enabled", "Disabled"});
        view.idTextField = new JTextField();
        view.backButton = new JButton();
        view.submitButton = new JButton();

        controller = new AddSensorController(view, service);
    }
	
	@Test
	void test0() {
		view.typeComboBox.setSelectedItem("Badge Scanner");
        view.statusComboBox.setSelectedItem("Enabled");
        view.idTextField.setText("TSID1");
        
        when(service.addSensor("Badge Scanner", "Enabled", "TSID1")).thenReturn(true);
        
        try (MockedStatic<JOptionPane> msg = mockStatic(JOptionPane.class)) {

	        view.submitButton.doClick();
	
	        verify(service).addSensor("Badge Scanner", "Enabled", "TSID1");
	        verify(view).dispose();
	        msg.verify(() -> JOptionPane.showMessageDialog(null, "Added"));
    	}
	}
	@Test
	void test1() {
        view.backButton.doClick();
        verify(view).dispose();
	}
	@Test
	void test2() {
		view.typeComboBox.setSelectedItem("Entry Sensor");
        view.statusComboBox.setSelectedItem("Enabled");
        view.idTextField.setText("TSID1");
        
        when(service.addSensor("Entry Sensor", "Enabled", "TSID1")).thenReturn(true);
        
        try (MockedStatic<JOptionPane> msg = mockStatic(JOptionPane.class)) {

	        view.submitButton.doClick();
	
	        verify(service).addSensor("Entry Sensor", "Enabled", "TSID1");
	        verify(view).dispose();
	        msg.verify(() -> JOptionPane.showMessageDialog(null, "Added"));
    	}
	}
	@Test
	void test3() {
		view.typeComboBox.setSelectedItem("Entry Sensor");
        view.statusComboBox.setSelectedItem("Disabled");
        view.idTextField.setText("TSID1");
        
        when(service.addSensor("Entry Sensor", "Disabled", "TSID1")).thenReturn(true);
        
        try (MockedStatic<JOptionPane> msg = mockStatic(JOptionPane.class)) {

	        view.submitButton.doClick();
	
	        verify(service).addSensor("Entry Sensor", "Disabled", "TSID1");
	        verify(view).dispose();
	        msg.verify(() -> JOptionPane.showMessageDialog(null, "Added"));
    	}
	}
	@Test
	void test4() {
		view.typeComboBox.setSelectedItem("Badge Scanner");
        view.statusComboBox.setSelectedItem("Disabled");
        view.idTextField.setText("TSID1");
        
        when(service.addSensor("Badge Scanner", "Disabled", "TSID1")).thenReturn(true);
        
        try (MockedStatic<JOptionPane> msg = mockStatic(JOptionPane.class)) {

	        view.submitButton.doClick();
	
	        verify(service).addSensor("Badge Scanner", "Disabled", "TSID1");
	        verify(view).dispose();
	        msg.verify(() -> JOptionPane.showMessageDialog(null, "Added"));
    	}
	}
	@Test
	void test5() {
		view.typeComboBox.setSelectedItem("Badge Scanner");
        view.statusComboBox.setSelectedItem("Disabled");
        view.idTextField.setText("TSID2");
        
        when(service.addSensor("Badge Scanner", "Disabled", "TSID2")).thenReturn(true);
        
        try (MockedStatic<JOptionPane> msg = mockStatic(JOptionPane.class)) {

	        view.submitButton.doClick();
	
	        verify(service).addSensor("Badge Scanner", "Disabled", "TSID2");
	        verify(view).dispose();
	        msg.verify(() -> JOptionPane.showMessageDialog(null, "Added"));
    	}
	}
	@Test
	void test6() {
		view.typeComboBox.setSelectedItem("Badge Scanner");
        view.statusComboBox.setSelectedItem("Disabled");
        view.idTextField.setText("TSID3");
        
        when(service.addSensor("Badge Scanner", "Disabled", "TSID3")).thenReturn(true);
        
        try (MockedStatic<JOptionPane> msg = mockStatic(JOptionPane.class)) {

	        view.submitButton.doClick();
	
	        verify(service).addSensor("Badge Scanner", "Disabled", "TSID3");
	        verify(view).dispose();
	        msg.verify(() -> JOptionPane.showMessageDialog(null, "Added"));
    	}
	}
	@Test
	void test7() {
		view.typeComboBox.setSelectedItem("Badge Scanner");
        view.statusComboBox.setSelectedItem("Disabled");
        view.idTextField.setText("TSID9");
        
        when(service.addSensor("Badge Scanner", "Disabled", "TSID9")).thenReturn(true);
        
        try (MockedStatic<JOptionPane> msg = mockStatic(JOptionPane.class)) {

	        view.submitButton.doClick();
	
	        verify(service).addSensor("Badge Scanner", "Disabled", "TSID9");
	        verify(view).dispose();
	        msg.verify(() -> JOptionPane.showMessageDialog(null, "Added"));
    	}
	}
	@Test
	void test8() {
		view.typeComboBox.setSelectedItem("Badge Scanner");
	    view.statusComboBox.setSelectedItem("Disabled");
	    view.idTextField.setText("T432");
	    
	    try (MockedStatic<JOptionPane> msg = mockStatic(JOptionPane.class)) {
		
			view.backButton.doClick();
	        verify(view).dispose();
	        verify(service, never()).addSensor("Badge Scanner", "Disabled", "T432");
	        msg.verify(() -> JOptionPane.showMessageDialog(null, "Added"), never());
	        msg.verify(() -> JOptionPane.showMessageDialog(null, "Invalid parameters"), never());
		}
	}
	@Test
	void test9() { // view can effectively never show invalid params. sensorservice will return true or hang.
		view.typeComboBox.setSelectedItem("Badge Scanner");
	    view.statusComboBox.setSelectedItem("Enabled");
	    view.idTextField.setText("T432");
	    
	    try (MockedStatic<JOptionPane> msg = mockStatic(JOptionPane.class)) {
		
			view.backButton.doClick();
	        verify(view).dispose();
	        verify(service, never()).addSensor("Badge Scanner", "Enabled", "T432");
	        msg.verify(() -> JOptionPane.showMessageDialog(null, "Added"), never());
	        msg.verify(() -> JOptionPane.showMessageDialog(null, "Invalid parameters"), never());
		}
	}
}
