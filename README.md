# Enabling Distributed Tracing in Springboot Applications
Springboot project that contains microservices which uses various open-sourced distributed tracing solutions to explore the capabilities.

## Modules
* `application-A` and `application-B` deals with **Jaeger**
* `application-C` and `application-D` deals with **Spring Cloud Sleuth with Zipkin and Opentracing**

Before you run the applications, you will need to start a Jaeger backend collecting agent.  
1. Go to : https://www.jaegertracing.io/docs/1.23/getting-started and download `jaeger-all-in-one`
1. Run the following command to start Jaeger-all-in-one, with the collector running at port 9411: `start jaeger-all-in-one --collector.zipkin.host-port=:9411`

### Application A and Application B - Jaeger
These applications auto-instruments traces using `Jaeger` and sends them to a Jaeger Collector.  
The `pom.xml` contains `opentracing-spring-jaeger-cloud-starter` dependency.  
Use the following example to test: `http://localhost:8081/get/123`

### Application C and Application D - Spring Cloud Sleuth with Zipkin
These applications auto-instruments traces using <b>Spring Cloud Sleuth</b> and sends them to a `Jaeger` Collector.  
The `pom.xml` contains `spring-cloud-sleuth-zipkin` and `brave-opentracing` dependencies.  
Use the following example to test: `http://localhost:8083/get/123`

## Ports
Jaeger metrics : 14269/metrics  
Jaeger default zipkin collector : 9411  
Jaeger UI : 16686

## Examples followed  
https://medium.com/swlh/tracing-in-spring-boot-with-opentracing-opentelemetry-dd724134ca93  
https://github.com/yurishkuro/opentracing-tutorial  
https://medium.com/jaegertracing/jaeger-and-opentelemetry-1846f701d9f2  
https://www.vinsguru.com/distributed-tracing-in-microservices-with-jaeger/  
