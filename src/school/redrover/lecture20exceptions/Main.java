package school.redrover.lecture20exceptions;

import school.redrover.lecture20exceptions.bank.Account;
import school.redrover.lecture20exceptions.bank.AccountDeactivatedException;
import school.redrover.lecture20exceptions.bank.BankingException;
import school.redrover.lecture20exceptions.bank.InsufficientFundsException;

import javax.sound.midi.Soundbank;
import java.util.Stack;

public class Main {

    private static int divideInts(int a, int b) {
//        try {
//            return a / b;
//        } catch (ArithmeticException e) {
//            return 0;
//        }

        return a / b;
//        throw new RuntimeException("somth else");
    }

    private static String debitFromAccount(Account acct, double amt){
        try {
            acct.debit(amt);
            return "ok";
        } catch (InsufficientFundsException e) {
            return "Not enough money";
        } catch (AccountDeactivatedException e) {
            return "Account is not active";
        } catch (BankingException e) {
            return e.getMessage();
        }

    }
    public static void main(String[] args) {

        /*
        Stack
        FILO
        first in, last out
         */

        Account account = new Account();
        System.out.println(account.getBalance());
        account.credit(100);
        System.out.println(account.getBalance());
        account.deactivate();
        System.out.println(debitFromAccount(account, 90));
        System.out.println(account.getBalance());
        account.activate();
        System.out.println(debitFromAccount(account, 200));
        System.out.println(account.getBalance());


    }
}
