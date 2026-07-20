# 📘 Day 14 – Stream API in Java

## 🎯 Objective

Learn the Java Stream API, introduced in Java 8, to process collections using functional programming. Understand stream operations, pipelines, intermediate operations, terminal operations, and solve common interview problems.

---

## 📖 What is Stream API?

The Stream API is part of the `java.util.stream` package.

It allows processing collections of data in a functional and declarative way without modifying the original collection.

A stream is **not a data structure**; it is a sequence of elements that supports operations like filtering, mapping, sorting, and reducing.

---

## ⭐ Stream Pipeline

Collection

↓

Stream

↓

Intermediate Operations

↓

Terminal Operation

↓

Result

---

## 🔹 Intermediate Operations

These operations return another Stream.

- filter()
- map()
- flatMap()
- sorted()
- distinct()
- limit()
- skip()
- peek()

---

## 🔹 Terminal Operations

These produce the final result.

- forEach()
- collect()
- count()
- reduce()
- min()
- max()
- findFirst()
- findAny()
- anyMatch()
- allMatch()
- noneMatch()

---

## ✅ Advantages

- Less Code
- Functional Programming
- Better Readability
- Parallel Processing
- Improved Performance
- Easy Collection Processing

---

## ❌ Disadvantages

- Can be harder to debug
- Not suitable for every use case
- Streams cannot be reused after a terminal operation

---

## 🌍 Applications

- Data Filtering
- Data Transformation
- Sorting
- Searching
- Aggregation
- Report Generation

---

## 💻 Java Program

See `StreamAPIDemo.java`

---

## 🎯 Learning Outcome

Today I learned Stream API, stream pipelines, intermediate operations, terminal operations, and practical collection processing using Java 8.
