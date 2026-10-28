public class instanceofOperator {
    public static void main(String[] args) {
        InstanceAnimal animal = new InstanceDog();

        System.out.println("Is an animal? " + (animal instanceof InstanceAnimal));
        System.out.println("Is a dog? " + (animal instanceof InstanceDog));
        System.out.println("Is a cat? " + (animal instanceof InstanceCat));
    }
}

class InstanceAnimal {
}

class InstanceDog extends InstanceAnimal {
}

class InstanceCat extends InstanceAnimal {
}
