import java.util.Arrays;

public class Les_5 {
    public static void main(String[] args) {

        int[] arr = {4, 5, 8, 3, 8, 9};

//алгоритм нахождения максимального значения
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i = i + 1) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);

//алгоритм нахождения минимального значения
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i = i + 1) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);

//алгоритм нахождения суммы массива
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {

            sum += arr[i]; // sum = sum + arr[i];
            }
        System.out.println(sum);



        System.out.println("-------------------------------------------------");


//двумерные массивы

        int[] [] array = {
                {4, 5, 8, 3, 8, 9},
                {6, 5, 2},
                {4, 2, 6, 7, 9}
        };

        System.out.println(array[0][0]);

//алгоритм нахождения максимального значения
        int arrayMax = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > arrayMax) {
                    arrayMax = array[i][j];
                }
            }
        }
        System.out.println(arrayMax);


//алгоритм нахождения минимального значения
        int arrayMin = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < arrayMin) {
                    arrayMin = array[i][j];
                }
            }
        }
        System.out.println(arrayMin);

        System.out.println("-------------------------------------------------");

//трехмерные массивы
        int[][][] threedarray = {
                {{4}, {5, 8, 3}, {8, 9}},
                {{6, 5, 2}},
                {{4, 2, 6, 7, 9}}
        };

        System.out.println(threedarray[0][0][0]);

        //алгоритм нахождения максимального значения
        int threedarrayMax = Integer.MIN_VALUE;

        for (int i = 0; i < threedarray.length; i++) {
            for (int j = 0; j < threedarray[i].length; j++) {
                for (int k = 0; k < threedarray[i][j].length; k++) {
                    if (threedarray[i][j][k] > threedarrayMax) {
                        threedarrayMax = threedarray[i][j][k];
                    }
                }
            }
        }

        System.out.println(threedarrayMax);
        System.out.println("-------------------------------------------------");


//break прерывание цикла

        for (int i = 0; i < arr.length; i = i + 1) {
            if (arr[i] % 5 == 0) {
                System.out.println(i);
                break;
            }
        }

//continue прерывание итерации

        for (int i = 0; i < arr.length; i = i + 1) {
            if (arr[i] % 5 == 0) {
                continue;
            }
            System.out.println(arr[i]);
        }
        System.out.println("-------------------------------------------------");


        int a = 10;
        int b = a;
        b = 20;
        System.out.println(a);

        int[] arr1 = {4, 5};
        int[] arr2 = arr1;
        arr2[0] = 9;
        System.out.println(Arrays.toString(arr1));

    }

    }

