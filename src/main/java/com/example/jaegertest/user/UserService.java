package com.example.jaegertest.user;

import io.opentracing.Span;
import io.opentracing.Tracer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserService {
    @Autowired
    private Tracer tracer;

    public User getUser(String id){
        Span span = tracer.buildSpan("get-user-service").start();
        span.log(Map.of("event","Id: " + id));
        span.finish();
        return new User(id,"Test");
    }
}
