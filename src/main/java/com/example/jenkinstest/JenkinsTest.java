package com.example.jenkinstest;

import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
// TEST

public class JenkinsTest {
    private final RedisTemplate<String, String> redisTemplate;

    @GetMapping("/test")
    public String test(){
        return "Hello World";
    }

    @GetMapping("/test1")
    public String test1(){
        redisTemplate.opsForValue().set("hello", "world");
        return redisTemplate.opsForValue().get("hello");
    }


}
