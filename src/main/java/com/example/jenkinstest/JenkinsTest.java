package com.example.jenkinstest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor

public class JenkinsTest {

    @GetMapping("/test")
    public String test(){
        return "Hello World";
    }


}
