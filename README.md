# 📇 Contact Manager - Enterprise REST API

![Java](https://img.shields.io/badge/Java-17-orange.svg?style=for-the-badge&logo=java)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-brightgreen.svg?style=for-the-badge&logo=springboot)
![Security](https://img.shields.io/badge/Spring_Security-JWT-blue.svg?style=for-the-badge&logo=springsecurity)
![Database](https://img.shields.io/badge/Database-MySQL_%7C_SQL_Server-lightgrey.svg?style=for-the-badge&logo=mysql)
![Testing](https://img.shields.io/badge/Testing-JUnit_5_%7C_Mockito-red.svg?style=for-the-badge)

> A robust, enterprise-grade backend API engineered with **Java** and **Spring Boot**. This project demonstrates industry-standard software architecture, emphasizing clean code principles, stateless authentication, strict validation protocols, and comprehensive error handling. It serves as the high-performance backend engine for the [Contact Manager React Application](https://github.com/AkramSE/Contact-Manager-UI.git).

---

## 🚀 Key Features & Capabilities

*   **🔒 Stateless JWT Security:** Fully secured API endpoints utilizing Spring Security and JSON Web Tokens (JWT). Features encrypted password hashing (BCrypt) and secure user session management.
*   **⚙️ Optimized CRUD Operations:** High-performance endpoints for Creating, Reading, Updating, and Deleting contacts, enhanced with server-side pagination and dynamic search filtering for large datasets.
*   **🛡️ DTO Design Pattern:** Strict implementation of Data Transfer Objects (DTOs) to decouple database entities from the presentation layer, preventing over-posting vulnerabilities and infinite JSON recursion.
*   **✅ Robust Data Validation:** Integrated `jakarta.validation` (`@Valid`, `@NotBlank`, `@Email`, etc.) to enforce data integrity and sanitize inputs at the controller level before reaching the business logic.
*   **🛑 Global Exception Handling:** Centralized `@RestControllerAdvice` to intercept system anomalies (e.g., `ResourceNotFoundException`, `MethodArgumentNotValidException`) and translate them into standardized, predictable JSON error responses.
*   **📜 Comprehensive Audit Logging:** Implemented **SLF4J** and **Logback** for strategic application logging, enabling effective tracking of system events, user actions, and error tracing.
*   **🧪 Test-Driven Development (TDD):** Business logic thoroughly verified using **JUnit 5** and **Mockito**, ensuring reliable operations and isolating the service layer from database dependencies.

---

## 🛠️ Technical Stack

| Category | Technology |
| :--- | :--- |
| **Core Language** | Java (JDK 17+) |
| **Framework** | Spring Boot 3.x |
| **Security & Auth** | Spring Security, JWT (`io.jsonwebtoken`) |
| **ORM & Persistence** | Spring Data JPA / Hibernate |
| **Database** | MySQL / SQL Server |
| **Testing Suite** | JUnit 5, Mockito |
| **Logging** | SLF4J, Logback |

---

## ⚙️ Quick Start & Installation

**1. Clone the repository**
```bash
git clone [https://github.com/AkramSE/Contact-Manager-API.git](https://github.com/AkramSE/Contact-Manager-API.git)
cd Contact-Manager-API
