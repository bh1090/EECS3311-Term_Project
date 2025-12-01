package test.java.org.apache.maven.archetypes.maven_archetype_quickstart.Oscar;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import javax.swing.*;

import org.junit.jupiter.api.*;
import org.mockito.MockedStatic;

import Application.SessionData;
import Controller.RoomBookingRequirementsController;
import Model.User.StudentUser;
import Service.RoomService;
import View.RoomBookingRequirementsView;

public class RoomBookingRequirementsControllerTest {
	RoomBookingRequirementsView view;
    RoomService service;
    RoomBookingRequirementsController controller;
    MockedStatic<SessionData> sessionMock;
    @BeforeEach
    void setUp() {
    	sessionMock = mockStatic(SessionData.class);
    	StudentUser fakeUser = new StudentUser("User54", "mail7", "pwd");
    	sessionMock.when(SessionData::getCurrentUser).thenReturn(fakeUser);
        view = mock(RoomBookingRequirementsView.class);
        service = mock(RoomService.class);
        
        view.roomIDTextField = new JTextField(1);
        view.startDateTimeSpinner = new JSpinner(new SpinnerDateModel());
        view.backButton = new JButton("Back");
        view.bookRoomButton = new JButton("Book Room");
        
        controller = new RoomBookingRequirementsController(view, service);
    }
    @AfterEach
    void setDown() {
    	sessionMock.close();
    }
	@Test
	void test0() {
		view.backButton.doClick();
		verify(view).dispose();
		Assertions.assertFalse(view.isDisplayable());
	}
	@Test
	void test1() {
		when(service.createBooking(anyString(), anyString(), any(), any(), any(), any(), anyString())).thenReturn(null);
		try (MockedStatic<JOptionPane> msgMock = mockStatic(JOptionPane.class)) {
			view.bookRoomButton.doClick();
			msgMock.verify(() -> JOptionPane.showMessageDialog(null, "Invalid booking"));
			verify(view, never()).dispose();
		}
	}
	@Test
	void test2() {
		view.userID = "UID1";
		view.paymentID = "PID1";
	    view.roomIDTextField.setText("ROOOOOOO1");
		when(service.createBooking(anyString(), anyString(), any(), any(), any(), any(), anyString())).thenReturn("TB1");
		try (MockedStatic<JOptionPane> msgMock = mockStatic(JOptionPane.class)) {
			view.bookRoomButton.doClick();
			msgMock.verify(() -> JOptionPane.showMessageDialog(null, "Your BookingID is TB1"));
			verify(view).dispose();
            assertFalse(view.isDisplayable());
		}
	}
	@Test
	void test3() {
		view.userID = "UID1";
		view.paymentID = "PID1";
	    view.roomIDTextField.setText("ROOOOOOO1");
		when(service.createBooking(anyString(), anyString(), any(), any(), any(), any(), anyString())).thenReturn("TB2311");
		try (MockedStatic<JOptionPane> msgMock = mockStatic(JOptionPane.class)) {
			view.bookRoomButton.doClick();
			msgMock.verify(() -> JOptionPane.showMessageDialog(null, "Your BookingID is TB2311"));
			verify(view).dispose();
            assertFalse(view.isDisplayable());
		}
	}
	@Test
	void test4() {
		view.userID = "UID1";
		view.paymentID = "PID1";
	    view.roomIDTextField.setText("ROOOOOOO1");
		when(service.createBooking(anyString(), anyString(), any(), any(), any(), any(), anyString())).thenReturn("T436hB1");
		try (MockedStatic<JOptionPane> msgMock = mockStatic(JOptionPane.class)) {
			view.bookRoomButton.doClick();
			msgMock.verify(() -> JOptionPane.showMessageDialog(null, "Your BookingID is T436hB1"));
			verify(view).dispose();
            assertFalse(view.isDisplayable());
		}
	}
	@Test
	void test5() {
		view.userID = "UID1";
		view.paymentID = "PID1";
	    view.roomIDTextField.setText("ROOOOOOO1");
		when(service.createBooking(anyString(), anyString(), any(), any(), any(), any(), anyString())).thenReturn("TBgdf1");
		try (MockedStatic<JOptionPane> msgMock = mockStatic(JOptionPane.class)) {
			view.bookRoomButton.doClick();
			msgMock.verify(() -> JOptionPane.showMessageDialog(null, "Your BookingID is TBgdf1"));
			verify(view).dispose();
            assertFalse(view.isDisplayable());
		}
	}
	@Test
	void test6() {
		view.userID = "UID1";
		view.paymentID = "PID1";
	    view.roomIDTextField.setText("ROOOOOOO1");
		when(service.createBooking(anyString(), anyString(), any(), any(), any(), any(), anyString())).thenReturn("Tn5y4B1");
		try (MockedStatic<JOptionPane> msgMock = mockStatic(JOptionPane.class)) {
			view.bookRoomButton.doClick();
			msgMock.verify(() -> JOptionPane.showMessageDialog(null, "Your BookingID is Tn5y4B1"));
			verify(view).dispose();
            assertFalse(view.isDisplayable());
		}
	}
	@Test
	void test7() {
		view.userID = "UID1";
		view.paymentID = "PID1";
	    view.roomIDTextField.setText("ROOOOOOO1");
		when(service.createBooking(anyString(), anyString(), any(), any(), any(), any(), anyString())).thenReturn("TBvs1");
		try (MockedStatic<JOptionPane> msgMock = mockStatic(JOptionPane.class)) {
			view.bookRoomButton.doClick();
			msgMock.verify(() -> JOptionPane.showMessageDialog(null, "Your BookingID is TBvs1"));
			verify(view).dispose();
            assertFalse(view.isDisplayable());
		}
	}
	@Test
	void test8() {
		view.userID = "UID1";
		view.paymentID = "PID1";
	    view.roomIDTextField.setText("ROOOOOOO1");
		when(service.createBooking(anyString(), anyString(), any(), any(), any(), any(), anyString())).thenReturn("TBy wneytkm1");
		try (MockedStatic<JOptionPane> msgMock = mockStatic(JOptionPane.class)) {
			view.bookRoomButton.doClick();
			msgMock.verify(() -> JOptionPane.showMessageDialog(null, "Your BookingID is TBy wneytkm1"));
			verify(view).dispose();
            assertFalse(view.isDisplayable());
		}
	}
	@Test
	void test9() {
		view.userID = "UID1";
		view.paymentID = "PID1";
	    view.roomIDTextField.setText("ROOOOOOO1");
		when(service.createBooking(anyString(), anyString(), any(), any(), any(), any(), anyString())).thenReturn("TBrcea1");
		try (MockedStatic<JOptionPane> msgMock = mockStatic(JOptionPane.class)) {
			view.bookRoomButton.doClick();
			msgMock.verify(() -> JOptionPane.showMessageDialog(null, "Your BookingID is TBrcea1"));
			verify(view).dispose();
            assertFalse(view.isDisplayable());
		}
	}
}
