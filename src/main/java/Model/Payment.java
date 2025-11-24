package Model;

// Represents a payment transaction.
public class Payment {
    private String paymentId;
    private double amount;
    private String status; // "PENDING", "COMPLETED", "REFUNDED"

    public Payment(String paymentId, double amount) {
        this.paymentId = paymentId;
        this.amount = amount;
        this.status = "PENDING";
    }

    public void completePayment() {
        this.status = "COMPLETED";
    }

    public boolean isPaid() {
        return "COMPLETED".equals(this.status);
    }
    
    // Getters
    public String getPaymentId() { 
    	return paymentId; }
    public double getAmount() { 
    	return amount; }
    public String getStatus() { 
    	return status; }
}