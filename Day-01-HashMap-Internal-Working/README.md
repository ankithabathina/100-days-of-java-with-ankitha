# Day 01 - How HashMap Works Internally in Java

## What is HashMap?
HashMap stores data as key-value pairs and uses hashing for fast retrieval.

## Internal Working
1. Calculate the hash code of the key.
2. Find the bucket index.
3. Store the key-value pair.
4. Handle collisions using Linked List or Red-Black Tree.

## Example
```java
HashMap<Integer, String> map = new HashMap<>();
map.put(1, "Java");
map.put(2, "Spring Boot");
map.put(3, "React");
