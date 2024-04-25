
package school.redrover.generics.animals;

import school.redrover.generics.comparators.Comparators;

import static school.redrover.generics.animals.Animals.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(Comparators.findBest(
                List.of(TIGER, ELEPHANT, BEAR, ANT, DUNG_BEETLE),
                STRONGEST
        ).getName());
    }
}