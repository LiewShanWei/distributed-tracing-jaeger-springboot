package com.example.jaegertest.user;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    public User getUser(String id){
        return new User(id,"Test");
    }
}
