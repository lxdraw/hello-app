FROM openjdk:8-jdk-slim

WORKDIR /etc/apps

COPY ./build/libs/hello-0.0.1-SNAPSHOT.jar hello.jar

ENTRYPOINT ["java", "-Djava.security.edg=file:/dev/./urandom","-jar", "hello.jar"]
