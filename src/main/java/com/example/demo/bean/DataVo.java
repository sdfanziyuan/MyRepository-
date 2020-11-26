package com.example.demo.bean;

import lombok.Data;

/**
 * @author sdpjw
 * @email ljf8838@163.com
 * @date 2020/11/21 18:10
 */
@Data
public class DataVo {
    private MarketOverviewDayVO marketOverviewDay;
    private MarketOverviewHeadVO marketOverviewHead;
    private MarketOverviewYearVO marketOverviewYear;

    public MarketOverviewDayVO getMarketOverviewDay() {
        return marketOverviewDay;
    }

    public void setMarketOverviewDay(MarketOverviewDayVO marketOverviewDay) {
        this.marketOverviewDay = marketOverviewDay;
    }

    public MarketOverviewHeadVO getMarketOverviewHead() {
        return marketOverviewHead;
    }

    public void setMarketOverviewHead(MarketOverviewHeadVO marketOverviewHead) {
        this.marketOverviewHead = marketOverviewHead;
    }

    public MarketOverviewYearVO getMarketOverviewYear() {
        return marketOverviewYear;
    }

    public void setMarketOverviewYear(MarketOverviewYearVO marketOverviewYear) {
        this.marketOverviewYear = marketOverviewYear;
    }
}





