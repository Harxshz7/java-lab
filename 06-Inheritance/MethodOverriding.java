class OverridingNotification {
    void send() {
        System.out.println("Sending a notification.");
    }
}

public class MethodOverriding extends OverridingNotification {
    @Override
    void send() {
        System.out.println("Sending an email notification.");
    }

    public static void main(String[] args) {
        OverridingNotification notification = new MethodOverriding();
        notification.send();
    }
}
