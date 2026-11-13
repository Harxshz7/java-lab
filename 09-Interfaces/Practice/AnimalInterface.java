package Practice;

public class AnimalInterface {
    public static void main(String[] args) {
        Animal animal = new Dog("Bruno");
        animal.eat();
        animal.makeSound();
    }
}

interface Animal {
    void eat();

    void makeSound();
}

class Dog implements Animal {
    private final String name;

    Dog(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Woof!");
    }
}
