package com.senai.exerciciofuturodev.rest.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/helloworld")
    public String getHelloWorld() {
        return "Hello World";
    }

    @GetMapping("/test")
    public String getTest() {
        return "test";
    }

}
