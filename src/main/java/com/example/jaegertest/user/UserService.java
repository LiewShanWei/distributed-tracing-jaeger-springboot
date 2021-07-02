package com.example.jaegertest.user;

import io.opentracing.Span;
import io.opentracing.Tracer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserService {
    public User getUser(String id){
        return new User(id,"Test");
    }
}
