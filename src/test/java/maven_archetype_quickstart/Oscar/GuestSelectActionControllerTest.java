package maven_archetype_quickstart.Oscar;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.verify;

import javax.swing.JButton;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;

import Application.SessionData;
import Controller.GuestSelectActionController;
import Model.User.StudentUser;
import View.GuestSelectActionView;

public class GuestSelectActionControllerTest {
	private GuestSelectActionController controller;
    private GuestSelectActionView view;
	
	@BeforeEach
    void setUp() {
        view = mock(GuestSelectActionView.class);
        
        view.availableRoomsButton = new JButton("Available Rooms");
        view.bookRoomButton = new JButton("Book Room");
        view.rescheduleRoomButton = new JButton("Reschedule/Cancel Room");
        view.logoutButton = new JButton("Logout");
        view.checkinButton = new JButton("Checkin");
        view.checkoutButton = new JButton("Checkout");
        
        controller = new GuestSelectActionController(view, null);
    }
	@Test
	void test0() {
		try (MockedStatic<SessionData> sessionMock = mockStatic(SessionData.class)) {
		    StudentUser fakeUser = new StudentUser("name1", "testmail1", "pass");
		    sessionMock.when(SessionData::getCurrentUser).thenReturn(fakeUser);
		    view.availableRoomsButton.doClick();
			verify(view).dispose();
		}
	}
	@Test
	void test1() {
		try (MockedStatic<SessionData> sessionMock = mockStatic(SessionData.class)) {
		    StudentUser fakeUser = new StudentUser("name1", "testmail1", "pass");
		    sessionMock.when(SessionData::getCurrentUser).thenReturn(fakeUser);
		    view.bookRoomButton.doClick();
			verify(view).dispose();
		}
	}
	@Test
	void test2() {
		try (MockedStatic<SessionData> sessionMock = mockStatic(SessionData.class)) {
		    StudentUser fakeUser = new StudentUser("name1", "testmail1", "pass");
		    sessionMock.when(SessionData::getCurrentUser).thenReturn(fakeUser);
		    view.rescheduleRoomButton.doClick();
			verify(view).dispose();
		}
	}
	@Test
	void test3() {
		try (MockedStatic<SessionData> sessionMock = mockStatic(SessionData.class)) {
		    StudentUser fakeUser = new StudentUser("name1", "testmail1", "pass");
		    sessionMock.when(SessionData::getCurrentUser).thenReturn(fakeUser);
		    view.logoutButton.doClick();
			verify(view).dispose();
		}
	}
	@Test
	void test4() {
		try (MockedStatic<SessionData> sessionMock = mockStatic(SessionData.class)) {
		    StudentUser fakeUser = new StudentUser("name1", "testmail1", "pass");
		    sessionMock.when(SessionData::getCurrentUser).thenReturn(fakeUser);
		    view.checkinButton.doClick();
			verify(view).dispose();
		}
	}
	@Test
	void test5() {
		try (MockedStatic<SessionData> sessionMock = mockStatic(SessionData.class)) {
		    StudentUser fakeUser = new StudentUser("name1", "testmail1", "pass");
		    sessionMock.when(SessionData::getCurrentUser).thenReturn(fakeUser);
		    view.checkoutButton.doClick();
			verify(view).dispose();
		}
	}
	@Test
	void test6() { // diff
		try (MockedStatic<SessionData> sessionMock = mockStatic(SessionData.class)) {
		    StudentUser fakeUser = new StudentUser("name2", "testmail2", "pass2");
		    sessionMock.when(SessionData::getCurrentUser).thenReturn(fakeUser);
		    view.rescheduleRoomButton.doClick();
			verify(view).dispose();
		}
	}
	@Test
	void test7() {
		try (MockedStatic<SessionData> sessionMock = mockStatic(SessionData.class)) {
		    StudentUser fakeUser = new StudentUser("name3", "testmail3", "pas3");
		    sessionMock.when(SessionData::getCurrentUser).thenReturn(fakeUser);
		    view.rescheduleRoomButton.doClick();
			verify(view).dispose();
		}
	}
	@Test
	void test8() {
		try (MockedStatic<SessionData> sessionMock = mockStatic(SessionData.class)) {
		    StudentUser fakeUser = new StudentUser("name4", "test4ail1", "pa4s");
		    sessionMock.when(SessionData::getCurrentUser).thenReturn(fakeUser);
		    view.rescheduleRoomButton.doClick();
			verify(view).dispose();
		}
	}
	@Test
	void test9() {
		try (MockedStatic<SessionData> sessionMock = mockStatic(SessionData.class)) {
		    StudentUser fakeUser = new StudentUser("na5e1", "testm5il1", "p5ss");
		    sessionMock.when(SessionData::getCurrentUser).thenReturn(fakeUser);
		    view.rescheduleRoomButton.doClick();
			verify(view).dispose();
		}
	}
}
