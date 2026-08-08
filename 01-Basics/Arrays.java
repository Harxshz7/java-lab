public class Arrays {
    public static void main(String[] args) {
        System.out.println("array with out new keyword");
        int[] numbers = { 10, 2, 3, 4, 5 };
        numbers[0] = 1;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("array with new keyword");
        int[] numbers2 = new int[5];
        numbers2[0] = 10;
        numbers2[1] = 20;
        numbers2[2] = 30;
        numbers2[3] = 40;
        numbers2[4] = 50;
        for (int i = 0; i < numbers2.length; i++) {
            System.out.println(numbers2[i]);
        }

    }

}
