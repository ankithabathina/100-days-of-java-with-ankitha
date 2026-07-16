# 📘 Day 10 – Java Memory Management

## 🎯 Objective

Learn how Java manages memory, understand Heap, Stack, Method Area, Program Counter Register, Native Method Stack, and Garbage Collection.

---

## 📖 What is Java Memory Management?

Java Memory Management is the process by which the JVM allocates and deallocates memory for objects during program execution.

It helps prevent memory leaks and automatically removes unused objects using the Garbage Collector.

---

## ❓ Why is Memory Management Important?

- Efficient memory utilization
- Automatic memory allocation
- Automatic garbage collection
- Prevents memory leaks
- Improves application performance

---

## 🏗 JVM Memory Areas

### 1. Heap Memory

- Stores Objects
- Stores Instance Variables
- Shared among Threads
- Managed by Garbage Collector

---

### 2. Stack Memory

- Stores Local Variables
- Stores Method Calls
- One Stack per Thread

---

### 3. Method Area

Stores:

- Class Metadata
- Static Variables
- Runtime Constant Pool

---

### 4. Program Counter Register

Stores the address of the currently executing instruction.

---

### 5. Native Method Stack

Used for executing native methods written in C/C++.

---

## ⚙️ Internal Working

Program Starts

↓

Class Loaded

↓

Memory Allocated

↓

Objects Created in Heap

↓

Method Calls Stored in Stack

↓

Objects Become Unused

↓

Garbage Collector Removes Unused Objects

↓

Memory Reused

---

## 🗑 Garbage Collection

Garbage Collection automatically removes unreachable objects from Heap Memory.

Common Garbage Collectors:

- Serial GC
- Parallel GC
- G1 GC
- ZGC

---

## ⭐ Advantages

- Automatic memory management
- Better performance
- Prevents memory leaks
- Efficient memory utilization

---

## 💻 Java Program

📄 MemoryManagementDemo.java

---

## 🎯 Learning Outcome

Today, I learned JVM memory areas, Heap vs Stack, Method Area, Program Counter Register, Native Method Stack, and Garbage Collection.
