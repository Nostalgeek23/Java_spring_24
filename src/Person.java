public class Person {

//    Задача №1
//
//    Необходимо создать класс Person с полями: имя, возраст, пол.
//    Класс должен иметь метод - getName, метод возвращает
//    имя с префиксом “Mr. ” если пол указан как мужской
//    и префикс “Mrs. ” если женский.

    String name;
    int age;
    String sex;

    String getName() {
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
