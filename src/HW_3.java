public class HW_3 {
    public static void main(String[] args) {

//task 1
        int a =41;
        int b = 47;

        if (a < b) {
            System.out.println("a < b");
        } else if (a > b) {
            System.out.println("a > b");
        } else {
            System.out.println("a == b");
        }


//task 2
        if ((a + b) % 2 == 0) {
            System.out.println("maybe a and b are even");
        } else {
            System.out.println("some variable is odd");
        }



//task 3
        if (a > 10) {
            System.out.println("a > 10");
        }
        if (a < 100) {
            System.out.println("a < 100");
        }
        if ((a / 2.0) > 20) {
            System.out.println("a / 2 > 20");
        }
        if (a >= 5 && a <= 40) {
            System.out.println("a is between 5 and 40");
        } else {
            System.out.println("a less than 5 or more 40");
        }

    }
}
