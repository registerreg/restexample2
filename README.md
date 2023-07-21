# Overview
This is a sample rest example application in Spring boot. This is intended to provide a bare minimum set of files that is executable, and can be compiled into a functional docker image.

# Running locally with gradle
gradle build

gradle bootRun

# Running with docker
To help ensure consistently correct startup across multiple platforms, you may choose to use Docker to containerize your application.  Installation steps for docker can be found on their main page.
https://docs.docker.com/engine/install/

With Docker installed, you can build your a new image. This build needs to be run after any changes are made to the source code.
```
docker build --tag=sample-project:latest .
```

After the image builds successfully, run a container from that image.
```
docker run -d --name sample-project -p8080:8080 sample-project:latest
```

Use the following url in browser to get supervisors

http://localhost:8080/api/supervisors

Use the following curl command for post

curl -X POST -H "Content-Type: application/json" -d '{"firstName": "John","lastName": "Jones","email": "johnJones@erols.com","phoneNumber": "111-222-3333","supervisor": "John Doe" }' http://localhost:8080/endpoint


When you are done testing, stop the server and remove the container.
```
docker rm -f sample-project
```

# Running with docker-compose
docker-compose up
