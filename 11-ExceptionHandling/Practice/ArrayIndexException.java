public class ArrayIndexException {
    public static void main(String[] args) {
        int[] values = { 4, 8, 12 };
        int index = 5;

        try {
            System.out.println(values[index]);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Index " + index + " is outside the array bounds.");
        }
    }
}
