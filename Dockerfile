#FROM maven:3.5-jdk-8-alpine AS BUILD_IMAGE
FROM maven/3.5-jdk-8-alpine
WORKDIR /app
COPY . /app
RUN mvn install -DskipTests
RUN ls -lhrt /app/
RUN ls -lhrt /app/target


FROM openjdk:8-jre
WORKDIR /app
COPY --from=BUILD_IMAGE /app/target/springbootdemo-0.0.1-SNAPSHOT.jar .
EXPOSE 8200
CMD ["java", "-jar", "springbootdemo-0.0.1-SNAPSHOT.jar"]
