package review;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LambdaPractice1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // 각 숫자를 제곱하고 합산
        int sumOfSquares = numbers.stream()
                .map(n -> n * n)
                .reduce(0, Integer::sum);

        System.out.println(sumOfSquares);

        List<String> items = Arrays.asList("apple", "banana", "orange", "apple", "orange", "banana", "banana");

        // 아이템을 그룹화하고 개수 세기
        Map<String, Long> itemCount = items.stream()
                .collect(Collectors.groupingBy(item -> item, Collectors.counting()));

        System.out.println(itemCount);
    }

}
