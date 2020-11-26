package com.example.demo.controller;

import com.example.demo.po.ShangHai;
import com.example.demo.service.ShangHaiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author sdpjw
 * @email ljf8838@163.com
 * @date 2020/11/24 8:15
 */
@RestController
@RequestMapping("")
public class ShangHaiController {
    @Autowired
    private ShangHaiService shangHaiService;

    @RequestMapping("/shanghai")
    public String getValues(){
        List<ShangHai> list = shangHaiService.getValues();
        return list.get(0).toString();
    }
    @RequestMapping("/addShanghai")
    public String addValues(ShangHai shangHai){
        return "插入记录数："+shangHaiService.addValues(shangHai);
    }

}
