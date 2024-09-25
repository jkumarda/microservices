package com.sb.publisher.service;

import com.sb.publisher.binding.Order;
import com.sb.publisher.constants.AppConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    public String sendOrderToTopic(Order order){
        kafkaTemplate.send(AppConstants.TOPIC, order);
        return "Order sent to Topic successfully!!!";
    }
}
