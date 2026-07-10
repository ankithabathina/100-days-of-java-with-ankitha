# 📘 Day 4 – Exception Handling in Java

## 🎯 Objective

Learn how Java handles runtime errors using Exception Handling.

---

## 📖 What is Exception Handling?

Exception Handling is a mechanism in Java that handles runtime errors gracefully without terminating the program unexpectedly.

---

## ❓ Why Do We Need Exception Handling?

- Prevents abnormal program termination.
- Improves program reliability.
- Makes debugging easier.
- Separates normal code from error-handling code.

---

## 📚 Types of Exceptions

### ✅ Checked Exceptions
- Checked at compile time.
- Must be handled or declared using `throws`.
- Examples:
  - IOException
  - SQLException

### ✅ Unchecked Exceptions
- Occur at runtime.
- Handling is optional.
- Examples:
  - ArithmeticException
  - NullPointerException
  - ArrayIndexOutOfBoundsException

---

## 🔑 Exception Handling Keywords

- `try` – Contains code that may cause an exception.
- `catch` – Handles the exception.
- `finally` – Executes whether an exception occurs or not.
- `throw` – Explicitly throws an exception.
- `throws` – Declares exceptions that a method may throw.

---

## ⚙️ Internal Process

1. JVM executes the code inside the `try` block.
2. If an exception occurs, JVM creates an Exception Object.
3. JVM searches for the appropriate `catch` block.
4. The matching `catch` block handles the exception.
5. The `finally` block executes (if present).
6. The program continues execution.

---

## 💻 Java Program

📄 **ExceptionHandlingDemo.java**

---

## 🎯 Learning Outcome

Today, I learned:
- What Exception Handling is.
- Checked vs Unchecked Exceptions.
- How `try`, `catch`, `finally`, `throw`, and `throws` work.
- How JVM handles exceptions internally.
- How Exception Handling improves application reliability.
