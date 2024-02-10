public class HW_5_1 {
    public static void main(String[] args) {

//        Задача №1
//
//        Дан массив:
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        необходимо вывести сумму всех значений массива.

        int[] array1 = {9, 2, 6, 4, 5, 12, 7, 8, 6};

        int sumarr1 = 0;
        for (int i = 0; i < array1.length; i++) {
            sumarr1 += array1[i];
        }
        System.out.println(sumarr1);


//        Задача №2
//
//        Дан массив:
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        необходимо вывести максимальное значение массива.

        int[] array2 = {9, 2, 6, 4, 5, 12, 7, 8, 6};

        int maxarray2 = Integer.MIN_VALUE;

        for (int i = 0; i < array2.length; i++) {
            if (array2[i] > maxarray2) {
                maxarray2 = array2[i];
            }
        }
        System.out.println(maxarray2);


//        Задача №3
//
//        Дан массив:
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        необходимо вывести минимальное значение массива.

        int[] array3 = {9, 2, 6, 4, 5, 12, 7, 8, 6};

        int minarray3 = Integer.MAX_VALUE;

        for (int i = 0; i < array3.length; i++) {
            if (array3[i] < minarray3) {
                minarray3 = array3[i];
            }
        }
        System.out.println(minarray3);


//        Задача №4
//
//        Дан массив:
//        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        необходимо вывести среднее арифметическое всех значений массива.

        int[] array4 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int sumarray4 = 0;

        for (int i = 0; i < array4.length; i++) {
            sumarray4 += array4[i];
        }
        int array4length = array4.length;
        System.out.println(sumarray4 / array4length);


//        Задача №5
//
//        Дан массив:
//        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
//        необходимо вывести сумму элементов массива.

        int[][] array5 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};

        int sumarray5 = 0;

        for (int i = 0; i < array5.length ; i++) {
            for (int j = 0; j < array5[i].length; j++) {
                sumarray5 += array5[i][j];
            }
        }
        System.out.println(sumarray5);


//        Задача №6
//
//        Дан массив:
//        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
//        необходимо вывести максимальное значение массива.


        int[][] array6 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};

        int maxarray6 = Integer.MIN_VALUE;

        for (int i = 0; i < array6.length; i++) {
            for (int j = 0; j < array6[i].length; j++) {
                if (array6[i][j] > maxarray6) {
                    maxarray6 = array6[i][j];
                }
            }
            System.out.println(maxarray6);
        }






    }
}
