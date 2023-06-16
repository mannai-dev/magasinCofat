FROM openjdk:17-jdk-alpine
COPY target/magasinCofat-1.0.jar magasinCofat-1.0.jar
ENTRYPOINT ["java","-jar","/magasinCofat-1.0.jar"]
