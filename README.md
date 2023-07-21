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

When you are done testing, stop the server and remove the container.
```
docker rm -f sample-project
```

# Running with docker-compose
docker-compose up
