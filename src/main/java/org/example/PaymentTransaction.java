package org.example;

public class PaymentTransaction {

    private String transactionId;
    private double amount;
    private String status;

    public PaymentTransaction(String transactionId,double amount,String status) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.status = status;
    }
        public String getTransactionId() {
            return transactionId;
        }

        public double getAmount() {
            return amount;
        }

        public String getStatus() {
            return status;
        }

  public void setstatus(String status){
        this.status=status;
  }

}