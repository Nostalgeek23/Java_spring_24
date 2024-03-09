package school.redrover.homework11;

//Задача №1
//
//Необходимо реализовать задание из Task#10
//со следующими условиями:
//Employee.getSalary должен быть абстрактный
//Worker.getBaseSalary должен быть финальным
//Коэффициенты для расчета ЗП у Manager и Director
//должны быть константами (коэффициенты из формулы расчета ЗП)
//Классы Manager и Director должны быть финальными


public abstract class Employee {
    private String name;
    private final static double BASE_SALARY = 2000;
    private double salary;
    private int numberOfSubordinates;

    protected double getBaseSalary() {
        return BASE_SALARY;
    }
    protected String getName(){
        return name;
    }
    protected void setName(String name){
        this.name = name;
    }
    protected abstract double getSalary();

    protected int getNumberOfSubordinates(){
        return numberOfSubordinates;
    }
    protected void setNumberOfSubordinates(int numberOfSubordinates){
        this.numberOfSubordinates = numberOfSubordinates;
    }
}

