# Stage 1: Build the application
FROM ubuntu:latest AS build

# Update package lists and install OpenJDK 17
RUN apt-get update
RUN apt-get install openjdk-17-jdk -y

# Copy application source code
COPY . .

# Build the application using Gradle
RUN ./gradlew bootJar --no-daemon

# Stage 2: Create the final image
FROM openjdk:17-jdk-slim

# Expose port 8080
EXPOSE 8090

# Copy the built JAR file from the build stage
COPY --from=build /build/libs/demo-1.jar app.jar

# Set the entry point to run the JAR file
ENTRYPOINT ["java", "-jar", "app.jar"]