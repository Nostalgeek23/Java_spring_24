package school.redrover.smarthome;

import school.redrover.smarthome.controls.DimmerSwitch;
import school.redrover.smarthome.controls.Switch;
import school.redrover.smarthome.devices.*;

public class Main {
    public static void main(String[] args) {
//        LightBulb bulb1 = new LightBulb();
//
//        Switch switch1 = new Switch(bulb1);
//        Switch switch2 = new Switch(new Kettle());
//
//        DimmerSwitch switch3 = new DimmerSwitch(new DimmableBulb());
//
//        switch1.turnOn();
//        switch2.turnOn();
//        switch1.turnOff();
//        switch2.turnOff();
//
//        switch3.turnOn();
//        switch3.adjust(50);
//        switch3.turnOff();

//        LightBulb bulb1 = new LightBulb();
//        LightBulb bulb2 = new LightBulb();
//        Kettle kettle1 = new Kettle();
//
//        SwitchBoard board = new SwitchBoard();
//        board.addDevice(bulb1);
//        board.addDevice(bulb2);
//        board.addDevice(kettle1);
//        Switch mainSwitch = new Switch(board);
//
//        mainSwitch.turnOn();
//        mainSwitch.turnOff();

        Stereo stereo1 = new Stereo();

        DimmerSwitch dimmerSwitch1 = new DimmerSwitch(stereo1);
        dimmerSwitch1.turnOn();
        dimmerSwitch1.adjust(30);
        dimmerSwitch1.turnOff();

        DimmableBulb bulb1 = new DimmableBulb();
        DimmerSwitch dimmerSwitch2 = new DimmerSwitch(bulb1);
        dimmerSwitch2.turnOn();
        dimmerSwitch2.adjust(30);
        dimmerSwitch2.turnOff();


        Switch simpleSwitch1 = new Switch(stereo1);
        simpleSwitch1.switchToOn();
        simpleSwitch1.switchToOff();
    }
}
