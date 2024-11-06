package stream.parllelstreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingByParallelStream {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(11,21,1,2,41,5,61,3,456,123,9,7,23);


     numbers.parallelStream()
             .sorted()
             .forEachOrdered(System.out::println);
    }
}
