# 📘 Day 16 - Design Patterns (Singleton & Factory Pattern)

## 🎯 Objective

Learn the fundamentals of Design Patterns in Java, understand why they are used, explore the different types of design patterns, and implement the Singleton and Factory patterns with real-world examples.

---

# 📖 What are Design Patterns?

Design Patterns are reusable solutions to commonly occurring software design problems.

They are **not complete programs**, but proven templates that help developers write clean, maintainable, scalable, and reusable code.

Design Patterns were introduced by the **Gang of Four (GoF)** in their book *Design Patterns: Elements of Reusable Object-Oriented Software*.

---

# ❓ Why Do We Need Design Patterns?

Without design patterns, applications become difficult to maintain as they grow.

Design patterns help us:

- Improve code reusability
- Reduce code duplication
- Make code easier to maintain
- Follow software design best practices
- Build scalable applications

---

# 📂 Types of Design Patterns

There are **23 Design Patterns**, grouped into three categories.

## 1️⃣ Creational Design Patterns

Focus on object creation.

Examples:

- Singleton
- Factory Method
- Abstract Factory
- Builder
- Prototype

---

## 2️⃣ Structural Design Patterns

Focus on class and object relationships.

Examples:

- Adapter
- Decorator
- Facade
- Proxy
- Composite
- Bridge

---

## 3️⃣ Behavioral Design Patterns

Focus on communication between objects.

Examples:

- Strategy
- Observer
- Command
- State
- Iterator
- Template Method

---

# 🔹 Singleton Pattern

## Definition

Singleton ensures that **only one object** of a class is created throughout the application.

It also provides a global access point to that object.

---

## Why Singleton?

Sometimes an application needs only one object.

Creating multiple objects wastes memory and may produce inconsistent results.

---

## Real-Time Examples

- Logger
- Database Connection
- Configuration Manager
- Cache Manager
- Printer Spooler

---

## Advantages

- Only one object exists
- Saves memory
- Global access
- Lazy initialization possible

---

## Disadvantages

- Difficult to unit test
- Breaks Single Responsibility Principle
- Not suitable when multiple instances are required

---

# 🔹 Factory Pattern

## Definition

Factory Pattern creates objects **without exposing object creation logic**.

The client requests an object, and the factory decides which object to create.

---

## Why Factory Pattern?

Instead of using `new` everywhere, object creation is centralized.

This makes code flexible and loosely coupled.

---

## Real-Time Examples

- Payment Gateway
- Notification Service
- Shape Creation
- Vehicle Factory
- Spring Bean Factory

---

## Advantages

- Loose Coupling
- Easy to Extend
- Reusable Code
- Encapsulates Object Creation

---

## Disadvantages

- More Classes
- Slightly More Complex

---

# 🔄 Singleton vs Factory Pattern

| Singleton | Factory |
|------------|----------|
| Creates only one object | Creates multiple objects |
| Focuses on object instance | Focuses on object creation |
| One global object | Returns different objects |
| Example: Logger | Example: Shape Factory |

---

# 🌍 Real-Time Applications

- Spring Framework
- Hibernate
- Database Connections
- Logging Frameworks
- Payment Gateways
- Notification Systems
- Configuration Managers

---

# 💻 Programs Included

- SingletonPatternDemo.java
- FactoryPatternDemo.java

---

# 🎯 Learning Outcome

Today I learned:

- What Design Patterns are
- Why Design Patterns are important
- Types of Design Patterns
- Singleton Pattern
- Factory Pattern
- Advantages and disadvantages
- Real-world applications
- Difference between Singleton and Factory Pattern

These patterns help developers write scalable, reusable, and maintainable Java applications and are widely used in enterprise software development.
