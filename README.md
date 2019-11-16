# Getting Started

### Reference Documentation
Running as a spring boot
```
mvn clean package
mvn spring-boot run
```

Running on Docker container
```
docker build -t dockernvkk/springbootapp .
docker run --rm -p 8081:8081 dockernvkk/springbootapp:latest
```

Publish to Docker Hub.
* First login to docker account with 'docker login'
* Push the image to target docker repo
```
docker push dockernvkk/springbootapp:latest
```


### Requirements
JDK 1.8
Maven3