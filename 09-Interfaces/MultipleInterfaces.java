public class MultipleInterfaces {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone();
        phone.call();
        phone.takePhoto();
    }
}

interface Callable {
    void call();
}

interface Camera {
    void takePhoto();
}

class SmartPhone implements Callable, Camera {
    @Override
    public void call() {
        System.out.println("Making a phone call.");
    }

    @Override
    public void takePhoto() {
        System.out.println("Taking a photo.");
    }
}
