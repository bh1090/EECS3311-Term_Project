package test.java.org.apache.maven.archetypes.maven_archetype_quickstart.Oscar;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.time.LocalDateTime;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;

import Application.SessionData;
import Controller.CheckinController;
import Model.Room.Booking;
import Model.Sensor.Sensor;
import Model.User.StudentUser;
import Service.RoomService;
import Service.SensorService;
import View.CheckinView;

public class CheckinControllerTest {
	CheckinView view;
    RoomService roomService;
    SensorService sensorService;
    CheckinController controller;
    MockedStatic<SessionData> sessionMock;
    MockedStatic<JOptionPane> jOptionPaneMock;
    @BeforeEach
    void setUp() {
    	sessionMock = mockStatic(SessionData.class);
    	jOptionPaneMock = mockStatic(JOptionPane.class);
    	StudentUser fakeUser = new StudentUser("User54", "mail7", "pwd");
    	sessionMock.when(SessionData::getCurrentUser).thenReturn(fakeUser);
        view = mock(CheckinView.class);
        roomService = mock(RoomService.class);
        sensorService = mock(SensorService.class);
        
        view.UserID = "UID";
        view.bookingIDTextField = new JTextField(1);
        view.backButton = new JButton("Back");
        view.checkinButton = new JButton("Checkin");
        
        controller = new CheckinController(view, roomService, sensorService);
    }
    @AfterEach
    void setDown() {
    	sessionMock.close();
    	jOptionPaneMock.close();
    }
	@Test
	void test0() {
		LocalDateTime ldt = LocalDateTime.now();
		Booking bn = new Booking("BID", "RID", "UID", ldt.plusMinutes(15).toLocalDate(), ldt.plusHours(1).toLocalDate(), ldt.plusMinutes(15).toLocalTime(), ldt.plusHours(1).toLocalTime(), "PID");
		when(roomService.performCheckIn(anyString())).thenReturn(true);
		when(roomService.getBookingDetails(anyString())).thenReturn(bn);
		when(sensorService.getSensorByRoomID(anyString(), eq("Entry Sensor"))).thenReturn(new Sensor("SID", "Entry Sensor", "STATUS", "ROOM", false));
		when(sensorService.getSensorByRoomID(anyString(), eq("Badge Scanner"))).thenReturn(new Sensor("SID", "Badge Scanner", "STATUS", "ROOM", false));
		when(sensorService.addScanIDSensorData(anyString(), anyString(), anyString())).thenReturn(true);
		when(sensorService.addOccupancySensorData(anyString())).thenReturn(true);
		
		view.bookingIDTextField.setText("bid3");
		view.checkinButton.doClick();
		
		verify(roomService).performCheckIn("bid3");
		verify(sensorService).addScanIDSensorData(anyString(), anyString(), anyString());
        verify(sensorService).addOccupancySensorData(anyString());

        jOptionPaneMock.verify(() -> JOptionPane.showMessageDialog(null, "Checked in"));
	}
	@Test
	void test1() {
		LocalDateTime ldt = LocalDateTime.now();
		Booking bn = new Booking("BID", "RID", "UID", ldt.plusMinutes(15).toLocalDate(), ldt.plusHours(1).toLocalDate(), ldt.plusMinutes(15).toLocalTime(), ldt.plusHours(1).toLocalTime(), "PID");
		when(roomService.performCheckIn(anyString())).thenReturn(true);
		when(roomService.getBookingDetails(anyString())).thenReturn(bn);
		when(sensorService.getSensorByRoomID(anyString(), eq("Entry Sensor"))).thenReturn(new Sensor("SID", "Entry Sensor", "STATUS", "ROOM", false));
		when(sensorService.getSensorByRoomID(anyString(), eq("Badge Scanner"))).thenReturn(new Sensor("SID", "Badge Scanner", "STATUS", "ROOM", false));
		when(sensorService.addScanIDSensorData(anyString(), anyString(), anyString())).thenReturn(true);
		when(sensorService.addOccupancySensorData(anyString())).thenReturn(true);
		view.bookingIDTextField.setText("bid3");
		view.backButton.doClick();
		
		verify(view).dispose();
		Assertions.assertFalse(view.isDisplayable());
	}
	@Test
	void test2() {
		LocalDateTime ldt = LocalDateTime.now();
		Booking bn = new Booking("BID", "RID", "UID", ldt.plusMinutes(15).toLocalDate(), ldt.plusHours(1).toLocalDate(), ldt.plusMinutes(15).toLocalTime(), ldt.plusHours(1).toLocalTime(), "PID");
		when(roomService.performCheckIn(anyString())).thenReturn(true);
		when(roomService.getBookingDetails(anyString())).thenReturn(bn);
		when(sensorService.getSensorByRoomID(anyString(), eq("Entry Sensor"))).thenReturn(new Sensor("SID", "Entry Sensor", "STATUS", "ROOM", false));
		when(sensorService.getSensorByRoomID(anyString(), eq("Badge Scanner"))).thenReturn(null);
		when(sensorService.addScanIDSensorData(anyString(), anyString(), anyString())).thenReturn(true);
		when(sensorService.addOccupancySensorData(anyString())).thenReturn(true);
		view.bookingIDTextField.setText("bid3");
		view.checkinButton.doClick();
		
		verify(sensorService, never()).addScanIDSensorData(anyString(), anyString(), anyString());
	}
	@Test
	void test3() {
		LocalDateTime ldt = LocalDateTime.now();
		Booking bn = new Booking("BID", "RID", "UID", ldt.plusMinutes(15).toLocalDate(), ldt.plusHours(1).toLocalDate(), ldt.plusMinutes(15).toLocalTime(), ldt.plusHours(1).toLocalTime(), "PID");
		when(roomService.performCheckIn(anyString())).thenReturn(true);
		when(roomService.getBookingDetails(anyString())).thenReturn(bn);
		when(sensorService.getSensorByRoomID(anyString(), eq("Entry Sensor"))).thenReturn(null);
		when(sensorService.getSensorByRoomID(anyString(), eq("Badge Scanner"))).thenReturn(new Sensor("SID", "Badge Scanner", "STATUS", "ROOM", false));
		when(sensorService.addScanIDSensorData(anyString(), anyString(), anyString())).thenReturn(true);
		when(sensorService.addOccupancySensorData(anyString())).thenReturn(true);
		
		view.bookingIDTextField.setText("bid3");
		view.checkinButton.doClick();
		
		verify(sensorService, never()).addOccupancySensorData(anyString());
	}
	@Test
	void test4() {
		LocalDateTime ldt = LocalDateTime.now();
		Booking bn = new Booking("BID", "RID", "dUID", ldt.plusMinutes(15).toLocalDate(), ldt.plusHours(1).toLocalDate(), ldt.plusMinutes(15).toLocalTime(), ldt.plusHours(1).toLocalTime(), "PID");
		when(roomService.performCheckIn(anyString())).thenReturn(true);
		when(roomService.getBookingDetails(anyString())).thenReturn(bn);
		when(sensorService.getSensorByRoomID(anyString(), eq("Entry Sensor"))).thenReturn(new Sensor("SID", "Entry Sensor", "STATUS", "ROOM", false));
		when(sensorService.getSensorByRoomID(anyString(), eq("Badge Scanner"))).thenReturn(new Sensor("SID", "Badge Scanner", "STATUS", "ROOM", false));
		when(sensorService.addScanIDSensorData(anyString(), anyString(), anyString())).thenReturn(true);
		when(sensorService.addOccupancySensorData(anyString())).thenReturn(true);
		
		view.bookingIDTextField.setText("bid3");
		view.checkinButton.doClick();
		
		jOptionPaneMock.verify(() -> JOptionPane.showMessageDialog(null, "Invalid bookingID"));
	}
	@Test
	void test5() {
		LocalDateTime ldt = LocalDateTime.now();
		Booking bn = new Booking("BID", "RID", "UID", ldt.plusMinutes(15).toLocalDate(), ldt.plusHours(1).toLocalDate(), ldt.plusMinutes(15).toLocalTime(), ldt.plusHours(1).toLocalTime(), "PID");
		bn.performCheckIn();
		when(roomService.performCheckIn(anyString())).thenReturn(true);
		when(roomService.getBookingDetails(anyString())).thenReturn(bn);
		when(sensorService.getSensorByRoomID(anyString(), eq("Entry Sensor"))).thenReturn(new Sensor("SID", "Entry Sensor", "STATUS", "ROOM", false));
		when(sensorService.getSensorByRoomID(anyString(), eq("Badge Scanner"))).thenReturn(new Sensor("SID", "Badge Scanner", "STATUS", "ROOM", false));
		when(sensorService.addScanIDSensorData(anyString(), anyString(), anyString())).thenReturn(true);
		when(sensorService.addOccupancySensorData(anyString())).thenReturn(true);
		
		view.bookingIDTextField.setText("bid3");
		view.checkinButton.doClick();
		
		jOptionPaneMock.verify(() -> JOptionPane.showMessageDialog(null, "Booking not confirmed"));
	}
	@Test
	void test6() {
		LocalDateTime ldt = LocalDateTime.now();
		Booking bn = new Booking("BID", "RID", "UID", ldt.plusMinutes(55).toLocalDate(), ldt.plusHours(1).toLocalDate(), ldt.plusMinutes(55).toLocalTime(), ldt.plusHours(1).toLocalTime(), "PID");
		when(roomService.performCheckIn(anyString())).thenReturn(true);
		when(roomService.getBookingDetails(anyString())).thenReturn(bn);
		when(sensorService.getSensorByRoomID(anyString(), eq("Entry Sensor"))).thenReturn(new Sensor("SID", "Entry Sensor", "STATUS", "ROOM", false));
		when(sensorService.getSensorByRoomID(anyString(), eq("Badge Scanner"))).thenReturn(new Sensor("SID", "Badge Scanner", "STATUS", "ROOM", false));
		when(sensorService.addScanIDSensorData(anyString(), anyString(), anyString())).thenReturn(true);
		when(sensorService.addOccupancySensorData(anyString())).thenReturn(true);
		
		view.bookingIDTextField.setText("bid3");
		view.checkinButton.doClick();
		
		jOptionPaneMock.verify(() -> JOptionPane.showMessageDialog(null, "Too early to checkin"));
	}
	@Test
	void test7() {
		LocalDateTime ldt = LocalDateTime.now();
		Booking bn = new Booking("BID", "RID", "UID", ldt.toLocalDate(), ldt.plusHours(1).toLocalDate(), ldt.toLocalTime(), ldt.plusHours(1).toLocalTime(), "PID");
		when(roomService.performCheckIn(anyString())).thenReturn(true);
		when(roomService.getBookingDetails(anyString())).thenReturn(bn);
		when(sensorService.getSensorByRoomID(anyString(), eq("Entry Sensor"))).thenReturn(new Sensor("SID", "Entry Sensor", "STATUS", "ROOM", false));
		when(sensorService.getSensorByRoomID(anyString(), eq("Badge Scanner"))).thenReturn(new Sensor("SID", "Badge Scanner", "STATUS", "ROOM", false));
		when(sensorService.addScanIDSensorData(anyString(), anyString(), anyString())).thenReturn(true);
		when(sensorService.addOccupancySensorData(anyString())).thenReturn(true);
		
		view.bookingIDTextField.setText("bid3");
		view.checkinButton.doClick();
		
		jOptionPaneMock.verify(() -> JOptionPane.showMessageDialog(null, "Booking passed"));
	}
	@Test
	void test8() {
		LocalDateTime ldt = LocalDateTime.now();
		Booking bn = new Booking("BID", "RID", "UID", ldt.plusMinutes(15).toLocalDate(), ldt.plusHours(1).toLocalDate(), ldt.plusMinutes(15).toLocalTime(), ldt.plusHours(1).toLocalTime(), "PID");
		bn.performCheckIn();
		when(roomService.performCheckIn(anyString())).thenReturn(true);
		when(roomService.getBookingDetails(anyString())).thenReturn(null);
		when(sensorService.getSensorByRoomID(anyString(), eq("Entry Sensor"))).thenReturn(new Sensor("SID", "Entry Sensor", "STATUS", "ROOM", false));
		when(sensorService.getSensorByRoomID(anyString(), eq("Badge Scanner"))).thenReturn(new Sensor("SID", "Badge Scanner", "STATUS", "ROOM", false));
		when(sensorService.addScanIDSensorData(anyString(), anyString(), anyString())).thenReturn(true);
		when(sensorService.addOccupancySensorData(anyString())).thenReturn(true);
		
		view.bookingIDTextField.setText("bid3");
		view.checkinButton.doClick();
		
		jOptionPaneMock.verify(() -> JOptionPane.showMessageDialog(null, "Invalid bookingID"));
	}
	@Test
	void test9() {
		LocalDateTime ldt = LocalDateTime.now();
		Booking bn = new Booking("BID", "RID", "UID", ldt.plusMinutes(25).toLocalDate(), ldt.plusHours(1).toLocalDate(), ldt.plusMinutes(25).toLocalTime(), ldt.plusHours(1).toLocalTime(), "PID");
		when(roomService.performCheckIn(anyString())).thenReturn(true);
		when(roomService.getBookingDetails(anyString())).thenReturn(bn);
		when(sensorService.getSensorByRoomID(anyString(), eq("Entry Sensor"))).thenReturn(new Sensor("SID", "Entry Sensor", "STATUS", "ROOM", false));
		when(sensorService.getSensorByRoomID(anyString(), eq("Badge Scanner"))).thenReturn(new Sensor("SID", "Badge Scanner", "STATUS", "ROOM", false));
		when(sensorService.addScanIDSensorData(anyString(), anyString(), anyString())).thenReturn(true);
		when(sensorService.addOccupancySensorData(anyString())).thenReturn(true);
		
		view.bookingIDTextField.setText("bid3");
		view.checkinButton.doClick();
		
		verify(roomService).performCheckIn("bid3");
		verify(sensorService).addScanIDSensorData(anyString(), anyString(), anyString());
        verify(sensorService).addOccupancySensorData(anyString());

        jOptionPaneMock.verify(() -> JOptionPane.showMessageDialog(null, "Checked in"));
	}
}
