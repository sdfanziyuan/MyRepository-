package com.example.demo.bean;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author sdpjw
 * @email ljf8838@163.com
 * @date 2020/11/24 9:50
 */
public class MarketOverviewYearVO {

        private BigDecimal yearAcceptAmount;
        private int  yearAcceptNum;
        private int  yearDiscountNum;
        private BigDecimal yearTradeAmount;
        private int yearTradeNum;
        private BigDecimal  yerDiscountAmount;

    public BigDecimal getYearAcceptAmount() {
        return yearAcceptAmount;
    }

    public void setYearAcceptAmount(BigDecimal yearAcceptAmount) {
        this.yearAcceptAmount = yearAcceptAmount;
    }

    public int getYearAcceptNum() {
        return yearAcceptNum;
    }

    public void setYearAcceptNum(int yearAcceptNum) {
        this.yearAcceptNum = yearAcceptNum;
    }

    public int getYearDiscountNum() {
        return yearDiscountNum;
    }

    public void setYearDiscountNum(int yearDiscountNum) {
        this.yearDiscountNum = yearDiscountNum;
    }

    public BigDecimal getYearTradeAmount() {
        return yearTradeAmount;
    }

    public void setYearTradeAmount(BigDecimal yearTradeAmount) {
        this.yearTradeAmount = yearTradeAmount;
    }

    public int getYearTradeNum() {
        return yearTradeNum;
    }

    public void setYearTradeNum(int yearTradeNum) {
        this.yearTradeNum = yearTradeNum;
    }

    public BigDecimal getYerDiscountAmount() {
        return yerDiscountAmount;
    }

    public void setYerDiscountAmount(BigDecimal yerDiscountAmount) {
        this.yerDiscountAmount = yerDiscountAmount;
    }
}
