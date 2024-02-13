import java.lang.reflect.Array;
import java.util.Arrays;

public class HW_6_2 {

    public static int getSum(int a, int b){
        return a + b;
    }

    public static int getSub(int a, int b){
        return a - b;
    }

    public static int getMult(int a, int b){
        return a * b;
    }

    public static double getDiv(double a, double b){
        return a / b;
    }


    public static int doubleInteger(int i) {
        // Double the integer and return it!
        return i * 2;
    }
//
//    If one of the flowers has an even number of petals and the other has an odd number of petals
//    it means they are in love.//
//    Write a function that will take the number of petals of each flower and return true if they are in love
//    and false if they aren't.
    public static boolean isLove(final int flower1, final int flower2) {

        if (flower1 % 2 == 1 && flower2 % 2 == 0) {
            return true;
        } else if (flower1 % 2 == 0 && flower2 % 2 == 1) {
            return true;
        } else {return false;}

    }


//    We need a function that can transform a number (integer) into a string.

    public static String numberToString(int num) {
        // Return a string of the number here!
        return String.valueOf(num);
    }


    public static int findSmallestInt(int[] args) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < args.length; i++) {
            if (args[i] < min) {
                min = args[i];
            }
        }
        return min;
    }


//    Given a non-negative integer, 3 for example, return a string with a murmur:
//    "1 sheep...2 sheep...3 sheep...". Input will always be valid, i.e. no negative integers.



    public static String countingSheep(int num) {
        //Add your code here
        String result = "";
        for (int i = 1; i <= num; i++) {
            result = result + i + " sheep...";
        }
        return result;
    }



    public static void main(String[] args) {

        System.out.println(getDiv(10,4));

        System.out.println(isLove(12,14));

        System.out.println(numberToString(231232));


        System.out.println(findSmallestInt(new int[]{2, 2, 3, 7, 14, 1, 5}));

        System.out.println(countingSheep(6));
    }
}
