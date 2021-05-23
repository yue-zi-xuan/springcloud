package com.ytian.springcloud.handler;

import com.ytian.springcloud.entities.CommonResult;
import com.ytian.springcloud.entities.Payment;
import org.springframework.web.bind.annotation.PathVariable;


public class fallbackclass {
    public static CommonResult handleFallback(@PathVariable Long id, Throwable e)
    {
        final Payment payment = new Payment(id, "null");
        return  new CommonResult<>(444,"wode!!!"+e.getMessage(),payment);
    }
    public static CommonResult handleFallback2(@PathVariable Long id,Throwable e)
    {
        final Payment payment = new Payment(id, "null");
        return  new CommonResult<>(444,"wode!!!"+e.getMessage());
    }
}
