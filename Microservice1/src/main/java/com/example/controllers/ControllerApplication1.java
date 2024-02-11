package com.example.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/serviceA")
public class ControllerApplication1 {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, I am Microservice1";
    }
}