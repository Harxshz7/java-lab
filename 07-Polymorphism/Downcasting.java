public class Downcasting {
    public static void main(String[] args) {
        DowncastAnimal animal = new DowncastDog();

        if (animal instanceof DowncastDog) {
            DowncastDog dog = (DowncastDog) animal;
            dog.fetch();
        }
    }
}

class DowncastAnimal {
    public void eat() {
        System.out.println("The animal eats.");
    }
}

class DowncastDog extends DowncastAnimal {
    public void fetch() {
        System.out.println("The dog fetches the ball.");
    }
}
