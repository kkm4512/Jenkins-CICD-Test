package com.example.jenkinstest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsTest {
    @GetMapping
    public String test1(){
        return "Hello World";
    }

    //CI TEST
}
