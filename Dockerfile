FROM openjdk:17-jdk-alpine AS BASE

WORKDIR /app

COPY target/trifork-opg.jar app.jar

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]