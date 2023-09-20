FROM eclipse-temurin:17

LABEL maintainer="sidh"

WORKDIR /app

EXPOSE 8093

COPY target/spring-boot-0.0.1-SNAPSHOT.jar /app/spring-boot.jar

ENTRYPOINT ["java", "-jar", "spring-boot.jar"]



