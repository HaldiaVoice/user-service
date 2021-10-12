FROM openjdk:11

COPY . /app

WORKDIR /app

ENV PORT 8050

CMD [ "java", "-jar", "/app/target/user-0.0.1-SNAPSHOT.jar" ]