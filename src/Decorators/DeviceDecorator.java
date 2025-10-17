package Decorators;

import Devices.*;

public abstract class DeviceDecorator implements Device {
    protected Device device;

    public DeviceDecorator(Device device) {
        this.device = device;
    }

    public void on() {
        device.on();
    }

    public void off() {
        device.off();
    }
}
