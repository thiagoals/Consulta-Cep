#
# Build stage
#
FROM maven:3.6.0-jdk-11-slim AS build
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package -Dmaven.test.skip=true

#
# Package stage
#
FROM openjdk:11-jre-slim
ARG PROJECT_NAME=cep
ARG PROJECT_VERSION="0.0.1"
COPY --from=build /home/app/target/$PROJECT_VERSION-$PROJECT_VERSION.jar /usr/local/lib/$PROJECT_VERSION.jar
ENTRYPOINT ["java","-jar","/usr/local/lib/authentication.jar"]
