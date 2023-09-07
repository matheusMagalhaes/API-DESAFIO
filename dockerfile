
FROM openjdk:11
RUN mkdir /app
COPY target/classes/com/desafio/apidesafio/ApiDesafioApplication.class/main  /app
WORKDIR /app
CMD java main
