package com.cleverti;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.lang.RuntimeException;

@RestController
public class AppController {

    @Autowired
    private AppService service;

    @GetMapping(path = "/")
    public AppModel get() {
         return service.findById(1L).orElseThrow(() -> new RuntimeException("Not found"));
    }
    
}