import java.util.Arrays;

public class Les4_1 {
    public static void main(String[] args) {


//        int a = 10;
//        int b = 20;
//        int c = 30;

//        int[] arr = {2, 4, 6, 7, 8};

//        System.out.println(arr.length);
//        System.out.println( arr[0]);

        int[] arr = new int[100];

        for (int i = 0; i < arr.length; i = i + 1) {
            arr[i] = i;

//            System.out.println(arr[i]);

            if (arr[i] % 2 == 0) {
                arr[i] = arr[i] * 10;
            }

        }

        System.out.println(Arrays.toString(arr));



//        поменять значения местами
//        int a = arr[0];
//        arr[0] = arr[3];
//        arr[3] = a;
//        System.out.println(Arrays.toString(arr));
//



    }
}
