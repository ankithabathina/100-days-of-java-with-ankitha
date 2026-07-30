# Day 24 – Functional Interfaces

## 📌 Objective

The objective of this project is to understand **Functional Interfaces** in Java, their rules, built-in functional interfaces, and how they work with Lambda Expressions. This project demonstrates how Functional Interfaces simplify Java programming and support functional programming introduced in Java 8.

---

# 📖 Introduction

A **Functional Interface** is an interface that contains **exactly one abstract method**. It serves as the foundation for Lambda Expressions and Method References in Java.

Functional Interfaces were introduced in **Java 8** to support functional programming and reduce boilerplate code. They are widely used in the **Collections Framework**, **Stream API**, **Spring Boot**, and **Multithreading**.

---

# What is a Functional Interface?

A Functional Interface is an interface that contains only one abstract method. It may contain any number of default, static, or private methods.

### Example

```java
@FunctionalInterface
interface Greeting {

    void message();

}
```

The interface above has only one abstract method, making it a Functional Interface.

---

# Why Functional Interfaces?

Functional Interfaces are used to:

- Support Lambda Expressions.
- Reduce boilerplate code.
- Improve code readability.
- Enable Functional Programming.
- Work with Stream API.
- Simplify Collection processing.

---

# Rules of Functional Interfaces

A Functional Interface:

- Must contain exactly one abstract method.
- Can contain multiple default methods.
- Can contain multiple static methods.
- Can contain private methods (Java 9+).
- Can extend another interface if only one abstract method exists.

---

# @FunctionalInterface Annotation

The **@FunctionalInterface** annotation tells the compiler that an interface should contain only one abstract method.

### Example

```java
@FunctionalInterface
interface Greeting {

    void message();

}
```

If another abstract method is added, the compiler generates an error.

---

# Built-in Functional Interfaces

Java provides several predefined Functional Interfaces in the **java.util.function** package.

### Predicate

Represents a condition and returns a boolean value.

```java
Predicate<Integer> even = number -> number % 2 == 0;

System.out.println(even.test(10));
```

Output

```
true
```

---

### Function

Accepts one input and returns one output.

```java
Function<Integer, Integer> square =
number -> number * number;

System.out.println(square.apply(5));
```

Output

```
25
```

---

### Consumer

Consumes data but does not return any value.

```java
Consumer<String> print =
name -> System.out.println(name);

print.accept("Ankitha");
```

Output

```
Ankitha
```

---

### Supplier

Supplies data without taking any input.

```java
Supplier<String> message =
() -> "Welcome to Java";

System.out.println(message.get());
```

Output

```
Welcome to Java
```

---

# Program Workflow

```
Create Functional Interface
           │
           ▼
Implement using Lambda Expression
           │
           ▼
Execute Abstract Method
           │
           ▼
Display Output
```

---

# Custom Functional Interface

Example:

```java
@FunctionalInterface
interface Addition {

    int add(int a, int b);

}
```

Implementation:

```java
Addition sum = (a, b) -> a + b;

System.out.println(sum.add(10,20));
```

Output

```
30
```

---

# Advantages

- Reduces boilerplate code.
- Supports Functional Programming.
- Improves readability.
- Easy to maintain.
- Works seamlessly with Lambda Expressions.
- Supports Stream API.
- Increases developer productivity.

---

# Disadvantages

- Can contain only one abstract method.
- May be confusing for beginners.
- Debugging complex Lambda Expressions can be difficult.
- Overusing Functional Interfaces may reduce readability.

---

# Real-Time Applications

### Stream API

- Filtering
- Mapping
- Reducing

### Collections Framework

- Sorting
- Searching
- Iteration

### Spring Boot

- Functional programming
- Event handling

### Multithreading

- Runnable
- ExecutorService

### Data Validation

- Predicate-based validation

---

# Functional Interface vs Normal Interface

| Functional Interface | Normal Interface |
|----------------------|------------------|
| One abstract method | Multiple abstract methods |
| Supports Lambda Expressions | Does not directly support Lambda Expressions |
| Introduced in Java 8 | Available since Java 1.0 |
| Used in Functional Programming | Used in Object-Oriented Programming |

---

# Best Practices

- Use the **@FunctionalInterface** annotation.
- Keep Functional Interfaces simple.
- Use built-in Functional Interfaces whenever possible.
- Avoid creating unnecessary custom interfaces.
- Prefer Method References for simple operations.
- Use meaningful method names.

---

# Interview Questions

## Basic

1. What is a Functional Interface?
2. Why are Functional Interfaces used?
3. What is the purpose of the @FunctionalInterface annotation?

## Intermediate

4. Can a Functional Interface contain default methods?
5. Can a Functional Interface contain static methods?
6. Explain Predicate.
7. Explain Function.
8. Explain Consumer.
9. Explain Supplier.

## Advanced

10. Difference between Functional Interface and Normal Interface?
11. How do Lambda Expressions use Functional Interfaces?
12. Can a Functional Interface extend another interface?
13. How are Functional Interfaces used in Stream API?
14. Where are Functional Interfaces used in Spring Boot?

---

# Learning Outcomes

After completing this project, you will be able to:

- Understand Functional Interfaces.
- Create custom Functional Interfaces.
- Use the @FunctionalInterface annotation.
- Work with Predicate, Function, Consumer, and Supplier.
- Implement Functional Interfaces using Lambda Expressions.
- Apply Functional Interfaces in Stream API and Collections.
- Answer Java 8 Functional Interface interview questions confidently.

---

# Technologies Used

- Java
- Java 8+
- Lambda Expressions
- Functional Interfaces
- java.util.function Package
- Eclipse / IntelliJ IDEA

---

# Conclusion

Functional Interfaces are one of the core features introduced in Java 8 to support Functional Programming. They enable developers to write cleaner, more concise, and maintainable code by working seamlessly with Lambda Expressions and Method References. Built-in Functional Interfaces such as **Predicate**, **Function**, **Consumer**, and **Supplier** are widely used in the Stream API, Collections Framework, and enterprise applications like Spring Boot. Mastering Functional Interfaces is essential for modern Java development and technical interviews.
