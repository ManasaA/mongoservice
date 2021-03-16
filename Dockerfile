FROM openjdk:8-jdk-alpine
ADD target/mongo-demo.jar mongo-demo.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "mongo-demo.jar"]