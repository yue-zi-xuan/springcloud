package com.ytian.springcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.ytian.springcloud.entities.CommonResult;
import com.ytian.springcloud.entities.Payment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlowLimitController
{

    @GetMapping("/testA")
    public String testA()
    {
        return "------testA";
    }

    @GetMapping("/testB")
    public String testB()
    {
        return "------testB";
    }



    @GetMapping(value = "/HotKey")
    @SentinelResource(value = "testFallback",fallback = "handleFallback")
    public String testHotKey(@RequestParam(value = "p1",required = false)String p1,
                             @RequestParam(value = "p2",required = false)String p2)
    {
        if (p1.equals("5"))
        {
            throw new IllegalArgumentException ("IllegalArgumentException,非法参数异常....");
        }
//        try { TimeUnit.SECONDS.sleep(2); } catch (InterruptedException e) { e.printStackTrace(); }
        return "---------testHotKey";
    }
    public CommonResult handleFallback(Throwable e)
    {
        final Payment payment = new Payment(1L, "null");
        return  new CommonResult<>(444,"wode!!!"+e.getMessage());
    }

    public String deal_testHotKey(String p1, String p2, BlockException exception)
    {
        return "---------deal_testHotKey!!!";
    }


}
