package Devices;

public class Light implements Device {
    @Override
    public void on() {
        System.out.println("Light is now ON");
    }

    @Override
    public void off() {
        System.out.println("Light is now OFF");
    }
}
