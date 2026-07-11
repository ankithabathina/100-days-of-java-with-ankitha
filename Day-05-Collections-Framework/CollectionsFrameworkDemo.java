import java.util.*;

public class CollectionsFrameworkDemo {

    public static void main(String[] args) {

        // List
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Spring Boot");
        System.out.println("List : " + list);

        // Set
        Set<String> set = new HashSet<>();
        set.add("Java");
        set.add("Java");
        set.add("React");
        System.out.println("Set : " + set);

        // Map
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Java");
        map.put(2, "Spring Boot");
        map.put(3, "React");
        System.out.println("Map : " + map);

        // Queue
        Queue<String> queue = new LinkedList<>();
        queue.add("Java");
        queue.add("Python");
        queue.add("C++");
        System.out.println("Queue : " + queue);
    }
}
