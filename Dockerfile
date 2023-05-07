FROM openjdk:8
ADD target/simple-springboots-0.1.jar simple-springboots.jar
ENTRYPOINT ["java", "-jar", "/simple-springboots.jar"]