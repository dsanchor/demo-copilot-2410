# Spring Boot 3 Rest API

## Build app

```bash
mvn clean package
```

## Run app

```bash
mvn spring-boot:run
```

## Test /hello endpoint

```bash
curl http://localhost:8080/hello
```

## Test /reverse endpoint

```bash
curl http://localhost:8080/reverse?text=hello
```

## Test /removeVowels endpoint

```bash
curl http://localhost:8080/removeVowels?text=hello
```

## Run unit tests

```bash
mvn test
```

# Dockerize the app

## Build docker image

```bash
docker build -t demo2410 .
```

## Run docker image

```bash
docker run -p 8080:8080 demo2410
```

