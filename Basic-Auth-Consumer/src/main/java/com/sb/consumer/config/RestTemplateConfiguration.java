package com.sb.consumer.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfiguration {
    @Value("${producer.api.url}")
    private String url;
    @Value("${producer.api.username}")
    private String username;
    @Value("${producer.api.password}")
    private String password;


    @Bean
    public RestTemplate restTemplate(){
        RestTemplate restTemplate = new RestTemplateBuilder().rootUri(url).basicAuthentication(username,password).build();
        return restTemplate;
    }
}
