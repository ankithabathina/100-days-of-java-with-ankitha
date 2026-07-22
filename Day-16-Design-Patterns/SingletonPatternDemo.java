class Singleton {

    // Step 1: Create a static object reference
    private static Singleton instance;

    // Step 2: Make the constructor private
    private Singleton() {
        System.out.println("Singleton Object Created");
    }

    // Step 3: Provide a public method to access the object
    public static Singleton getInstance() {

        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }

    public void display() {
        System.out.println("Welcome to Singleton Design Pattern");
    }
}

public class SingletonPatternDemo {

    public static void main(String[] args) {

        Singleton obj1 = Singleton.getInstance();

        Singleton obj2 = Singleton.getInstance();

        obj1.display();

        System.out.println(obj1);

        System.out.println(obj2);

        System.out.println("Same Object : " + (obj1 == obj2));

    }

}
