public class IncrementDecrement {

    public static void main(String[] args) {

        System.out.println("===== PRE-INCREMENT (++a) =====");
        int a = 10;
        System.out.println("Initial value : " + a);
        System.out.println("Result        : " + (++a));
        System.out.println("After         : " + a);

        System.out.println("\n===== POST-INCREMENT (a++) =====");
        int b = 10;
        System.out.println("Initial value : " + b);
        System.out.println("Result        : " + (b++));
        System.out.println("After         : " + b);

        System.out.println("\n===== PRE-DECREMENT (--a) =====");
        int c = 10;
        System.out.println("Initial value : " + c);
        System.out.println("Result        : " + (--c));
        System.out.println("After         : " + c);

        System.out.println("\n===== POST-DECREMENT (a--) =====");
        int d = 10;
        System.out.println("Initial value : " + d);
        System.out.println("Result        : " + (d--));
        System.out.println("After         : " + d);
    }
}