public class InstanceVariables {
    String name;
    int age;

    public static void main(String[] args) {
        InstanceVariables firstPerson = new InstanceVariables();
        firstPerson.name = "Asha";
        firstPerson.age = 25;

        InstanceVariables secondPerson = new InstanceVariables();
        secondPerson.name = "Ravi";
        secondPerson.age = 30;

        System.out.println(firstPerson.name + " is " + firstPerson.age);
        System.out.println(secondPerson.name + " is " + secondPerson.age);
    }
}
