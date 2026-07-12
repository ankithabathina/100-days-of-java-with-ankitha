# 📘 Day 6 – ArrayList in Java

## 🎯 Objective

Learn how ArrayList works internally, its features, important methods, time complexity, and real-world usage.

---

## 📖 What is ArrayList?

ArrayList is a resizable array implementation of the List interface in Java. It stores elements dynamically and automatically increases its capacity when needed.

---

## ❓ Why Use ArrayList?

- Dynamic size
- Fast random access
- Allows duplicate elements
- Maintains insertion order
- Easy to use

---

## ⚙️ Internal Working

1. Default capacity is **10**.
2. Elements are stored in an internal array.
3. When the array becomes full, ArrayList creates a larger array.
4. New Capacity = Old Capacity + (Old Capacity / 2).
5. Existing elements are copied into the new array.
6. New elements continue to be added.

---

## ⭐ Features

- Dynamic resizing
- Ordered collection
- Allows duplicate elements
- Allows null values
- Fast access using index

---

## 🔑 Important Methods

- add()
- get()
- set()
- remove()
- contains()
- size()
- clear()
- isEmpty()

---

## ⏱️ Time Complexity

| Operation | Complexity |
|-----------|------------|
| add() | O(1) |
| get() | O(1) |
| set() | O(1) |
| remove() | O(n) |
| contains() | O(n) |

---

## 💻 Java Program

📄 ArrayListDemo.java

---

## 🎯 Learning Outcome

Today, I learned how ArrayList stores data, grows dynamically, and performs common operations efficiently.
