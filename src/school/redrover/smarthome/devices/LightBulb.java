package school.redrover.smarthome.devices;

public class LightBulb implements Switchable{
    public void turnOn() {
        System.out.println("is on");
    }

    public void turnOff() {
        System.out.println("is off");
    }
}
