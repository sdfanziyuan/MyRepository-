package com.example.demo.service.impl;

import com.example.demo.bean.Notice;
import com.example.demo.mapper.ShangHaiMapper;
import com.example.demo.po.ShangHai;
import com.example.demo.service.ShangHaiService;
import com.example.demo.utils.ReptileSh;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * @author sdpjw
 * @email ljf8838@163.com
 * @date 2020/11/24 8:12
 */
@Service("shangHaiService")
public class ShangHaiServiceImpl implements ShangHaiService {
    @Autowired
    private ShangHaiMapper shangHaiMapper;

    @Override
    public List<ShangHai> getValues(){
        return shangHaiMapper.getValues();
    }

    @Override
    public int addValues(ShangHai shangHai) {
        int result;
        ReptileSh reptileSh = new ReptileSh();
        Notice notice = reptileSh.GET_OK() != null ? reptileSh.GET_OK() : null;
        if(notice != null){
            System.out.println("getDayAcceptAmount="+notice.getData().getMarketOverviewDay().getDayAcceptAmount());
            shangHai.setDay_accept_amount(notice.getData().getMarketOverviewDay().getDayAcceptAmount());
            shangHai.setDay_accept_num(notice.getData().getMarketOverviewDay().getDayAcceptNum());
            shangHai.setDay_discount_amount(notice.getData().getMarketOverviewDay().getDayDiscountAmount());
            shangHai.setDay_discount_num(notice.getData().getMarketOverviewDay().getDayDiscountNum());
            shangHai.setDay_trade_amount(notice.getData().getMarketOverviewDay().getDayTradeAmount());
            shangHai.setDay_trade_num(notice.getData().getMarketOverviewDay().getDayTradeNum());
            shangHai.setEcds_mem_num(notice.getData().getMarketOverviewHead().getEcdsMemNum());
            shangHai.setSts_date(reptileSh.changeWeek(notice.getData().getMarketOverviewHead().getStsDate()));
            shangHai.setTrx_mem_num(notice.getData().getMarketOverviewHead().getTrxMemNum());
            shangHai.setYear_accept_amount(notice.getData().getMarketOverviewYear().getYearAcceptAmount());
            shangHai.setYear_accept_num(notice.getData().getMarketOverviewYear().getYearAcceptNum());
            shangHai.setYear_discount_amount(notice.getData().getMarketOverviewYear().getYerDiscountAmount());
            shangHai.setYear_discount_num(notice.getData().getMarketOverviewYear().getYearDiscountNum());
            shangHai.setYear_trade_amount(notice.getData().getMarketOverviewYear().getYearTradeAmount());
            shangHai.setYear_trade_num(notice.getData().getMarketOverviewYear().getYearTradeNum());
            shangHai.setId(UUID.randomUUID().toString().replaceAll("-",""));
            result = shangHaiMapper.addValues(shangHai);
        }else{
            result = 0;
        }
        return result;
    }

}
