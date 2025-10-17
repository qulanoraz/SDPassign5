package Decorators;

import Devices.*;

public class EnergySavingDecorator extends DeviceDecorator {
    public EnergySavingDecorator(Device device) {
        super(device);
    }

    @Override
    public void on() {
        super.on();
        System.out.println("- Energy saving mode is now ON");
    }

    @Override
    public void off() {
        super.off();
        System.out.println("- Energy saving mode is now OFF");
    }
}
