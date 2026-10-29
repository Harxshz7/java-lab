package Practice;

public class PaymentMethod {
    public static void main(String[] args) {
        PaymentOption[] payments = {
            new CardPaymentOption(),
            new CashPaymentOption()
        };

        for (PaymentOption payment : payments) {
            payment.pay(49.99);
        }
    }
}

interface PaymentOption {
    void pay(double amount);
}

class CardPaymentOption implements PaymentOption {
    @Override
    public void pay(double amount) {
        System.out.printf("Paid $%.2f by card.%n", amount);
    }
}

class CashPaymentOption implements PaymentOption {
    @Override
    public void pay(double amount) {
        System.out.printf("Paid $%.2f in cash.%n", amount);
    }
}
