package school.redrover.homework10;

//Задача №1
//
//Необходимо создать класс Employee со следующими методами:
//getBaseSalary - получить базовую ставку
//        setBaseSalary
//getName - получить имя
//setName
//getSalary - получить зарплату

public class Employee {
    private String name;
    private double baseSalary;
    private double salary;

    public double getBaseSalary() {
        return baseSalary;
    }
    public void setBaseSalary(double baseSalary){
      this.baseSalary = baseSalary;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getSalary(){
        return salary;
    }
}
