class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }
}

public class BankBalanceException {
    private static void withdraw(double balance, double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Withdrawal exceeds the available balance.");
        }

        System.out.println("Remaining balance: " + (balance - amount));
    }

    public static void main(String[] args) {
        try {
            withdraw(500.0, 750.0);
        } catch (InsufficientBalanceException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
