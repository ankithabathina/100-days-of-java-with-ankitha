# 📘 Day 13 – Java 8 Features

## 🎯 Objective

Learn the major features introduced in Java 8 that make Java programming more concise, functional, and efficient.

---

## 📖 What is Java 8?

Java 8 is one of the most important releases of Java.

It introduced Functional Programming concepts, Stream API, Lambda Expressions, Method References, Optional Class, and the new Date & Time API.

These features reduce boilerplate code and improve application performance.

---

## ⭐ Features of Java 8

- Lambda Expressions
- Functional Interfaces
- Method References
- Default Methods
- Static Methods
- Stream API
- Optional Class
- Date & Time API

---

## 🔹 Lambda Expression

A Lambda Expression is an anonymous function.

Example:

```java
() -> System.out.println("Hello Java 8");
```

Benefits:

- Less code
- Better readability
- Functional programming

---

## 🔹 Functional Interface

A Functional Interface contains exactly one abstract method.

Example:

```java
@FunctionalInterface
interface Greeting{
    void sayHello();
}
```

Examples:

- Runnable
- Callable
- Comparator

---

## 🔹 Method Reference

Method Reference is a shorthand for Lambda Expressions.

Example:

```java
System.out::println
```

---

## 🔹 Default Method

Interfaces can now contain methods with implementation.

Example:

```java
default void display(){
    System.out.println("Default Method");
}
```

---

## 🔹 Static Method

Interfaces can also contain static methods.

Example:

```java
static void info(){
    System.out.println("Static Method");
}
```

---

## ⭐ Advantages

- Cleaner Code
- Functional Programming
- Better Readability
- Improved Performance
- Less Boilerplate Code

---

## 🌍 Applications

- Spring Boot
- Microservices
- Stream Processing
- Enterprise Applications
- Backend Development

---

## 💻 Java Program

See `Java8FeaturesDemo.java`

---

## 🎯 Learning Outcome

Today I learned Java 8 Features including Lambda Expressions, Functional Interfaces, Method References, Default Methods, and Static Methods.
