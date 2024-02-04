public class Les3_Operators {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = 20;
        int d = -50;

//        System.out.println(a > b);
//        System.out.println(a < b);
//
//        System.out.println(a == b);
//        System.out.println(b == c);
//
//        System.out.println(15 != 20);
//
//        System.out.println(c <= 20);
//        System.out.println(b >= a);


        if (c > 0 || d > 0) {
            System.out.println("OK");
        } else {
            System.out.println("both of vars are positive");
        }

        if (c > 0 && d > 0) {
            System.out.println("OK");
        } else {
            System.out.println("one of vars is negative");
        }
    }
}
