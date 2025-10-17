import Decorators.EnergySavingDecorator;
import Decorators.RemoteAccessDecorator;
import Decorators.VoiceControlDecorator;
import Devices.*;

public class Main {
    public static void main(String[] args) {
        Device light = new Light();
        MusicSystem music = new MusicSystem();
        Thermostat thermostat = new Thermostat();
        Device cameras = new SecurityCamera();

        Device smartLight = new VoiceControlDecorator(light);
        Device smartMusic = new VoiceControlDecorator(new RemoteAccessDecorator(music));
        Device smartThermostat = new VoiceControlDecorator(new RemoteAccessDecorator(new EnergySavingDecorator(thermostat)));
        Device smartCameras = new RemoteAccessDecorator(cameras);

        HomeAutomationFacade facade = new HomeAutomationFacade(
                smartLight,
                smartMusic,
                music,
                smartCameras,
                smartThermostat,
                thermostat
        );

        facade.activateNightMode();
        System.out.println();
        facade.startPartyMode();
        System.out.println();
        facade.leaveHome();
    }
}
