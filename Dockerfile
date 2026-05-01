# Step 1: Build stage
FROM maven:3.9.9-eclipse-temurin-21 AS builder

WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Step 2: Run stage
FROM eclipse-temurin:21-jdk

WORKDIR /app
COPY --from=builder /app/target/lms-portal-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]