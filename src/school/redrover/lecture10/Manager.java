package school.redrover.lecture10;

public class Manager extends Worker {
    private int count;

    public Manager(String name, int age, int salary, int count){
        super(name, age, salary);
        this.count = count;
    }
}
