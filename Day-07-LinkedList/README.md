# 📘 Day 7 – LinkedList in Java

## 🎯 Objective

Learn how LinkedList works internally, its features, important methods, time complexity, and real-world usage.

---

## 📖 What is LinkedList?

LinkedList is a class in the Java Collections Framework that implements the List and Deque interfaces. It stores elements as nodes connected through previous and next references.

---

## ❓ Why Use LinkedList?

- Dynamic size
- Fast insertion and deletion
- Maintains insertion order
- Allows duplicate elements
- Allows null values

---

## ⚙️ Internal Working

1. LinkedList stores elements as nodes.
2. Each node contains:
   - Previous node reference
   - Data
   - Next node reference
3. The first node is called **Head**.
4. The last node is called **Tail**.
5. Nodes are connected using previous and next pointers.
6. Insertion and deletion only require updating node references.

---

## ⭐ Features

- Doubly Linked List
- Dynamic Size
- Ordered Collection
- Allows Duplicates
- Allows Null Values
- Efficient Insertions and Deletions

---

## 🔑 Important Methods

- add()
- addFirst()
- addLast()
- get()
- getFirst()
- getLast()
- remove()
- removeFirst()
- removeLast()
- contains()

---

## ⏱️ Time Complexity

| Operation | Complexity |
|-----------|------------|
| add() | O(1) |
| addFirst() | O(1) |
| addLast() | O(1) |
| get(index) | O(n) |
| remove() | O(1) |
| contains() | O(n) |

---

## 💻 Java Program

📄 LinkedListDemo.java

---

## 🎯 Learning Outcome

Today, I learned how LinkedList stores data using nodes, how insertion and deletion work efficiently, and when LinkedList is preferred over ArrayList.
