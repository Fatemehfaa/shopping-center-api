FROM openjdk:17-jdk-alpine
WORKDIR /app
COPY target/*.jar shopping-center.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "shopping-center.jar"]
