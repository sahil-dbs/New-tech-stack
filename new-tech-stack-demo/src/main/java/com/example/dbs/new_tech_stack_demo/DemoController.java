package com.example.dbs.new_tech_stack_demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class DemoController {

    @GetMapping("/test")
    public String testEndpoint() {
        return "testing123";
    }
    
}
