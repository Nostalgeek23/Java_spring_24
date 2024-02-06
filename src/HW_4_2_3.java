import java.util.Arrays;

public class HW_4_2_3 {
    public static void main(String[] args) {

//        Задача №3
//
//        Дан массив:
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        необходимо увеличить все значения массива на 15.

        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};

        for (int i = 0; i < array.length; i = i + 1) {
            array[i] = array[i] + 15;
            System.out.println(array[i]);
        }

        System.out.println(Arrays.toString(array));

    }
}
