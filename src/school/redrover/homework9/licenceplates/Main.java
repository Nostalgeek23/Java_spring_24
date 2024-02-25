package school.redrover.homework9.licenceplates;

public class Main {
    public static void main(String[] args) {
        LicencePlateMaker nyMaker = new LicencePlateMaker("NY", 1000);

        System.out.println(nyMaker.makeNextPlate().getPlate());
        System.out.println(nyMaker.makeNextPlate().getPlate());
        System.out.println(nyMaker.makeNextPlate().getPlate());
        System.out.println(nyMaker.makeNextPlate().getPlate());
        System.out.println(nyMaker.makeNextPlate().getPlate());
        System.out.println(nyMaker.makeNextPlate().getPlate());

        LicencePlateMaker gaMaker = new LicencePlateMaker("GA", 100);
        System.out.println(gaMaker.makeNextPlate().getPlate());
        System.out.println(gaMaker.makeNextPlate().getPlate());
        System.out.println(gaMaker.makeNextPlate().getPlate());
        System.out.println(gaMaker.makeNextPlate().getPlate());

    }
}
