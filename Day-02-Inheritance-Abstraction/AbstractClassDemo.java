# Abstraction in Java

## What is Abstraction?

Abstraction is one of the core concepts of Object-Oriented Programming (OOP). It is the process of hiding implementation details and showing only the essential functionality to the user.

### Definition

**Abstraction is the process of hiding implementation details and exposing only the required functionality to the user.**

## Why Do We Need Abstraction?

* To hide complex implementation details.
* To improve security by exposing only the required functionality.
* To make code easier to understand and maintain.
* To reduce code complexity.
* To improve flexibility and scalability.

## Real-Life Example

### Car

When you drive a car, you use the steering wheel, brake, accelerator, and gears. You don't need to know how the engine works internally.

This is called **abstraction**—you use the functionality without knowing the implementation.

## How is Abstraction Achieved in Java?

Java provides two ways to achieve abstraction:

1. **Abstract Class**
2. **Interface**

## Types of Abstraction

### 1. Full Abstraction

* Hides all implementation details.
* Only method declarations are provided.
* Traditionally achieved using an interface.

### 2. Partial Abstraction

* Some methods have implementation, while others are abstract.
* Achieved using an abstract class.

## Advantages of Abstraction

* Hides implementation details.
* Reduces code complexity.
* Improves security.
* Makes code easier to maintain.
* Increases flexibility and reusability.

## Disadvantages of Abstraction

* Can make the design more complex.
* Requires additional classes and interfaces.
* Beginners may find it difficult to understand initially.

## Example

```java id="ih1fzk"
abstract class Animal {
    abstract void sound();

    void sleep() {
        System.out.println("Sleeping");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class AbstractionDemo {
    public static void main(String[] args) {
        Animal obj = new Dog();
        obj.sound();
        obj.sleep();
    }
}
```

### Output

```text id="8q7zt4"
Dog barks
Sleeping
```

## Summary

* Abstraction hides implementation details and exposes only the required functionality.
* It helps reduce complexity and improve maintainability.
* Java achieves abstraction using **Abstract Classes** and **Interfaces**.
* **Full abstraction** is traditionally achieved using interfaces.
* **Partial abstraction** is achieved using abstract classes.
