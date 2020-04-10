package com.cleverti;

import org.springframework.web.bind.annotation.*;

@RestController
public class AppController {

    @GetMapping(path = "/")
    public String get() {
        return "hello world";
    }
    
}