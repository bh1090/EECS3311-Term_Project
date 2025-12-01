package test.java.org.apache.maven.archetypes.maven_archetype_quickstart.Oscar;

import static org.mockito.Mockito.*;

import javax.swing.*;

import org.junit.jupiter.api.*;
import org.mockito.MockedStatic;

import Application.SessionData;
import Controller.RescheduleBookingController;
import Model.User.StudentUser;
import Service.RoomService;
import View.RescheduleBookingView;

public class RescheduleBookingControllerTest {
	RescheduleBookingView view;
    RoomService service;
    RescheduleBookingController controller;
    MockedStatic<SessionData> sessionMock;
    @BeforeEach
    void setUp() {
    	sessionMock = mockStatic(SessionData.class);
    	StudentUser fakeUser = new StudentUser("User54", "mail7", "pwd");
    	sessionMock.when(SessionData::getCurrentUser).thenReturn(fakeUser);
        view = mock(RescheduleBookingView.class);
        service = mock(RoomService.class);
        
        view.bookingIDTextField = new JTextField(1);
        view.backButton = new JButton("Back");
        view.rescheduleBookingButton = new JButton("Reschedule Booking");
        
        controller = new RescheduleBookingController(view, service);
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
		view.bookingIDTextField.setText("TBOOKINH1");
		view.rescheduleBookingButton.doClick();
		verify(service).cancelBooking("TBOOKINH1");
		verify(view).dispose();
		Assertions.assertFalse(view.isDisplayable());
	}
	@Test
	void test2() {
		view.bookingIDTextField.setText("TBOOKINH12");
		view.rescheduleBookingButton.doClick();
		verify(service).cancelBooking("TBOOKINH12");
		verify(view).dispose();
		Assertions.assertFalse(view.isDisplayable());
	}
	@Test
	void test3() {
		view.bookingIDTextField.setText("TBOOK3INH1");
		view.rescheduleBookingButton.doClick();
		verify(service).cancelBooking("TBOOK3INH1");
		verify(view).dispose();
		Assertions.assertFalse(view.isDisplayable());
	}
	@Test
	void test4() {
		view.bookingIDTextField.setText("TBOOK4INH1");
		view.rescheduleBookingButton.doClick();
		verify(service).cancelBooking("TBOOK4INH1");
		verify(view).dispose();
		Assertions.assertFalse(view.isDisplayable());
	}
	@Test
	void test5() {
		view.bookingIDTextField.setText("TBOOK5INH1");
		view.rescheduleBookingButton.doClick();
		verify(service).cancelBooking("TBOOK5INH1");
		verify(view).dispose();
		Assertions.assertFalse(view.isDisplayable());
	}
	@Test
	void test6() {
		view.bookingIDTextField.setText("TBO6OKINH1");
		view.rescheduleBookingButton.doClick();
		verify(service).cancelBooking("TBO6OKINH1");
		verify(view).dispose();
		Assertions.assertFalse(view.isDisplayable());
	}
	@Test
	void test7() {
		view.bookingIDTextField.setText("TB7OOKINH1");
		view.rescheduleBookingButton.doClick();
		verify(service).cancelBooking("TB7OOKINH1");
		verify(view).dispose();
		Assertions.assertFalse(view.isDisplayable());
	}
	@Test
	void test8() {
		view.bookingIDTextField.setText("TBOOK8INH1");
		view.rescheduleBookingButton.doClick();
		verify(service).cancelBooking("TBOOK8INH1");
		verify(view).dispose();
		Assertions.assertFalse(view.isDisplayable());
	}
	@Test
	void test9() {
		view.bookingIDTextField.setText("TBOOK9INH1");
		view.rescheduleBookingButton.doClick();
		verify(service).cancelBooking("TBOOK9INH1");
		verify(view).dispose();
		Assertions.assertFalse(view.isDisplayable());
	}
}
