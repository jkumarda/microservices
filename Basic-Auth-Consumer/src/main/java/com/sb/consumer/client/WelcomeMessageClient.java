package com.sb.consumer.client;

import org.apache.logging.log4j.util.Base64Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class WelcomeMessageClient {

    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/")
    public ResponseEntity<String> getMsg(){
        ResponseEntity<String> response = restTemplate.getForEntity("/", String.class);
        return response;
    }

    @GetMapping("/msg")
    public ResponseEntity<String> getWelcomeMsg(){
        String username = "babul";
        String password = "Babul@789";
        String userPswd = username+":"+password;
        String encode = Base64Util.encode(userPswd);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Authorization", "Basic "+encode);
        HttpEntity httpEntity = new HttpEntity<>(httpHeaders);

        RestTemplate restTemplate1 = new RestTemplate();
        ResponseEntity<String> response = restTemplate1.exchange("http://localhost:8090/", HttpMethod.GET, httpEntity, String.class);
        return response;

    }
}
