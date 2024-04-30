FROM eclipse-temurin:17-jdk-alpine

# Set the working directory inside the container
WORKDIR /usr/src/app

# Copy the WAR file from your local machine to the container
COPY target/*.war app.war

# Expose the port on which your application will run
EXPOSE 8080

# Define the command to run your application when the container starts
CMD ["java", "-jar", "app.war"]
