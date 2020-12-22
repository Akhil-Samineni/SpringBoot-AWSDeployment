FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/spring-boot-aws-exe.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]