public class StaticMembers {
    private static int objectCount;

    public StaticMembers() {
        objectCount++;
    }

    public static int getObjectCount() {
        return objectCount;
    }

    public static void main(String[] args) {
        new StaticMembers();
        new StaticMembers();
        System.out.println("Objects created: " + StaticMembers.getObjectCount());
    }
}
