
# ðŸ“‡ Contact Manager â€“ Enterprise REST API

> Enterprise-grade Contact Manager backend built with **Java 17**, **Spring Boot 3**, **Spring Security**, **JWT**, **Spring Data JPA**, and **MySQL**.

## âœ¨ Features

- ðŸ” JWT Authentication & Authorization
- ðŸ‘¤ User Registration & Login
- ðŸ“‡ Contact CRUD Operations
- ðŸ“„ Pagination & Search
- âœ… DTO Architecture
- âœ… Bean Validation
- ðŸ›¡ Global Exception Handling
- ðŸ”‘ BCrypt Password Encryption
- ðŸ“œ SLF4J + Logback Logging
- ðŸ§ª JUnit 5 & Mockito Testing
- ðŸ—„ Spring Data JPA + Hibernate

## ðŸ›  Tech Stack

| Technology | Version |
|---|---|
| Java | 17 |
| Spring Boot | 3.x |
| Spring Security | Latest |
| JWT | io.jsonwebtoken |
| Spring Data JPA | Hibernate |
| Database | MySQL / SQL Server |
| Testing | JUnit 5, Mockito |

## ðŸ“ Project Structure

```text
src/main/java/com/tenpearls/contact_manager/
â”œâ”€â”€ config/
â”œâ”€â”€ controller/
â”œâ”€â”€ dto/
â”œâ”€â”€ entity/
â”œâ”€â”€ exception/
â”œâ”€â”€ repository/
â”œâ”€â”€ security/
â””â”€â”€ service/
```

## ðŸš€ Getting Started

```bash
git clone https://github.com/AkramSE/Contact-Manager-API.git
cd Contact-Manager-API
```

Configure:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/contact_manager_db
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
```

Run:

```bash
./mvnw clean install
./mvnw spring-boot:run
```

## ðŸ” Security

- JWT based authentication
- Stateless sessions
- BCrypt password hashing
- Protected REST endpoints

## ðŸ“Œ Backend Architecture

Controller â†’ Service â†’ Repository â†’ Database

DTOs isolate API payloads from entities.

## ðŸ§ª Testing

- Unit testing with JUnit 5
- Mockito for service isolation

## ðŸŒ Frontend

https://github.com/AkramSE/Contact-Manager-UI

## ðŸ‘¨â€ðŸ’» Author

**Muhammad Akram**

LinkedIn: https://linkedin.com/in/muhammad-akram-se

GitHub: https://github.com/AkramSE

---
Made with â¤ï¸ using Java & Spring Boot.
