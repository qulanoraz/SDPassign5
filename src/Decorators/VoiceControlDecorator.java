package Decorators;

import Devices.*;

public class VoiceControlDecorator extends DeviceDecorator {
    public VoiceControlDecorator(Device device) {
        super(device);
    }

    @Override
    public void on() {
        super.on();
        System.out.println("- Voice control is now ON");
    }

    @Override
    public void off() {
        super.off();
        System.out.println("- Voice control is now OFF");
    }
}
