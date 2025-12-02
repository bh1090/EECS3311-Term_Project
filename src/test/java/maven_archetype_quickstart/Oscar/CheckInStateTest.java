package maven_archetype_quickstart.Oscar;

import static com.github.stefanbirkner.systemlambda.SystemLambda.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Model.Room.Booking;
import Model.State.CheckInState;

public class CheckInStateTest {
	private CheckInState state;
	private Booking booking;
	@BeforeEach
	public void setUp() {
        // runs before each test
		this.booking = new Booking(null, null, null, null, null, null, null, null);
        this.state = new CheckInState();
    }
	@Test
	void test0() throws Exception {
		String out = tapSystemOut(() -> {
			this.state.cancel(booking);
        });
		assertEquals("Cannot cancel. Guest is already here.", out.trim());
	}
	@Test
	void test1() throws Exception {
		String out = tapSystemOut(() -> {
			this.state.checkIn(booking);
        });
		assertEquals("Already checked in.", out.trim());
	}
	@Test
	void test2() throws Exception {
		String out = tapSystemOut(() -> {
			this.state.checkOut(booking);
        });
		assertEquals("Guest checking out. Booking complete.", out.trim());
	}
	@Test
	void test3() {
		this.state.checkOut(booking);
		assertEquals(this.booking.getStatus(), "COMPLETED");
	}
	@Test
	void test4() {
		assertEquals(this.state.getStatus(), "CHECKED_IN");
	}
	@Test
	void test5() {
		assertNotEquals(this.state.getStatus(), "CANCELLED");
	}
	@Test
	void test6() {
		assertNotEquals(this.state.getStatus(), "CONFIRMED");
	}
	@Test
	void test7() {
		assertNotEquals(this.state.getStatus(), "COMPLETED");
	}
	@Test
	void test8() throws Exception {
		String out = tapSystemOut(() -> {
            state.cancel(null);
        });
		assertNotEquals("Booking cancelled.", out.trim());
	}
	@Test
	void test9() throws Exception {
		String out = tapSystemOut(() -> {
            state.cancel(null);
        });
		assertNotEquals("Cannot cancel a completed booking.", out.trim());
	}
}
