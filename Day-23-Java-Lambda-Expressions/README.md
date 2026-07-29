# Day 23 – Java Lambda Expressions

## 📌 Objective

The objective of this project is to understand Java Lambda Expressions, their syntax, advantages, and real-world applications. This project demonstrates how Lambda Expressions simplify Java programming by reducing boilerplate code and enabling functional programming features introduced in Java 8.

---

# 📖 Introduction

Lambda Expressions were introduced in **Java 8** to support **Functional Programming**. They provide a concise way to implement functional interfaces without creating anonymous inner classes.

Lambda Expressions make Java code shorter, cleaner, and easier to read. They are widely used with the **Collections Framework**, **Stream API**, **Comparator**, and **Multithreading**.

---

# What is a Lambda Expression?

A Lambda Expression is an anonymous function that can be passed as an argument or assigned to a variable.

It consists of:

- Parameters
- Arrow Operator (`->`)
- Method Body

### Syntax

```java
(parameters) -> {
    // body
}
```

### Example

```java
() -> System.out.println("Hello Java");
```

---

# Why Lambda Expressions?

Before Java 8, developers used **Anonymous Inner Classes** to implement interfaces.

Lambda Expressions:

- Reduce code length.
- Improve readability.
- Increase productivity.
- Support functional programming.
- Work seamlessly with Streams and Collections.

---

# Functional Interface

A Functional Interface is an interface that contains **only one abstract method**.

Example:

```java
@FunctionalInterface
interface Greeting{

    void message();

}
```

---

# Lambda Expression Examples

## Example 1: No Parameters

```java
Greeting greet = () -> System.out.println("Hello Java");

greet.message();
```

---

## Example 2: One Parameter

```java
Square square = (x) -> x * x;

System.out.println(square.findSquare(5));
```

---

## Example 3: Multiple Parameters

```java
Addition add = (a,b) -> a + b;

System.out.println(add.sum(10,20));
```

---

# Lambda with Collections

Lambda Expressions simplify iteration.

```java
List<String> names = Arrays.asList("Ankitha","Rahul","David");

names.forEach(name -> System.out.println(name));
```

---

# Lambda with Comparator

Sorting becomes easier using Lambda.

```java
Collections.sort(names,(a,b)->a.compareTo(b));
```

---

# Method Reference (Introduction)

Method Reference is a shorter form of Lambda Expression.

Example:

```java
names.forEach(System.out::println);
```

---

# Anonymous Class vs Lambda Expression

| Anonymous Class | Lambda Expression |
|-----------------|-------------------|
| More code | Less code |
| Difficult to read | Easy to read |
| Uses class syntax | Uses arrow operator (`->`) |
| Slower to write | Faster to write |

---

# Advantages

- Reduces boilerplate code.
- Improves readability.
- Supports Functional Programming.
- Simplifies Collection operations.
- Easy to use with Streams.
- Improves code maintainability.

---

# Disadvantages

- Can be confusing for beginners.
- Difficult to debug complex Lambda Expressions.
- Can only implement Functional Interfaces.
- Overuse may reduce readability.

---

# Real-Time Applications

### Collections Framework

- Sorting
- Searching
- Filtering

### Stream API

- map()
- filter()
- reduce()
- collect()

### Comparator

- Custom Sorting

### Multithreading

- Runnable
- ExecutorService

### Spring Boot

- Functional Programming
- Stream Processing

---

# Best Practices

- Keep Lambda Expressions short.
- Use meaningful variable names.
- Prefer Method References when possible.
- Avoid complex nested Lambda Expressions.
- Use Functional Interfaces appropriately.

---

# Interview Questions

## Basic

1. What is a Lambda Expression?
2. Why were Lambda Expressions introduced?
3. What is Functional Programming?

## Intermediate

4. What is a Functional Interface?
5. Explain Lambda Expression syntax.
6. Difference between Lambda Expression and Anonymous Class?
7. What is Method Reference?

## Advanced

8. How are Lambda Expressions implemented internally?
9. Can Lambda Expressions access local variables?
10. Where are Lambda Expressions used in Stream API?
11. Explain effectively final variables.
12. What are the advantages of Lambda Expressions?

---

# Learning Outcomes

After completing this project, you will be able to:

- Understand Lambda Expressions.
- Write concise Java code.
- Implement Functional Interfaces.
- Use Lambda with Collections.
- Sort data using Comparator.
- Understand Method References.
- Use Lambda Expressions in real-world applications.
- Answer Java 8 interview questions confidently.

---

# Technologies Used

- Java
- Java 8+
- Collections Framework
- Functional Interfaces
- Lambda Expressions
- Eclipse / IntelliJ IDEA

---

# Conclusion

Java Lambda Expressions are one of the most significant features introduced in Java 8. They simplify code by replacing anonymous inner classes with concise expressions, making applications more readable and maintainable. Lambda Expressions are widely used in modern Java development, especially with the Stream API, Collections Framework, Comparator, and Spring Boot. Mastering Lambda Expressions is an essential step toward becoming a proficient Java developer and preparing for technical interviews.
