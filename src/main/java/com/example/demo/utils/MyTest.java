package com.example.demo.utils;

import com.example.demo.mapper.ShangHaiMapper;
import com.example.demo.po.ShangHai;
import com.example.demo.service.ShangHaiService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * @author sdpjw
 * @email ljf8838@163.com
 * @date 2020/11/23 18:13
 */
@Configuration
public class MyTest {
    @Autowired
    private ShangHaiMapper shangHaiMapper;
    private static MyTest myTest;

    @PostConstruct
    public void init(){
        myTest = this;
        myTest.shangHaiMapper = this.shangHaiMapper;
    }

    @Test
    public void test1(){
        List<ShangHai> list = myTest.shangHaiMapper.getValues();
    }

    @Test
    public void test2(){
        ShangHaiService shangHaiService =
                (ShangHaiService)ApplicationContextUtil.getBean("shangHaiService");
        shangHaiService.addValues(new ShangHai());
    }




}
