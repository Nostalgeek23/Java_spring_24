package school.redrover.smarthome.devices;

public class Kettle implements Switchable{
    public void turnOn(){
        System.out.println("Heating");
    }

    public void turnOff(){
        System.out.println("Not heating");
    }
}
