package com.example.demo.controller;


import com.example.demo.po.ShcpeMarketOverviewEntity;
import com.example.demo.service.ShcpeMarketOverviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/noauth/api/v1/shcpeMarketOverview")
public class ShcpeMarketOverviewController {

    @Autowired
    private ShcpeMarketOverviewService shcpeMarketOverviewService;

//    @GetMapping("/get")
//    public R get(){
//        return R.ok().put("data", shcpeMarketOverviewService.get());
//    }@GetMapping("/get")

    @GetMapping("/get")
    public ShcpeMarketOverviewEntity get(){
        return shcpeMarketOverviewService.get();
    }
}
