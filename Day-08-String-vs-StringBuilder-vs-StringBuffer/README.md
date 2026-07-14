# 📘 Day 8 – String vs StringBuilder vs StringBuffer

## 🎯 Objective

Learn the differences between String, StringBuilder, and StringBuffer, their internal working, mutability, thread safety, and performance.

---

## 📖 What is String?

String is an immutable class in Java. Once a String object is created, its value cannot be changed.

Example:

```java
String str = "Java";
str = str + " Developer";
```

A new object is created instead of modifying the existing one.

---

## 📖 What is StringBuilder?

StringBuilder is a mutable class used for modifying strings efficiently.

It is **not thread-safe**, making it faster than StringBuffer.

---

## 📖 What is StringBuffer?

StringBuffer is also mutable but **thread-safe** because its methods are synchronized.

It is slightly slower than StringBuilder.

---

## ⚙️ Internal Working

### String

```
String Pool
   │
"Java"
   │
New Object Created
```

### StringBuilder

```
Same Object
   │
Append Data
   │
Modify Existing Object
```

### StringBuffer

```
Same Object
   │
Synchronized Methods
   │
Thread Safe
```

---

## 📊 Comparison

| Feature | String | StringBuilder | StringBuffer |
|----------|---------|---------------|--------------|
| Mutable | ❌ No | ✅ Yes | ✅ Yes |
| Thread Safe | ✅ Yes | ❌ No | ✅ Yes |
| Performance | Slow | Fastest | Moderate |
| Memory | High | Low | Medium |

---

## ⭐ Advantages

### String
- Immutable
- Secure
- Thread-safe

### StringBuilder
- Fast
- Efficient
- Best for single-threaded applications

### StringBuffer
- Thread-safe
- Suitable for multi-threaded applications

---

## 💻 Java Program

📄 StringComparisonDemo.java

---

## 🎯 Learning Outcome

Today, I learned the differences between String, StringBuilder, and StringBuffer, along with their performance, mutability, and thread safety.
