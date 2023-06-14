FROM openjdk:8-jdk-alpine
COPY target/magasinCofat-1.0.jar magasinCofat-1.0.jar
ENTRYPOINT ["java","-jar","/magasinCofat-1.0.jar"]