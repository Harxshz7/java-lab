public class RuntimePolymorphism {
    public static void main(String[] args) {
        RuntimeAnimal animal = new RuntimeDog();
        animal.speak();

        animal = new RuntimeCat();
        animal.speak();
    }
}

class RuntimeAnimal {
    public void speak() {
        System.out.println("The animal makes a sound.");
    }
}

class RuntimeDog extends RuntimeAnimal {
    @Override
    public void speak() {
        System.out.println("The dog barks.");
    }
}

class RuntimeCat extends RuntimeAnimal {
    @Override
    public void speak() {
        System.out.println("The cat meows.");
    }
}
