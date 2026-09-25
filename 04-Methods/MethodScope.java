class MethodScope {

    public static void main(String[] args) {
        int a = 20;
        int b = 30;
        add(a, b);
        System.out.println(a + " " + b);
    }

    public static void add(int a, int b) {
        a = 30;
        b = 20;
        System.out.println(a + " " + b);

    }
}