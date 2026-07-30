import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

@FunctionalInterface
interface Greeting {

    void message();

}

@FunctionalInterface
interface Addition {

    int add(int a, int b);

}

public class FunctionalInterfaceDemo {

    public static void main(String[] args) {

        System.out.println("===== Functional Interface Demo =====");

        // Greeting Interface
        Greeting greet = () -> System.out.println("Hello, Welcome to Java!");

        greet.message();

        System.out.println();

        // Addition Interface
        Addition sum = (a, b) -> a + b;

        System.out.println("Addition of 10 and 20 : " + sum.add(10, 20));

        System.out.println();

        // Predicate Example
        Predicate<Integer> even = number -> number % 2 == 0;

        System.out.println("Is 10 Even? " + even.test(10));
        System.out.println("Is 15 Even? " + even.test(15));

        System.out.println();

        // Function Example
        Function<Integer, Integer> square = number -> number * number;

        System.out.println("Square of 5 : " + square.apply(5));
        System.out.println("Square of 8 : " + square.apply(8));

        System.out.println();

        // Consumer Example
        Consumer<String> print = name -> System.out.println("Hello " + name);

        print.accept("Ankitha");

        System.out.println();

        // Supplier Example
        Supplier<String> message = () -> "Welcome to Functional Interfaces";

        System.out.println(message.get());

        System.out.println();

        System.out.println("===== Program Completed Successfully =====");

    }

}
