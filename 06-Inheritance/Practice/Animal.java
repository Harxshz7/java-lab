package Practice;

public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " eats food.");
    }

    public static void main(String[] args) {
        Animal animal = new Animal("Animal");
        animal.eat();
        Dog dog = new Dog("Bruno");
        dog.eat();
        dog.speak();
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    void speak() {
        System.out.println(name + " barks.");
    }
}
