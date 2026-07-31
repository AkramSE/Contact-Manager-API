# 📇 Contact Manager - Enterprise REST API

![Java](https://img.shields.io/badge/Java-17-orange.svg)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-brightgreen.svg)
![Security](https://img.shields.io/badge/Spring_Security-JWT-blue.svg)
![Testing](https://img.shields.io/badge/Testing-JUnit_5_%7C_Mockito-red.svg)
![Database](https://img.shields.io/badge/Database-SQL_Server-lightgrey.svg)

A robust, enterprise-grade backend API developed in **Java** and **Spring Boot**. This project demonstrates industry-standard backend architecture, focusing on clean code, secure data transfer, strict validation protocols, and structured error handling. It serves as the powerful backend engine for the [Contact Manager React Application](https://github.com/AkramSE/Contact-Manager-UI.git).

## 🚀 Key Features

*   **🔒 JWT Authentication & Security:** Fully secured endpoints using Spring Security and JSON Web Tokens (JWT). Includes user registration, login, and encrypted password management.
*   **⚙️ Complete CRUD Engine:** Fully functional and optimized endpoints to Create, Read, Update, and Delete user contacts with pagination and dynamic search filtering.
*   **🛡️ Data Transfer Objects (DTOs):** Implemented the DTO design pattern to isolate database entities from API responses, ensuring data security and preventing infinite JSON recursion.
*   **✅ Strict Input Validation:** Integrated `jakarta.validation` (`@Valid`, `@NotBlank`, `@Email`) to enforce data integrity at the controller level, automatically rejecting malformed requests.
*   **🛑 Global Exception Handling:** Utilized `@RestControllerAdvice` to intercept system errors (e.g., `ResourceNotFoundException`) and translate them into clean, standardized, and user-friendly JSON responses.
*   **📜 Application Logging:** Comprehensive logging implemented using **SLF4J** and **Logback** to track system events, user activities, and trace errors gracefully.
*   **🧪 Unit Testing:** Thoroughly tested service layers using **JUnit 5** and **Mockito**, ensuring reliable business logic without database dependencies.

## 🛠️ Technical Stack

| Category | Technology |
| :--- | :--- |
| **Language** | Java (JDK 17+) |
| **Framework** | Spring Boot 3.x |
| **Security** | Spring Security, JWT (io.jsonwebtoken) |
| **Persistence** | Spring Data JPA / Hibernate |
| **Database** | SQL Server (Configurable for MySQL/PostgreSQL) |
| **Testing** | JUnit 5, Mockito |
| **Logging** | SLF4J, Logback |

## 📁 Architecture & Directory Structure
Built strictly on **N-Tier Architecture** for scalability and separation of concerns:

```text
src/main/java/com/tenpearls/contact_manager/
 ├── config/       # Security & CORS Configurations
 ├── controller/   # REST API Endpoints & Request Handling
 ├── dto/          # Data Transfer Objects for API inputs/outputs
 ├── entity/       # JPA Database Entities (User, Contact, Email, Phone)
 ├── exception/    # Global Exception Handlers & Custom Exceptions
 ├── repository/   # Spring Data JPA Interfaces
 ├── security/     # JWT Filters, Auth Entry Points & Services
 └── service/      # Core Business Logic 

🔗 Links & Let's Connect
🌐 Frontend Client: https://github.com/AkramSE/Contact-Manager-UI.git
💼 LinkedIn: https://linkedin.com/in/muhammad-akram-se
