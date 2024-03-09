package school.redrover.lecture12;

public class Person {
    final String name;
    Person(String name) {
        this.name = name;
    }

    public String toString(){
        return "Person " + name;
    }
}
