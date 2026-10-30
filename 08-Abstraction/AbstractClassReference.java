public class AbstractClassReference {
    public static void main(String[] args) {
        Payment payment = new CardPayment();
        payment.process(125.50);
    }
}

abstract class Payment {
    public final void process(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Payment amount must be positive.");
        }
        validate(amount);
        complete(amount);
    }

    protected abstract void validate(double amount);

    protected abstract void complete(double amount);
}

class CardPayment extends Payment {
    @Override
    protected void validate(double amount) {
        System.out.printf("Validating card payment of %.2f.%n", amount);
    }

    @Override
    protected void complete(double amount) {
        System.out.printf("Card payment of %.2f completed.%n", amount);
    }
}
