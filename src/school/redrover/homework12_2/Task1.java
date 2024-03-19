package school.redrover.homework12_2;

//Задача №1
//
//Создать лист и добавить в него следующие слова:
//        White.
//        Tan.
//        Yellow.
//        Orange.
//        Red.
//        Pink.
//        Purple.
//        Blue.
//Затем удалить из этого списка все цвета в которых встречается буква “L”

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("White");
        myList.add("Tan");
        myList.add("Yellow");
        myList.add("Orange");
        myList.add("Red");
        myList.add("Pink");
        myList.add("Purple");
        myList.add("Blue");

        System.out.println(myList);

        myList.removeIf(n -> (n.contains("l") || n.contains("L")));

        System.out.println(myList);

    }
}
