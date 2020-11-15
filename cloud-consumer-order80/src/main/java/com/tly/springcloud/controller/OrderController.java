package com.tly.springcloud.controller;


import com.tly.utils.CommonResult;
import com.tly.utils.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@Slf4j
//@RequestMapping("/consumer")
public class OrderController {

    @Resource
    private RestTemplate restTemplate;

    public static final String PAYMENT_URL = "http://localhost:8101";

    @PostMapping("/consumer/payment/create")
    public CommonResult<Payment> create(Payment payment) {
        //此处是post
        return restTemplate.postForObject(PAYMENT_URL + "/payment8101/payment/create", payment, CommonResult.class);
    }

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        //此处是get
        return restTemplate.getForObject(PAYMENT_URL + "/payment8101/payment/get/"+id,CommonResult.class);
    }
}
