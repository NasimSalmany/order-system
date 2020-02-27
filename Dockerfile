FROM maven:4.0.0-jdk-8-alpine AS MAVEN_BUILD
MAINTAINER Nasim Salmany
COPY pom.xml /build/
COPY src /build/src/
WORKDIR /build/
RUN mvn package
FROM openjdk:8-jre-alpine
WORKDIR /app
COPY --from=MAVEN_BUILD /build/target/product-service-0.0.1-SNAPSHOT.jar /app/
ENTRYPOINT ["java", "-jar", "product-service-0.0.1-SNAPSHOT.jar"]