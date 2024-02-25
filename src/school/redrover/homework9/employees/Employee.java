package school.redrover.homework9.employees;

//Задача №2
//
//Необходимо создать класс Employee с полями: имя, возраст, пол и ЗП в день.
//Все поля сделать приватными и для каждого поля добавить методы set и get.
//Класс должен иметь метод - getSalary(Month[] monthArray),
//метод возвращает зарплату за те месяцы которые были переданы в качестве аргумента.

import school.redrover.homework9.months.Month;

public class Employee {

    private String name;
    private int age;
    private String sex;
    private double daySalary;


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setDaySalary(int daySalary) {
        this.daySalary = daySalary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public double getDaySalary() {
        return daySalary;
    }

    public double getSalary(Month[] monthArray){
        double countSalary = 0.0;
        for (int i = 0; i < monthArray.length; i++) {
            countSalary += monthArray[i].getDaysAmount() * daySalary;
        }
        return countSalary;
    }
}
