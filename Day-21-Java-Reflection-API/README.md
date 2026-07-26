# 📘 Day 21 - Java Reflection API

## 🎯 Objective

The objective of this project is to understand the **Java Reflection API**, which allows a program to inspect and manipulate classes, methods, constructors, fields, and objects at runtime. Reflection is a powerful feature of Java used extensively in frameworks such as Spring, Hibernate, JUnit, and Mockito.

---

# 📖 Introduction

The Reflection API is part of the `java.lang.reflect` package. It enables Java programs to examine the structure and behaviour of classes during runtime without knowing their details at compile time.

Reflection is commonly used for:

- Runtime class inspection
- Dependency Injection
- Object Mapping
- Framework Development
- Annotation Processing
- Dynamic Method Invocation

---

# 🔍 What is Reflection API?

The **Reflection API** is a Java feature that enables a program to:

- Retrieve information about classes
- Access constructors
- Access methods
- Access fields
- Create objects dynamically
- Invoke methods at runtime
- Access private members

Instead of hardcoding everything, Reflection allows Java to analyse and manipulate classes dynamically.

---

# ❓ Why Reflection API?

Reflection provides flexibility when the class structure is unknown during compilation.

### It is useful for:

- Dynamic object creation
- Framework development
- Testing frameworks
- Dependency Injection
- Runtime analysis
- Plugin systems

---

# 🏗 Reflection Architecture

```
Application
      │
      ▼
Reflection API
(java.lang.reflect)
      │
      ▼
Class Object
      │
      ├── Constructors
      ├── Methods
      ├── Fields
      └── Objects
```

The **Class** object acts as the entry point for Reflection.

---

# 📦 Important Reflection Classes

| Class | Purpose |
|--------|---------|
| Class | Represents metadata of a class |
| Constructor | Represents constructors |
| Method | Represents methods |
| Field | Represents variables |
| Modifier | Retrieves access modifiers |
| Package | Retrieves package information |

---

# 🏛 Obtaining a Class Object

There are multiple ways to obtain a `Class` object.

### 1. Using `.class`

```java
Class<?> cls = Student.class;
```

### 2. Using `getClass()`

```java
Student s = new Student();
Class<?> cls = s.getClass();
```

### 3. Using `Class.forName()`

```java
Class<?> cls = Class.forName("Student");
```

---

# 🛠 Constructors

Reflection allows us to retrieve constructors available in a class.

Example:

```java
Constructor<?>[] constructors = cls.getDeclaredConstructors();
```

Using Reflection, objects can also be created dynamically.

```java
Object obj = cls.getDeclaredConstructor().newInstance();
```

---

# ⚙ Methods

Reflection can retrieve every method declared inside a class.

Example:

```java
Method[] methods = cls.getDeclaredMethods();
```

Methods can also be executed dynamically.

```java
displayMethod.invoke(object);
```

---

# 🧩 Fields

Reflection retrieves all fields of a class.

Example:

```java
Field[] fields = cls.getDeclaredFields();
```

It can also modify field values during runtime.

---

# 🔒 Accessing Private Members

Normally private methods and variables cannot be accessed outside the class.

Reflection provides:

```java
setAccessible(true);
```

Example:

```java
Method method = cls.getDeclaredMethod("privateMethod");
method.setAccessible(true);
method.invoke(object);
```

---

# 🔄 Reflection Workflow

```
Java Class
     │
     ▼
Class Object
     │
     ├── Get Constructors
     ├── Get Methods
     ├── Get Fields
     ├── Create Object
     └── Invoke Methods
```

---

# ✅ Advantages

- Runtime inspection of classes
- Dynamic object creation
- Dynamic method invocation
- Useful for framework development
- Supports Dependency Injection
- Simplifies testing tools
- Used in ORM frameworks

---

# ❌ Disadvantages

- Slower than normal method calls
- Breaks encapsulation
- Reduces code readability
- Can introduce security risks
- More difficult to debug
- Higher maintenance complexity

---

# 🌍 Real-Time Applications

The Reflection API is widely used in modern Java applications.

### Spring Framework

- Dependency Injection
- Bean creation

### Hibernate

- Entity mapping
- Table generation

### JUnit

- Automatic test discovery

### Mockito

- Dynamic mock object creation

### Jackson & Gson

- JSON serialization and deserialization

### IDEs

- Auto-completion
- Code inspection

### Plugin Systems

- Loading external modules dynamically

---

# 💻 Program Overview

This project demonstrates:

- Retrieving class information
- Listing constructors
- Listing methods
- Listing fields
- Creating an object dynamically
- Invoking public methods
- Invoking private methods

---

# 📊 Reflection vs Normal Java

| Normal Java | Reflection |
|-------------|------------|
| Compile-time | Runtime |
| Faster | Slightly slower |
| Direct method calls | Dynamic method calls |
| Strong encapsulation | Can access private members |
| Less flexible | Highly flexible |

---

# 🎯 Best Practices

- Use Reflection only when necessary.
- Avoid excessive use in performance-critical applications.
- Do not unnecessarily expose private members.
- Handle Reflection exceptions properly.
- Prefer normal method calls whenever possible.

---

# ❓ Interview Questions

### 1. What is Reflection API?

Reflection is a Java feature that allows inspection and manipulation of classes, methods, constructors, and fields at runtime.

---

### 2. Which package contains Reflection API?

```
java.lang.reflect
```

---

### 3. What is the Class class?

The `Class` class stores metadata about a Java class and acts as the starting point for Reflection.

---

### 4. How do you create an object using Reflection?

```java
cls.getDeclaredConstructor().newInstance();
```

---

### 5. How can you invoke a method dynamically?

```java
method.invoke(object);
```

---

### 6. Can Reflection access private methods?

Yes, by using:

```java
setAccessible(true);
```

---

### 7. Name some frameworks that use Reflection.

- Spring Framework
- Hibernate
- JUnit
- Mockito
- Jackson
- Gson

---

### 8. What are the disadvantages of Reflection?

- Performance overhead
- Security concerns
- Breaks encapsulation
- Difficult debugging

---

# 🎯 Learning Outcome

After completing this project, you will be able to:

- Understand the Reflection API
- Obtain Class objects
- Access constructors dynamically
- Access methods dynamically
- Access fields dynamically
- Invoke public and private methods
- Explain how Reflection is used in Java frameworks

---

# 📝 Conclusion

The **Java Reflection API** is a powerful runtime feature that enables programs to inspect and manipulate classes dynamically. It forms the foundation of many enterprise Java frameworks such as Spring, Hibernate, JUnit, and Mockito. Although Reflection provides great flexibility, it should be used carefully because it may affect performance and bypass encapsulation. Understanding Reflection is essential for Java developers preparing for backend development and technical interviews.

---

## ⭐ If you found this project helpful, don't forget to Star the repository!

### 🚀 Happy Coding!
**100 Days of Java with Ankitha**
