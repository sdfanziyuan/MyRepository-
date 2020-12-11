package com.example.demo.task;

import com.example.demo.service.ShcpeMarketOverviewService;
import com.example.demo.utils.ApplicationContextUtil;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * @author sdpjw
 * @email ljf8838@163.com
 * @date 2020/11/24 14:00
 */
@Configuration      //1.主要用于标记配置类，兼备Component的效果。
@EnableScheduling   // 2.开启定时任务
public class SaticScheduleTask {
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
}
