package com.example.demo.service.impl;

import com.example.demo.mapper.ShcpeMarketOverviewDao;
import com.example.demo.po.ShcpeMarketOverviewEntity;
import com.example.demo.service.ShcpeMarketOverviewService;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.example.demo.utils.ReptileSh;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("shcpeMarketOverviewService")
public class ShcpeMarketOverviewServiceImpl extends ServiceImpl<ShcpeMarketOverviewDao, ShcpeMarketOverviewEntity> implements ShcpeMarketOverviewService {
    @Autowired
    private ShcpeMarketOverviewDao shcpeMarketOverviewDao;

//    @Autowired
//    private ReptileSh reptileSh;
    @Override
    public ShcpeMarketOverviewEntity get() {
        // 获取最近一条市场数据
        List<ShcpeMarketOverviewEntity> shcpeMarketOverviewEntityList = selectList(new EntityWrapper<ShcpeMarketOverviewEntity>()
                .orderBy("create_time", false).last("LIMIT 1")
        );
        if (null != shcpeMarketOverviewEntityList && !shcpeMarketOverviewEntityList.isEmpty()) {
            return shcpeMarketOverviewEntityList.get(0);
        }
        return null;
    }
    @Override
    public void set(){
        ShcpeMarketOverviewEntity shcpeMarketOverviewEntity = new ReptileSh().getShcpeMarketOverview();
        if(null != shcpeMarketOverviewEntity)
             shcpeMarketOverviewDao.setValue(shcpeMarketOverviewEntity);

    }
}
