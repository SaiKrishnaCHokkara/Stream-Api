package stream.methodReference;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MethodReference {
    public static void main(String[] args) {

        List<Integer> integersList = Arrays.asList( 1, 5, 3, 7, 9, 2, 4, 6, 9, 10);

//        using lambda expression
        ISort iSort = (list ->{
           Collections.sort(list);
        });

//        iSort.sortedList(integersList);
//        System.out.println(" After sorting : "+integersList);

        /*
         *  Method Reference : 1.It is a process that reduces the lambda expression
         *                     2.It will be used to avoid duplicate code and re-use the existing code for example
         *                     3.There two methods which performs same operation in order implement both the methods
         *                       we can reference one method with another one
         *                     4.For Static methods we need to use (syntax: ClassName::methodName ) operator
         * Example : Above Lambda code converting into Method Reference way
         *
         * Note : Method Reference internally uses lambda expressions
         *
         * Flow : 1. iSort1.sortedList(integersList) called then it will check for implementation
         *        2. There is no implementation and checks this ISort iSort1 = Collections::sort;
         *        3. we already have an in-built method that performs sort operation,we referenced to that method
         *        4. sortedList() will take the implementation of Collections.sort()
         *        5. Then it will process the list and produces result
         */

        ISort iSort1 = Collections::sort;

        iSort1.sortedList(integersList);
        System.out.println(integersList);



    }
}
