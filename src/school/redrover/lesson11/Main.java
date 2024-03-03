package school.redrover.lesson11;

public class Main {
    public static void main(String[] args) {

        WindowCooler myCooler = new WindowCooler(25);
        myCooler.adjustTemp(23);
        myCooler.adjustTemp(24);
        myCooler.adjustTemp(25);
        myCooler.adjustTemp(26);
        myCooler.adjustTemp(25);
        myCooler.adjustTemp(24);
    }
}
