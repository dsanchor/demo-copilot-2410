# Use OpenJDK as the base image
FROM openjdk:17-jdk-alpine

# Set the working directory to /app
WORKDIR /app

COPY  target/demo2410-0.0.1-SNAPSHOT.jar /app

EXPOSE 8080

# Set the startup command to run the JAR file
CMD ["java", "-jar", "demo2410-0.0.1-SNAPSHOT.jar"]