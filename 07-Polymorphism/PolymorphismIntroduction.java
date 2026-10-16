public class PolymorphismIntroduction {
    public static void main(String[] args) {
        IntroAnimal[] animals = {
            new IntroDog(),
            new IntroCat()
        };

        for (IntroAnimal animal : animals) {
            animal.makeSound();
        }
    }
}

class IntroAnimal {
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

class IntroDog extends IntroAnimal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}

class IntroCat extends IntroAnimal {
    @Override
    public void makeSound() {
        System.out.println("The cat meows.");
    }
}
