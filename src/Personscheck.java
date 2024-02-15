public class Personscheck {

    //    Задача №1
//
//    Необходимо создать класс Person с полями: имя, возраст, пол.
//    Класс должен иметь метод - getName, метод возвращает имя с префиксом “Mr. ”
//    если пол указан как мужской и префикс “Mrs. ” если женский.

    public static void main(String[] args) {

        Person p1 = new Person();
        p1.name = "Papolotti";
        p1.age = 24;
        p1.sex = "Мужской";

        Person p2 = new Person();
        p2.name = "Watson";
        p2.age = 21;
        p2.sex = "Женский";

        Person p3 = new Person();
        p3.name = "Gunter";
        p3.age = 27;
        p3.sex = "Мужской";

        Person p4 = new Person();
        p4.name = "Fisher";
        p4.age = 32;
        p4.sex = "Женский";

        Person p5 = new Person();
        p5.name = "Smith";
        p5.age = 32;
        p5.sex = "Мужской";

        Person p6 = new Person();
        p6.name = "Conneli";
        p6.age = 44 ;
        p6.sex = "Женский";

        Person p7 = new Person();
        p7.name = "McLovin";
        p7.age = 35;
        p7.sex = "Мужской";

        Person p8 = new Person();
        p8.name = "Smith";
        p8.age = 19;
        p8.sex = "Женский";

        Person[] prsns = {p1, p2, p3, p4, p5, p6, p7, p8};

        for (int i = 0; i < prsns.length; i++) {
            System.out.println(prsns[i].getName());
        }

    }



}
