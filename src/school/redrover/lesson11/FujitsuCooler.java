package school.redrover.lesson11;

public class FujitsuCooler extends Cooler{
    private boolean isAcOn = false;

    public FujitsuCooler(int targetTemp){
        super(targetTemp);
    }

    private Fujitsu123 myFujitsu;


    protected boolean isCurrentlyCooling(){
        return isAcOn;
    }
    protected void startCooling(){
        myFujitsu.turnOn();
        this.isAcOn = true;
    }
    protected void stopCooling(){
        myFujitsu.turnOff();
        this.isAcOn = false;
    }


    private static class Fujitsu123{
        void turnOn(){
            System.out.println("Fujitsu123ON");
        }
        void turnOff(){
            System.out.println("Fujitsu123OFF");
        }
    }
}
