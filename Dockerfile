FROM openjdk:8-jre-alpine
MAINTAINER Ali Shahbour <ali.shahbour@teltacworldwide.com>

VOLUME /tmp
ADD ./target/*.jar /app/app.jar
CMD ["java","-Djava.security.egd=file:/dev/./urandom","-Xmx4096m", "-jar", "/app/app.jar"]

EXPOSE 8080