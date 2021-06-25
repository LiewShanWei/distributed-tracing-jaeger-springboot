package com.example.jaegertest.user;

import io.opentracing.Span;
import io.opentracing.Tracer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private Tracer tracer;

    @GetMapping(value = "/user/test", produces = MediaType.TEXT_PLAIN_VALUE )
    public String getTestStringApi(){
        Span span = tracer.activeSpan();
        String s = "Program is running";
        span.log(Map.of("event","declare s"));

        span.finish();
        return s;
    }

    @GetMapping(value = "/user/get/{id}")
    public User getUserApi(@PathVariable String id){
        return userService.getUser(id);
    }
}
