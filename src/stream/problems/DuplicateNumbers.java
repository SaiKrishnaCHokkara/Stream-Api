package stream.problems;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(910,12,12,4,1,66,7,89,52,33,1);



        Set<Integer> set = numbers.stream()
        .filter(num-> Collections.frequency(numbers, num)>1)
        .collect(Collectors.toSet());
        System.out.println(set);
    }
}
