package test.java.org.apache.maven.archetypes.maven_archetype_quickstart.Bhavya;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import Model.Payment.Payment;
import Repository.PaymentRepository;

public class PaymentRepositoryTest {

    private PaymentRepository repo;

    @Before
    public void setUp() {
        repo = PaymentRepository.getInstance();
    }

    @Test
    public void testSingletonInstance() {
        PaymentRepository r1 = PaymentRepository.getInstance();
        PaymentRepository r2 = PaymentRepository.getInstance();
        assertSame("Should return the same instance", r1, r2);
    }

    @Test
    public void testSaveAndRetrieve() {
        String paymentId = "PAY-TEST-" + System.currentTimeMillis();
        Payment payment = new Payment(paymentId, 150.0);
        
        repo.save(payment);

        Payment retrieved = findPaymentById(paymentId);
        assertNotNull("Should find saved payment", retrieved);
        assertEquals(150.0, retrieved.getAmount(), 0.01);
    }

    @Test
    public void testPaymentCompletionPersistence() {
        String paymentId = "PAY-COMP-" + System.currentTimeMillis();
        Payment payment = new Payment(paymentId, 50.0);
        payment.completePayment(); // Mark completed
        
        repo.save(payment);

        Payment retrieved = findPaymentById(paymentId);
        assertNotNull(retrieved);
        assertTrue("Payment status should be COMPLETED", retrieved.isPaid());
    }

    @Test
    public void testPendingPaymentPersistence() {
        String paymentId = "PAY-PEND-" + System.currentTimeMillis();
        Payment payment = new Payment(paymentId, 75.0);
        // Do not complete
        
        repo.save(payment);

        Payment retrieved = findPaymentById(paymentId);
        assertNotNull(retrieved);
        assertFalse("Payment status should be PENDING (not paid)", retrieved.isPaid());
    }

    @Test
    public void testUpdatePaymentAmount() {
        String paymentId = "PAY-UPDATE-" + System.currentTimeMillis();
        Payment p1 = new Payment(paymentId, 100.0);
        repo.save(p1);

        Payment p2 = new Payment(paymentId, 200.0); // Same ID, new amount
        repo.save(p2);

        Payment retrieved = findPaymentById(paymentId);
        assertEquals("Amount should be updated", 200.0, retrieved.getAmount(), 0.01);
    }

    @Test
    public void testSaveUpdatesExistingCount() {
        String paymentId = "PAY-COUNT-" + System.currentTimeMillis();
        repo.save(new Payment(paymentId, 10.0));
        int count1 = repo.findAll().size();

        repo.save(new Payment(paymentId, 20.0));
        int count2 = repo.findAll().size();

        assertEquals("Saving same ID should not increase count", count1, count2);
    }

    @Test
    public void testFindAllReturnsCopy() {
        List<Payment> list1 = repo.findAll();
        int size1 = list1.size();

        Payment p = new Payment("PAY-NEW-" + System.currentTimeMillis(), 10.0);
        repo.save(p);

        List<Payment> list2 = repo.findAll();
        assertEquals("List size should increase by 1", size1 + 1, list2.size());
        
        // Ensure modifying the returned list doesn't affect the repo
        list2.clear();
        assertFalse("Repo should not be empty after clearing result list", repo.findAll().isEmpty());
    }

    @Test
    public void testHighPrecisionAmount() {
        String paymentId = "PAY-PREC-" + System.currentTimeMillis();
        double amount = 123.45678;
        Payment p = new Payment(paymentId, amount);
        repo.save(p);

        Payment retrieved = findPaymentById(paymentId);
        assertEquals(amount, retrieved.getAmount(), 0.00001);
    }

    @Test
    public void testZeroAmount() {
        String paymentId = "PAY-ZERO-" + System.currentTimeMillis();
        Payment p = new Payment(paymentId, 0.0);
        repo.save(p);

        Payment retrieved = findPaymentById(paymentId);
        assertEquals(0.0, retrieved.getAmount(), 0.01);
    }

    @Test
    public void testSaveMultiplePayments() {
        int startCount = repo.findAll().size();
        for(int i=0; i<5; i++) {
            repo.save(new Payment("BULK-" + i + "-" + System.currentTimeMillis(), 10.0));
        }
        assertEquals("Should have added 5 payments", startCount + 5, repo.findAll().size());
    }

    // Helper since PaymentRepository might not expose findById
    private Payment findPaymentById(String id) {
        return repo.findAll().stream()
                .filter(p -> p.getPaymentId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
