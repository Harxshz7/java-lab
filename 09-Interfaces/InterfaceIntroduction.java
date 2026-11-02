public class InterfaceIntroduction {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.eat();
        animal.makeSound();
    }
}

interface Animal {
    void eat();

    void makeSound();
}

class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("Dog is eating.");
    }

    @Override
    public void makeSound() {
        System.out.println("Dog says: Woof!");
    }
}
