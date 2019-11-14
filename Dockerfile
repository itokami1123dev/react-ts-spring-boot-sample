FROM maven:3.6.1-jdk-8 AS builder
RUN mkdir -p /opt/java/src
COPY ./ /opt/java/
RUN cd /opt/java && mvn install

FROM openjdk:8-jre-alpine
RUN mkdir -p /opt/app/
COPY --from=builder /opt/java/target/react-ts-spring-boot-sample-0.0.1-SNAPSHOT.jar /opt/app/
EXPOSE 8080
CMD  ["java","-jar","/opt/app/react-ts-spring-boot-sample-0.0.1-SNAPSHOT.jar"]

