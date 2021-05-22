package com.ytian.springcloud.service.Impl;

import com.ytian.springcloud.entities.CommonResult;
import com.ytian.springcloud.entities.Payment;
import com.ytian.springcloud.service.PaymentService;

public class PaymentFallbackServiceImpl implements PaymentService {
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult(200, "错了!!!!:" ,new Payment(id,"serialError"));
    }
}
