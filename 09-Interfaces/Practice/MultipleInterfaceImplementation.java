package Practice;

public class MultipleInterfaceImplementation {
    public static void main(String[] args) {
        SmartDevice device = new SmartDevice();
        device.connect();
        device.playMusic();
    }
}

interface Connectable {
    void connect();
}

interface MusicPlayer {
    void playMusic();
}

class SmartDevice implements Connectable, MusicPlayer {
    @Override
    public void connect() {
        System.out.println("Smart device connected.");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing music.");
    }
}
