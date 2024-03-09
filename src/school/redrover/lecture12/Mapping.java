package school.redrover.lecture12;

import java.util.*;


public class Mapping {
    public static void main(String[] args) {

        Map<Integer, Person> people = new HashMap<>();
        people.put(1, new Person("Edward"));
        people.put(2, new Person("James"));
        people.put(3, new Person("Augustus"));

        System.out.println(people);

        people.put(2, new Person("Illari"));

        System.out.println(people.get(2));
        System.out.println(people.getOrDefault(43324, new Person("aaaaa")));
        System.out.println(people);

        for (Integer key : people.keySet()){
            System.out.println("key= " + key + ", value = " + people.get(key));
        }


        Map<Character, Integer> charCounts = new HashMap<>();
        String string = "sdfkjsdgfweytrwqeugcmnvbnkldjsaefweddsjf;ifhheiuwyrqwoilvnmcvkjdsfnvjbywetoygchx";
        for (char c : string.toCharArray()) {
            int currentCount = charCounts.getOrDefault(c, 0);
            charCounts.put(c, currentCount+1);
        }
        System.out.println(charCounts);
    }
}
