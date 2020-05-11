package com.atguigu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


/**
 * @author tujietg
 * @date 5/11/20 4:16 PM
 */
@Slf4j
@RestController
public class OmsOrderController {

    @Autowired
    private RestTemplate restTemplate;

    /**
     * 客户端调用 服务器端
     */
    private String url = "http://localhost:8001";

    /**
     * 调用Eureka
     */
    public static final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";


    @GetMapping(value = "/consumer/payment/lb")
    public String getPaymentLB() {
        return restTemplate.getForObject(PAYMENT_URL + "/payment/lb", String.class);
    }

}
