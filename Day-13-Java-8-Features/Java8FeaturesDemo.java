import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface Greeting {

    void sayHello();

    default void welcome() {
        System.out.println("Welcome to Java 8 Features!");
    }

    static void info() {
        System.out.println("Static Method inside Interface");
    }
}

public class Java8FeaturesDemo {

    public static void printMessage() {
        System.out.println("Hello from Method Reference!");
    }

    public static void main(String[] args) {

        System.out.println("===== Lambda Expression =====");

        Greeting greet = () -> System.out.println("Hello Java 8!");

        greet.sayHello();

        System.out.println("\n===== Default Method =====");

        greet.welcome();

        System.out.println("\n===== Static Method =====");

        Greeting.info();

        System.out.println("\n===== Method Reference =====");

        Greeting reference = Java8FeaturesDemo::printMessage;

        reference.sayHello();

        System.out.println("\n===== Lambda with Collection =====");

        List<String> names = Arrays.asList(
                "Ankitha",
                "Java",
                "Spring Boot",
                "Stream API"
        );

        names.forEach(name -> System.out.println(name));

        System.out.println("\n===== Method Reference =====");

        names.forEach(System.out::println);
    }
}
