public class ReturnValue {
    public int addNumbers() {
        int a = 10, b = 20;
        return a + b;
    }

    public static void main(String[] args) {
        ReturnValue rv = new ReturnValue();
        int sum = rv.addNumbers();
        System.out.println("The sum is: " + sum);
    }

}