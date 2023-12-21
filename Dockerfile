# Use an official OpenJDK runtime as a parent image
FROM adoptopenjdk:11-jre-hotspot

# Set the working directory to /app
WORKDIR /app

# Copy the packaged JAR file into the container at /app
COPY target/bugwars-0.0.1-SNAPSHOT.jar /app/

# Expose the port that your Spring Boot application will run on
EXPOSE 8080

# Define any environment variables (if needed)
# ENV VARIABLE_NAME=value

# Command to run your application
CMD ["java", "-jar", "bugwars-0.0.1-SNAPSHOT.jar"]
