package com.tutorial.learn.controllers;

import com.tutorial.learn.beans.User;
import com.tutorial.learn.services.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
public class DemoController {
    private final UserService userService;

    public DemoController(final UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/hello-world")
    public String sayHello() {
        return "Hello world";
    }

    @GetMapping("/user-details")
    public User getUserDetails(@RequestParam(name="username") String username) {
        return userService.getUserDetails(username);
    }

    @PostMapping("/new-user")
    public User saveNewUser(@RequestBody User user) {
        userService.createUser(user);
        return user;
    }

}
