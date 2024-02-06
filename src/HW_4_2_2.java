public class HW_4_2_2 {
    public static void main(String[] args) {

//        Задача №2
//
//        Дан массив:
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        необходимо вывести все значения массива больше 5.


        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};

        for (int i = 0; i < array.length ; i = i + 1) {
            if (array[i] > 5) {
                System.out.println(array[i]);
            }

        }

    }
}
