RUN curl -fsSLO https://get.docker.com/builds/Linux/x86_64/docker-17.04.0-ce.tgz \
  && tar xzvf docker-17.04.0-ce.tgz \
  && mv docker/docker /usr/local/bin \
  && rm -r docker docker-17.04.0-ce.tgz
FROM openjdk:8
ADD target/simple-springboots-0.1.jar simple-springboots.jar
ENTRYPOINT ["java", "-jar", "/simple-springboots.jar"]
