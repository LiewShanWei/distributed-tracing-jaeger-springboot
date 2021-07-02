package com.example.jaegertest.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(value = "/user/test", produces = MediaType.TEXT_PLAIN_VALUE )
    public String getTestStringApi(){
        return "Program is running";
    }

    @GetMapping(value = "/user/get/{id}")
    public User getUserApi(@PathVariable String id){
        return userService.getUser(id);
    }
}
