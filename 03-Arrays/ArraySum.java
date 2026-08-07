public class ArraySum {
    public static void main(String[] args) {
        int[] number = { 5, 10, 15, 20, 25 };
        int sum = 0;
        for (int num : number) {
            sum = sum + num;
        }
        System.out.println("sum is:" + sum);
    }
}
