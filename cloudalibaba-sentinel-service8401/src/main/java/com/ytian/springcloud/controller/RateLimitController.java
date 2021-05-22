package com.ytian.springcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.ytian.springcloud.entities.CommonResult;
import com.ytian.springcloud.entities.Payment;
import com.ytian.springcloud.myhandler.CustomerBlockerHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RateLimitController {


    @GetMapping(value = "/byResource")
    @SentinelResource(value = "byResource",blockHandler = "handleException")
    public CommonResult byResource()
    {
        return new CommonResult(200,"按名称限流测试ok",new Payment(2020L,"serial001"));
    }
    public CommonResult handleException(BlockException exception)
    {
        return new CommonResult(444,exception.getClass().getCanonicalName()+"\t"+"服务不可用");
    }

    @GetMapping(value = "/rateLimit/customerBlockerHandler")
    @SentinelResource(value = "customerBlockerHandler",
            blockHandlerClass = CustomerBlockerHandler.class,
            blockHandler = "handleException2")
    public CommonResult customerBlockerHandler()
    {
        return new CommonResult(200,"按名称限流测试ok",new Payment(2020L,"serial003"));
    }


}
