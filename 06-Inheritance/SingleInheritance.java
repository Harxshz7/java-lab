class SingleAnimal {
    void eat() {
        System.out.println("Animal eats.");
    }
}

public class SingleInheritance extends SingleAnimal {
    void bark() {
        System.out.println("Dog barks.");
    }

    public static void main(String[] args) {
        SingleInheritance dog = new SingleInheritance();
        dog.eat();
        dog.bark();
    }
}
