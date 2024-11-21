package stream.problems;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Sorting {
    public static void main(String[] args) {


        List<Integer> numbers = Arrays.asList(910,12,3,4,5,66,7,89,52,33,11);

        numbers.stream()
                .sorted().forEach(System.out::println);

      numbers.stream()
                 .sorted(Collections.reverseOrder())
              .forEach(System.out::println);

    }
}
