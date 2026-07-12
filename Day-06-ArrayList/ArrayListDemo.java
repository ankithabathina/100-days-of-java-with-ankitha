import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        // Adding Elements
        list.add("Java");
        list.add("Spring Boot");
        list.add("React");

        System.out.println("ArrayList: " + list);

        // Accessing Element
        System.out.println("Element at index 1: " + list.get(1));

        // Updating Element
        list.set(2, "MySQL");
        System.out.println("After Update: " + list);

        // Removing Element
        list.remove(1);
        System.out.println("After Remove: " + list);

        // Searching Element
        System.out.println("Contains Java? " + list.contains("Java"));

        // Size
        System.out.println("Size: " + list.size());
    }
}
