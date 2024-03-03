package school.redrover.lesson11;

public abstract class Cooler {
    private final int targetTemp;
    public Cooler(int targetTemp){
        this.targetTemp = targetTemp;
    }
    protected int getTargetTemp(){
        return targetTemp;
    }

    public final void adjustTemp(int currentTemp){
        if (currentTemp >= getTargetTemp() && !isCurrentlyCooling()){
            System.out.println("Turning on");
            startCooling();
        } else if(currentTemp < getTargetTemp() && isCurrentlyCooling()){
            System.out.println("Turning off");
            stopCooling();
        } else {
            System.out.println("Nothing to do");
        }
    }
    protected abstract boolean isCurrentlyCooling();
    protected abstract void startCooling();
    protected abstract void stopCooling();

}
