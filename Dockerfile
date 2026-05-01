# Use Java 21
FROM eclipse-temurin:21-jdk

# Set working directory
WORKDIR /app

# Copy jar file
COPY target/lms-portal-0.0.1-SNAPSHOT.jar app.jar

# Run application
ENTRYPOINT ["java", "-jar", "app.jar"]