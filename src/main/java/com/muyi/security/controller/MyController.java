package com.muyi.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/")
    public String getMainMsg(){
        return "Hello all";
    }

    @GetMapping("/user")
    public String getUserMsg(){
        return "Hello user";
    }

    @GetMapping("/admin")
    public String getAdminMsg(){
        return "Hello admin";
    }
}
