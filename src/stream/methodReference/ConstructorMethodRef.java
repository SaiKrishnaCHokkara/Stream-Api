package stream.methodReference;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorMethodRef {
    public static void main(String[] args) {

        Supplier<Employee> supplier = Employee::new;
        System.out.println(supplier.get());

        Function<Integer,Employee> function = Employee::new;
        Employee employee = function.apply(101);
        System.out.println(employee);

        BiFunction<Integer,String ,Employee> biFunction = Employee::new;
        Employee employee1 =biFunction.apply(101, "Krishna");
        System.out.println(employee1);
    }
}
