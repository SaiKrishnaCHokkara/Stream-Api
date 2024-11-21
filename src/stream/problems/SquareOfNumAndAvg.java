package stream.problems;

import java.util.Arrays;
import java.util.List;

public class SquareOfNumAndAvg {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);

        double res = numbers.stream()
                .map(num -> num * num)
                .filter(num -> num > 10)
                .mapToInt(num -> num)
                .average()
                .getAsDouble();

        System.out.println("Avg of Squares of given numbers : "+res);



    }
}
