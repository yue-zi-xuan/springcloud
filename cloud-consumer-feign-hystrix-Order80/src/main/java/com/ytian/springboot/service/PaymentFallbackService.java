package com.ytian.springboot.service;


import org.springframework.stereotype.Service;

@Service
public class PaymentFallbackService implements PaymentHystrixService{
    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "PayMent Fallback";
    }

    @Override
    public String paymentInfo_OK(Integer id) {
        return "PayMent Fallback";
    }
}
