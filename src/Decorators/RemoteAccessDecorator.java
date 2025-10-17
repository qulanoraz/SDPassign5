package Decorators;

import Devices.*;

public class RemoteAccessDecorator extends DeviceDecorator {
    public RemoteAccessDecorator(Device device) {
        super(device);
    }

    @Override
    public void on() {
        super.on();
        System.out.println("- Remote access is now ON");
    }

    @Override
    public void off() {
        super.off();
        System.out.println("- Remote access is no OFF");
    }
}
