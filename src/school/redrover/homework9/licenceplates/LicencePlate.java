package school.redrover.homework9.licenceplates;

//Для учета автомобилей на дороге важно, чтобы номера не повторялись.
//Необходимо создать класс LicensePlate, в котором есть неизменяемое строковое поле plate.
//Запретить создавать экземпляры этого класса кому попало (т.е. классам за пределами того пакета/package,
//в котором находится класс LicensePlate).
//Для выдачи номеров создать класс LicensePlateMaker, который хранит в себе неизменяемый префикс
//(например, CA для Калифорнии или NY для Нью-Йорка)  и имеет метод makeNextPlate(),
//который создает новые номера формата “CA-1”, “CA-2”, “CA-123” по порядку. Или “NY-300”, “NY-301” и т. д.
//Номера, конечно же, повторяться не должны,
//хотя бы на период существования данного экземпляра класса LicensePlateMaker.

public class LicencePlate {
    private String plate;

    LicencePlate(String plate) {  //without "public" or "private" its package-private
        this.plate = plate;
    }

    public String getPlate() {
        return plate;
    }
}
