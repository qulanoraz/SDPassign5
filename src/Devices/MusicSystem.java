package Devices;

public class MusicSystem implements Device {
    private int volume = 20;

    @Override
    public void on() {
        System.out.println("Music system is now ON");
    }

    @Override
    public void off() {
        System.out.println("Music system if now OFF");
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("- Music system`s volume is " + volume + " now");
    }
}
