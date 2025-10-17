package Devices;

public class SecurityCamera implements Device {
    @Override
    public void on() {
        System.out.println("Security cameras are now ON");
    }

    @Override
    public void off() {
        System.out.println("Security cameras are now OFF");
    }
}
