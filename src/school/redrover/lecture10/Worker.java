package school.redrover.lecture10;

public class Worker extends Person{
    private int salary;

    public Worker(String name, int age, int salary){
        super(name, age);
        this.salary = salary;
    }

    int getSalary(){
        return salary;
    }
}
