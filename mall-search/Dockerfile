FROM openjdk:8-jre
MAINTAINER PPDebug <pengpeng.coding@gmail.com>

ENV IPADDRESS=127.0.0.1 SPRING_PROFILES_ACTIVE=prod JAVA_OPTS=""
RUN echo "export IPADDRESS=$IPADDRESS && export SPRING_PROFILES_ACTIVE=$SPRING_PROFILES_ACTIVE && export JAVA_OPTS=$JAVA_OPTS"
ENTRYPOINT ["java", "-jar", "/usr/share/myservice/myservice.jar"]

EXPOSE 8081

# Add Maven dependencies (not shaded into the artifact; Docker-cached)
#ADD target/lib           /usr/share/myservice/lib
# Add the service itself
ARG JAR_FILE
ADD target/${JAR_FILE} /usr/share/myservice/myservice.jar