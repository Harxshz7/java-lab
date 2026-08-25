public class ArrayMin {
    public static void main(String[] args) {
        int[] arr = { 8, 7, 4, 6, 3, 9 };
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Minimum element in the array: " + min);
    }
}
