public class HW_4_1_3 {
    public static void main(String[] args) {


//        Задача №3
//
//        Необходимо вывести все числа кратные 4 между числами 40 и 60 включительно.
//                Реализовать 2 варианта:
//        использовать конструкцию if для определения кратности (цикл с шагом 1, i = i + 1);
//        без использования конструкции if (шаг цикла на ваше усмотрение).


//        using if
        for (int i = 40; i <= 60; i = i + 1) {
            if (i % 4 == 0) {
                System.out.println(i);
            }
        }

//        without if
        for (int i = 40; i <= 60; i = i + 4) {
                System.out.println(i);
        }

//        another ways???:

//            int a = 40;
//
//            while (a % 4 == 0 && a <= 60) {
//                System.out.println(a);
//                a = a + 1;
//            }


//            int b = 40;
//
//            do {
//                System.out.println(b);
//                b = b + 1;
//            } while (b % 4 == 0 && b <= 60);

        }
    }

