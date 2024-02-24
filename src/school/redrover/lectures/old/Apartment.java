package school.redrover.lectures.old;

public class Apartment {

    int bedrooms;
    Address address;
    int price;


    String getInfoCard() {
        String result = "-------------------" +
        "\nPrice: " + price +
        "\nBedrooms: " + bedrooms +
        "\nCity: " + address.city +
        "\nState: " + address.state +
        "\n-------------------" ;

        return result;
    }

}
