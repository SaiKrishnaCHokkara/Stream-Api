package stream.generator;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class OfMethod
{
    public static void main(String[] args) {


       Stream.of(1,2,3,4,5,6,7,8,9,10)
               .forEach((intObj)->System.out.println(intObj));
    }

}
