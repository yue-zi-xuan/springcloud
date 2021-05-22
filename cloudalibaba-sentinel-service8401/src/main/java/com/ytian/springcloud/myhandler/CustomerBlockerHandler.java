package com.ytian.springcloud.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.ytian.springcloud.entities.CommonResult;

public class CustomerBlockerHandler {

    public static CommonResult handleException1(BlockException exception)
    {
        return new CommonResult(4444,"我的,global----handleException1");
    }

    public static CommonResult handleException2(BlockException exception)
    {
        return new CommonResult(4444,"我的,global----handleException2");
    }

}
