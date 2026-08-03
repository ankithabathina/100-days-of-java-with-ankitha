import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamAPIDemo {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50, 30, 20);

        System.out.println("Original List");
        System.out.println(numbers);

        // filter()
        System.out.println("\nNumbers Greater Than 20");

        numbers.stream()
               .filter(number -> number > 20)
               .forEach(System.out::println);

        // map()
        System.out.println("\nSquare of Each Number");

        numbers.stream()
               .map(number -> number * number)
               .forEach(System.out::println);

        // sorted()
        System.out.println("\nSorted Numbers");

        numbers.stream()
               .sorted()
               .forEach(System.out::println);

        // distinct()
        System.out.println("\nDistinct Numbers");

        numbers.stream()
               .distinct()
               .forEach(System.out::println);

        // limit()
        System.out.println("\nFirst Three Numbers");

        numbers.stream()
               .limit(3)
               .forEach(System.out::println);

        // skip()
        System.out.println("\nAfter Skipping First Two Numbers");

        numbers.stream()
               .skip(2)
               .forEach(System.out::println);

        // collect()
        System.out.println("\nCollect Numbers Greater Than 20");

        List<Integer> result = numbers.stream()
                                      .filter(number -> number > 20)
                                      .collect(Collectors.toList());

        System.out.println(result);

        // count()
        long count = numbers.stream().count();

        System.out.println("\nTotal Elements : " + count);

        // min()
        Optional<Integer> minimum = numbers.stream()
                                           .min(Integer::compareTo);

        System.out.println("\nMinimum Number : " + minimum.get());

        // max()
        Optional<Integer> maximum = numbers.stream()
                                           .max(Integer::compareTo);

        System.out.println("Maximum Number : " + maximum.get());

        // findFirst()
        Optional<Integer> first = numbers.stream().findFirst();

        System.out.println("\nFirst Element : " + first.get());

        // anyMatch()
        boolean any = numbers.stream()
                             .anyMatch(number -> number > 45);

        System.out.println("\nAny Number Greater Than 45 : " + any);

        // allMatch()
        boolean all = numbers.stream()
                             .allMatch(number -> number > 5);

        System.out.println("All Numbers Greater Than 5 : " + all);

        // noneMatch()
        boolean none = numbers.stream()
                              .noneMatch(number -> number < 0);

        System.out.println("No Negative Numbers : " + none);

    }

}
