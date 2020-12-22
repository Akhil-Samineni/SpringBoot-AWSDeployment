FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/spring-boot-aws-exe.jar target/app.jar
ENTRYPOINT ["java","-jar","target/app.jar"]