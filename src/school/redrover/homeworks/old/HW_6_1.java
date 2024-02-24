package school.redrover.homeworks.old;

public class HW_6_1 {
    public static void main(String[] args) {

//        Задача №1
//
//        Дана строка:
//        String s = “Перестановочный алгоритм быстрого действия”;
//        необходимо вывести все буквы “о” из этой строки.
//                Для указанной строки ответ будет “ооооо” (или в столбик)


        String s = "Перестановочный алгоритм быстрого действия";

        for (int i = 0; i < s.length(); i++) {
            char o = s.charAt(i);
            if (o == 'о') {
                System.out.println(o);
            }
        }

        System.out.println("------------------------------------");


//        Задача №2
//
//        Дана строка:
//        String s = “Перевыборы выбранного президента”;
//        необходимо подсчитать количество букв “е” в строке.
//        Для указанной строки ответ будет 4.


        String st = "Перевыборы выбранного президента";

        int countOfe = 0;
        for (int i = 0; i < st.length(); i++) {
            char e = st.charAt(i);
            if (e == 'е') {
                countOfe++;
            }
        }
        System.out.println(countOfe);

        System.out.println("------------------------------------");


//        Задача №3
//
//        Дан массив:
//        String[][] array = {{“Привет”, “всем”, “кто”}, {“изучает”, “язык”, “программирования”}, {“java”}};
//        необходимо подсчитать количество строк в массиве, которые не содержат буквы “е”.


        String[][] array = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"}, {"java"}};

        int countNotE = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (!array[i][j].contains("е")){
                    countNotE++;
                }
            }
        }
        System.out.println(countNotE);


        System.out.println("------------------------------------");





//        Экстра задача
//
//        Дана строка:
//        String s = “Посмотрите как Рите нравится ритм”;
//        необходимо вывести индексы начала всех подстрок - “рит”, независимо от регистра.
//                Для указанной строки ответ будет 6, 15, 29.


        String srit = "Посмотрите как Рите нравится ритм";

        String sl = srit.toLowerCase();

        String searchStr = "рит";

        for (int i = 0; i < sl.length() - searchStr.length(); i++) {
            String subStr = sl.substring(i, i + searchStr.length());

            if (subStr.equals(searchStr)) {
                System.out.println(i);
            }


        }



    }
}