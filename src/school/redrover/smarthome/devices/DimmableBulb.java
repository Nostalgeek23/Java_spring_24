package school.redrover.smarthome.devices;

import java.awt.*;

public class DimmableBulb extends LightBulb implements SwitchableAndAdjustable {

    public void adjustBrightness(int percent) {
        System.out.println("Light brightness " + percent);
    }

    @Override
    public void adjust(int percent) {
        adjustBrightness(percent);
    }
}
