import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {

        // Creating a HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // Adding key-value pairs
        map.put(1, "Java");
        map.put(2, "Spring Boot");
        map.put(3, "React");

        // Display the HashMap
        System.out.println("HashMap: " + map);

        // Access a value using a key
        System.out.println("Value for key 2: " + map.get(2));

        // Check if a key exists
        System.out.println("Contains key 1: " + map.containsKey(1));

        // Check if a value exists
        System.out.println("Contains value React: " + map.containsValue("React"));

        // Remove a key-value pair
        map.remove(3);

        // Display the updated HashMap
        System.out.println("After removing key 3: " + map);

        // Display all keys
        System.out.println("Keys: " + map.keySet());

        // Display all values
        System.out.println("Values: " + map.values());

        // Display all key-value pairs
        System.out.println("Entries: " + map.entrySet());

        // Display the size of the HashMap
        System.out.println("Size: " + map.size());
    }
}
