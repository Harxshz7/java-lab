public class TypeCasting {

    public static void main(String[] args) {

        int num = 100;
        double d = num;

        System.out.println("Implicit Type Casting (Widening)");
        System.out.println("Integer value : " + num);
        System.out.println("Double value  : " + d);

        System.out.println();

        double pi = 3.14159;
        int value = (int) pi;

        System.out.println("Explicit Type Casting (Narrowing)");
        System.out.println("Double value  : " + pi);
        System.out.println("Integer value : " + value);

        System.out.println();

        char ch = 'A';
        int ascii = ch;

        System.out.println("Character to Integer");
        System.out.println("Character : " + ch);
        System.out.println("ASCII Value : " + ascii);

        System.out.println();

        int code = 66;
        char letter = (char) code;

        System.out.println("Integer to Character");
        System.out.println("Integer : " + code);
        System.out.println("Character : " + letter);
    }
}
