package Practice;

public class CountPositiveNegative {
    public static void main(String[] args) {
        int[] arr = { -5, 3, 0, -2, 7, 1, -8, 4 };
        int positiveCount = 0;
        int negativeCount = 0;

        for (int num : arr) {
            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            }
        }

        System.out.println("Number of positive elements: " + positiveCount);
        System.out.println("Number of negative elements: " + negativeCount);
    }

}
