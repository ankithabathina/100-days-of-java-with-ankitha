import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

// Student Class
class Student {

    private String name = "Ankitha";
    private int age = 21;

    public Student() {
        System.out.println("Student Object Created");
    }

    public void display() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }

    private void privateMethod() {
        System.out.println("Private Method Executed Successfully");
    }
}

// Main Class
public class ReflectionDemo {

    public static void main(String[] args) throws Exception {

        // Step 1: Get Class Object
        Class<?> cls = Student.class;

        System.out.println("========== CLASS INFORMATION ==========");
        System.out.println("Class Name : " + cls.getName());

        // Step 2: Constructors
        System.out.println("\n========== CONSTRUCTORS ==========");

        Constructor<?>[] constructors = cls.getDeclaredConstructors();

        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor.getName());
        }

        // Step 3: Create Object Dynamically
        Object obj = cls.getDeclaredConstructor().newInstance();

        // Step 4: Methods
        System.out.println("\n========== METHODS ==========");

        Method[] methods = cls.getDeclaredMethods();

        for (Method method : methods) {
            System.out.println(method.getName());
        }

        // Step 5: Fields
        System.out.println("\n========== FIELDS ==========");

        Field[] fields = cls.getDeclaredFields();

        for (Field field : fields) {
            System.out.println(field.getName());
        }

        // Step 6: Invoke Public Method
        System.out.println("\n========== INVOKE PUBLIC METHOD ==========");

        Method displayMethod = cls.getDeclaredMethod("display");
        displayMethod.invoke(obj);

        // Step 7: Invoke Private Method
        System.out.println("\n========== INVOKE PRIVATE METHOD ==========");

        Method privateMethod = cls.getDeclaredMethod("privateMethod");

        privateMethod.setAccessible(true);

        privateMethod.invoke(obj);
    }
}
