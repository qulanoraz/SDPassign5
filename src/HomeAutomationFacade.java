import Devices.*;

public class HomeAutomationFacade {
    private Device light;
    private Device music;
    private Device cameras;
    private Device thermostat;

    private Thermostat realThermostat;
    private MusicSystem realMusic;

    public HomeAutomationFacade(Device light, Device music, MusicSystem realMusic, Device cameras, Device thermostat, Thermostat realThermostat) {
        this.light = light;
        this.music = music;
        this.realMusic = realMusic;
        this.cameras = cameras;
        this.thermostat = thermostat;
        this.realThermostat = realThermostat;
    }

    public void startPartyMode() {
        System.out.println("PARTY MODE:");
        light.on();
        music.on();

        realMusic.setVolume(100);
    }

    public void activateNightMode() {
        System.out.println("NIGHT MODE:");
        light.off();
        cameras.on();
        thermostat.on();

        realThermostat.setEcoMode();
    }

    public void leaveHome() {
        System.out.println("See you!");
        light.off();
        music.off();
        thermostat.off();
        cameras.on();
    }
}
