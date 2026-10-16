public class MethodOverriding {
    public static void main(String[] args) {
        OverrideNotification notification = new OverrideEmailNotification();
        notification.send();
    }
}

class OverrideNotification {
    public void send() {
        System.out.println("Sending a notification.");
    }
}

class OverrideEmailNotification extends OverrideNotification {
    @Override
    public void send() {
        System.out.println("Sending an email notification.");
    }
}
