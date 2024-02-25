package school.redrover.homework9.employees;


//Необходимо создать класс Manager с полями: имя, возраст, пол, ЗП в день и количество подчиненных.
//Все поля сделать приватными и для каждого поля добавить методы set и get.
//Класс должен иметь метод - getSalary(Month[] monthArray),
//метод возвращает зарплату за те месяцы которые были переданы в качестве аргумента.
//К рассчитанной ЗП должно прибавляться по 1% за каждого подчиненного.

import school.redrover.homework9.months.Month;

public class Manager {
    private String name;
    private int age;
    private String sex;
    private double daySalary;
    int subordinates;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double getDaySalary() {
        return daySalary;
    }

    public void setDaySalary(double daySalary) {
        this.daySalary = daySalary;
    }

    public int getSubordinates() {
        return subordinates;
    }

    public void setSubordinates(int subordinates) {
        this.subordinates = subordinates;
    }

    public double getSalary(Month[] monthArray){
        double countSalary = 0.0;
        for (int i = 0; i < monthArray.length; i++) {
            countSalary += monthArray[i].getDaysAmount() * daySalary;
        }
        return countSalary * (1 + subordinates * 0.01);

    }
}
