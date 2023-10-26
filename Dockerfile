FROM eclipse-temurin:11-jdk-alpine
VOLUME / tmp
COPY target/*.jar UserRgister-0.0.1-SNAPSHOT.jar
ENTRYPOINT["java","-jar","/UserRgister-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080
