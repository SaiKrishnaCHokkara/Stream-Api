package stream.inbuiltFunctionalInterfaces;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

public class FunctionalInterfaces {

    public static void main(String[] args) {

        // 1. Consumer interface which has accept(type)

        List<Integer> numbers = Arrays.asList(1,4,3,6,5,8,7,8,9,1,2);

        Consumer<List<Integer>> consumer = Collections::sort;

                consumer.accept(numbers);

        System.out.println(numbers);
        // 2. BiFunction Interface which has apply(type , type , return type)

        BiFunction<Integer,Integer,Integer> biFunction = Integer::sum;
       int i = biFunction.apply(123, 234);
        System.out.println(i);
        // 3. BiPredicate Interface which has test(type , type)

        BiPredicate<String , String> strCompare = Object::equals;
       boolean b= strCompare.test("Krishna", "krishna");
        System.out.println(b);
        // Calling non-static method reference

        Consumer<String> stringConsumer = System.out::println;
        stringConsumer.accept("Sai Krishna");


    }
}
