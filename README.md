# distributed-tracing-springboot

## What is this?
This is a Springboot project that uses opentracing-spring-jaeger-web-starter dependency to autoconfigure jaeger with Springboot. This project is used to test jaeger features using Springboot microservice.   

## How to start?
Go to : https://www.jaegertracing.io/docs/1.23/getting-started and download jaeger-all-in-one  

## Commands
To run jaeger-all-in-one: $ jaeger-all-in-one --collector.zipkin.host-port=:9411

## Ports
Jaeger metrics : 14269/metrics
Jaeger default zipkin collector : 9411  
Jaeger UI : 16686

## Examples followed  
https://medium.com/swlh/tracing-in-spring-boot-with-opentracing-opentelemetry-dd724134ca93  
https://github.com/yurishkuro/opentracing-tutorial  
https://medium.com/jaegertracing/jaeger-and-opentelemetry-1846f701d9f2  
https://www.vinsguru.com/distributed-tracing-in-microservices-with-jaeger/  
