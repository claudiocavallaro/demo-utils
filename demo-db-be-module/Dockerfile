FROM openjdk:11
ARG JAR_FILE=demo-db-be/target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","app.jar"]