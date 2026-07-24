class Student {

    // Required Fields
    private String name;
    private int age;

    // Optional Fields
    private String department;
    private String email;
    private double cgpa;

    // Private Constructor
    private Student(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.department = builder.department;
        this.email = builder.email;
        this.cgpa = builder.cgpa;
    }

    // Display Method
    public void display() {
        System.out.println("Student Details");
        System.out.println("--------------------------");
        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
        System.out.println("Department : " + department);
        System.out.println("Email      : " + email);
        System.out.println("CGPA       : " + cgpa);
    }

    // Static Builder Class
    public static class Builder {

        private String name;
        private int age;
        private String department;
        private String email;
        private double cgpa;

        public Builder(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Builder setDepartment(String department) {
            this.department = department;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setCgpa(double cgpa) {
            this.cgpa = cgpa;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }
}

public class BuilderPatternDemo {

    public static void main(String[] args) {

        Student student = new Student.Builder("Ankitha", 21)
                .setDepartment("Computer Science")
                .setEmail("ankitha@gmail.com")
                .setCgpa(8.5)
                .build();

        student.display();
    }
}
