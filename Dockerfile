# Start with a base image containing Java runtime (mine java 8)
FROM openjdk:8u212-jdk-slim
# Add Maintainer Info
LABEL maintainer="nvenkatakiran@gmail.com"
# Add a volume pointing to /tmp
VOLUME /tmp
# Make port 8081 available to the world outside this container
EXPOSE 8081
# The application's jar file (when packaged)
ARG JAR_FILE=target/spring-boot-app-0.0.1-SNAPSHOT.jar
# Add the application's jar to the container
ADD ${JAR_FILE} springbootapp.jar
# Run the jar file 
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/springbootapp.jar"]