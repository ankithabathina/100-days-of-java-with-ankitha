# 📘 Day 11 – Synchronization in Java

## 🎯 Objective

Understand Synchronization in Java, why it is required, how it prevents race conditions, and how synchronized methods and blocks ensure thread safety.

---

## 📖 What is Synchronization?

Synchronization is a mechanism that allows only one thread to access a shared resource at a time.

When multiple threads access the same object simultaneously, inconsistent results may occur. Synchronization prevents this by allowing only one thread to execute the critical section while other threads wait.

---

## ❓ Why Synchronization?

Without synchronization:

- Race Condition occurs.
- Shared data becomes inconsistent.
- Threads overwrite each other's work.

With synchronization:

- Only one thread executes the critical section.
- Data remains consistent.
- Thread safety is maintained.

---

## ⚙️ Internal Working

1. A thread requests access to a synchronized method.
2. JVM checks whether the object's lock is available.
3. If the lock is free, the thread acquires it.
4. Other threads wait until the lock is released.
5. After execution, the lock is released.
6. Another waiting thread acquires the lock.

---

## 🔒 Types of Synchronization

### 1. Synchronized Method

Entire method is locked.

```java
public synchronized void increment() {
    count++;
}
```

### 2. Synchronized Block

Locks only a specific block.

```java
synchronized(this){
    count++;
}
```

### 3. Static Synchronization

Locks the Class object instead of an object.

```java
public static synchronized void display(){
}
```

---

## ⚔️ Race Condition

A race condition occurs when multiple threads update the same variable simultaneously, producing incorrect results.

---

## ✅ Advantages

- Thread Safety
- Data Consistency
- Prevents Race Conditions
- Safe Shared Resource Access
- Reliable Concurrent Programming

---

## ❌ Disadvantages

- Performance overhead
- Threads may wait for locks
- Can lead to deadlock if misused

---

## 🌍 Applications

- Banking Systems
- Online Ticket Booking
- Inventory Management
- Payment Processing
- Multiplayer Games
- Hospital Management Systems

---

## 💻 Java Program

See `SynchronizationDemo.java`

---

## 📚 Interview Questions

### Q1. What is Synchronization?

A mechanism that allows only one thread to access a shared resource at a time.

### Q2. What is a Race Condition?

When multiple threads modify shared data simultaneously, leading to inconsistent results.

### Q3. Difference between synchronized method and synchronized block?

Method locks the entire method, while block locks only a specific section.

### Q4. Can constructors be synchronized?

No.

### Q5. Can static methods be synchronized?

Yes.

---

## 🎯 Learning Outcome

Today I learned Synchronization, Object Locks, Race Conditions, Thread Safety, synchronized methods, synchronized blocks, and static synchronization.
