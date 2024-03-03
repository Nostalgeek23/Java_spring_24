package school.redrover.homework11;

public class Main {
    public static void main(String[] args) {

        Worker w = new Worker();
        w.setName("Will");
        w.setNumberOfSubordinates(0);
        System.out.println(w.getSalary());

        Manager a = new Manager();
        a.setName("Al");
        a.setNumberOfSubordinates(5);
        System.out.println(a.getSalary());

        Director d = new Director();
        d.setName("Don");
        d.setNumberOfSubordinates(7);
        System.out.println(d.getSalary());
    }
}
