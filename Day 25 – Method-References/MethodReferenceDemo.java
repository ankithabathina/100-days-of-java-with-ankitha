import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

class MathOperations {

    public static int square(int number) {
        return number * number;
    }

}

class Printer {

    public void display(String message) {
        System.out.println(message);
    }

}

class Student {

    public Student() {
        System.out.println("Student Object Created");
    }

}

public class MethodReferenceDemo {

    public static void main(String[] args) {

        System.out.println("===== Method References in Java =====");

        // 1. Static Method Reference
        System.out.println("\n1. Static Method Reference");

        Function<Integer, Integer> square = MathOperations::square;

        System.out.println("Square of 5 : " + square.apply(5));
        System.out.println("Square of 10 : " + square.apply(10));

        // 2. Instance Method Reference
        System.out.println("\n2. Instance Method Reference");

        Printer printer = new Printer();

        Consumer<String> print = printer::display;

        print.accept("Welcome to Java");
        print.accept("Method References are easy!");

        // 3. Instance Method of an Arbitrary Object
        System.out.println("\n3. Instance Method of an Arbitrary Object");

        List<String> names = Arrays.asList(
                "ankitha",
                "java",
                "spring boot",
                "github");

        names.stream()
             .map(String::toUpperCase)
             .forEach(System.out::println);

        // 4. Constructor Reference
        System.out.println("\n4. Constructor Reference");

        Supplier<Student> student = Student::new;

        student.get();

        System.out.println("\n===== Program Completed Successfully =====");

    }

}
