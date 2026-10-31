package Practice;

public class AnimalAbstraction {
    public static void main(String[] args) {
        Animal animal = new Dog("Bruno");
        animal.eat();
        animal.makeSound();
    }
}

abstract class Animal {
    private final String name;

    protected Animal(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Animal name must not be blank.");
        }
        this.name = name;
    }

    protected String getName() {
        return name;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public abstract void makeSound();
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Woof!");
    }
}
