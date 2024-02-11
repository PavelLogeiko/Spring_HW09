package com.example.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/serviceB")
public class ControllerApplication2 {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, I am Microservice2";
    }
}