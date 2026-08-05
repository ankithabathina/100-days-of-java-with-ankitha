# Day 30 – Java Networking

## 📌 Objective

The objective of this project is to understand the fundamentals of **Java Networking**, learn how computers communicate over a network, and build a simple client-server application using the `Socket` and `ServerSocket` classes. This project also explains networking concepts commonly used in Java enterprise applications.

---

# 📖 Introduction

**Java Networking** is a collection of APIs that enables communication between computers connected through a network. It allows applications to exchange data over the Internet or a local network using networking protocols such as **TCP** and **UDP**.

Java provides the **java.net** package, which contains classes for creating network applications like chat systems, file transfer applications, email clients, and web servers.

---

# What is Java Networking?

Java Networking is the process of connecting two or more computers to exchange information using Java programs.

It provides built-in classes that make network communication simple and secure.

Some commonly used classes are:

- Socket
- ServerSocket
- URL
- URLConnection
- InetAddress
- DatagramSocket
- DatagramPacket

---

# Why Java Networking?

Java Networking is used to:

- Exchange data between computers.
- Build client-server applications.
- Develop chat applications.
- Create web applications.
- Transfer files over a network.
- Connect distributed systems.

---

# Client-Server Architecture

Java Networking mainly follows the **Client-Server Architecture**.

### Client

A client sends requests to a server.

Examples:

- Web Browser
- Mobile Application
- Desktop Application

### Server

A server receives client requests, processes them, and sends responses.

Examples:

- Web Server
- Database Server
- Application Server

---

# IP Address

An **IP Address (Internet Protocol Address)** uniquely identifies a device connected to a network.

Example:

```
192.168.1.100
```

Types of IP Addresses:

- IPv4
- IPv6

---

# Port Number

A **Port Number** identifies a specific application or service running on a computer.

Example:

```
Server IP : 192.168.1.100

Port : 8080
```

Common Port Numbers:

| Port | Service |
|------:|----------|
| 80 | HTTP |
| 443 | HTTPS |
| 21 | FTP |
| 25 | SMTP |
| 3306 | MySQL |

---

# Socket

A **Socket** is one endpoint of communication between a client and a server.

It establishes a connection and enables data transfer.

### Example

```java
Socket socket = new Socket("localhost",5000);
```

---

# ServerSocket

A **ServerSocket** waits for incoming client requests.

After accepting a connection, it communicates using a Socket object.

### Example

```java
ServerSocket server =
new ServerSocket(5000);

Socket socket =
server.accept();
```

---

# TCP Protocol

**TCP (Transmission Control Protocol)** is a reliable communication protocol.

Features:

- Connection-oriented
- Reliable
- Error checking
- Ordered data delivery
- Data acknowledgement

Used in:

- Banking Systems
- Email
- File Transfer
- Web Applications

---

# UDP Protocol

**UDP (User Datagram Protocol)** is a fast communication protocol.

Features:

- Connectionless
- Faster than TCP
- No guarantee of delivery
- No acknowledgement
- Less overhead

Used in:

- Online Gaming
- Live Video Streaming
- Voice Calls
- Video Conferencing

---

# TCP vs UDP

| TCP | UDP |
|-----|-----|
| Connection-oriented | Connectionless |
| Reliable | Less reliable |
| Slower | Faster |
| Error checking available | No error checking |
| Ordered delivery | Unordered delivery |
| Used for file transfer | Used for live streaming |

---

# Program Workflow

```
Client
   │
   ▼
Socket Connection
   │
   ▼
ServerSocket
   │
   ▼
Server Accepts Request
   │
   ▼
Data Transfer
   │
   ▼
Connection Closed
```

---

# Advantages

- Platform independent.
- Easy to develop network applications.
- Secure communication.
- Supports TCP and UDP.
- Large collection of networking classes.
- Suitable for distributed applications.
- Reliable data transfer using TCP.

---

# Disadvantages

- Network communication may be slower than local execution.
- Requires network connectivity.
- Network failures can interrupt communication.
- Security must be handled carefully.
- Large applications require proper connection management.

---

# Real-Time Applications

- Chat Applications
- WhatsApp
- Telegram
- Online Banking
- File Transfer Systems
- Email Applications
- Web Browsers
- REST APIs
- Spring Boot Microservices
- Online Multiplayer Games

---

# Best Practices

- Always close sockets after use.
- Use try-with-resources whenever possible.
- Handle exceptions properly.
- Validate client input.
- Use appropriate port numbers.
- Prefer TCP when reliability is required.
- Use UDP for real-time applications requiring speed.

---

# Interview Questions

## Basic

1. What is Java Networking?
2. What is the java.net package?
3. What is a Socket?
4. What is a ServerSocket?
5. What is an IP Address?
6. What is a Port Number?

## Intermediate

7. Explain Client-Server Architecture.
8. Difference between TCP and UDP.
9. Explain Socket communication.
10. Explain ServerSocket communication.

## Advanced

11. How does Java establish a network connection?
12. How are sockets used in real-time applications?
13. How is Java Networking used in Spring Boot?
14. How do REST APIs use networking concepts?
15. Explain Socket programming with an example.

---

# Learning Outcomes

After completing this project, you will be able to:

- Understand Java Networking fundamentals.
- Explain Client-Server Architecture.
- Work with Socket and ServerSocket.
- Differentiate between TCP and UDP.
- Understand IP addresses and Port Numbers.
- Build simple client-server applications.
- Answer Java Networking interview questions confidently.

---

# Technologies Used

- Java
- Java Networking API
- java.net Package
- Socket
- ServerSocket
- Eclipse / IntelliJ IDEA

---

# Conclusion

Java Networking provides powerful APIs for building network-based applications that communicate over local networks or the Internet. By using classes such as **Socket** and **ServerSocket**, developers can create client-server applications for messaging, file transfer, web communication, and distributed systems. Understanding Java Networking is essential for developing scalable enterprise applications and strengthens your foundation in backend Java development.
