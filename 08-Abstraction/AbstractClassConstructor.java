public class AbstractClassConstructor {
    public static void main(String[] args) {
        Account account = new SavingsAccount("SA-1001", 2500);
        account.printSummary();
        account.calculateInterest();
    }
}

abstract class Account {
    private final String accountNumber;
    protected double balance;

    protected Account(String accountNumber, double openingBalance) {
        if (accountNumber == null || accountNumber.isBlank()) {
            throw new IllegalArgumentException("Account number must not be blank.");
        }
        if (openingBalance < 0) {
            throw new IllegalArgumentException("Opening balance cannot be negative.");
        }
        this.accountNumber = accountNumber;
        this.balance = openingBalance;
    }

    public void printSummary() {
        System.out.printf("%s: balance %.2f%n", accountNumber, balance);
    }

    public abstract void calculateInterest();
}

class SavingsAccount extends Account {
    SavingsAccount(String accountNumber, double openingBalance) {
        super(accountNumber, openingBalance);
    }

    @Override
    public void calculateInterest() {
        double interest = balance * 0.04;
        System.out.printf("Annual interest: %.2f%n", interest);
    }
}
