package school.redrover.homework9.licenceplates;

public class LicencePlateMaker {
    private String prefix;
    private int lastUsedNumber;

    public LicencePlateMaker(String prefix, int lastUsedNumber) {
        this.prefix = prefix;
        this.lastUsedNumber = lastUsedNumber;
    }

    public LicencePlate makeNextPlate (){
        int nextNumber = lastUsedNumber + 1;
        lastUsedNumber = nextNumber;
        return new LicencePlate(prefix + "-" + nextNumber);
    }
}
