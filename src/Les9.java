import school.redrover.lecture9.accounts.BankAccount;
import school.redrover.lecture9.time.Date;
import school.redrover.lecture9.users.User;

public class Les9 {
    public static void main(String[] args) {

        User user = new User("i_petrov");
        System.out.println(user.getFullName());
        user.setFullName("Ivan Petrov");
        System.out.println(user.getFullName());

        User iphone = new User("iphone");
        System.out.println(iphone.getUsername());
        System.out.println("-----------------------------");


        BankAccount acct1 = new BankAccount("5468-2123-1234-6454");
        System.out.println(acct1.getBalance()); //0
        acct1.credit(1000.0);
        System.out.println(acct1.getBalance()); //1000
        acct1.debit(100.0);
        System.out.println(acct1.getBalance()); //900
        acct1.debit(1000.0); //low balance
        System.out.println(acct1.getBalance());
        System.out.println("-----------------------------");


        Date date = new Date(20, 02, 2024);

        System.out.print(date.getDay());
        System.out.print("-");
        System.out.print(date.getMonth());
        System.out.print("-");
        System.out.print(date.getYear());




    }
}
