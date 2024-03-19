package school.redrover.homework12_2;

import java.util.ArrayList;
import java.util.List;
//Задача №3
//
//Удалить из листа, созданного в предыдущей задаче, все четные элементы.

public class Task3 {

    public static void main(String[] args) {

        List<Integer> ints = new ArrayList<>();
        for (int i = 100; i <= 1000; i++) {
            ints.add(i);
        }
        System.out.println(ints);
        ints.removeIf(n -> (n % 2 == 0));
        System.out.println(ints);
    }
}
