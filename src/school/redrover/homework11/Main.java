package school.redrover.homework11;

public class Main {
    public static void main(String[] args) {
        Manager a = new Manager();
        a.setName("Al");
        a.setBaseSalary(2000);
        a.setNumberOfSubordinates(5);
        System.out.println(a.getSalary());

        Director d = new Director();
        d.setName("Don");
        d.setBaseSalary(2000);
        d.setNumberOfSubordinates(5);
        System.out.println(d.getSalary());
    }
}
