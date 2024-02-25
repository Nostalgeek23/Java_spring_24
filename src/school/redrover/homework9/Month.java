package school.redrover.homework9;

//Задача №1
//
//Создать класс Month с полями: имя месяца, количеством дней и количеством рабочих дней.
//Создать класс MonthUtils который бы хранил подготовленные месяцы или их массивы для использования
//        (объекты класса Month).

public class Month {

   private String monthName;
   private int daysAmount;
   private int workDaysAmount;

    public Month(String monthName, int daysAmount, int workDaysAmount) {
        this.monthName = monthName;
        this.daysAmount = daysAmount;
        this.workDaysAmount = workDaysAmount;
    }

    public String getMonthName() {
        return monthName;
    }

    public int getDaysAmount() {
        return daysAmount;
    }

    public int getWorkDaysAmount() {
        return workDaysAmount;
    }


}
