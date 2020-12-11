package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.common.kafka.KafkaSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author sdpjw
 * @date 2020/12/11 14:14
 */
@RestController
@RequestMapping()
public class KafkaController {
    @Autowired
    private KafkaSender kafkaSender;
    @RequestMapping("/sendMessageToKafka")
    public String sendMessageToKafka(){

        Map<String,String> map = new HashMap<>();
        map.put("message","我是一条消息");
        String taskId = "123456";
        String jsonStr = JSONObject.toJSONString(map);
        kafkaSender.send("testTopic",taskId,jsonStr);
        return "hi guy";
    }
}
