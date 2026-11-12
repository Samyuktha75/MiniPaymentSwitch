import org.example.PaymentTransaction;

public class PaymentApplication {
    public static void main(String[] args){
        System.out.println("welcomr");

        System.out.println("started");

        PaymentTransaction transaction=new PaymentTransaction("TXN1001",1000.0,"Paending");
        transaction.setstatus("Approved");
        System.out.println("Transaction ID: " + transaction.getTransactionId());
        System.out.println("Amount: " + transaction.getAmount());
        System.out.println("Status: " + transaction.getStatus());
    }
}
