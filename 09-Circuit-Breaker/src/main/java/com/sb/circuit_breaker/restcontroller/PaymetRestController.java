package com.sb.circuit_breaker.restcontroller;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymetRestController {

    @GetMapping("/payment")
    @CircuitBreaker(name = "payment-service", fallbackMethod = "fallbackServiceForPayment")
    public String paymentService() throws InterruptedException {
        System.out.println("******* Payment service executed *******");
        int a = 10/0;
        return "Payment Done successfully!!!";
    }

    public String fallbackServiceForPayment(Throwable throwable){
        System.out.println("****** Fallback service executed ******");
        return "Payment gateway facing some issue, please try after sometimes!!";
    }
}
