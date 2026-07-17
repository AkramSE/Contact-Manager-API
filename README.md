# 📇 Contact Manager REST API

![Java](https://img.shields.io/badge/Java-17-orange.svg)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen.svg)
![Hibernate](https://img.shields.io/badge/Hibernate-ORM-blue.svg)

A robust, enterprise-grade backend API developed in **Java** and **Spring Boot**. This project demonstrates industry-standard backend architecture, focusing on clean code, secure data transfer, strict validation protocols, and structured error handling.

## 🚀 Key Features

* **Complete CRUD Engine:** Fully functional and optimized endpoints to Create, Read, Update, and Delete user contacts.
* **Data Transfer Objects (DTOs):** Implemented the DTO design pattern to isolate database entities from API responses, ensuring data security and preventing infinite JSON recursion.
* **Strict Input Validation:** Integrated `jakarta.validation` (`@Valid`, `@NotBlank`) to enforce data integrity at the controller level, automatically rejecting malformed requests.
* **Global Exception Handling:** Utilized `@RestControllerAdvice` to intercept system errors and stack traces, translating them into clean, standardized, and user-friendly JSON responses.
* **Relational Database Mapping:** Configured a seamless `One-to-Many` relationship between `User` and `Contact` entities using Spring Data JPA.

## 🛠️ Technical Stack

* **Language:** Java (JDK 17+)
* **Framework:** Spring Boot 3.x
* **Persistence:** Spring Data JPA / Hibernate
* **Database:** H2 In-Memory Database
* **Architecture:** N-Tier Architecture (Controller > Service > Repository > Entity/DTO)

## ⚙️ Getting Started (How to Run)

### Prerequisites
* Java 17 or higher installed
* IDE (IntelliJ IDEA, Eclipse, or VS Code)

### Installation Steps
1. **Clone the repository:**
   ```bash
   git clone [https://github.com/AkramSE/Contact-Manager-API.git](https://github.com/AkramSE/Contact-Manager-API.git)