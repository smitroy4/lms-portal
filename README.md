🏫 LMS Portal Backend

A scalable Learning Management System (LMS) backend built using Spring Boot, MySQL, and Spring Data JPA. This project provides RESTful APIs to manage students, instructors, courses, and enrollments, following clean architecture and real-world backend development practices.

⚙️ Tech Stack

Backend: Spring Boot

Database: MySQL

ORM: Spring Data JPA (Hibernate)

Validation: Jakarta Validation

Build Tool: Maven

Java Version: 21

📌 Features

✅ Student Management (CRUD)

✅ Instructor Management (CRUD)

✅ Course Management (CRUD)

✅ Enrollment System (Student ↔ Course mapping)

✅ RESTful API design

✅ Layered Architecture (Controller → Service → Repository)

✅ Input Validation using @Valid

✅ Clean and modular code structure

🧱 Project Structure
lms-portal
│
├── controller
├── service
├── service.impl
├── repository
├── entity
└── config (if applicable)

🔗 API Endpoints
👨‍🎓 Student APIs
Method	Endpoint	Description
GET	/student/	Get all students
GET	/student/{id}	Get student by ID
POST	/student/create	Create student
PUT	/student/update/{id}	Update student
DELETE	/student/delete/{id}	Delete student
👨‍🏫 Instructor APIs
Method	Endpoint	Description
GET	/instructor/	Get all instructors
GET	/instructor/{id}	Get instructor by ID
POST	/instructor/create	Create instructor
PUT	/instructor/update/{id}	Update instructor
DELETE	/instructor/delete/{id}	Delete instructor
📚 Course APIs
Method	Endpoint	Description
GET	/course/	Get all courses
GET	/course/{id}	Get course by ID
POST	/course/create	Create course
PUT	/course/update/{id}	Update course
DELETE	/course/delete/{id}	Delete course
🔄 Enrollment APIs
Method	Endpoint	Description
GET	/enrollment/	Get all enrollments
POST	/enrollment/create?studentId=&courseId=	Enroll student in course
GET	/enrollment/courses/{courseId}	Get courses by student (naming improvement needed)
GET	/enrollment/student/{studentId}	Get students by course (naming improvement needed)
🗄️ Database Configuration (MySQL)

Update your application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/[YOUR_DB_NAME]
spring.datasource.username=[YOUR_USERNAME]
spring.datasource.password=[YOUR_PASSWORD]

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect

▶️ How to Run

Clone the repository

git clone [[REPO_LINK]](https://github.com/smitroy4/lms-portal)


Navigate to project

cd lms-portal


Run the application

Maven:
./mvnw spring-boot:run

Gradle:
./gradlew bootRun

🧪 Sample Request
Create Student
POST /student/create

{
  "name": "John Doe",
  "email": "john@example.com"
}

📈 Future Improvements

🔐 Add Spring Security + JWT Authentication

📄 Introduce DTO Layer (best practice)

🔄 Add Pagination & Sorting

⚠️ Global Exception Handling (@ControllerAdvice)

📊 Logging (SLF4J)

🧪 Unit Testing (JUnit + Mockito)

📦 Docker support

🌐 Deployment (AWS / Render)

👨‍💻 Author

Smit
[[LinkedIn]](https://www.linkedin.com/in/smitroy22/)
[[GitHub]](https://github.com/smitroy4)
