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
ARG PROJECT_VERSION="0.0.1-SNAPSHOT"
EXPOSE 8089
COPY --from=build /home/app/target/$PROJECT_NAME-$PROJECT_VERSION.jar /usr/local/lib/$PROJECT_NAME.jar
ENTRYPOINT ["java","-jar","/usr/local/lib/cep.jar"]
