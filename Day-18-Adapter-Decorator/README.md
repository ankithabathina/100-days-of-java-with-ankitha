# 📘 Day 18 – Adapter Pattern & Decorator Pattern

> **"Structural Design Patterns help classes and objects work together efficiently by organizing relationships and adding functionality without modifying existing code."**

---

# 🎯 Objective

The objective of this lesson is to understand two important **Structural Design Patterns** in Java:

- Adapter Pattern
- Decorator Pattern

These patterns help developers integrate incompatible systems, improve code flexibility, and add new features without changing existing code.

---

# 📖 Introduction to Structural Design Patterns

Structural Design Patterns explain **how classes and objects are combined** to create larger and more flexible structures.

These patterns focus on improving the relationships between classes while keeping applications maintainable and reusable.

---

# Why Structural Design Patterns?

Structural Design Patterns are used to:

- Improve flexibility
- Promote code reuse
- Reduce coupling
- Simplify integration
- Extend functionality
- Improve maintainability

---

# Types of Structural Design Patterns

Some commonly used Structural Design Patterns are:

- Adapter
- Bridge
- Composite
- Decorator
- Facade
- Flyweight
- Proxy

---

# 🔌 Adapter Pattern

## Definition

The Adapter Pattern is a Structural Design Pattern that allows two incompatible interfaces to work together.

It acts as a bridge between an existing class and a client that expects a different interface.

---

## Why Adapter Pattern?

Suppose your laptop has only USB-C ports but your pendrive uses USB-A.

Instead of replacing the pendrive,

you use an Adapter.

Similarly,

Java uses Adapter Pattern to connect incompatible classes.

---

# Components

## Target

The interface expected by the client.

---

## Adaptee

The existing class having incompatible functionality.

---

## Adapter

Converts the Adaptee interface into the Target interface.

---

## Client

Uses the Target interface.

---

# Adapter Workflow

```
Client

↓

Target Interface

↓

Adapter

↓

Adaptee
```

---

# Real-Life Examples

- Mobile Charger Adapter
- USB to HDMI Adapter
- Memory Card Reader
- Language Translator
- Travel Plug Adapter

---

# Advantages

- Reuses existing classes
- Improves compatibility
- Promotes loose coupling
- Easy integration
- Reduces duplicate code

---

# Disadvantages

- Additional Adapter class required
- Slight increase in complexity

---

# Real-Time Applications

- JDBC Driver
- Spring MVC Handler Adapter
- Payment Gateway Integration
- Legacy System Integration
- Third-party API Integration

---

# 🎨 Decorator Pattern

## Definition

Decorator Pattern dynamically adds new functionality to an existing object without changing its source code.

Instead of modifying the original class,

it wraps the object inside another object.

---

## Why Decorator Pattern?

Imagine ordering a Pizza.

Base Pizza

↓

Cheese Pizza

Now you can add

- Extra Cheese
- Mushroom
- Corn
- Olives

Each topping decorates the existing Pizza instead of creating a new Pizza class.

---

# Components

## Component

Common interface.

---

## Concrete Component

Original object.

---

## Decorator

Wraps the Component.

---

## Concrete Decorator

Adds additional functionality.

---

# Decorator Workflow

```
Client

↓

Decorator

↓

Original Object
```

---

# Real-Life Examples

- Coffee with Milk
- Pizza Toppings
- Mobile Cover Accessories
- Gift Wrapping
- Ice Cream Toppings

---

# Advantages

- Adds functionality dynamically
- Follows Open/Closed Principle
- Flexible design
- Better than inheritance
- Easy maintenance

---

# Disadvantages

- Creates many small classes
- Can make debugging difficult

---

# Real-Time Applications

- Java I/O Streams
- Spring Security
- Logging Frameworks
- Notification Systems
- GUI Components

---

# Adapter Pattern vs Decorator Pattern

| Adapter Pattern | Decorator Pattern |
|-----------------|-------------------|
| Changes interface | Adds functionality |
| Solves compatibility issues | Enhances object behavior |
| Used during integration | Used during feature enhancement |
| Converts one interface into another | Wraps an existing object |
| Focuses on compatibility | Focuses on flexibility |

---

# Best Practices

- Use Adapter when interfaces are incompatible.
- Use Decorator when functionality should be added dynamically.
- Prefer composition over inheritance.
- Keep decorators focused on one responsibility.

---

# Frequently Asked Interview Questions

### 1. What is Adapter Pattern?

Allows incompatible interfaces to work together.

---

### 2. What is Decorator Pattern?

Adds responsibilities dynamically to objects.

---

### 3. Difference between Adapter and Decorator?

Adapter changes interfaces.

Decorator adds behavior.

---

### 4. Real-time example of Adapter?

JDBC Driver.

---

### 5. Real-time example of Decorator?

BufferedInputStream.

---

### 6. Why Decorator instead of inheritance?

Because it provides greater flexibility.

---

### 7. Where is Adapter Pattern used?

Spring MVC, Payment Gateways, API Integration.

---

### 8. Where is Decorator Pattern used?

Java I/O Streams, Spring Security, Logging.

---

### 9. Advantages of Adapter Pattern?

Compatibility and code reuse.

---

### 10. Advantages of Decorator Pattern?

Flexible feature addition without modifying existing code.

---

# Java Programs

## Program 1

**AdapterPatternDemo.java**

Demonstrates communication between incompatible interfaces.

---

## Program 2

**DecoratorPatternDemo.java**

Demonstrates adding functionality dynamically.

---

# Learning Outcome

After completing Day 18, you will be able to:

- Explain Structural Design Patterns.
- Implement Adapter Pattern.
- Implement Decorator Pattern.
- Compare Adapter and Decorator.
- Understand real-world applications.
- Answer Java interview questions confidently.

---

# Conclusion

The Adapter Pattern helps incompatible systems communicate, while the Decorator Pattern enhances object functionality without modifying existing code.

Both patterns are widely used in enterprise Java applications and are frequently asked in Java interviews.

---

# ⭐ Day 18 Completed Successfully!

## Topics Covered

- ✅ Structural Design Patterns
- ✅ Adapter Pattern
- ✅ Decorator Pattern
- ✅ Components
- ✅ Workflow
- ✅ Real-Time Applications
- ✅ Advantages
- ✅ Disadvantages
- ✅ Comparison
- ✅ Best Practices
- ✅ Interview Questions
