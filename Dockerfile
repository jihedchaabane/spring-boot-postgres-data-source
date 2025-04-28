FROM openjdk:21
WORKDIR /var/lib/jenkins/workspace/jars
ADD target/spring-boot-postgres-data-source-0.0.1-SNAPSHOT.jar spring-boot-postgres-data-source.jar
COPY target/spring-boot-postgres-data-source-0.0.1-SNAPSHOT.jar spring-boot-postgres-data-source-0.0.1-SNAPSHOT.jar
EXPOSE 2501
ENTRYPOINT ["java", "-jar", "spring-boot-postgres-data-source-0.0.1-SNAPSHOT.jar"]