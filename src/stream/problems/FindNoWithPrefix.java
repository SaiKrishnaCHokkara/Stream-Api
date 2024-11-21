package stream.problems;

import java.util.Arrays;
import java.util.List;

public class FindNoWithPrefix {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(910,912,93,4,95,66,97,989,52,933,911);

numbers.stream()
        .map(num -> num.toString())
        .filter(num-> num.startsWith("9"))
        .mapToInt(num -> Integer.valueOf(num))
        .forEach(System.out::println);


    }
}
