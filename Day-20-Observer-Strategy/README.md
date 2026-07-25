# 📘 Day 20 - Observer Pattern & Strategy Pattern

## 🎯 Objective

Learn two important **Behavioral Design Patterns**:

- Observer Pattern
- Strategy Pattern

These patterns define how objects communicate and interact with each other while keeping the system flexible, reusable, and maintainable.

---

# 📖 Behavioral Design Patterns

Behavioral Design Patterns focus on the communication between objects.

Instead of concentrating on object creation or structure, they define how objects collaborate to perform tasks efficiently.

### Why Behavioral Design Patterns?

- Improve communication between objects
- Reduce coupling
- Increase flexibility
- Follow SOLID principles
- Make code reusable and maintainable

---

# 👀 Observer Pattern

## Definition

The **Observer Pattern** is a Behavioral Design Pattern where one object (called the **Subject**) automatically notifies multiple dependent objects (called **Observers**) whenever its state changes.

Instead of checking repeatedly for updates, observers receive notifications automatically.

---

## Why Observer Pattern?

Imagine subscribing to a YouTube channel.

Whenever a new video is uploaded, all subscribers receive a notification automatically.

You don't need to check YouTube every minute.

This is exactly how the Observer Pattern works.

---

## Components

### Subject

Maintains a list of observers and sends notifications.

### Observer

Receives updates from the subject.

### Concrete Subject

Stores data and notifies observers when changes occur.

### Concrete Observer

Implements the update behavior.

---

## Workflow

```
Subject
     │
     ├─────────────► Observer 1
     │
     ├─────────────► Observer 2
     │
     └─────────────► Observer 3
```

Whenever the Subject changes, every Observer receives the update.

---

## Advantages

- Loose coupling
- Easy to add new observers
- Automatic notification
- Better scalability
- Supports event-driven programming

---

## Disadvantages

- Notification overhead
- Difficult debugging
- Performance issues with many observers

---

## Real-Time Applications

- YouTube Notifications
- WhatsApp Groups
- Stock Market Updates
- Weather Applications
- Email Notifications
- News Apps
- Social Media Feeds

---

## Java Program Explanation

Our Java program demonstrates a **YouTube Channel Notification System**.

- The YouTube Channel acts as the Subject.
- Subscribers act as Observers.
- Whenever a new video is uploaded, every subscriber automatically receives a notification.

---

# 🎯 Strategy Pattern

## Definition

The **Strategy Pattern** is a Behavioral Design Pattern that allows selecting an algorithm or behavior at runtime.

Instead of hardcoding one implementation, multiple strategies can be swapped without changing the client code.

---

## Why Strategy Pattern?

Imagine paying on an e-commerce website.

Sometimes you pay using:

- Credit Card
- UPI
- PayPal
- Net Banking

The payment process changes, but the checkout system remains the same.

Each payment method is a different strategy.

---

## Components

### Strategy

Defines the common interface.

### Concrete Strategy

Implements different algorithms.

### Context

Uses the selected strategy.

### Client

Chooses which strategy to use.

---

## Workflow

```
Client
    │
    ▼
Context
    │
    ▼
Selected Strategy
    │
    ▼
Execute Algorithm
```

---

## Advantages

- Easy to switch algorithms
- Follows Open/Closed Principle
- Reduces if-else statements
- Promotes code reuse
- Easy maintenance

---

## Disadvantages

- More classes
- Client must know available strategies
- Slight increase in complexity

---

## Real-Time Applications

- Google Maps Route Selection
- Payment Gateway
- Compression Algorithms
- Sorting Algorithms
- Authentication Methods
- Travel Booking

---

## Java Program Explanation

Our Java program demonstrates a **Payment System**.

- Payment is the Strategy interface.
- CreditCardPayment, UpiPayment, and PayPalPayment are Concrete Strategies.
- PaymentContext selects the payment strategy.
- The client changes payment methods at runtime.

---

# ⚖️ Observer Pattern vs Strategy Pattern

| Observer Pattern | Strategy Pattern |
|------------------|------------------|
| One-to-many relationship | One-to-one relationship |
| Sends notifications | Changes behavior |
| Event-driven | Algorithm-driven |
| Subject manages observers | Context manages strategies |
| Used for updates | Used for selecting algorithms |

---

# ✅ Best Practices

- Use Observer when multiple objects must react to state changes.
- Use Strategy when behavior changes dynamically.
- Keep observers lightweight.
- Avoid unnecessary notifications.
- Keep strategies independent.
- Follow the Single Responsibility Principle.

---

# 💼 Frequently Asked Interview Questions

1. What is the Observer Pattern?
2. Explain the Subject and Observer.
3. Where is Observer Pattern used?
4. What is Strategy Pattern?
5. Why do we use Strategy Pattern?
6. Difference between Observer and Strategy?
7. Explain Observer with a real-time example.
8. Explain Strategy with a payment example.
9. Which SOLID principles are followed?
10. Where are these patterns used in Spring Framework?

---

# 🎯 Learning Outcome

After completing Day 20, you will be able to:

- Understand the Observer Pattern
- Implement Observer Pattern in Java
- Understand Strategy Pattern
- Implement Strategy Pattern in Java
- Compare Observer and Strategy Patterns
- Apply Behavioral Design Patterns in real-world applications
- Answer Java interview questions confidently

---

# 📌 Conclusion

The **Observer Pattern** enables automatic communication between objects through notifications, making it ideal for event-driven systems.

The **Strategy Pattern** allows algorithms or behaviors to be selected dynamically, making applications more flexible and easier to extend.

Both patterns are widely used in enterprise Java applications, Spring Framework, GUI applications, and modern software architectures.
