package com.example.jaegertest.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/user/test", produces = MediaType.TEXT_PLAIN_VALUE )
    public String getTestStringApi(){
        return "Program is running";
    }

    @GetMapping(value = "/user/get/{id}")
    public User getUserApi(@PathVariable String id){
        return userService.getUser(id);
    }

    @GetMapping(value = "/user2/get/{id}")
    public User getUserFromAnotherApi(@PathVariable String id){
        final String uri = "http://localhost:8082/user/get/" + id;
        RestTemplate restTemplate = new RestTemplate();

        User result = restTemplate.getForObject(uri, User.class);
        return result;
    }
}
