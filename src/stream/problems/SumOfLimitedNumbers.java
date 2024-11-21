package stream.problems;

import java.util.Arrays;
import java.util.List;

public class SumOfLimitedNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(910,12,3,4,5,66,7,89,52,33,11);


       int sum = numbers.stream()
               .skip(5)
               .limit(5)
                .reduce((num1,num2)-> num1+num2)
                .get();

        System.out.println(sum);

    }
}
