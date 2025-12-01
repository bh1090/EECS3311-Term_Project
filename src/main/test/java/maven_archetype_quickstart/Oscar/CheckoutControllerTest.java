package maven_archetype_quickstart.Oscar;

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
import Controller.CheckoutController;
import Model.Room.Booking;
import Model.Sensor.Sensor;
import Model.User.StudentUser;
import Service.RoomService;
import Service.SensorService;
import View.CheckinView;
import View.CheckoutView;

public class CheckoutControllerTest {
	CheckoutView view;
    RoomService roomService;
    SensorService sensorService;
    CheckoutController controller;
    MockedStatic<SessionData> sessionMock;
    MockedStatic<JOptionPane> jOptionPaneMock;
    @BeforeEach
    void setUp() {
    	sessionMock = mockStatic(SessionData.class);
    	jOptionPaneMock = mockStatic(JOptionPane.class);
    	StudentUser fakeUser = new StudentUser("User54", "mail7", "pwd");
    	sessionMock.when(SessionData::getCurrentUser).thenReturn(fakeUser);
        view = mock(CheckoutView.class);
        roomService = mock(RoomService.class);
        sensorService = mock(SensorService.class);
        
        view.UserID = "UID";
        view.bookingIDTextField = new JTextField(1);
        view.backButton = new JButton("Back");
        view.checkoutButton = new JButton("Checkout");
        
        controller = new CheckoutController(view, roomService, sensorService);
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
		bn.performCheckIn();
		when(roomService.performCheckOut(anyString())).thenReturn(true);
		when(roomService.getBookingDetails(anyString())).thenReturn(bn);
		when(sensorService.getSensorByRoomID(anyString(), eq("Entry Sensor"))).thenReturn(new Sensor("SID", "Entry Sensor", "STATUS", "ROOM", false));
		when(sensorService.getSensorByRoomID(anyString(), eq("Badge Scanner"))).thenReturn(new Sensor("SID", "Badge Scanner", "STATUS", "ROOM", false));
		when(sensorService.addScanIDSensorData(anyString(), anyString(), anyString())).thenReturn(true);
		when(sensorService.addOccupancySensorData(anyString())).thenReturn(true);
		
		view.bookingIDTextField.setText("bid3");
		view.checkoutButton.doClick();
		
		verify(roomService).performCheckOut("bid3");
		verify(sensorService).addScanIDSensorData(anyString(), anyString(), anyString());
        verify(sensorService).addOccupancySensorData(anyString());
		jOptionPaneMock.verify(() -> JOptionPane.showMessageDialog(null, "Checked out"));
	}
	@Test
	void test1() {
		LocalDateTime ldt = LocalDateTime.now();
		Booking bn = new Booking("BID", "RID", "UIaD", ldt.plusMinutes(15).toLocalDate(), ldt.plusHours(1).toLocalDate(), ldt.plusMinutes(15).toLocalTime(), ldt.plusHours(1).toLocalTime(), "PID");
		bn.performCheckIn();
		when(roomService.performCheckOut(anyString())).thenReturn(true);
		when(roomService.getBookingDetails(anyString())).thenReturn(bn);
		when(sensorService.getSensorByRoomID(anyString(), eq("Entry Sensor"))).thenReturn(new Sensor("SID", "Entry Sensor", "STATUS", "ROOM", false));
		when(sensorService.getSensorByRoomID(anyString(), eq("Badge Scanner"))).thenReturn(new Sensor("SID", "Badge Scanner", "STATUS", "ROOM", false));
		when(sensorService.addScanIDSensorData(anyString(), anyString(), anyString())).thenReturn(true);
		when(sensorService.addOccupancySensorData(anyString())).thenReturn(true);
		
		view.bookingIDTextField.setText("bid3");
		view.checkoutButton.doClick();
		
		jOptionPaneMock.verify(() -> JOptionPane.showMessageDialog(null, "Invalid bookingID"));
	}
	@Test
	void test2() {
		LocalDateTime ldt = LocalDateTime.now();
		Booking bn = new Booking("BID", "RID", "UID", ldt.plusMinutes(15).toLocalDate(), ldt.plusHours(1).toLocalDate(), ldt.plusMinutes(15).toLocalTime(), ldt.plusHours(1).toLocalTime(), "PID");
//		bn.performCheckIn();
		when(roomService.performCheckOut(anyString())).thenReturn(true);
		when(roomService.getBookingDetails(anyString())).thenReturn(bn);
		when(sensorService.getSensorByRoomID(anyString(), eq("Entry Sensor"))).thenReturn(new Sensor("SID", "Entry Sensor", "STATUS", "ROOM", false));
		when(sensorService.getSensorByRoomID(anyString(), eq("Badge Scanner"))).thenReturn(new Sensor("SID", "Badge Scanner", "STATUS", "ROOM", false));
		when(sensorService.addScanIDSensorData(anyString(), anyString(), anyString())).thenReturn(true);
		when(sensorService.addOccupancySensorData(anyString())).thenReturn(true);
		
		view.bookingIDTextField.setText("bid3");
		view.checkoutButton.doClick();
		
		jOptionPaneMock.verify(() -> JOptionPane.showMessageDialog(null, "Booking not checked in"));
	}
	@Test
	void test3() {
		LocalDateTime ldt = LocalDateTime.now();
		Booking bn = new Booking("BID", "RID", "UID", ldt.plusMinutes(15).toLocalDate(), ldt.plusHours(1).toLocalDate(), ldt.plusMinutes(15).toLocalTime(), ldt.plusHours(1).toLocalTime(), "PID");
		bn.performCheckIn();
		when(roomService.performCheckOut(anyString())).thenReturn(true);
		when(roomService.getBookingDetails(anyString())).thenReturn(bn);
		when(sensorService.getSensorByRoomID(anyString(), eq("Entry Sensor"))).thenReturn(new Sensor("SID", "Entry Sensor", "STATUS", "ROOM", false));
		when(sensorService.getSensorByRoomID(anyString(), eq("Badge Scanner"))).thenReturn(new Sensor("SID", "Badge Scanner", "STATUS", "ROOM", false));
		when(sensorService.addScanIDSensorData(anyString(), anyString(), anyString())).thenReturn(true);
		when(sensorService.addOccupancySensorData(anyString())).thenReturn(true);
		
		view.bookingIDTextField.setText("bid3");
		view.checkoutButton.doClick();
	}
	@Test
	void test4() {
		LocalDateTime ldt = LocalDateTime.now();
		Booking bn = new Booking("BID", "RID", "UID", ldt.plusMinutes(15).toLocalDate(), ldt.plusHours(1).toLocalDate(), ldt.plusMinutes(15).toLocalTime(), ldt.plusHours(1).toLocalTime(), "PID");
		bn.performCheckIn();
		when(roomService.performCheckOut(anyString())).thenReturn(true);
		when(roomService.getBookingDetails(anyString())).thenReturn(bn);
		when(sensorService.getSensorByRoomID(anyString(), eq("Entry Sensor"))).thenReturn(null);
		when(sensorService.getSensorByRoomID(anyString(), eq("Badge Scanner"))).thenReturn(new Sensor("SID", "Badge Scanner", "STATUS", "ROOM", false));
		when(sensorService.addScanIDSensorData(anyString(), anyString(), anyString())).thenReturn(true);
		when(sensorService.addOccupancySensorData(anyString())).thenReturn(true);
		
		view.bookingIDTextField.setText("bid3");
		view.checkoutButton.doClick();
		
		verify(sensorService, never()).addOccupancySensorData(anyString());
	}
	@Test
	void test5() {
		LocalDateTime ldt = LocalDateTime.now();
		Booking bn = new Booking("BID", "RID", "UID", ldt.plusMinutes(15).toLocalDate(), ldt.plusHours(1).toLocalDate(), ldt.plusMinutes(15).toLocalTime(), ldt.plusHours(1).toLocalTime(), "PID");
		bn.performCheckIn();
		when(roomService.performCheckOut(anyString())).thenReturn(true);
		when(roomService.getBookingDetails(anyString())).thenReturn(bn);
		when(sensorService.getSensorByRoomID(anyString(), eq("Entry Sensor"))).thenReturn(new Sensor("SID", "Entry Sensor", "STATUS", "ROOM", false));
		when(sensorService.getSensorByRoomID(anyString(), eq("Badge Scanner"))).thenReturn(null);
		when(sensorService.addScanIDSensorData(anyString(), anyString(), anyString())).thenReturn(true);
		when(sensorService.addOccupancySensorData(anyString())).thenReturn(true);
		
		view.bookingIDTextField.setText("bid3");
		view.checkoutButton.doClick();
		
		verify(sensorService, never()).addScanIDSensorData(anyString(), anyString(), anyString());
	}
	@Test
	void test6() {
		LocalDateTime ldt = LocalDateTime.now();
		Booking bn = new Booking("BID", "RID", "UID", ldt.plusMinutes(1).toLocalDate(), ldt.plusHours(1).toLocalDate(), ldt.plusMinutes(1).toLocalTime(), ldt.plusHours(1).toLocalTime(), "PID");
		bn.performCheckIn();
		when(roomService.performCheckOut(anyString())).thenReturn(true);
		when(roomService.getBookingDetails(anyString())).thenReturn(bn);
		when(sensorService.getSensorByRoomID(anyString(), eq("Entry Sensor"))).thenReturn(new Sensor("SID", "Entry Sensor", "STATUS", "ROOM", false));
		when(sensorService.getSensorByRoomID(anyString(), eq("Badge Scanner"))).thenReturn(new Sensor("SID", "Badge Scanner", "STATUS", "ROOM", false));
		when(sensorService.addScanIDSensorData(anyString(), anyString(), anyString())).thenReturn(true);
		when(sensorService.addOccupancySensorData(anyString())).thenReturn(true);
		
		view.bookingIDTextField.setText("bid3");
		view.checkoutButton.doClick();
		
		verify(roomService).performCheckOut("bid3");
		verify(sensorService).addScanIDSensorData(anyString(), anyString(), anyString());
        verify(sensorService).addOccupancySensorData(anyString());
		jOptionPaneMock.verify(() -> JOptionPane.showMessageDialog(null, "Checked out"));
	}
	@Test
	void test7() {
		LocalDateTime ldt = LocalDateTime.now();
		Booking bn = new Booking("BID", "RID", "UID", ldt.plusMinutes(19).toLocalDate(), ldt.plusHours(1).toLocalDate(), ldt.plusMinutes(19).toLocalTime(), ldt.plusHours(1).toLocalTime(), "PID");
		bn.performCheckIn();
		when(roomService.performCheckOut(anyString())).thenReturn(true);
		when(roomService.getBookingDetails(anyString())).thenReturn(bn);
		when(sensorService.getSensorByRoomID(anyString(), eq("Entry Sensor"))).thenReturn(new Sensor("SID", "Entry Sensor", "STATUS", "ROOM", false));
		when(sensorService.getSensorByRoomID(anyString(), eq("Badge Scanner"))).thenReturn(new Sensor("SID", "Badge Scanner", "STATUS", "ROOM", false));
		when(sensorService.addScanIDSensorData(anyString(), anyString(), anyString())).thenReturn(true);
		when(sensorService.addOccupancySensorData(anyString())).thenReturn(true);
		
		view.bookingIDTextField.setText("bid3");
		view.checkoutButton.doClick();
		
		verify(roomService).performCheckOut("bid3");
		verify(sensorService).addScanIDSensorData(anyString(), anyString(), anyString());
        verify(sensorService).addOccupancySensorData(anyString());
		jOptionPaneMock.verify(() -> JOptionPane.showMessageDialog(null, "Checked out"));
	}
	@Test
	void test8() {
		LocalDateTime ldt = LocalDateTime.now();
		Booking bn = new Booking("BID", "RID", "UID", ldt.plusMinutes(15).toLocalDate(), ldt.plusHours(0).toLocalDate(), ldt.plusMinutes(15).toLocalTime(), ldt.plusHours(0).toLocalTime(), "PID");
		bn.performCheckIn();
		when(roomService.performCheckOut(anyString())).thenReturn(true);
		when(roomService.getBookingDetails(anyString())).thenReturn(bn);
		when(sensorService.getSensorByRoomID(anyString(), eq("Entry Sensor"))).thenReturn(new Sensor("SID", "Entry Sensor", "STATUS", "ROOM", false));
		when(sensorService.getSensorByRoomID(anyString(), eq("Badge Scanner"))).thenReturn(new Sensor("SID", "Badge Scanner", "STATUS", "ROOM", false));
		when(sensorService.addScanIDSensorData(anyString(), anyString(), anyString())).thenReturn(true);
		when(sensorService.addOccupancySensorData(anyString())).thenReturn(true);
		
		view.bookingIDTextField.setText("bid3");
		view.checkoutButton.doClick();
		
		verify(roomService).performCheckOut("bid3");
		verify(sensorService).addScanIDSensorData(anyString(), anyString(), anyString());
        verify(sensorService).addOccupancySensorData(anyString());
		jOptionPaneMock.verify(() -> JOptionPane.showMessageDialog(null, "Checked out"));
	}
	@Test
	void test9() {
		LocalDateTime ldt = LocalDateTime.now();
		Booking bn = new Booking("BID", "RID", "UID", ldt.plusMinutes(15).toLocalDate(), ldt.plusHours(1).toLocalDate(), ldt.plusMinutes(15).toLocalTime(), ldt.plusHours(1).toLocalTime(), "PID");
		bn.performCheckIn();
		when(roomService.performCheckOut(anyString())).thenReturn(true);
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
}
