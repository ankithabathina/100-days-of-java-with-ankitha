public class MemoryManagementDemo {

    int id = 101;

    public static void main(String[] args) {

        MemoryManagementDemo obj1 = new MemoryManagementDemo();
        MemoryManagementDemo obj2 = new MemoryManagementDemo();

        System.out.println("Objects Created");

        obj1 = null;
        obj2 = null;

        System.gc();

        System.out.println("Garbage Collection Requested");
    }

    @Override
    protected void finalize() {

        System.out.println("Object Destroyed by Garbage Collector");

    }
}
