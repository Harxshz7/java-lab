public class ArrayCopy {
    public static void main(String[] args) {
        int[] orarray = { 1, 2, 3, 4, 5 };
        int[] newarray = new int[orarray.length];
        for (int i = 0; i < orarray.length; i++) {
            newarray[i] = orarray[i];
        }
        System.out.println("Original Array:");
        for (int i = 0; i < orarray.length; i++) {
            System.out.print(orarray[i] + " ");
        }
        System.out.println("\nCopied Array:");
        for (int i = 0; i < newarray.length; i++) {
            System.out.print(newarray[i] + " ");
        }
    }

}
