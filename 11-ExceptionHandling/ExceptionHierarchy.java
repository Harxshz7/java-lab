public class ExceptionHierarchy {
    public static void main(String[] args) {
        Class<?> type = ArithmeticException.class;

        while (type != null) {
            System.out.println(type.getName());
            type = type.getSuperclass();
        }
    }
}
