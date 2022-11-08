FROM openjdk:8-jre
MAINTAINER PPDebug <pengpeng.coding@gmail.com>

ENV IPADDRESS 127.0.0.1
ENV SPRING_PROFILES_ACTIVE=prod
ENV JAVA_OPTS="-Xms=512m -Xmx=512m"
ENTRYPOINT ["java", "-jar", "/usr/share/myservice/myservice.jar", "$JAVA_OPTS"]

EXPOSE 8401

# Add Maven dependencies (not shaded into the artifact; Docker-cached)
#ADD target/lib           /usr/share/myservice/lib
# Add the service itself
ARG JAR_FILE
ADD target/${JAR_FILE} /usr/share/myservice/myservice.jar