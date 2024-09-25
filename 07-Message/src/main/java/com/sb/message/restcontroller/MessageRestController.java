package com.sb.message.restcontroller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageRestController {
    @Value("${msg}")
    String welcomeMsg;

    @GetMapping("/msg")
    public String getWelcomeMsg(){
        return welcomeMsg;
    }
}
