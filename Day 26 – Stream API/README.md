# Day 26 – Stream API

## 📌 Objective

The objective of this project is to understand the Java Stream API, learn how to process collections efficiently using functional programming concepts, and perform operations such as filtering, mapping, sorting, and collecting data with concise and readable code.

---

# 📖 Introduction

The **Stream API** was introduced in **Java 8** to simplify processing collections. It allows developers to perform operations on data in a declarative and functional style without modifying the original collection.

A Stream is not a data structure; it is a sequence of elements that supports various operations such as filtering, mapping, sorting, searching, and collecting data.

The Stream API works seamlessly with **Lambda Expressions**, **Method References**, and **Functional Interfaces**, making Java code cleaner and easier to maintain.

---

# What is Stream API?

A Stream is a sequence of elements from a source such as a List, Set, Array, or Map that supports aggregate operations.

Unlike collections, Streams do not store data. They process data from a source and produce a result.

### Syntax

```java
collection.stream()
          .operation()
          .terminalOperation();
```

---

# Why Stream API?

The Stream API is used to:

- Reduce boilerplate code.
- Improve readability.
- Support functional programming.
- Process large collections efficiently.
- Perform operations without modifying the original data.
- Enable sequential and parallel processing.

---

# Features of Stream API

- Introduced in Java 8.
- Supports Functional Programming.
- Uses Lambda Expressions.
- Uses Method References.
- Supports Parallel Streams.
- Lazy evaluation.
- Does not modify the original collection.
- Improves code readability.

---

# Creating Streams

Streams can be created from collections, arrays, or the Stream class.

### Example

```java
List<Integer> numbers =
Arrays.asList(10,20,30,40,50);

numbers.stream()
       .forEach(System.out::println);
```

Output

```
10
20
30
40
50
```

---

# Intermediate Operations

Intermediate operations return another Stream and are executed only when a terminal operation is called.

## filter()

Returns elements that satisfy a given condition.

```java
numbers.stream()
       .filter(number -> number > 20)
       .forEach(System.out::println);
```

Output

```
30
40
50
```

---

## map()

Transforms each element into another form.

```java
numbers.stream()
       .map(number -> number * number)
       .forEach(System.out::println);
```

Output

```
100
400
900
1600
2500
```

---

## sorted()

Sorts elements in ascending order.

```java
numbers.stream()
       .sorted()
       .forEach(System.out::println);
```

---

## distinct()

Removes duplicate elements.

```java
numbers.stream()
       .distinct()
       .forEach(System.out::println);
```

---

## limit()

Returns only the specified number of elements.

```java
numbers.stream()
       .limit(3)
       .forEach(System.out::println);
```

Output

```
10
20
30
```

---

## skip()

Skips the specified number of elements.

```java
numbers.stream()
       .skip(2)
       .forEach(System.out::println);
```

Output

```
30
40
50
```

---

# Terminal Operations

Terminal operations produce the final result and close the Stream.

## forEach()

```java
numbers.stream()
       .forEach(System.out::println);
```

---

## collect()

```java
List<Integer> result =
numbers.stream()
       .filter(number -> number > 20)
       .collect(Collectors.toList());
```

---

## count()

```java
long count =
numbers.stream().count();
```

---

## min()

```java
Optional<Integer> minimum =
numbers.stream().min(Integer::compare);
```

---

## max()

```java
Optional<Integer> maximum =
numbers.stream().max(Integer::compare);
```

---

## findFirst()

```java
Optional<Integer> first =
numbers.stream().findFirst();
```

---

## anyMatch()

```java
boolean result =
numbers.stream()
       .anyMatch(number -> number > 40);
```

---

## allMatch()

```java
boolean result =
numbers.stream()
       .allMatch(number -> number > 5);
```

---

## noneMatch()

```java
boolean result =
numbers.stream()
       .noneMatch(number -> number < 0);
```

---

# Program Workflow

```
Collection
      │
      ▼
Create Stream
      │
      ▼
Intermediate Operations
(filter, map, sorted...)
      │
      ▼
Terminal Operation
(collect, count, forEach...)
      │
      ▼
Final Result
```

---

# Advantages

- Reduces boilerplate code.
- Improves readability.
- Supports functional programming.
- Simplifies collection processing.
- Supports parallel processing.
- Improves maintainability.
- Efficient for data processing.

---

# Disadvantages

- Not suitable for very simple operations.
- Cannot reuse a Stream after a terminal operation.
- Debugging complex Stream pipelines can be difficult.
- Slight learning curve for beginners.

---

# Real-Time Applications

- Data filtering
- Report generation
- E-commerce product search
- Employee management systems
- Spring Boot applications
- Stream processing
- Collection manipulation

---

# Best Practices

- Keep Stream operations simple.
- Prefer Method References where applicable.
- Avoid modifying the source collection.
- Use parallel streams only when beneficial.
- Choose appropriate terminal operations.

---

# Interview Questions

## Basic

1. What is Stream API?
2. Why was Stream API introduced?
3. Difference between Collection and Stream?
4. What are intermediate operations?
5. What are terminal operations?

## Intermediate

6. Explain filter().
7. Explain map().
8. Explain collect().
9. Explain sorted().
10. Explain distinct().

## Advanced

11. Difference between stream() and parallelStream()?
12. Can a Stream be reused?
13. Explain lazy evaluation.
14. Difference between map() and flatMap()?
15. How is Stream API used in Spring Boot?

---

# Learning Outcomes

After completing this project, you will be able to:

- Understand the Java Stream API.
- Create and process Streams.
- Use intermediate and terminal operations.
- Filter, transform, and sort data.
- Improve code readability using functional programming.
- Apply Stream API in real-world Java applications.
- Answer Stream API interview questions confidently.

---

# Technologies Used

- Java
- Java 8+
- Stream API
- Lambda Expressions
- Method References
- Collections Framework
- Eclipse / IntelliJ IDEA

---

# Conclusion

The Java Stream API is one of the most powerful features introduced in Java 8. It enables developers to process collections using a functional programming approach with concise and readable code. By combining Streams with Lambda Expressions, Method References, and Functional Interfaces, developers can build efficient, maintainable, and scalable applications. Mastering the Stream API is essential for modern Java development and technical interviews.
