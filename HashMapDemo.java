import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Java");
        map.put(2, "Spring Boot");
        map.put(3, "React");

        System.out.println("Complete Map: " + map);
        System.out.println("Value for key 2: " + map.get(2));
    }
}
