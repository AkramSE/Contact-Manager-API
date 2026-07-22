# 📇 Contact Manager REST API

![Java](https://img.shields.io/badge/Java-17-orange.svg?style=for-the-badge&logo=java)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen.svg?style=for-the-badge&logo=springboot)
![Hibernate](https://img.shields.io/badge/Hibernate-ORM-blue.svg?style=for-the-badge&logo=hibernate)
![MySQL](https://img.shields.io/badge/MySQL-Database-4479A1.svg?style=for-the-badge&logo=mysql&logoColor=white)

A robust, enterprise-grade backend API developed in **Java** and **Spring Boot**. This project demonstrates industry-standard backend architecture, focusing on clean code, secure data transfer, strict validation protocols, and structured error handling. It serves as the powerful backend engine for the Contact Manager React Application.

---

## 🚀 Key Features

* **Complete CRUD Engine:** Fully functional and optimized endpoints to Create, Read, Update, and Delete user contacts.
* **Data Transfer Objects (DTOs):** Implemented the DTO design pattern to isolate database entities from API responses, ensuring data security and preventing infinite JSON recursion.
* **Strict Input Validation:** Integrated `jakarta.validation` (`@Valid`, `@NotBlank`) to enforce data integrity at the controller level, automatically rejecting malformed requests.
* **Global Exception Handling:** Utilized `@RestControllerAdvice` to intercept system errors and stack traces, translating them into clean, standardized, and user-friendly JSON responses.
* **Relational Database Mapping:** Configured a seamless `One-to-Many` relationship between `User` and `Contact` entities using Spring Data JPA.

---

## 🛠️ Technical Stack

* **Language:** Java (JDK 17+)
* **Framework:** Spring Boot 3.x
* **Persistence:** Spring Data JPA / Hibernate
* **Database:** MySQL *(or configured database)*
* **Architecture:** N-Tier Architecture (Controller > Service > Repository > Entity/DTO)

---

## 📂 Architecture & Directory Structure
```text
src/main/java/com/tenpearls/contact_manager/
 ├── controller/       # Handles incoming HTTP requests and responses
 ├── service/          # Contains core business logic
 ├── repository/       # Interfaces for database interactions (Spring Data JPA)
 ├── entity/           # Database models and mappings
 ├── dto/              # Data Transfer Objects for secure communication
 └── exception/        # Global exception handlers and custom error classes