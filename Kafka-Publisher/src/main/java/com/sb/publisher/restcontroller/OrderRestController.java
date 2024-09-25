package com.sb.publisher.restcontroller;
import com.sb.publisher.binding.Order;
import com.sb.publisher.service.OrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderRestController {
    @Autowired
    private OrderService orderService;
    @PostMapping("/save")
    public String saveOrder(@RequestBody Order order){
        String result = orderService.sendOrderToTopic(order);
        return result;
    }
}
