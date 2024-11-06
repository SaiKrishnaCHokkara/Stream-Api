package stream.streamandmethodref;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

public class StreamAndMethodRefMain
{
    public static void main(String[] args) {

        List<String> names = Arrays.asList("sai","ram","raj","krishna","yash","jai");

       names.stream()


                .map(Employee::new) // Employee(id , Name); this Employee object will passes through entire stream
               .peek((employee)->
                       employee.setId(ThreadLocalRandom.current().nextInt(1, 100)))
               .map(Employee::getName) // employe.getname() which returns String name
               .map(String::toUpperCase)// converting that string name toUpperCase()
//               .limit(4)  //Setting limit to 4
                .forEach(System.out::println); // Producing the output


    }

}
