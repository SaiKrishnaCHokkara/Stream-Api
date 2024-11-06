package stream.filter;

import java.util.Arrays;

public class FilterAndTakeWhileMethods
{
    public static void main(String[] args) {

        Integer[] numbers = {1,2,3,4,5,6,7,8,9,10};

         Arrays.stream(numbers).filter(integer-> integer>5 ) // filter method takes the predicate
                 .forEach(num -> System.out.println(" "+num));

/*
    1.filter method will check each and every element one by one in the given array
    2.takeWhile() will check the element one by one whenever the condition fails then it will terminate the process
    3.skip method will skip the data based on our input for ex skip(3) it will skip the first 3 elements
    4.distinct() will eliminate the duplicate data in the given data

    note : skip() and distinct() are state full intermediate operations

*/

    }
}
