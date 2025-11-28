package Repository;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import Model.Payment.Payment;
import Database.Database;
/**
 * Repository for managing Payment data persistence via CSV.
 */
public class PaymentRepository {
    private static PaymentRepository instance = null;
    private List<Payment> payments = new ArrayList<>();

    private PaymentRepository() {
        loadPaymentsFromCSV();
    }

    public static synchronized PaymentRepository getInstance() {
        if (instance == null) {
            instance = new PaymentRepository();
        }
        return instance;
    }

    public void save(Payment payment) {
        payments.removeIf(p -> p.getPaymentId().equals(payment.getPaymentId()));
        payments.add(payment);
        savePaymentsToCSV();
    }

    public List<Payment> findAll() { return new ArrayList<>(payments); }

    private void loadPaymentsFromCSV() {
        payments.clear();
        File file = new File(Database.PAYMENT_FILE);
        if (!file.exists()) return;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            br.readLine(); 
            while ((line = br.readLine()) != null) {
                String[] val = line.split(",");
                if (val.length < 3) continue;

                String pId = val[0].trim();
                String amountStr = val[1].trim();
                String status = val[2].trim();

                double amount = Double.parseDouble(amountStr);

                Payment p = new Payment(pId, amount);
                if ("COMPLETED".equalsIgnoreCase(status)) {
                    p.completePayment();
                }
                payments.add(p);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void savePaymentsToCSV() {
        try (PrintWriter pw = new PrintWriter(new FileWriter(Database.PAYMENT_FILE))) {
            pw.println("paymentId,amount,status");
            for (Payment p : payments) {
                pw.println(p.getPaymentId() + "," + p.getAmount() + "," + p.getStatus());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}