# 📘 Day 15 - Generics in Java

## 🎯 Objective

Learn Generics in Java, understand why they were introduced, how they provide type safety, and how Generic Classes, Generic Methods, Generic Interfaces, Wildcards, and Bounded Types make Java programs reusable and flexible.

---

# 📖 What are Generics?

Generics are a feature introduced in **Java 5** that allows classes, interfaces, and methods to work with different data types while maintaining **compile-time type safety**.

Instead of writing separate code for different data types, Generics allow us to write reusable code that works with multiple object types.

---

# ❓ Why were Generics introduced?

Before Java 5, Java collections stored objects as `Object`.

Developers had to manually type cast the objects after retrieving them.

This could lead to runtime errors such as **ClassCastException**.

### Without Generics

```java
ArrayList list = new ArrayList();

list.add("Java");
list.add(100);

String language = (String) list.get(0);
```

Problems

- ❌ No Type Safety
- ❌ Manual Type Casting
- ❌ Runtime Errors
- ❌ Difficult to Maintain

---

### With Generics

```java
ArrayList<String> list = new ArrayList<>();

list.add("Java");

// list.add(100); // Compile-time Error

String language = list.get(0);
```

Benefits

- ✅ Type Safety
- ✅ No Type Casting
- ✅ Compile-Time Error Checking
- ✅ Better Readability

---

# 🔹 Generic Type Parameters

Generics use type parameters inside angle brackets (`<>`).

| Symbol | Meaning |
|---------|----------|
| T | Type |
| E | Element |
| K | Key |
| V | Value |
| N | Number |

Example

```java
HashMap<Integer, String>
```

Here,

- `Integer` → Key
- `String` → Value

---

# 🔹 Generic Class

A Generic Class can work with different data types.

### Syntax

```java
class Box<T>{

}
```

### Example

```java
class Box<T>{

    T value;

    void set(T value){
        this.value = value;
    }

    T get(){
        return value;
    }

}
```

Usage

```java
Box<String> box = new Box<>();

box.set("Java");

System.out.println(box.get());
```

---

# 🔹 Generic Method

A Generic Method can accept different data types.

### Syntax

```java
public static <T> void print(T value)
```

### Example

```java
public static <T> void print(T value){

    System.out.println(value);

}
```

Usage

```java
print(100);

print("Java");

print(10.5);
```

---

# 🔹 Generic Interface

Interfaces can also use Generics.

```java
interface Printer<T>{

    void print(T value);

}
```

Implementation

```java
class StringPrinter implements Printer<String>{

    public void print(String value){

        System.out.println(value);

    }

}
```

---

# 🔹 Diamond Operator (<>)

Introduced in **Java 7**.

Instead of writing

```java
ArrayList<String> list = new ArrayList<String>();
```

We write

```java
ArrayList<String> list = new ArrayList<>();
```

The compiler automatically infers the type.

---

# 🔹 Bounded Generics

Sometimes we want to restrict the type parameter.

```java
class Calculator<T extends Number>{

}
```

Allowed

- Integer
- Double
- Float
- Long

Not Allowed

- String
- Character

---

# 🔹 Wildcards

Wildcards provide flexibility while working with Generics.

### Unbounded Wildcard

```java
List<?>
```

Accepts any type.

---

### Upper Bounded Wildcard

```java
List<? extends Number>
```

Accepts `Number` and its subclasses.

---

### Lower Bounded Wildcard

```java
List<? super Integer>
```

Accepts `Integer` and its superclasses.

---

# 🔹 Type Erasure

Java removes Generic type information during compilation.

Example

```java
ArrayList<String>
```

becomes

```java
ArrayList
```

at runtime.

This process is called **Type Erasure**.

---

# 🔹 Wrapper Classes and Generics

Generics work only with **objects**, not primitive data types.

❌ Incorrect

```java
ArrayList<int> list = new ArrayList<>();
```

✅ Correct

```java
ArrayList<Integer> list = new ArrayList<>();
```

Wrapper classes convert primitive types into objects.

| Primitive | Wrapper Class |
|------------|---------------|
| int | Integer |
| double | Double |
| char | Character |
| boolean | Boolean |
| long | Long |
| float | Float |

---

# 🌍 Real-Time Uses of Generics

Generics are widely used in Java applications.

### Collections

```java
ArrayList<String> names = new ArrayList<>();
```

### HashMap

```java
HashMap<Integer, String> students = new HashMap<>();
```

### Queue

```java
Queue<Integer> queue = new LinkedList<>();
```

### Stack

```java
Stack<String> stack = new Stack<>();
```

### Custom Generic Class

```java
Box<Employee> employeeBox = new Box<>();
```

---

# ✅ Advantages

- Type Safety
- Code Reusability
- Compile-Time Error Checking
- No Explicit Type Casting
- Better Readability
- Easier Maintenance

---

# ❌ Limitations

- Cannot use primitive data types directly
- Cannot create objects using `new T()`
- Static members cannot use type parameters
- Generic type information is removed at runtime (Type Erasure)

---

# 💻 Program Included

✔ Generic Class

✔ Generic Method

✔ Generic Interface

✔ Wrapper Class Example

✔ Diamond Operator

✔ Bounded Generics

✔ Wildcards

---

# 🎯 Learning Outcome

Today I learned:

- What Generics are
- Why Generics were introduced
- Generic Classes
- Generic Methods
- Generic Interfaces
- Type Parameters
- Diamond Operator
- Bounded Generics
- Wildcards
- Type Erasure
- Wrapper Classes with Generics
- Real-world applications of Generics

These concepts help write reusable, type-safe, and maintainable Java applications and are frequently asked in Java developer interviews.
