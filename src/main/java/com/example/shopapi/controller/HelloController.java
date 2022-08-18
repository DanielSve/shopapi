package com.example.shopapi.controller;

import com.example.shopapi.model.User;
import com.example.shopapi.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class HelloController {

    private final UserService userService;

    public HelloController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String hello() {
        return "Hello";
    }

}
