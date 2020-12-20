FROM maven:3.6.0-jdk-8-alpine

COPY target/myob-*.jar /opt/app/myob.jar

EXPOSE 8090

ENTRYPOINT ["java", "-jar", "/opt/app/myob.jar"]