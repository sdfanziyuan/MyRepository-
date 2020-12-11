package com.example.demo.task;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.common.kafka.KafkaSender;
import com.example.demo.service.ShcpeMarketOverviewService;
import com.example.demo.utils.ApplicationContextUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.HashMap;

/**
 * @author sdpjw
 * @date 2020/11/24 14:00
 */
@Configuration      //1.主要用于标记配置类，兼备Component的效果。
@EnableScheduling   // 2.开启定时任务
public class SaticScheduleTask {

    @Autowired
    private KafkaSender kafkaSender;

    /**
     * 获取票交所数据
     * @throws InterruptedException
     */
    //@Scheduled(fixedRate=1000*60*60)
    private void configureTasks() throws InterruptedException {
        System.err.println("执行静态定时任务时间: " + LocalDateTime.now());
        ShcpeMarketOverviewService shcpeMarketOverviewService =
                (ShcpeMarketOverviewService)ApplicationContextUtil.getBean("shcpeMarketOverviewService");
        for (int i = 0;i<10;i++){
            shcpeMarketOverviewService.set();
            Thread.currentThread().sleep(5000);
        }
    }

    /**
     * kafka测试
     */
    @Scheduled(fixedRate=1000)
    public void sendMsg(){
        kafkaSender.send("testTopic1","123", JSONObject.toJSONString(new HashMap<String,String>().put("message","我是一条消息")));
    }
}
