package school.redrover.smarthome.controls;

import school.redrover.smarthome.devices.DimmableBulb;
import school.redrover.smarthome.devices.SwitchableAndAdjustable;

public class DimmerSwitch {

    private SwitchableAndAdjustable device;

    public DimmerSwitch(SwitchableAndAdjustable device) {
        this.device = device;
    }

    public void turnOn() {
        device.turnOn();
    };
    public void turnOff() {
        device.turnOff();
    };
    public void adjust(int percent) {
        device.adjust(percent);
    };


}
