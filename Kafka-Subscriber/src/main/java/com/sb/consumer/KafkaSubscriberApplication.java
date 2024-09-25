package com.sb.consumer;

import com.sb.consumer.constants.AppConstants;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
public class KafkaSubscriberApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaSubscriberApplication.class, args);
	}

	@KafkaListener(topics = AppConstants.TOPIC, groupId = "order_group_id")
	public void getOrderDetails(String order){
		System.out.println("******* Kafka Listener executed ********");
		System.out.println(order);
	}
}
