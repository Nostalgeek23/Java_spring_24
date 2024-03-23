package school.redrover.smarthome.controls;

import school.redrover.smarthome.devices.Switchable;

public class Switch {

    private final Switchable switchable;

    public Switch(Switchable switchable) {
        this.switchable = switchable;
    }

    public void switchToOn() {
        switchable.turnOn();
    }
    public void switchToOff() {
        switchable.turnOff();
    }


}
