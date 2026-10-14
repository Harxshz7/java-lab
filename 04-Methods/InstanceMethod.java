public class InstanceMethod {
    // Instance method
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        InstanceMethod instance = new InstanceMethod();
        int sum = instance.add(5, 10);
        System.out.println("Sum: " + sum); // Output: Sum: 15
    }
}
