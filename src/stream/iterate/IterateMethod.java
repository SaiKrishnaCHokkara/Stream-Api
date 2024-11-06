package stream.iterate;

import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class IterateMethod {

    public static void main(String[] args) {

        Stream.iterate(10, integer ->{
            return integer+5 ;
                } )
//                .limit(10)
                .sorted()
                .forEach(System.out::println);

    }

}
