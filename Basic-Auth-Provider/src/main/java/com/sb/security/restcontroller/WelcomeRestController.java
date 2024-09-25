package com.sb.security.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
    @GetMapping("/")
    public String welcomeMessage(){
        return "Welcome to Spring-Security....Good Evening guys!!!";
    }
}
