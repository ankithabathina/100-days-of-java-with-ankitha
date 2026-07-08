# Interface in Java

## What is an Interface?

An **interface** is a blueprint of a class that contains method declarations. It is used to achieve abstraction and multiple inheritance in Java. A class implements an interface and provides the implementation for its methods.

### Definition

**An interface is a blueprint of a class that contains method declarations and is used to achieve abstraction and multiple inheritance.**

## Why Do We Need an Interface?

* To achieve abstraction.
* To define a common contract for multiple classes.
* To support multiple inheritance.
* To promote loose coupling between classes.
* To improve code flexibility and maintainability.

## Syntax

```java
interface Animal {
    void sound();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Bark");
    }
}
```

## Features of an Interface

* Cannot create objects.
* Methods are `public` and `abstract` by default.
* Variables are `public static final` by default.
* A class implements an interface using the `implements` keyword.
* Supports multiple inheritance.
* Can contain `default` and `static` methods (Java 8+).
* Can contain `private` methods (Java 9+).

## Types of Methods in an Interface

### 1. Abstract Method

A method without implementation. The implementing class must provide the method body.

```java
interface Animal {
    void sound();
}
```

### 2. Default Method (Java 8+)

A method with implementation inside the interface.

```java
interface Animal {
    default void sleep() {
        System.out.println("Sleeping");
    }
}
```

### 3. Static Method (Java 8+)

Belongs to the interface and is called using the interface name.

```java
interface Animal {
    static void display() {
        System.out.println("Animal Interface");
    }
}
```

### 4. Private Method (Java 9+)

Used only inside the interface to support other methods.

```java
interface Animal {
    private void helper() {
        System.out.println("Helper Method");
    }
}
```

## Variables in an Interface

All variables in an interface are automatically:

```java
public static final
```

Example:

```java
interface Test {
    int MAX = 100;
}
```

`MAX` is a constant and cannot be modified.

## Advantages of Interface

* Achieves abstraction.
* Supports multiple inheritance.
* Promotes loose coupling.
* Improves code reusability.
* Makes applications easier to maintain and extend.

## Disadvantages of Interface

* Cannot create objects.
* Cannot have constructors.
* Every abstract method must be implemented by the implementing class.
* Interfaces cannot store object state using instance variables.

## Example

```java
interface Animal {
    void sound();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Animal obj = new Dog();
        obj.sound();
    }
}
```

### Output

```text
Dog barks
```

## Summary

* An interface is a blueprint of a class.
* It is used to achieve abstraction and multiple inheritance.
* Methods are `public abstract` by default.
* Variables are `public static final` by default.
* A class uses the `implements` keyword to implement an interface.
* Interfaces can contain `default`, `static`, and `private` methods in modern Java versions.
