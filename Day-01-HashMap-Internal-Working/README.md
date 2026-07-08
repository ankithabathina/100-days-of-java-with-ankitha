# 📘 Day 1 – How HashMap Works Internally in Java

## 🎯 Objective

Learn how HashMap stores and retrieves data efficiently using hashing.

---

## 📖 What is HashMap?

HashMap is a class in the Java Collections Framework that stores data in **key-value pairs**. It uses **hashing** to provide fast insertion, deletion, and retrieval of elements.

---

## ⚙️ Internal Working of HashMap

When a key-value pair is inserted:

1. Calculate the **hash code** of the key.
2. Convert the hash code into a **bucket index**.
3. Store the key-value pair in that bucket.
4. If multiple keys map to the same bucket (**collision**), HashMap uses:
   - Linked List (Java 7)
   - Red-Black Tree (Java 8 and above, when collisions become large)

---

## 💻 Example

```java
import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Java");
        map.put(2, "Spring Boot");
        map.put(3, "React");

        System.out.println(map);
    }
}
```

---

## ⏱️ Time Complexity

| Operation | Complexity |
|-----------|------------|
| Insert | O(1) |
| Search | O(1) |
| Delete | O(1) |

Worst Case: **O(n)** (when many collisions occur)

---

## 📌 Key Takeaways

- Stores data as **key-value pairs**.
- Does **not maintain insertion order**.
- Allows **one null key** and multiple null values.
- Uses **hashing** for fast data retrieval.
- Handles collisions using **Linked List** or **Red-Black Tree**.

---

## ✅ Learning Outcome

Today, I learned how HashMap internally stores data, handles collisions, and achieves efficient performance using hashing.

## 💻 Java Implementation

The complete Java program demonstrating HashMap operations is available below:

🔗 **[HashMapDemo.java](HashMapDemo.java)**
