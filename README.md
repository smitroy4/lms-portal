# LMS Portal

**A RESTful Learning Management System API** built with Spring Boot — managing students, courses, instructors, and enrollments with clean layered architecture and proper relational mapping.

---

## Table of Contents

- [Overview](#overview)
- [Tech Stack](#tech-stack)
- [Architecture](#architecture)
- [Features](#features)
- [Data Model](#data-model)
- [API Reference](#api-reference)
- [Getting Started](#getting-started)
- [Roadmap](#roadmap)
- [Author](#author)

---

## Overview

LMS Portal provides a backend foundation for a learning platform — handling student registrations, course management, instructor assignments, and enrollment tracking.

Designed to demonstrate real-world Spring Boot patterns: layered architecture, JPA relational mapping, input validation, and clean REST API design.

An interactive walkthrough of the project - [Spring Boot REST API Tutorial | Service & Controller Layer | LMS Portal](https://youtu.be/HtQeggdmJxk?si=JTiHsTrQeHSibSh0)

---

## Tech Stack

| Layer | Technology |
|---|---|
| Language | Java 21 |
| Framework | Spring Boot 3 |
| ORM | Spring Data JPA (Hibernate) |
| Database | MySQL |
| Build Tool | Maven |
| Utilities | Lombok, Jakarta Validation |

---

## Architecture

```
Controller  →  Service  →  Repository  →  Entity
   ↑               ↑             ↑            ↑
HTTP layer   Business logic   JPA/DB     DB models
```

Standard layered architecture — each layer has a single responsibility and communicates only with the layer directly below it.

---

## Features

**Student Management**
- Full CRUD operations
- Email-based lookup
- Input validation via Jakarta annotations

**Course Management**
- Create and manage courses with pricing and descriptions
- Assign courses to instructors

**Instructor Management**
- Full CRUD with expertise field support

**Enrollment System**
- Enroll students into courses with duplicate prevention
- Query courses by student and students by course
- Enrollment date tracking

---

## Data Model

**Entities:** `Student`, `Instructor`, `Course`, `Enrollment`

**Relationships:**
```
Instructor  ──< Course
Student     ──< Enrollment >── Course
```

- One `Instructor` → Many `Courses`
- One `Student` → Many `Enrollments`
- One `Course` → Many `Enrollments`

---

## API Reference

### Students
```
GET    /student/
GET    /student/{id}
POST   /student/create
PUT    /student/update/{id}
DELETE /student/delete/{id}
```

### Courses
```
GET    /course/
GET    /course/{id}
POST   /course/create
PUT    /course/update/{id}
DELETE /course/delete/{id}
```

### Instructors
```
GET    /instructor/
GET    /instructor/{id}
POST   /instructor/create
PUT    /instructor/update/{id}
DELETE /instructor/delete/{id}
```

### Enrollments
```
GET    /enrollment/
POST   /enrollment/create?studentId={id}&courseId={id}
GET    /enrollment/courses/{courseId}      → courses enrolled by a student
GET    /enrollment/student/{studentId}     → students enrolled in a course
```

---

## Getting Started

### Prerequisites
- Java 21
- MySQL running locally
- Maven

### Configuration

Update `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/lms-portal-db
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
```

### Run

```bash
git clone https://github.com/smitroy4/lms-portal.git
cd lms-portal
mvn spring-boot:run
```

API available at `http://localhost:8080/api/`

### Sample Data

A `data.sql` file preloads the database with 20 students, 8 instructors, 15 courses, and 40 enrollments for immediate testing.

---

## Roadmap

- [ ] DTO layer to decouple entity exposure from API responses
- [ ] Global exception handling (`@ControllerAdvice`)
- [ ] Pagination and sorting on list endpoints
- [ ] Spring Security + JWT authentication
- [ ] Swagger / OpenAPI documentation
- [ ] Docker deployment

---

## Author

**Smit Roy**
[github.com/smitroy4](https://github.com/smitroy4)

---

⭐ If this was helpful, feel free to star the repo.
