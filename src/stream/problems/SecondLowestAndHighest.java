package stream.problems;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SecondLowestAndHighest {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(910, 12, 3, 4, 5, 66, 7, 89, 52, 33, 11);

       int secondLeast = numbers.stream()
                .sorted().distinct().limit(2).skip(1).findFirst().get();
        System.out.println(secondLeast);
       int secondHighest = numbers.stream()
               .sorted(Collections.reverseOrder())
               .distinct().limit(2)
               .skip(1).findFirst().get();
        System.out.println(secondHighest);


    }
}
