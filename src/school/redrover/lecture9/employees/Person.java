package school.redrover.lecture9.employees;

public class Person {

//    Задача №1
//
//    Необходимо создать класс employees.Person с полями: имя, возраст, пол.
//    Класс должен иметь метод - getName, метод возвращает
//    имя с префиксом “Mr. ” если пол указан как мужской
//    и префикс “Mrs. ” если женский.

    String name;
    int age;
    String sex;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


//    String getName;
public String getName() {
        String searchSex = sex.toLowerCase();
      String result = null;
        if (searchSex.equals("мужской")) {
            result = "Mr. " + name;
        }
        if (searchSex.equals("женский")) {
            result = "Mrs." + name;
        }
     return result;
    }

}
