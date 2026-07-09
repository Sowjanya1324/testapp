FROM eclipse-temurin:21-jdk
WORKDIR /app
COPY target/test-app.jar test-app.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","test-app.jar"]