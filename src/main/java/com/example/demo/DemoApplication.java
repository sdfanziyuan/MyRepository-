package com.example.demo;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.common.kafka.KafkaSender;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;

@EnableCaching
@SpringBootApplication
@MapperScan(basePackages = {"com.example.demo.mapper"})
//@MapperScan("com.example.demo.mapper")
public class DemoApplication {
    @Autowired
    private RestTemplateBuilder builder;
    // 使用RestTemplateBuilder来实例化RestTemplate对象，spring默认已经注入了RestTemplateBuilder实例
    @Bean
    public RestTemplate restTemplate() {
        return builder.build();
    }
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
