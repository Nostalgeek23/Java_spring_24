public class Employees {
    public static void main(String[] args) {


        Employee e1 = new Employee();
        e1.name = "Papolotti";
        e1.age = 24;
        e1.sex = "Мужской";
        e1.salary = 2334;

        Employee e2 = new Employee();
        e2.name = "Watson";
        e2.age = 21;
        e2.sex = "Женский";
        e2.salary = 5432;

        Employee e3 = new Employee();
        e3.name = "Gunter";
        e3.age = 27;
        e3.sex = "Мужской";
        e3.salary = 1234;

        Employee e4 = new Employee();
        e4.name = "Fisher";
        e4.age = 32;
        e4.sex = "Женский";
        e4.salary = 3145;

        Employee e5 = new Employee();
        e5.name = "Smith";
        e5.age = 32;
        e5.sex = "Мужской";
        e5.salary = 4165;

        Employee e6 = new Employee();
        e6.name = "Conneli";
        e6.age = 44 ;
        e6.sex = "Женский";
        e6.salary = 3555;

        Employee e7 = new Employee();
        e7.name = "McLovin";
        e7.age = 35;
        e7.sex = "Мужской";
        e7.salary = 2222;

        Employee e8 = new Employee();
        e8.name = "Smith";
        e8.age = 19;
        e8.sex = "Женский";
        e8.salary = 1400;


        System.out.println(Employee.isSameName(e5, e8));



        Employee[] eArray = {e1, e2, e3, e4, e5, e6, e7, e8};

        System.out.println(Salary.getSum(eArray));
    }
}
