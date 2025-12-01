package maven_archetype_quickstart.Bhavya;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import Model.Payment.Payment;

public class PaymentTest {

    private Payment payment;

    @Before
    public void setUp() {
        // Initialize a standard payment before each test
        payment = new Payment("PAY-101", 50.0);
    }

    @Test
    public void testPaymentCreation() {
        assertNotNull("Payment object should be created", payment);
        assertEquals("PAY-101", payment.getPaymentId());
        assertEquals(50.0, payment.getAmount(), 0.01);
    }

    @Test
    public void testInitialStatusIsPending() {
        assertEquals("PENDING", payment.getStatus());
        assertFalse("New payment should not be marked as paid", payment.isPaid());
    }

    @Test
    public void testCompletePayment() {
        payment.completePayment();
        assertEquals("COMPLETED", payment.getStatus());
        assertTrue("Completed payment should return true for isPaid()", payment.isPaid());
    }

    @Test
    public void testGetAmountPrecision() {
        Payment p = new Payment("P2", 10.12345);
        assertEquals(10.12345, p.getAmount(), 0.00001);
    }

    @Test
    public void testZeroAmount() {
        Payment p = new Payment("P3", 0.0);
        assertEquals(0.0, p.getAmount(), 0.01);
        assertEquals("PENDING", p.getStatus());
    }

    @Test
    public void testNegativeAmount() {
        // Depending on business logic, this might be allowed (refund) or invalid.
        // Assuming the class is a simple POJO, it stores what it's given.
        Payment p = new Payment("P4", -25.0);
        assertEquals(-25.0, p.getAmount(), 0.01);
    }

    @Test
    public void testEmptyId() {
        Payment p = new Payment("", 100.0);
        assertEquals("", p.getPaymentId());
    }

    @Test
    public void testNullId() {
        Payment p = new Payment(null, 100.0);
        assertNull(p.getPaymentId());
    }

    @Test
    public void testIsPaidLogicForNonCompleted() {
        // Verify only "COMPLETED" string triggers true
        assertFalse(payment.isPaid());
        
        // Even if we manually manipulated status (not possible via setters here, but hypothetically)
        // ensure default state remains robust.
        assertEquals("PENDING", payment.getStatus());
    }

    @Test
    public void testCompletePaymentTwice() {
        // Idempotency check
        payment.completePayment();
        payment.completePayment();
        assertEquals("COMPLETED", payment.getStatus());
        assertTrue(payment.isPaid());
    }
}