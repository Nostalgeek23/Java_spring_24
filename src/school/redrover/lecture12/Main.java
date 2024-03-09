package school.redrover.lecture12;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        List<String> myList = new ArrayList<String>();
        myList.add("aa");
        myList.add("bb");
        myList.add("cc");
        myList.add("dd");
        myList.add("ee");
        myList.add("ff");

        System.out.println(myList);
        System.out.println(myList.get(2));
        myList.remove(2);
        System.out.println(myList);
        myList.add(2, "gg");
        System.out.println(myList);
        myList.addAll(List.of("x", "y", "z"));
        System.out.println(myList);
        System.out.println(myList.size());


        List<String> immutable = List.of("one", "two", "three");
        System.out.println(immutable.get(0));
        System.out.println(immutable);
//        immutable.add("xxxx"); unsupported

        List<Integer> ints = List.of(1, 4, 67, 324, -434, 56, -1, 0);
//          for (int i = 0; i < ints.size(); i++){
//            int chislo = ints.get(i);
//          }
            for (int chislo : ints) {
                if (chislo < 0) {
                    System.out.println(chislo);
                }
            }


        System.out.println(myList.contains("x"));
        System.out.println(myList.contains("xxxxxxx"));

    }
}
