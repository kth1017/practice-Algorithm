package review;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicatePractice {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Jack", "Doe");

        Predicate<String> startsWithJ = name -> name.startsWith("J");

        List<String> filteredNames = names.stream()
                .filter(startsWithJ)
                .collect(Collectors.toList());

        System.out.println(filteredNames);
    }
}
