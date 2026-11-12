package org.example;

public class TransactionValidator {

    public boolean isValid(PaymentTransaction transaction) {

        if (transaction == null) {
            return false;
        }

        if (transaction.getTransactionId() == null ||
                transaction.getTransactionId().trim().isEmpty()) {
            return false;
        }

        if (transaction.getAmount() <= 0) {
            return false;
        }

        if (transaction.getStatus() == null ||
                transaction.getStatus().trim().isEmpty()) {
            return false;
        }

        return true;
    }
}