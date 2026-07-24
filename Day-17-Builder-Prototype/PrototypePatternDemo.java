class Employee implements Cloneable {

    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void display() {
        System.out.println("Name   : " + name);
        System.out.println("Salary : " + salary);
    }
}

public class PrototypePatternDemo {

    public static void main(String[] args) {

        try {

            Employee emp1 = new Employee("Ankitha", 50000);

            Employee emp2 = (Employee) emp1.clone();

            System.out.println("Original Employee");
            emp1.display();

            System.out.println();

            System.out.println("Cloned Employee");
            emp2.display();

            System.out.println();

            System.out.println("Are both objects same?");
            System.out.println(emp1 == emp2);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
