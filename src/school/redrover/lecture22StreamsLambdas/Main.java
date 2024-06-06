package school.redrover.lecture22StreamsLambdas;

import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 3, 5, 43, 2, 5, -23, 0);
        List<String> words = List.of("some", "random", "list", "of", "words", "232132132");

        /*
                   .map(new Function<String, Integer>() {
                    @Override
                    public Integer apply(String s) {
                        return s.length();
                    }
                })
         */

        List<Integer> lengths = words //List<String>
                .stream() //Stream<String>
                .map(s -> s.length()) //Stream<Integer>
                .filter(i -> i < 3) //Stream<Integer>
                .toList(); //List<Integer>
//              .collect(Collectors.toList());
        System.out.println(lengths);

        System.out.println(
                words //List<String>
                        .stream() //Stream<String>
                        //.map(word -> word.chars().mapToObj(i -> (char) i)) //Stream<Stream<Character>>
                        .flatMap(word -> word.chars().mapToObj(i -> (char) i)) //Stream<Character>
//                        .anyMatch(c -> c == 'x')
                        .allMatch(c -> {
                            boolean isLetter = Character.isAlphabetic(c);
                            boolean isNumber = Character.isDigit(c);
                            return isLetter || isNumber;
                        }) //Boolean
        );


        System.out.println(
                words
                        .stream()
                        .reduce((a, b) -> a.length() > b.length() ? a : b)
        );

        System.out.println(
                integers.stream()
                        .reduce(
                                0,
                                (acc, number) -> acc + number,
                                (sum1, sum2) -> sum1 + sum2
                        )
        );

        System.out.println(integers.stream().reduce((a, b) -> a + b));


        Stream<Integer> mystream = Stream.iterate(1, i -> i + 1)
                .filter(i -> i % 2 == 0)
                .peek(System.out::println)
                .map(i -> i * 3);
        System.out.println("-------------------");
        System.out.println(mystream.limit(20).toList());
    }
}
