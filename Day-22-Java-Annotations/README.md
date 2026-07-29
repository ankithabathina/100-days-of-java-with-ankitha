# Day 22 – Java Annotations

## 📌 Objective

The objective of this project is to learn Java Annotations, understand their purpose, explore built-in and custom annotations, and access annotation information at runtime using the Reflection API.

---

# 📖 Introduction

Java Annotations are a form of metadata that provide additional information about classes, methods, constructors, fields, parameters, and packages. They do not directly affect the execution of a program but are used by the compiler, JVM, and frameworks such as Spring Boot, Hibernate, and JUnit.

Annotations were introduced in Java 5 to simplify development and reduce XML-based configuration.

---

# What is an Annotation?

An annotation is metadata represented by the **@** symbol. It provides information about the program without changing its logic.

### Example

```java
@Override
public void display() {
    System.out.println("Hello Java");
}
```

---

# Why Use Annotations?

- Improve code readability.
- Reduce XML configuration.
- Provide metadata to the compiler and JVM.
- Detect errors during compilation.
- Support runtime processing through Reflection.
- Simplify framework configuration.

---

# Types of Java Annotations

## 1. Built-in Annotations

These annotations are provided by Java.

Examples:

- `@Override`
- `@Deprecated`
- `@SuppressWarnings`
- `@FunctionalInterface`
- `@SafeVarargs`

---

## 2. Custom Annotations

Custom annotations are created by developers according to application requirements.

Example:

```java
@interface MyAnnotation {
    String author();
    int version();
}
```

---

# Built-in Annotations

## @Override

Indicates that a method overrides a superclass method.

```java
@Override
public void show() {
    System.out.println("Student");
}
```

---

## @Deprecated

Marks a method or class as obsolete.

```java
@Deprecated
public void oldMethod() {
}
```

---

## @SuppressWarnings

Suppresses compiler warnings.

```java
@SuppressWarnings("unchecked")
```

---

## @FunctionalInterface

Specifies that an interface contains exactly one abstract method.

```java
@FunctionalInterface
interface Demo {
    void display();
}
```

---

# Creating a Custom Annotation

```java
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnnotation {

    String author();

    int version();

}
```

---

# Meta Annotations

Meta Annotations define the behavior of other annotations.

## @Retention

Specifies how long an annotation is available.

- SOURCE
- CLASS
- RUNTIME

Example:

```java
@Retention(RetentionPolicy.RUNTIME)
```

---

## @Target

Specifies where an annotation can be applied.

Example:

```java
@Target(ElementType.METHOD)
```

Common targets:

- TYPE
- METHOD
- FIELD
- PARAMETER
- CONSTRUCTOR

---

## @Documented

Includes annotations in generated Java documentation.

---

## @Inherited

Allows child classes to inherit annotations from parent classes.

---

# Reflection with Annotations

Reflection allows Java programs to inspect classes, methods, constructors, and fields during runtime.

Example:

```java
Method method = Student.class.getMethod("show");

if(method.isAnnotationPresent(MyAnnotation.class)){

    MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);

    System.out.println(annotation.author());
    System.out.println(annotation.version());

}
```

---

# Program Workflow

```
Create Custom Annotation
        │
        ▼
Apply Annotation to Method
        │
        ▼
Execute Program
        │
        ▼
Read Annotation using Reflection
        │
        ▼
Display Annotation Details
```

---

# Advantages

- Improves code readability.
- Reduces XML configuration.
- Simplifies framework development.
- Enables compile-time checking.
- Supports runtime processing.
- Easy to maintain.

---

# Disadvantages

- Reflection may slightly reduce performance.
- Overuse can make code difficult to understand.
- Debugging annotation-based applications can be challenging.

---

# Real-Time Applications

### Spring Boot

- @SpringBootApplication
- @RestController
- @Service
- @Repository
- @Autowired

### Hibernate

- @Entity
- @Table
- @Column
- @Id

### JUnit

- @Test
- @BeforeEach
- @AfterEach

### Jakarta Validation

- @NotNull
- @Email
- @Size

---

# Annotations vs Comments

| Annotation | Comment |
|------------|----------|
| Metadata | Documentation |
| Used by compiler/JVM | Read by developers |
| Begins with @ | Begins with // or /* */ |
| Available at runtime (depending on retention) | Not available at runtime |

---

# Best Practices

- Prefer built-in annotations whenever possible.
- Use meaningful names for custom annotations.
- Keep annotations simple.
- Avoid unnecessary custom annotations.
- Use Reflection only when required.

---

# Interview Questions

### Basic

1. What are Java Annotations?
2. Why are annotations used?
3. What is metadata?

### Intermediate

4. Explain @Override.
5. Explain @Deprecated.
6. What is @Retention?
7. What is @Target?
8. What are Meta Annotations?

### Advanced

9. How are annotations read using Reflection?
10. Explain RetentionPolicy.RUNTIME.
11. How are annotations used in Spring Boot?
12. How are annotations used in Hibernate?

---

# Learning Outcomes

After completing this project, you will be able to:

- Understand Java Annotations.
- Differentiate between built-in and custom annotations.
- Create custom annotations.
- Use Meta Annotations.
- Read annotations using Reflection.
- Explain annotation usage in Spring Boot and Hibernate.
- Answer Java Annotation interview questions confidently.

---

# Technologies Used

- Java
- JDK 17+
- Reflection API
- Eclipse / IntelliJ IDEA

---

# Conclusion

Java Annotations provide metadata that simplifies application development, improves readability, and reduces configuration. They are widely used in modern Java frameworks such as Spring Boot, Hibernate, and JUnit. Learning annotations is essential for building enterprise Java applications and understanding how modern Java frameworks work.
