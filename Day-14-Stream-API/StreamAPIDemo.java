import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIDemo {

    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(5, 8, 2, 9, 4, 8, 10, 3);

        System.out.println("Original List");
        System.out.println(numbers);

        System.out.println("\nEven Numbers");
        numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);

        System.out.println("\nSquare of Numbers");
        numbers.stream()
                .map(n -> n * n)
                .forEach(System.out::println);

        System.out.println("\nSorted List");
        numbers.stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println("\nDistinct Elements");
        numbers.stream()
                .distinct()
                .forEach(System.out::println);

        System.out.println("\nMaximum Number");
        System.out.println(numbers.stream().max(Integer::compare).get());

        System.out.println("\nMinimum Number");
        System.out.println(numbers.stream().min(Integer::compare).get());

        System.out.println("\nCount");
        System.out.println(numbers.stream().count());

        System.out.println("\nCollect Even Numbers");

        List<Integer> even =
                numbers.stream()
                        .filter(n -> n % 2 == 0)
                        .collect(Collectors.toList());

        System.out.println(even);
    }
}
