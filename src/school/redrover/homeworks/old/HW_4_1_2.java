package school.redrover.homeworks.old;

public class HW_4_1_2 {
    public static void main(String[] args) {


//        Задача №2
//
//        Необходимо вывести все положительные степени числа 5 которые меньше 10000,
//        вывести результат возведения в степень.



    for ( int  i = 5, a = 1 ; i < 10000; i = i * 5, a = a + 1) {

        System.out.println("число 5 в степени " + a + " равно " + i);
    }

    }
}
