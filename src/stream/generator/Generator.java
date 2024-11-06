package stream.generator;

import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

import static jdk.nashorn.internal.objects.NativeArray.forEach;

public class Generator
{
    public static void main(String[] args) {

//        Supplier<String> supplier = ()->{return "Hello Stream...!";};


//        Consumer<String> consumer = (s)->{System.out.println(s);};

        Stream.generate(()->"Hello Stream...!" )
                .forEach(str->System.out.println(str));

    }
}
