package com.sb.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class BasicAuthConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicAuthConsumerApplication.class, args);

	}

}
