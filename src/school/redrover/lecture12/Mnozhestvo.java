package school.redrover.lecture12;

import java.util.*;

public class Mnozhestvo {
    public static void main(String[] args) {


        Set <String> mySet = new HashSet<>();
        mySet.add("vasya");
        mySet.add("petya");
        mySet.add("Nicolai");
        mySet.add("vasya");

        System.out.println(mySet.size());
        System.out.println(mySet);
        System.out.println("--------------");

        Set<Person> people = new HashSet<>();
        people.add(new Person("Vasya"));
        people.add(new Person("Nicolai"));
        people.add(new Person("Valera"));
        System.out.println(people.size());


        for (Person p : people){
            System.out.println(p.name);
        }
    }


}
