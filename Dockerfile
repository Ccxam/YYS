FROM openjdk:11-jdk-alpine
VOLUME /tmp
COPY ./target/yys_service.jar yys_service.jar
ENTRYPOINT ["java","-jar","/yys_service.jar", "&"]