public class Employee {

//    Задача №2

//    Необходимо создать класс Employee с полями как у Person (из предыдущего задания)
//    и поле зарплата.
//    Класс должен иметь метод isSameName(Employee employee) который возвращает true,
//    если у сотрудника у которого был вызван метод и сотрудника который был передан как параметр,
//    одинаковое имя.


    String name;
    int age;
    String sex;
    int salary;


    public static boolean isSameName(Employee emp1, Employee emp2) {
        if (emp1.name.equals(emp2.name)) {
            return true;
        } else {return false;}
    }

}
