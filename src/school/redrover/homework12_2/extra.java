package school.redrover.homework12_2;
//
//Задача со звездочкой
//Создать список из 30 или более случайных слов (например, можно воспользоваться https://randomwordgenerator.com/ ).
// Напечатать из этого списка самые длинные слова, начинающиеся на каждую букву.
//Т.е. если, к примеру, в списке есть слова, начинающиеся на a, b, d, f,
//то надо напечатать самое длинное слово на a, самое длинное на b, на d и нa f.

import java.util.*;

public class extra {
    public static void main(String[] args) {

        List<String> mySet = new java.util.ArrayList<>(List.of("film",
                "window",
                "revolution",
                "bread",
                "term",
                "grimace",
                "joint",
                "warning",
                "create",
                "consultation",
                "exit",
                "cycle",
                "apple",
                "critic",
                "education",
                "layout",
                "plagiarize",
                "contain",
                "trouble",
                "raise",
                "ordinary",
                "liberal",
                "modernize",
                "script",
                "elaborate",
                "carrot",
                "earthquake",
                "tree",
                "witness",
                "responsible",
                "volume",
                "passion",
                "ant",
                "criminal",
                "groan",
                "burn"));

        Collections.sort(mySet);
        System.out.println(mySet);

        List<String> listForLetter = new ArrayList<>();

        for (int i = 0; i < mySet.size()-1; i++) {
            if (mySet.get(i).charAt(0) == mySet.get(i+1).charAt(0)){
                listForLetter.add(mySet.get(i));
//                отдельный if для последней буквы алфавита
                    if (i == mySet.size()-2){
                        listForLetter.add(mySet.get(i+1));
                        int index = 0;
                        int wordLength = listForLetter.get(0).length();
                            for (int j = 0; j < listForLetter.size(); j++) {
                                if (listForLetter.get(j).length() > wordLength){
                                    index = j;
                                    wordLength = listForLetter.get(j).length();
                                }
                            }
                        System.out.println(listForLetter.get(index));
                        listForLetter.clear();
                    }
            } else {
                listForLetter.add(mySet.get(i));
                int index = 0;
                int wordLength = listForLetter.get(0).length();
                    for (int j = 0; j < listForLetter.size(); j++) {
                        if (listForLetter.get(j).length() > wordLength){
                            index = j;
                            wordLength = listForLetter.get(j).length();
                        }
                    }
                System.out.println(listForLetter.get(index));
                listForLetter.clear();
            }
        }


    }

}
