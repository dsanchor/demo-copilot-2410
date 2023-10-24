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

# Deploy to AKS

## Environment variables

```bash
export RESOURCE_GROUP=aks-demo-alb-rg
export CLUSTER_NAME=demo
export NAMESPACE=demo2410
```

## Get AKS credentials

```bash
az aks get-credentials --resource-group $RESOURCE_GROUP --name $CLUSTER_NAME
```

## Create namespace

```bash
kubectl create namespace $NAMESPACE
```

## Deploy app

```bash
kubectl apply -f k8s/application.yaml -n $NAMESPACE
```

## Get service public IP

```bash
export SVC_IP=`kubectl get svc demo2410 -n $NAMESPACE -o jsonpath='{.status.loadBalancer.ingress[0].ip}'`
```

## Test /hello endpoint

```bash
curl http://$SVC_IP/hello
```