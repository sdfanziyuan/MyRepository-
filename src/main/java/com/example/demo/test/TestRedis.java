package com.example.demo.test;

import com.example.demo.utils.RedisUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author sdpjw
 * @email ljf8838@163.com
 * @date 2020/12/2 10:31
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestRedis {

    @Autowired
    private RedisUtil redisUtil;

    @Autowired
    private RedisTemplate redisTemplate;

    static Logger logger=LoggerFactory.getLogger(TestRedis.class);

    @Test
    public void set() {
        redisUtil.sSet("car1","avalon");
        logger.info(redisUtil.sGet("car1").toString());
    }
}
