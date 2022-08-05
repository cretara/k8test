FROM eclipse-temurin:17-alpine
MAINTAINER cretaradev@gmail.com
EXPOSE 8087
COPY target/dvdrental-service-1.0.0.jar dvdrental-service-1.0.0.jar
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-Dspring.profiles.active=debug", "-jar", "/dvdrental-service-1.0.0.jar"]
