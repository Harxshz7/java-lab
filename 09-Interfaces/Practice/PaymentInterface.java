package Practice;

public class PaymentInterface {
    public static void main(String[] args) {
        Payment payment = new CardPayment();
        payment.pay(1500);
    }
}

interface Payment {
    void pay(double amount);
}

class CardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid Rs. " + amount + " using a card.");
    }
}
