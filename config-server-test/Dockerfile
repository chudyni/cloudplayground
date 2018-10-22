FROM openjdk:8-jdk-alpine

VOLUME /tmp
ADD /target/config-server-test-0.0.1-SNAPSHOT.jar config-server-test.jar
CMD ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/config-server-test.jar"]
