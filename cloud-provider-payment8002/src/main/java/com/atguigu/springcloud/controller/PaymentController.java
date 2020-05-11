package com.atguigu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tujietg
 * @date 5/11/20 3:43 PM
 */
@Slf4j
@RestController
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/payment/lb")
    public String getPaymentLB() {
        log.info("发生调用：" + serverPort);
        return serverPort;
    }


}
