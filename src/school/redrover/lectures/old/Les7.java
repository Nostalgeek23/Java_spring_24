package school.redrover.lectures.old;

public class Les7 {
    public static void main(String[] args) {

        int myVar = 23;

        Apartment apt1 = new Apartment();
        apt1.bedrooms = 2;
        apt1.address = new Address();
        apt1.address.city = "SF";
        apt1.address.state = "CA";
        apt1.price = 3500;

        Apartment apt2 = new Apartment();
        apt2.bedrooms = 4;
        apt2.address = new Address();
        apt2.address.city = "Atlanta";
        apt2.address.state = "GA";
        apt2.price = 2500;

        Apartment apt3 = new Apartment();
        apt3.bedrooms = 5;
        apt3.address = new Address();
        apt3.address.city = "Fresno";
        apt3.address.state = "CA";
        apt3.price = 600;

        Apartment apt4 = new Apartment();
        apt4.bedrooms = 2;
        apt4.address = new Address();
        apt4.address.city = "SF";
        apt4.address.state = "CA";
        apt4.price = 3800;

        Apartment apt5 = new Apartment();
        apt5.bedrooms = 3;
        apt5.address = new Address();
        apt5.address.city = "Atlanta";
        apt5.address.state = "GA";
        apt5.price = 2000;


        Apartment[] apts = {apt1, apt2, apt3, apt4, apt5};

//        all SF aparts
        for (int i = 0; i < apts.length; i++) {
            Apartment currentAppt = apts[i];
            if (currentAppt.address.city.equals("SF")) {
//                System.out.println("bedrooms: " + currentAppt.bedrooms);
//                System.out.println("price: " + currentAppt.price);
//                System.out.println("--------------------");
                System.out.println(apts[i].getInfoCard());
            }
        }

        System.out.println("=================================");
//        affordable aparts
        for (int i = 0; i < apts.length; i++) {
            Apartment currentAppt = apts[i];
            if (currentAppt.price <= 2500) {
//                System.out.println("bedrooms: " + currentAppt.bedrooms);
//                System.out.println("price: " + currentAppt.price);
//                System.out.println("city: " + currentAppt.address.city);
//                System.out.println("--------------------");
                System.out.println(apts[i].getInfoCard());
            }
        }

        System.out.println("=================================");
//in CA
        for (int i = 0; i < apts.length; i++) {
            Apartment currentAppt = apts[i];
            if (currentAppt.address.state.equals("CA")) {
//                System.out.println("bedrooms: " + currentAppt.bedrooms);
//                System.out.println("price: " + currentAppt.price);
//                System.out.println("city: " + currentAppt.address.city);
//                System.out.println("--------------------");
                System.out.println(apts[i].getInfoCard());
            }
        }

        System.out.println("=================================");







    }
}
