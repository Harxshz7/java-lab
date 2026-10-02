public class Encapsulation {
    private int balance;

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public int getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        Encapsulation account = new Encapsulation();
        account.deposit(500);
        System.out.println("Balance: " + account.getBalance());
    }
}
