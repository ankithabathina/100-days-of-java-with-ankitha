import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        // Adding Elements
        list.add("Java");
        list.add("Spring Boot");
        list.add("React");

        System.out.println("LinkedList: " + list);

        // Add First
        list.addFirst("HTML");

        // Add Last
        list.addLast("MySQL");

        System.out.println("After Adding: " + list);

        // Get First and Last
        System.out.println("First Element: " + list.getFirst());
        System.out.println("Last Element: " + list.getLast());

        // Remove Element
        list.remove("React");

        System.out.println("After Removing: " + list);

        // Contains
        System.out.println("Contains Java? " + list.contains("Java"));
    }
}
