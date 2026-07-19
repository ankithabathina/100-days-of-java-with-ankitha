# 📘 Day 12 – Executor Framework in Java

## 🎯 Objective

Learn the Executor Framework in Java, how it manages threads efficiently, and how it simplifies concurrent programming.

---

## 📖 What is Executor Framework?

The Executor Framework is part of the `java.util.concurrent` package.

It provides a high-level API to create, manage, and reuse threads without manually creating Thread objects.

Instead of creating threads yourself, you submit tasks to an Executor Service.

---

## ❓ Why Use Executor Framework?

Creating many threads manually can:

- Consume more memory
- Reduce performance
- Be difficult to manage

Executor Framework solves these problems using thread pools.

---

## ⚙️ Internal Working

Task Submitted

↓

ExecutorService

↓

Thread Pool

↓

Worker Thread Executes Task

↓

Thread Returned to Pool

---

## 🔑 Types of Executors

- Fixed Thread Pool
- Cached Thread Pool
- Single Thread Executor
- Scheduled Thread Pool

---

## ✅ Advantages

- Better Performance
- Thread Reusability
- Easy Task Management
- Improved Scalability
- Reduces Resource Usage

---

## ❌ Disadvantages

- Improper shutdown may cause memory leaks.
- Choosing the wrong pool size affects performance.

---

## 🌍 Applications

- Web Servers
- Banking Systems
- E-commerce Applications
- File Processing
- Background Jobs

---

## 💻 Java Program

See `ExecutorFrameworkDemo.java`

---

## 🎯 Learning Outcome

Today I learned how the Executor Framework manages thread pools, executes tasks efficiently, and improves application performance.
