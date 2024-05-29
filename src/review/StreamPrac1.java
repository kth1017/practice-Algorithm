package review;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPrac1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Even numbers: " + evenNumbers);



        List<String> words = Arrays.asList("apple", "banana", "cherry");

        List<String> upperCaseWords = words.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("Uppercase words: " + upperCaseWords);
    }
}
