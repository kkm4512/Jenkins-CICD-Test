package com.example.jenkinstest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
//
public class JenkinsTest {

    @GetMapping("/test")
    public String test(){
        return "Hello World!";
    }

    @GetMapping("/test1")
    public String test1(){
        return "안녕하십니까 ~";
    }


}
