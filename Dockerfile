FROM openjdk:8-jdk-alpine

WORKDIR /tmp

ADD target/gmud-service-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8095

ENTRYPOINT ["/usr/bin/java", "-jar", "/tmp/app.jar"]
