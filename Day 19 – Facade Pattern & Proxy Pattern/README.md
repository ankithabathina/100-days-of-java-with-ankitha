# 📘 Day 19 – Facade Pattern & Proxy Pattern

> **"Structural Design Patterns simplify complex systems and control access to objects, making software more maintainable, secure, and scalable."**

---

# 🎯 Objective

The objective of this lesson is to understand two important **Structural Design Patterns** in Java:

- Facade Pattern
- Proxy Pattern

These patterns simplify interactions with complex systems and provide controlled access to objects.

---

# 📖 Introduction to Structural Design Patterns

Structural Design Patterns focus on organizing classes and objects to create flexible, reusable, and maintainable software.

These patterns reduce complexity and improve communication between different parts of an application.

---

# Why Structural Design Patterns?

They help to:

- Reduce coupling
- Simplify complex systems
- Improve maintainability
- Increase code reusability
- Enhance flexibility
- Improve readability

---

# Types of Structural Design Patterns

- Adapter
- Bridge
- Composite
- Decorator
- Facade
- Flyweight
- Proxy

---

# 🏢 Facade Pattern

## Definition

The **Facade Pattern** is a Structural Design Pattern that provides a simple interface to a complex subsystem.

Instead of interacting with multiple classes, the client communicates with a single Facade class.

---

## Why Facade Pattern?

Imagine starting your computer.

You simply press the **Power Button**.

Internally, many operations happen:

- CPU starts
- RAM initializes
- Hard Disk loads OS
- Drivers load

You don't perform these steps manually.

The **Power Button acts as a Facade**.

---

# Components

## Client

Uses the Facade.

---

## Facade

Provides a simplified interface.

---

## Subsystem Classes

Perform the actual work.

---

# Workflow

```
Client

↓

Facade

↓

Subsystem Classes
```

---

# Real-Life Examples

- ATM Machine
- TV Remote
- Computer Startup
- Hotel Booking System
- Banking Applications

---

# Advantages

- Simplifies complex systems
- Reduces coupling
- Improves readability
- Easier maintenance
- Hides implementation details

---

# Disadvantages

- Facade can become too large
- May hide advanced subsystem functionality

---

# Real-Time Applications

- Spring Framework
- JDBC
- Hotel Booking Systems
- Banking Software
- E-Commerce Applications

---

# 🔒 Proxy Pattern

## Definition

The **Proxy Pattern** provides a placeholder or representative object that controls access to another object.

The Proxy decides whether the client can access the real object.

---

## Why Proxy Pattern?

Suppose you enter a company.

You first meet the **Security Guard**.

Only after verification are you allowed inside.

The Security Guard acts as a **Proxy**.

---

# Components

## Subject

Common interface.

---

## Real Subject

Original object.

---

## Proxy

Controls access.

---

## Client

Uses the Proxy.

---

# Workflow

```
Client

↓

Proxy

↓

Real Object
```

---

# Real-Life Examples

- ATM Card
- Security Guard
- Credit Card
- Proxy Server
- Authentication System

---

# Advantages

- Controls access
- Improves security
- Supports lazy loading
- Adds logging
- Adds caching

---

# Disadvantages

- Extra abstraction layer
- Slight performance overhead

---

# Real-Time Applications

- Spring AOP
- Hibernate Lazy Loading
- Java RMI
- Security Systems
- Proxy Servers

---

# Facade Pattern vs Proxy Pattern

| Facade Pattern | Proxy Pattern |
|----------------|---------------|
| Simplifies a complex system | Controls access to an object |
| Focuses on ease of use | Focuses on security and control |
| Hides subsystem complexity | Restricts or manages object access |
| Used to simplify APIs | Used for protection and optimization |

---

# Best Practices

- Use Facade to simplify complex subsystems.
- Use Proxy to control access to sensitive objects.
- Prefer composition over inheritance.
- Keep Facade and Proxy focused on a single responsibility.

---

# Frequently Asked Interview Questions

### 1. What is the Facade Pattern?

Provides a simple interface to a complex subsystem.

---

### 2. What is the Proxy Pattern?

Controls access to another object.

---

### 3. Difference between Facade and Proxy?

Facade simplifies complexity.

Proxy controls access.

---

### 4. Real-time example of Facade?

Computer Startup and ATM Machine.

---

### 5. Real-time example of Proxy?

Security Guard and ATM Card.

---

### 6. Where is Proxy Pattern used?

Spring AOP and Hibernate.

---

### 7. Where is Facade Pattern used?

Spring Framework and JDBC.

---

### 8. Advantages of Facade?

Simplifies complex systems.

---

### 9. Advantages of Proxy?

Provides security and access control.

---

### 10. Why use Structural Design Patterns?

To build maintainable, reusable, and scalable applications.

---

# Java Programs

## Program 1

**FacadePatternDemo.java**

Demonstrates simplifying communication with multiple subsystem classes.

---

## Program 2

**ProxyPatternDemo.java**

Demonstrates controlling access to an object.

---

# Learning Outcome

After completing Day 19, you will be able to:

- Understand the Facade Pattern.
- Implement the Proxy Pattern.
- Compare Facade and Proxy.
- Identify real-world use cases.
- Answer Java interview questions confidently.

---

# Conclusion

The **Facade Pattern** simplifies interactions with complex systems by providing a unified interface, while the **Proxy Pattern** controls access to objects by acting as an intermediary.

Both patterns are widely used in enterprise Java applications and are commonly asked in Java interviews.

---

# ⭐ Day 19 Completed Successfully!

## Topics Covered

- ✅ Structural Design Patterns
- ✅ Facade Pattern
- ✅ Proxy Pattern
- ✅ Components
- ✅ Workflow
- ✅ Real-Time Applications
- ✅ Advantages
- ✅ Disadvantages
- ✅ Comparison
- ✅ Best Practices
- ✅ Interview Questions
