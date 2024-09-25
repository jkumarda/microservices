package com.sb.greetings_api.restcontroller;

import com.sb.greetings_api.feign.clients.WelcomeFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetsRestController {
    @Autowired
    private WelcomeFeignClient welcomeFeignClient;
    @GetMapping("/greets")
    public String getGreetingsMsg(){
        String welcomeMsg = welcomeFeignClient.invokeWelcomeMsgApi();
        String greetMsg = "Good After-Noon!!!";
        return greetMsg + ", " + welcomeMsg;
    }
}
