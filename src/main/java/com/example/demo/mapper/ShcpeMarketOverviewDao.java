package com.example.demo.mapper;


import com.example.demo.po.ShcpeMarketOverviewEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ShcpeMarketOverviewDao extends BaseMapper<ShcpeMarketOverviewEntity> {
    int set(ShcpeMarketOverviewEntity shcpeMarketOverviewEntity);
}
