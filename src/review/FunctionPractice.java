package review;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionPractice {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Jack", "Doe");

        Function<String, Integer> nameLength = name -> name.length();

        List<Integer> nameLengths = names.stream()
                .map(nameLength)
                .collect(Collectors.toList());

        System.out.println(nameLengths);
    }
}
