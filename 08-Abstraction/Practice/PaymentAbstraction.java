package Practice;

public class PaymentAbstraction {
    public static void main(String[] args) {
        PaymentMethod payment = new CardPayment("**** 4242");
        payment.pay(799.00);
    }
}

abstract class PaymentMethod {
    public final void pay(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Payment amount must be positive.");
        }
        authorize(amount);
        capture(amount);
    }

    protected abstract void authorize(double amount);

    protected abstract void capture(double amount);
}

class CardPayment extends PaymentMethod {
    private final String maskedCardNumber;

    CardPayment(String maskedCardNumber) {
        if (maskedCardNumber == null || maskedCardNumber.isBlank()) {
            throw new IllegalArgumentException("Masked card number must not be blank.");
        }
        this.maskedCardNumber = maskedCardNumber;
    }

    @Override
    protected void authorize(double amount) {
        System.out.printf("Authorizing %.2f on card %s.%n", amount, maskedCardNumber);
    }

    @Override
    protected void capture(double amount) {
        System.out.printf("Captured %.2f from card.%n", amount);
    }
}
