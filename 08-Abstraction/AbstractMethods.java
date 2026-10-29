public class AbstractMethods {
    public static void main(String[] args) {
        Notification notification = new EmailNotification();
        notification.send("Release completed successfully.");
    }
}

abstract class Notification {
    public abstract void send(String message);
}

class EmailNotification extends Notification {
    @Override
    public void send(String message) {
        System.out.println("Email notification: " + message);
    }
}
