package stream.problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxAndMin {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(910,12,3,4,5,66,7,89,52,33,11);
        int max = numbers.stream().
                max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(max);

        int min = numbers.stream().
                min(Comparator.comparing(Integer::valueOf)).get();

        System.out.println(min);
    }
}
