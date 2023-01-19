WORKDIR /opt/app
COPY ./ /opt/app
RUN gradle clean build -x test
FROM gradle:7.6.0-jdk11-alpine AS build
COPY --from=build /opt/app/build/libs/*.jar app.jar
ENV PORT 8080
EXPOSE $PORT
ENTRYPOINT ["java", "-jar", "-Xmx1024M", "-Dserver.port=${PORT}", "app.jar"]
