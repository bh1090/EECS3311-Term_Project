package maven_archetype_quickstart.Oscar;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static com.github.stefanbirkner.systemlambda.SystemLambda.*;

import Model.State.CancelledState;

public class CancelledStateTest {
	
	@Test
	void test0() throws Exception {
		CancelledState state = new CancelledState();
		String out = tapSystemOut(() -> {
            state.cancel(null);
        });
		assertEquals("Error: Booking was cancelled.", out.trim());
	}
	@Test
	void test1() throws Exception {
		CancelledState state = new CancelledState();
		String out = tapSystemOut(() -> {
            state.checkIn(null);
        });
		assertEquals("Error: Booking was cancelled.", out.trim());
	}
	@Test
	void test2() throws Exception {
		CancelledState state = new CancelledState();
		String out = tapSystemOut(() -> {
            state.checkOut(null);
        });
		assertEquals("Error: Booking was cancelled.", out.trim());
	}
	@Test
	void test3() {
		CancelledState state = new CancelledState();
        assertEquals("CANCELLED", state.getStatus());
	}
	@Test
	void test4() {
		CancelledState state = new CancelledState();
        assertNotEquals("CHECKED_IN", state.getStatus());
	}
	@Test
	void test5() {
		CancelledState state = new CancelledState();
        assertNotEquals("COMPLETED", state.getStatus());
	}
	@Test
	void test6() {
		CancelledState state = new CancelledState();
        assertNotEquals("CONFIRMED", state.getStatus());
	}
	@Test
	void test7() throws Exception {
		CancelledState state = new CancelledState();
		String out = tapSystemOut(() -> {
            state.cancel(null);
        });
		assertNotEquals("Booking cancelled.", out.trim());
	}
	@Test
	void test8() throws Exception {
		CancelledState state = new CancelledState();
		String out = tapSystemOut(() -> {
            state.cancel(null);
        });
		assertNotEquals("Cannot cancel a completed booking.", out.trim());
	}
	@Test
	void test9() throws Exception {
		CancelledState state = new CancelledState();
		String out = tapSystemOut(() -> {
            state.cancel(null);
        });
		assertNotEquals("Cannot cancel. Guest is already here.", out.trim());
	}
}
