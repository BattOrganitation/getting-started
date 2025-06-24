FROM gradle:8-jdk17 as build

WORKDIR /app
COPY . .

RUN gradle shadowJar --no-configuration-cache --no-daemon

FROM eclipse-temurin:17-jdk
COPY --from=build /app/build/libs/app-all.jar /app/app.jar

ENTRYPOINT ["java", "-jar", "/app/app.jar"]