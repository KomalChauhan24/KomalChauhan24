# Use a base Java image
FROM eclipse-temurin:17-jdk as builder

# Create app directory
WORKDIR /app

# Argument for JAR file
ARG JAR_FILE=target/*.jar

# Copy the built Spring Boot jar
COPY ${JAR_FILE} app.jar

# Run the application
ENTRYPOINT ["java","-jar","/app/app.jar"]
