package school.redrover.lesson11;

public class WindowCooler extends Cooler{

    boolean isWindowOpen;
    public WindowCooler(int targetTemp) {
        super(targetTemp);
    }

    @Override
    protected boolean isCurrentlyCooling() {
        return isWindowOpen;
    }

    @Override
    protected void startCooling() {
        System.out.println("Opening the window");
        isWindowOpen = true;
    }

    @Override
    protected void stopCooling() {
        System.out.println("Closing the window");
        isWindowOpen = false;
    }
}
