package school.redrover.lecture9.employees;

public class Employee {

//    Задача №2

//    Необходимо создать класс employees.Employee с полями как у employees.Person (из предыдущего задания)
//    и поле зарплата.
//    Класс должен иметь метод isSameName(employees.Employee employee) который возвращает true,
//    если у сотрудника у которого был вызван метод и сотрудника который был передан как параметр,
//    одинаковое имя.


    String name;
    int age;
    String sex;
    int salary;


//    public static boolean isSameName(employees.Employee emp1, employees.Employee emp2) {
//        if (emp1.name.equals(emp2.name)) {
//            return true;
//        } else {return false;}
//    }

    boolean isSameName(Employee otherEmployee) {
        return name.equals(otherEmployee.name);
    }

}
