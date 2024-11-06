package stream.parllelstreams;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParallelSynchronized {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
      // List<Integer> syncList = (List<Integer>) Collections.synchronizedCollection(list);
        for (int i = 1; i < 6; i++)
        {
         List<Integer> collectors =   Stream.iterate(0 , no -> no+1).parallel().limit(20).collect(Collectors.toList());
            System.out.println(collectors);
            System.out.println("Size of List : "+collectors.size());

        }

    }
}
