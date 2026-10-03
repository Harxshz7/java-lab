public class InstanceMethods {
    private String accountHolder;
    private double balance;

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    void displayBalance() {
        System.out.println(accountHolder + " balance: " + balance);
    }

    public static void main(String[] args) {
        InstanceMethods account = new InstanceMethods();
        account.accountHolder = "Maya";
        account.deposit(1500);
        account.displayBalance();
    }
}
