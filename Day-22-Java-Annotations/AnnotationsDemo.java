import java.lang.annotation.*;
import java.lang.reflect.Method;

// Creating a Custom Annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnnotation {
    String author();
    int version();
}

// Class using the annotation
class Student {

    @MyAnnotation(author = "Ankitha", version = 1)
    public void display() {
        System.out.println("Welcome to Java Annotations");
    }
}

public class AnnotationsDemo {

    public static void main(String[] args) throws Exception {

        Student student = new Student();

        // Calling the method
        student.display();

        // Getting the Method object
        Method method = Student.class.getMethod("display");

        // Checking whether annotation is present
        if (method.isAnnotationPresent(MyAnnotation.class)) {

            // Getting annotation values
            MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);

            System.out.println("\nAnnotation Details");
            System.out.println("-------------------");
            System.out.println("Author  : " + annotation.author());
            System.out.println("Version : " + annotation.version());
        }
    }
}
