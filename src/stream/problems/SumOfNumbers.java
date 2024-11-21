package stream.problems;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfNumbers {
    public static void main(String[] args) {


        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);

        Optional<Integer> sumOfNumbers = numbers.stream()
                .reduce(Integer::sum);

        System.out.println("Sum of number in list : "+sumOfNumbers.get());

    }
}
