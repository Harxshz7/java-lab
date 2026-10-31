package Practice;

public class BankAccountAbstraction {
    public static void main(String[] args) {
        BankAccount account = new SavingsAccount("SA-2001", 1000);
        account.deposit(250);
        account.withdraw(100);
        account.applyInterest();
        account.printBalance();
    }
}

abstract class BankAccount {
    private final String accountNumber;
    private double balance;

    protected BankAccount(String accountNumber, double openingBalance) {
        if (accountNumber == null || accountNumber.isBlank()) {
            throw new IllegalArgumentException("Account number must not be blank.");
        }
        if (openingBalance < 0) {
            throw new IllegalArgumentException("Opening balance cannot be negative.");
        }
        this.accountNumber = accountNumber;
        this.balance = openingBalance;
    }

    public final void deposit(double amount) {
        validatePositiveAmount(amount);
        balance += amount;
    }

    public final boolean withdraw(double amount) {
        validatePositiveAmount(amount);
        if (amount > balance) {
            return false;
        }
        balance -= amount;
        return true;
    }

    protected final double getBalance() {
        return balance;
    }

    public final void printBalance() {
        System.out.printf("%s balance: %.2f%n", accountNumber, balance);
    }

    private void validatePositiveAmount(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive.");
        }
    }

    public abstract void applyInterest();
}

class SavingsAccount extends BankAccount {
    SavingsAccount(String accountNumber, double openingBalance) {
        super(accountNumber, openingBalance);
    }

    @Override
    public void applyInterest() {
        deposit(getBalance() * 0.04);
    }
}
