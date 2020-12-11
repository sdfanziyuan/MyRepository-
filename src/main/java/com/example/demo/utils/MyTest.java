package com.example.demo.utils;

import com.example.demo.DemoApplication;
import com.example.demo.service.ShcpeMarketOverviewService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author sdpjw
 * @email ljf8838@163.com
 * @date 2020/11/23 18:13
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class MyTest {

//    @Test
    public void test1() throws InterruptedException {
        ReptileSh reptileSh = new ReptileSh();
        for (int i = 0;i < 5; i++){
            reptileSh.getShcpeMarketOverview();
            Thread.currentThread().sleep(500);
        }
    }

    /**
     * 某些地方的@Autowired在 junit中无效
     */
//    @Test
    public void test2(){
        ShcpeMarketOverviewService shcpeMarketOverviewService =
                (ShcpeMarketOverviewService)ApplicationContextUtil.getBean("shcpeMarketOverviewService");
        shcpeMarketOverviewService.set();
    }

}
