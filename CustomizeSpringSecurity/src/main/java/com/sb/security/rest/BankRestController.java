package com.sb.security.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankRestController {

    @GetMapping("/contact")
    public String contactUs(){
        return "Contact US : +91-78722227722";
    }

    @GetMapping("/about")
    public String aboutUs(){
        return "We are since 2000!";
    }

    @GetMapping("/deposit")
    public String deposit(){
        return "INR amount 10000/- deposited successfully!";
    }

    @GetMapping("/withdraw")
    public String withdraw(){
        return "Amount 2000/- withdrawn from SBI ATM successfully!";
    }
}
