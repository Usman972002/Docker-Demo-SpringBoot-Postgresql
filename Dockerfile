FROM openjdk:24-jdk
ADD target/Docker-Demo.jar docker-demo.jar
ENTRYPOINT ["java", "-jar", "/docker-demo.jar"]
