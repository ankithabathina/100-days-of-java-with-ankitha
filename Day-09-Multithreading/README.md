# 📘 Day 9 – Multithreading in Java

## 🎯 Objective

Learn the fundamentals of Multithreading, thread lifecycle, thread creation, synchronization, and thread methods in Java.

---

## 📖 What is Multithreading?

Multithreading is a Java feature that allows multiple threads to execute concurrently within a single program, improving performance and CPU utilization.

---

## ❓ Why Use Multithreading?

- Improves application performance
- Executes multiple tasks simultaneously
- Better CPU utilization
- Responsive applications
- Efficient resource sharing

---

## 📚 Process vs Thread

| Process | Thread |
|----------|---------|
| Independent program | Smallest unit of execution |
| Own memory | Shares process memory |
| Heavyweight | Lightweight |

---

## ⚙️ Thread Lifecycle

New → Runnable → Running → Waiting/Blocked → Terminated

---

## 🔑 Ways to Create a Thread

### 1. Extending Thread Class

```java
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running");
    }
}
```

### 2. Implementing Runnable Interface

```java
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Runnable is running");
    }
}
```

---

## ⭐ Important Thread Methods

- start()
- run()
- sleep()
- join()
- yield()
- interrupt()

---

## ⭐ Advantages

- Faster execution
- Better responsiveness
- Efficient CPU utilization
- Supports concurrent programming

---

## 💻 Java Program

📄 MultithreadingDemo.java

---

## 🎯 Learning Outcome

Today, I learned how Java creates and manages threads, the thread lifecycle, and different ways to implement multithreading.
