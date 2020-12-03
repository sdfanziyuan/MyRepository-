package com.example.demo.task;

import com.example.demo.po.ShangHai;
import com.example.demo.service.ShangHaiService;
import com.example.demo.utils.ApplicationContextUtil;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.time.LocalDateTime;

/**
 * @author sdpjw
 * @email ljf8838@163.com
 * @date 2020/11/24 14:00
 */
@Configuration      //1.主要用于标记配置类，兼备Component的效果。
@EnableScheduling   // 2.开启定时任务
public class SaticScheduleTask {
//    //3.添加定时任务
//    @Scheduled(cron = "0/60 * * * * ?")
//    //或直接指定时间间隔，例如：5秒
//    //@Scheduled(fixedRate=5000)
//    private void configureTasks() throws InterruptedException {
//        System.err.println("执行静态定时任务时间: " + LocalDateTime.now());
//        ShangHaiService shangHaiService =
//                (ShangHaiService)ApplicationContextUtil.getBean("shangHaiService");
//        int num = 0;
//        while (num < 1){
//            num = shangHaiService.addValues(new ShangHai());
//            System.out.println("num="+num);
//            Thread.currentThread().sleep(5000);
//        }
//    }
}
