package stream.map;

import java.util.Arrays;

public class MapMethod {
    public static void main(String[] args) {

        Integer[] numbers = {1,2,3,4,5,6,7,8,9,10};

        Arrays.stream(numbers)
                .filter(num -> num>3)
                .map((num) ->
                        {
                            switch (num)
                            {
                                case 4: return "Four";
                                case 5: return "Five";
                                case 6: return "Six";
                                case 7: return "Seven";
                                case 8: return "Eight";
                                case 9: return "Nine";
                                case 10: return "Ten";


                            }
                            return "Not found the word ";
                        }
                        )
                .forEach(num -> System.out.println(num));


    }
}

//There are two types of operations in streams
/*

 1. Intermediate Operations : which is used to for some operation in between stream
                              and which returns respective stream.
                              ex: filter() , map() etc
            These Intermediate operations are further divided into two types
                i. State Full : Inorder to process the data these state full intermediate operations
                                will store all the data in the memory and processes it and provides the
                                data. ex: sorted() , limit() -> short circuiting State full method etc

                ii.States Less : It is quite opposite to State full operation it doesn't store's
                                 the data to process it when ever the first data come to it will check
                                 according to condition if it passes it send to next stage or else disappear
                                 (it checks one after another it will not remember the previous data).
                                 ex: filter() , map() etc

 2. Terminal Operations : which is used to print output in other words
                          It will start the pipeline and end pipeline after getting output.
                          ex: forEach() , count() , collect() etc

    NOTE : Once we perform terminal operation on stream which performed intermediate operation
           we cannot utilize that stream.

 */