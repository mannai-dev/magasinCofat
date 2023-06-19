FROM openjdk:17-jdk-alpine
COPY target/MagasinCofat-0.0.1-SNAPSHOT.jar MagasinCofat-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/MagasinCofat-0.0.1-SNAPSHOT.jar"]
