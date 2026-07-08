# Inheritance in Java

## What is Inheritance?

Inheritance is one of the core concepts of Object-Oriented Programming (OOP). It allows one class to acquire the properties (fields) and behaviors (methods) of another class. This helps in reusing existing code and building relationships between classes.

### Definition

**Inheritance is the process by which one class acquires the properties and methods of another class using the `extends` keyword.**

### Syntax

```java
class Parent {
    // Fields and methods
}

class Child extends Parent {
    // Additional fields and methods
}
```

## Why Do We Need Inheritance?

* To reuse existing code.
* To avoid writing duplicate code.
* To improve code maintainability.
* To establish a parent-child relationship between classes.
* To support Runtime Polymorphism through method overriding.

## Types of Inheritance in Java

### 1. Single Inheritance

One child class inherits from one parent class.

### 2. Multilevel Inheritance

A class inherits from another child class, forming multiple levels.

### 3. Hierarchical Inheritance

Multiple child classes inherit from the same parent class.

### 4. Multiple Inheritance

A class inherits from more than one parent class.

**Note:** Java does **not** support multiple inheritance with classes because it can lead to ambiguity. However, it supports multiple inheritance through interfaces.

### 5. Hybrid Inheritance

A combination of two or more types of inheritance.

**Note:** Hybrid inheritance is not supported using classes but can be achieved using interfaces.

## Advantages of Inheritance

* Promotes code reusability.
* Reduces code duplication.
* Improves code maintainability.
* Supports method overriding.
* Creates an "is-a" relationship between classes.

## Disadvantages of Inheritance

* Creates tight coupling between parent and child classes.
* Changes in the parent class may affect child classes.
* Deep inheritance hierarchies increase complexity.
* Can reduce flexibility if inheritance is overused.

## Example

```java
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.eat();
        dog.bark();
    }
}
```

### Output

```
Animal is eating
Dog is barking
```

## Summary

* Inheritance allows one class to inherit another class's properties and methods.
* It is achieved using the `extends` keyword.
* It improves code reusability and maintainability.
* Java supports Single, Multilevel, and Hierarchical inheritance using classes.
* Multiple and Hybrid inheritance are supported through interfaces, not through classes.
