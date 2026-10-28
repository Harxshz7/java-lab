package Practice;

public class AnimalSounds {
    public static void main(String[] args) {
        SoundAnimal[] animals = {
            new SoundDog(),
            new SoundCat(),
            new SoundCow()
        };

        for (SoundAnimal animal : animals) {
            animal.makeSound();
        }
    }
}

abstract class SoundAnimal {
    public abstract void makeSound();
}

class SoundDog extends SoundAnimal {
    @Override
    public void makeSound() {
        System.out.println("Dog: Woof!");
    }
}

class SoundCat extends SoundAnimal {
    @Override
    public void makeSound() {
        System.out.println("Cat: Meow!");
    }
}

class SoundCow extends SoundAnimal {
    @Override
    public void makeSound() {
        System.out.println("Cow: Moo!");
    }
}
