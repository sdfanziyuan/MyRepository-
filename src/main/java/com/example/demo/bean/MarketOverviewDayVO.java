package com.example.demo.bean;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author sdpjw
 * @email ljf8838@163.com
 * @date 2020/11/24 9:49
 */
public class MarketOverviewDayVO {

    private BigDecimal dayAcceptAmount;
    private int  dayAcceptNum;
    private BigDecimal  dayDiscountAmount;
    private int dayDiscountNum;
    private BigDecimal  dayTradeAmount;
    private int dayTradeNum;

    public BigDecimal getDayAcceptAmount() {
        return dayAcceptAmount;
    }

    public void setDayAcceptAmount(BigDecimal dayAcceptAmount) {
        this.dayAcceptAmount = dayAcceptAmount;
    }

    public int getDayAcceptNum() {
        return dayAcceptNum;
    }

    public void setDayAcceptNum(int dayAcceptNum) {
        this.dayAcceptNum = dayAcceptNum;
    }

    public BigDecimal getDayDiscountAmount() {
        return dayDiscountAmount;
    }

    public void setDayDiscountAmount(BigDecimal dayDiscountAmount) {
        this.dayDiscountAmount = dayDiscountAmount;
    }

    public int getDayDiscountNum() {
        return dayDiscountNum;
    }

    public void setDayDiscountNum(int dayDiscountNum) {
        this.dayDiscountNum = dayDiscountNum;
    }

    public BigDecimal getDayTradeAmount() {
        return dayTradeAmount;
    }

    public void setDayTradeAmount(BigDecimal dayTradeAmount) {
        this.dayTradeAmount = dayTradeAmount;
    }

    public int getDayTradeNum() {
        return dayTradeNum;
    }

    public void setDayTradeNum(int dayTradeNum) {
        this.dayTradeNum = dayTradeNum;
    }
}
