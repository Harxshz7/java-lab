
import java.util.ArrayList;

public class collectionClass {

    public static void main(String[] args) {
        ArrayList a1 = new ArrayList();
        a1.add(10);
        a1.add(1, 10.5);
        System.out.println("Size " + a1.size());
        System.out.println("Contains " + a1.contains(10));
        System.out.println("Empty " + a1.isEmpty());
        System.out.println("get " + a1.get(0));
        a1.remove(0);

        System.out.println("after remove by index: " + a1);
        System.out.println(a1);

        ArrayList a2 = new ArrayList();
        a2.add("hello");
        a2.add(true);
        a1.addAll(a2);
        System.out.println("After adding collection a2 : " + a1);
        a1.addAll(0, a2);
        System.out.println("After adding collection a2 by index : " + a1);
        System.out.println("after remove by object: " + a1.remove("hello"));
        a2.clear();
        System.out.println("clear" + a2);

    }
}