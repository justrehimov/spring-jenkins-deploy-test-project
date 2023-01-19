FROM gradle:7.6.0-jdk11-alpine
WORKDIR /app
COPY build/libs/spring-jenkins-deploy-test-project-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]