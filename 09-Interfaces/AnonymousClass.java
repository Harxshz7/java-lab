public class AnonymousClass {
    public static void main(String[] args) {
        Greeting greeting = new Greeting() {
            @Override
            public void sayHello(String name) {
                System.out.println("Hello, " + name + "!");
            }
        };
        greeting.sayHello("Student");
    }
}

interface Greeting {
    void sayHello(String name);
}
