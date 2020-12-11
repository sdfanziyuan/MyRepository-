package com.example.demo.common.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


/**
 * @author sdpjw
 * @date 2020/12/11 14:53
 */
@Component
public class KafkaConsumer {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    //下面的主题是一个数组，可以同时订阅多主题，只需按数组格式即可，也就是用“，”隔开
    @KafkaListener(topics = {"testTopic1"})
    public void receive(ConsumerRecord<?, ?> record){

        logger.info("消费得到的消息---key: " + record.key());
        logger.info("消费得到的消息---value: " + record.value().toString());
    }

}
