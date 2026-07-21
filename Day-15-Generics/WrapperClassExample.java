import java.util.ArrayList;

public class WrapperClassExample {

    public static void main(String[] args) {

        // ================================
        // Example 1: Using Wrapper Class in Collections
        // ================================

        // ArrayList stores only objects, so we use Integer instead of int
        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(85);
        marks.add(92);
        marks.add(78);

        System.out.println("Student Marks: " + marks);

        // ================================
        // Example 2: Autoboxing
        // ================================

        // Java automatically converts int to Integer
        Integer number = 100;

        System.out.println("Autoboxing: " + number);

        // ================================
        // Example 3: Unboxing
        // ================================

        // Java automatically converts Integer to int
        int value = number;

        System.out.println("Unboxing: " + value);

        // ================================
        // Example 4: String to Integer
        // ================================

        String age = "21";

        int convertedAge = Integer.parseInt(age);

        System.out.println("Converted Age: " + convertedAge);

        // ================================
        // Example 5: Wrapper Class Utility Methods
        // ================================

        System.out.println("Maximum: " + Integer.max(50, 80));
        System.out.println("Minimum: " + Integer.min(50, 80));
        System.out.println("Sum: " + Integer.sum(50, 80));

    }
}
