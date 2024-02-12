public class Les6 {

    public static void printString(String str){
        System.out.println(str);
    }

    public static void printSum(int a, int b){
        System.out.println(a + b);
    }

    public static int getSum(int a, int b){
        return a + b;
    }

    public static void main(String[] args) {

//        int a = 0;
//
//        int[] arr = {};

        String s = "Hello world";

//        String sU = s.toUpperCase();
//
//
//        System.out.println(s.toLowerCase());
//        System.out.println(s.toUpperCase());
//        System.out.println(sU);
//
//        int wIndex = s.indexOf("w");
//        System.out.println(wIndex);
//
//
        String subStr = s.substring(6, 9);
        System.out.println(subStr);
//
//        String rep = s.replace("l", "!");
//        System.out.println(rep);
//
        System.out.println("X" + s.substring(1));
//
//
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            System.out.println(c);
        }


//        printString(s);
//
//        printSum (3, 7);
//        printSum(5, 4);
//
//
//        int x = getSum(3, 7);
//        System.out.println(x);
//
//        System.out.println(getSum(5,4));














    }
}
