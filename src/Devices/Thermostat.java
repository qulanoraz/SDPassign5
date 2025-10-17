package Devices;

public class Thermostat implements Device {
    private int temperature = 22;

    @Override
    public void on() {
        System.out.println("Thermostat is now ON");
    }

    @Override
    public void off() {
        System.out.println("Thermostat is now OFF");
    }

    public void setEcoMode() {
        temperature = 17;
        System.out.println("- Thermostat switched to ECO mode (" + temperature + "°C)");
    }
}
