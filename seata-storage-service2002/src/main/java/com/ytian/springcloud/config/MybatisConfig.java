package com.ytian.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.ytian.springcloud.dao")
public class MybatisConfig {
}
