package stream.problems;

import java.util.Arrays;
import java.util.List;

public class OddAndEven {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(910,12,3,4,5,66,7,89,52,33,11);

        numbers.stream()
                .filter(num -> num%2==0)
                .forEach(System.out::println);

        numbers.stream()
                .filter(num -> num%2!=0)
                .forEach(System.out::println);

    }
}
