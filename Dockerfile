FROM gradle:8-jdk17
WORKDIR /home/gradle
COPY . .
RUN gradle bootJar
ENTRYPOINT ["java","-jar","build/libs/sample-project-0.0.1-SNAPSHOT.jar"]