package school.redrover.lecture10;

public class Les10 {
    public static void main(String[] args) {


        Person a = new Person("Anna", 30);
        System.out.println(a.getName());


        Person p = new Gentleman("Ivan", 31, "NY");
        System.out.println(p.getName());


        Person[] arr = {
                new Person("Anna", 30),
                new Person("Sergey", 31),

                new Gentleman("Valera", 33, "CA"),
                new Gentleman("Nic"),
                new Gentleman("Juan", 35),
                new Gentleman(),

                new Worker("Henry", 43,133),
                new Manager("Galya", 44, 233, 11)
        };

        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i].getName());
        }
    }
}
