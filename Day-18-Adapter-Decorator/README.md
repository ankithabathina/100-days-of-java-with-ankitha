# 📘 Day 18 – Adapter Pattern & Decorator Pattern

> **"Structural Design Patterns help classes and objects work together efficiently by organizing relationships between them."**

---

# 🎯 Objective

The objective of this lesson is to understand two important **Structural Design Patterns** in Java: **Adapter Pattern** and **Decorator Pattern**.

These patterns help developers integrate incompatible systems, extend functionality without modifying existing code, and build flexible, maintainable applications.

---

# 📖 Introduction to Structural Design Patterns

Structural Design Patterns focus on **how classes and objects are organized** to form larger and more flexible structures.

These patterns make it easier to build reusable, scalable, and maintainable software.

---

# Types of Structural Design Patterns

Some commonly used Structural Design Patterns are:

- Adapter
- Decorator
- Facade
- Bridge
- Composite
- Proxy
- Flyweight

---

# 🔌 Adapter Pattern

## Definition

The **Adapter Pattern** allows two incompatible interfaces to work together.

It acts as a bridge between an existing class and the client that expects a different interface.

---

## Why Adapter Pattern?

Suppose your application expects USB-C, but your charger has a Micro USB connector.

Instead of changing the charger or the phone, we use an **Adapter**.

Similarly, in Java, an Adapter converts one interface into another so that existing classes can work together.

---

## Real-Life Examples

- Mobile Charger Adapter
- USB to HDMI Adapter
- Power Plug Converter
- Card Reader
- Language Translator

---

## Components

### Target

The interface expected by the client.

### Adaptee

The existing class with incompatible functionality.

### Adapter

Converts the Adaptee interface into the Target interface.

### Client

Uses the Target interface.

---

## Workflow

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

## Advantages

- Reuses existing code
- Improves compatibility
- Promotes loose coupling
- Reduces duplicate code
- Easy integration of third-party libraries

---

## Disadvantages

- Adds extra classes
- Slightly increases complexity

---

## Real-Time Applications

- JDBC Driver
- Spring MVC
- Payment Gateway Integration
- Legacy System Integration
- API Integration

---

# 🎨 Decorator Pattern

## Definition

The **Decorator Pattern** adds new functionality to an object dynamically without modifying its existing code.

It wraps the original object inside another object.

---

## Why Decorator Pattern?

Suppose you order a Pizza.

Base Pizza:

- Cheese Pizza

You can decorate it with:

- Extra Cheese
- Mushroom
- Olives
- Corn

Instead of creating a separate class for every combination, we add toppings dynamically.

---

## Real-Life Examples

- Coffee with Milk & Sugar
- Pizza Toppings
- Mobile Phone Accessories
- Gift Wrapping
- Ice Cream Toppings

---

## Components

### Component

Defines the common interface.

### Concrete Component

Original object.

### Decorator

Wraps the component.

### Concrete Decorator

Adds new functionality.

---

## Workflow

```
Client

↓

Decorator

↓

Original Object
```

---

## Advantages

- Adds functionality dynamically
- Follows Open/Closed Principle
- Flexible design
- Promotes composition over inheritance

---

## Disadvantages

- Creates many small classes
- Can make debugging difficult

---

## Real-Time Applications

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
| Converts one interface into another | Wraps an existing object |
| Used during integration | Used for feature enhancement |

---

# Best Practices

- Use Adapter when interfaces are incompatible.
- Use Decorator when adding responsibilities dynamically.
- Prefer composition over inheritance.
- Keep decorators focused on a single feature.

---

# Frequently Asked Interview Questions

### 1. What is the Adapter Pattern?

It converts one interface into another interface expected by the client.

---

### 2. What is the Decorator Pattern?

It dynamically adds responsibilities to an object without changing its original code.

---

### 3. Difference between Adapter and Decorator?

Adapter changes the interface.

Decorator adds functionality.

---

### 4. Real-time example of Adapter Pattern?

JDBC Drivers and Payment Gateway Integration.

---

### 5. Real-time example of Decorator Pattern?

Java BufferedInputStream and Spring Security.

---

### 6. Why is composition preferred over inheritance?

Because it provides greater flexibility and avoids tight coupling.

---

### 7. Where is Adapter Pattern used?

API Integration, Legacy Systems, Spring Framework.

---

### 8. Where is Decorator Pattern used?

Java I/O Streams, Logging Frameworks, GUI Components.

---

# Java Programs

## Program 1

**AdapterPatternDemo.java**

Demonstrates integrating incompatible interfaces.

---

## Program 2

**DecoratorPatternDemo.java**

Demonstrates dynamically adding functionality to objects.

---

# Learning Outcome

After completing Day 18, you will be able to:

- Understand Structural Design Patterns.
- Implement Adapter Pattern.
- Implement Decorator Pattern.
- Compare Adapter and Decorator.
- Identify real-world applications.
- Answer interview questions confidently.

---

# Conclusion

The **Adapter Pattern** helps incompatible classes work together, while the **Decorator Pattern** enhances object functionality without modifying existing code.

Both patterns are widely used in enterprise Java applications and are frequently asked in Java interviews.

---

## ⭐ Day 18 Completed Successfully!

### Topics Covered

- ✅ Structural Design Patterns
- ✅ Adapter Pattern
- ✅ Decorator Pattern
- ✅ Components
- ✅ Workflow
- ✅ Real-Time Applications
- ✅ Best Practices
- ✅ Interview Questions
