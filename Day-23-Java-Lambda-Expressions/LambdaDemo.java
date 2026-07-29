import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Functional Interface with No Parameters
@FunctionalInterface
interface Greeting {
    void message();
}

// Functional Interface with One Parameter
@FunctionalInterface
interface Square {
    int findSquare(int number);
}

// Functional Interface with Two Parameters
@FunctionalInterface
interface Addition {
    int add(int a, int b);
}

public class LambdaDemo {

    public static void main(String[] args) {

        // Lambda Expression with No Parameters
        Greeting greet = () -> System.out.println("Hello Java Lambda Expressions");

        greet.message();

        // Lambda Expression with One Parameter
        Square square = (number) -> number * number;

        System.out.println("Square of 5 = " + square.findSquare(5));

        // Lambda Expression with Multiple Parameters
        Addition addition = (a, b) -> a + b;

        System.out.println("Sum = " + addition.add(10, 20));

        // Collections Example
        List<String> names = new ArrayList<>();

        names.add("Rahul");
        names.add("Ankitha");
        names.add("David");
        names.add("Ramesh");

        System.out.println("\nBefore Sorting");

        names.forEach(name -> System.out.println(name));

        // Sorting using Lambda Expression
        Collections.sort(names, (name1, name2) -> name1.compareTo(name2));

        System.out.println("\nAfter Sorting");

        names.forEach(name -> System.out.println(name));

        // Method Reference
        System.out.println("\nPrinting Using Method Reference");

        names.forEach(System.out::println);
    }
}
