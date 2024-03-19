package school.redrover.homework12_2;

//Задача №2
//
//Создать лист со значениями от 100 до 1000.

import java.util.ArrayList;
import java.util.List;

public class Task2 {

    public static void main(String[] args) {

        List<Integer> ints = new ArrayList<>();
        for (int i = 100; i <= 1000; i++) {
            ints.add(i);
        }
        System.out.println(ints);
    }
}
