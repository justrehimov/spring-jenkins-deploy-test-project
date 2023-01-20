FROM gradle:7.6.0-jdk11-alpine
ENV DEPLOY_ENV default
WORKDIR /app
COPY build/libs/spring-boot-1.0.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar", "--spring.profiles.active=${DEPLOY_ENV}"]
CMD ["cd"]