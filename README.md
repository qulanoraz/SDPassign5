Smart Home Automation System (Decorator + Facade)

Project Description

My code uses two design patterns: Decorator and Facade. This system helps control devices (Light, Music System, Thermostat, Security Cameras) in an easy way.


Features

- Device Abstraction: I made a Device interface and different device classes. Each device can turn on and off.

- Decorator Pattern: I added extra features to devices. For example, voice control, energy saving mode, and remote access. Decorators can be combined in any order.

- Facade Pattern: I made a HomeAutomationFacade class that gives the user simple commands. For example, you can start party mode, activate night mode, or leave home. The facade coordinates the devices and uses their extra features when needed.


How It Works

Devices (Light, MusicSystem, Thermostat, SecurityCamera) are created.

Decorators wrap devices to add new features. For example, a Light with voice control and a Music System with remote access.

The decorated devices are used in the HomeAutomationFacade.

The user can use facade methods:

activateNightMode() — turns off light, sets thermostat to eco mode, and turns on cameras.

startPartyMode() — turns on light and music, sets high volume.

leaveHome() — turns off all devices, enables cameras.


Structure

- Devices: Light, MusicSystem, Thermostat, SecurityCamera

- Decorators: VoiceControlDecorator, EnergySavingDecorator, RemoteAccessDecorator

- Facade: HomeAutomationFacade
