# 📘 Day 17 – Builder Pattern & Prototype Pattern

## 🎯 Objective

Learn two important **Creational Design Patterns** in Java: **Builder Pattern** and **Prototype Pattern**. These patterns help create objects efficiently, improve code readability, and reduce complexity in large applications.

---

# 🌟 What are Creational Design Patterns?

Creational Design Patterns deal with **object creation mechanisms**. They provide flexible and reusable ways to create objects while hiding the object creation logic from the client.

### Why Use Creational Design Patterns?

- Simplify object creation
- Improve code readability
- Reduce code duplication
- Promote loose coupling
- Make applications easier to maintain and extend

---

# 🏗️ Builder Pattern

## Definition

The **Builder Pattern** is a creational design pattern used to construct complex objects step by step. It is especially useful when an object has many optional parameters.

Instead of using multiple constructors, the Builder Pattern allows us to create objects in a readable and organized way.

---

## Why Builder Pattern?

Suppose a `Student` object contains:

- Name
- Age
- Email
- Phone
- Address
- Department
- CGPA

Creating multiple constructors for every combination becomes difficult.

The Builder Pattern solves this problem.

---

## Structure

```
Client
   │
   ▼
Builder
   │
   ▼
Product Object
```

---

## Advantages

- Improves code readability
- Avoids constructor overloading
- Creates immutable objects
- Easy to maintain
- Flexible object creation

---

## Disadvantages

- Requires additional Builder class
- More code compared to simple constructors
- Slightly increases project size

---

## Real-Time Applications

- Lombok `@Builder`
- Spring Boot configuration objects
- HTTP Request Builders
- Database Connection Builders
- StringBuilder class

---

# 🧬 Prototype Pattern

## Definition

The **Prototype Pattern** creates a new object by copying an existing object instead of creating it from scratch.

It is useful when object creation is expensive or time-consuming.

---

## Why Prototype Pattern?

Imagine loading a large object from a database.

Instead of creating it repeatedly,

we simply clone the existing object.

This improves performance.

---

## Cloneable Interface

Java provides the **Cloneable** interface for object cloning.

Example:

```java
class Employee implements Cloneable
```

The object can then be cloned using:

```java
employee.clone();
```

---

# Shallow Copy

A shallow copy copies only the object itself.

If the object contains references to other objects,

both copies share the same referenced objects.

### Advantages

- Faster
- Less memory

### Disadvantages

- Shared references may cause unexpected changes

---

# Deep Copy

A deep copy creates completely independent objects.

All referenced objects are copied as well.

### Advantages

- Independent copies
- Safe for modifications

### Disadvantages

- Slower than shallow copy
- Uses more memory

---

# Builder Pattern vs Prototype Pattern

| Builder Pattern | Prototype Pattern |
|-----------------|-------------------|
| Creates object step by step | Creates object by cloning |
| Best for complex objects | Best for copying existing objects |
| Uses Builder class | Uses Cloneable interface |
| Easy to customize values | Fast object duplication |
| Improves readability | Improves performance |

---

# Applications

### Builder Pattern

- Spring Boot
- Lombok
- Configuration Objects
- SQL Query Builders
- HTTP Request Builders

### Prototype Pattern

- Game Development
- Document Templates
- Graphics Editors
- Employee Records
- Object Caching

---

# Java Programs

## Program 1

**BuilderPatternDemo.java**

Demonstrates creating objects using the Builder Pattern.

---

## Program 2

**PrototypePatternDemo.java**

Demonstrates cloning objects using the Prototype Pattern.

---

# Best Practices

- Use Builder Pattern when objects contain many optional fields.
- Use Prototype Pattern when object creation is expensive.
- Prefer immutable objects with Builder Pattern.
- Override `clone()` carefully.
- Use deep copy when objects contain mutable references.

---

# Advantages

- Clean object creation
- Better code readability
- Easy maintenance
- Flexible design
- Reusable code
- Improved performance using cloning

---

# Disadvantages

- Extra classes required
- Slightly more complex implementation
- Clone method must be handled carefully
- Deep copy can increase memory usage

---

# Frequently Asked Interview Questions

### 1. What is the Builder Pattern?

The Builder Pattern creates complex objects step by step using a separate Builder class.

---

### 2. Why do we use the Builder Pattern?

To avoid constructor overloading and improve code readability.

---

### 3. What is the Prototype Pattern?

The Prototype Pattern creates new objects by cloning existing objects.

---

### 4. What is object cloning?

Object cloning creates a duplicate of an existing object.

---

### 5. What is the Cloneable interface?

It is a marker interface that allows Java objects to be cloned.

---

### 6. What is the difference between shallow copy and deep copy?

Shallow copy shares referenced objects, while deep copy creates completely independent copies.

---

### 7. Where is the Builder Pattern used?

- Lombok
- Spring Boot
- StringBuilder
- HTTP Request Builders

---

### 8. Where is the Prototype Pattern used?

- Game engines
- Document editors
- Object caching
- Graphics software

---

### 9. Builder Pattern vs Prototype Pattern?

Builder constructs new objects step by step, whereas Prototype creates objects by cloning existing ones.

---

### 10. Which pattern improves readability?

The Builder Pattern improves readability by allowing object creation in a clear and structured manner.

---

# Learning Outcome

After completing Day 17, you will be able to:

- Understand Creational Design Patterns
- Implement the Builder Pattern
- Implement the Prototype Pattern
- Differentiate between shallow copy and deep copy
- Use the Cloneable interface
- Identify real-world applications of both patterns
- Answer Builder and Prototype Pattern interview questions confidently

---

# Conclusion

The **Builder Pattern** simplifies the creation of complex objects, while the **Prototype Pattern** improves performance by cloning existing objects. Both patterns are widely used in Java enterprise applications and are frequently asked in technical interviews.

---

## ⭐ Day 17 Completed Successfully!

**Topics Covered:**

- ✔ Creational Design Patterns
- ✔ Builder Pattern
- ✔ Prototype Pattern
- ✔ Cloneable Interface
- ✔ Shallow Copy
- ✔ Deep Copy
- ✔ Real-Time Applications
- ✔ Interview Questions
