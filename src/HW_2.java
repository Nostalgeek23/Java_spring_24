public class HW_2 {
    public static void main(String[] args) {
        int a = 533;
        int b = 42;
//sum
        System.out.print("Sum: ");
        System.out.println(a + b);
//multiply
        System.out.print("Mult: ");
        System.out.println(a * b);
//subtraction
        System.out.print("Sub: ");
        System.out.println(a - b);
//division
        System.out.print("Div: ");
        System.out.println(1.0 * a / b);
//remainder
        System.out.print("Rem: ");
        System.out.println(a % b);

        System.out.println("-------------------------------------");

//parity check a
        if ((a % 2) == 0) {
            System.out.println("a is even");
        }
        else {
            System.out.println("a is odd");
        }
//parity check b
        if ((b % 2) == 0) {
            System.out.println("b is even");
        }
        else {
            System.out.println("b is odd");
        }
        System.out.println("-------------------------------------");
    }
}
