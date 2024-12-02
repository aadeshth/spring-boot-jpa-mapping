FROM openjdk:17-jdk-alpine
COPY target/spring-boot-mysql-0.0.1.jar spring-boot-mysql.jar
ENTRYPOINT ["java","-jar","spring-boot-mysql.jar"]
EXPOSE 8080