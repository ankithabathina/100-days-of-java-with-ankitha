
# 📘 Day 3 – JVM (Java Virtual Machine) Architecture

## 🎯 Objective

Learn how the Java Virtual Machine (JVM) executes Java programs and understand its internal architecture.

---

## 📖 What is JVM?

JVM (Java Virtual Machine) is a part of the Java Runtime Environment (JRE). It converts Java bytecode into machine code, allowing Java programs to run on any operating system.

---

## 🌟 Why Do We Need JVM?

- Provides Platform Independence
- Executes Java Bytecode
- Performs Automatic Memory Management
- Supports Garbage Collection
- Improves Performance using JIT Compiler
- Provides Security

---

## 🏗️ JVM Architecture

The main components of JVM are:

- Class Loader Subsystem
- Runtime Data Areas
- Execution Engine
- Java Native Interface (JNI)
- Native Method Libraries

---

## 📦 Runtime Data Areas

### Heap Memory
- Stores objects and instance variables.
- Shared among all threads.

### Stack Memory
- Stores local variables and method calls.
- Each thread has its own stack.

### Method Area
- Stores class metadata, static variables, and method information.

### Program Counter (PC) Register
- Stores the address of the currently executing instruction.

### Native Method Stack
- Stores native methods written in languages like C or C++.

---

## ⚙️ Execution Flow

1. Write Java Program (.java)
2. Compile using **javac**
3. Generate Bytecode (.class)
4. Class Loader loads the class
5. Bytecode Verifier checks the code
6. Execution Engine executes the bytecode
7. JIT Compiler converts frequently used bytecode into native machine code
8. Output is displayed

---

## 🚀 Key Components

### Class Loader
Loads the compiled `.class` file into memory.

### Execution Engine
Executes the bytecode using the Interpreter and JIT Compiler.

### JIT Compiler
Converts frequently used bytecode into machine code to improve performance.

### Garbage Collector
Automatically removes unused objects from Heap Memory.

---

## 💻 Java Program

The Java implementation is available in:

📄 **JVMDemo.java**

---

## ✅ Learning Outcome

Today, I learned:

- JVM Architecture
- Class Loader Subsystem
- Runtime Data Areas
- Execution Engine
- JIT Compiler
- Garbage Collection
- Complete execution flow of a Java program
