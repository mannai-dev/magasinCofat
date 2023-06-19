FROM openjdk:17-jdk-alpine
COPY target/MagasinCofat-1.0.jar MagasinCofat-1.0.jar
ENTRYPOINT ["java","-jar","/MagasinCofat-1.0.jar"]
