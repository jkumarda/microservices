package com.sb.greetings_api.feign.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "WELCOME-API")
public interface WelcomeFeignClient {

    @GetMapping("/welcome")
    String invokeWelcomeMsgApi();
}
