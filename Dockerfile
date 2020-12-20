FROM maven:3.6.0-jdk-8-alpine

COPY target/DemoApp-*.jar /opt/app/myob.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/opt/app/myob.jar"]