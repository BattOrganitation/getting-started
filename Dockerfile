FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY dist/app-all.jar /app/app.jar
ENTRYPOINT ["java", "-jar", "/app/app.jar"]