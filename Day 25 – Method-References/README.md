# Day 25 – Method References

## 📌 Objective

The objective of this project is to understand **Method References** in Java, learn their syntax and different types, and use them to write cleaner and more readable code. This project also demonstrates how Method References simplify Lambda Expressions and are widely used in modern Java applications.

---

# 📖 Introduction

Method References were introduced in **Java 8** as a feature that allows developers to refer to methods by name instead of writing Lambda Expressions.

A Method Reference is simply a shorthand notation for a Lambda Expression that directly calls an existing method.

Instead of writing:

```java
name -> System.out.println(name)
```

we can write:

```java
System.out::println
```

Method References improve readability and reduce unnecessary code.

---

# What is a Method Reference?

A Method Reference is a reference to an existing method using the **::** operator.

It is used when a Lambda Expression simply calls an existing method without adding extra logic.

### Syntax

```java
ClassName::methodName
```

or

```java
objectReference::methodName
```

or

```java
ClassName::new
```

---

# Why Method References?

Method References are used to:

- Reduce boilerplate code.
- Improve readability.
- Replace simple Lambda Expressions.
- Make code cleaner and easier to understand.
- Work efficiently with Functional Interfaces.
- Simplify Stream API operations.

---

# Types of Method References

Java supports four types of Method References.

## 1. Static Method Reference

References a static method of a class.

### Example

```java
MathOperations::square
```

---

## 2. Instance Method Reference

References a method of a particular object.

### Example

```java
printer::display
```

---

## 3. Instance Method of an Arbitrary Object

References an instance method of any object of a particular type.

### Example

```java
String::toUpperCase
```

---

## 4. Constructor Reference

References a constructor instead of a method.

### Example

```java
Student::new
```

---

# Method Reference vs Lambda Expression

| Lambda Expression | Method Reference |
|-------------------|------------------|
| Uses `->` operator | Uses `::` operator |
| More code | Less code |
| Suitable for custom logic | Suitable for existing methods |
| Can contain multiple statements | Refers to a single existing method |
| Slightly less readable | More readable |

---

# Program Workflow

```
Functional Interface
        │
        ▼
Lambda Expression
        │
        ▼
Method Reference
        │
        ▼
Invoke Existing Method
        │
        ▼
Display Output
```

---

# Static Method Reference Example

```java
class MathOperations {

    static int square(int number) {

        return number * number;

    }

}
```

Usage

```java
Function<Integer,Integer> square =
MathOperations::square;

System.out.println(square.apply(5));
```

Output

```
25
```

---

# Instance Method Reference Example

```java
class Printer {

    void display(String message){

        System.out.println(message);

    }

}
```

Usage

```java
Printer printer = new Printer();

Consumer<String> print =
printer::display;

print.accept("Hello Java");
```

Output

```
Hello Java
```

---

# Constructor Reference Example

```java
class Student{

    Student(){

        System.out.println("Student Object Created");

    }

}
```

Usage

```java
Supplier<Student> student =
Student::new;

student.get();
```

Output

```
Student Object Created
```

---

# Advantages

- Improves code readability.
- Reduces unnecessary Lambda Expressions.
- Produces cleaner code.
- Easy to maintain.
- Encourages code reuse.
- Works well with Functional Interfaces.
- Frequently used in Stream API.
- Simplifies Collection operations.

---

# Disadvantages

- Cannot replace every Lambda Expression.
- Works only when an existing method matches the Functional Interface.
- Beginners may find the syntax confusing.
- Less flexible than Lambda Expressions when custom logic is required.

---

# Real-Time Applications

### Collections Framework

- Sorting
- Iteration

### Stream API

- map()
- filter()
- forEach()

### Comparator

- Sorting objects

### Spring Boot

- Functional programming

### Event Handling

- Callback methods

---

# Best Practices

- Prefer Method References over simple Lambda Expressions.
- Use meaningful method names.
- Avoid using Method References if they reduce readability.
- Use Constructor References when object creation is simple.
- Combine Method References with Functional Interfaces and Stream API.

---

# Interview Questions

## Basic

1. What is a Method Reference?
2. Why were Method References introduced?
3. What operator is used in Method References?

## Intermediate

4. Explain the syntax of Method References.
5. What are the four types of Method References?
6. Difference between Lambda Expressions and Method References?
7. What is a Constructor Reference?

## Advanced

8. Can every Lambda Expression be replaced by a Method Reference?
9. How are Method References used with Functional Interfaces?
10. How are Method References used in Stream API?
11. Explain Method References with Comparator.
12. Where are Method References used in Spring Boot?

---

# Learning Outcomes

After completing this project, you will be able to:

- Understand Method References in Java.
- Differentiate Method References from Lambda Expressions.
- Use all four types of Method References.
- Create Constructor References.
- Improve code readability.
- Apply Method References with Functional Interfaces and Stream API.
- Answer Java 8 interview questions confidently.

---

# Technologies Used

- Java
- Java 8+
- Functional Interfaces
- Lambda Expressions
- Method References
- Stream API
- Eclipse / IntelliJ IDEA

---

# Conclusion

Method References are one of the most useful features introduced in Java 8. They provide a concise and readable way to invoke existing methods without writing unnecessary Lambda Expressions. Method References work seamlessly with Functional Interfaces and are widely used in the Collections Framework, Stream API, Spring Boot, and enterprise Java applications. Mastering Method References helps developers write cleaner, more maintainable, and professional Java code.
