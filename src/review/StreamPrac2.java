package review;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPrac2 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date");

        List<String> sortedWords = words.stream()
                .sorted((a, b) -> Integer.compare(a.length(), b.length()))
                .collect(Collectors.toList());

        System.out.println("Sorted words by length: " + sortedWords);


        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);

        List<Integer> distinctNumbers = numbers.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Distinct numbers: " + distinctNumbers);
    }



}
