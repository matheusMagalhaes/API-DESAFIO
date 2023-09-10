
FROM openjdk
RUN mkdir /app
COPY target/api-desafio-0.0.1-SNAPSHOT.jar /app/
EXPOSE 8080
WORKDIR /app
CMD ["java", "-jar", "api-desafio-0.0.1-SNAPSHOT.jar"]