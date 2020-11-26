package com.example.demo.bean;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author sdpjw
 * @email ljf8838@163.com
 * @date 2020/11/24 9:50
 */
public class MarketOverviewHeadVO {

    private int ecdsMemNum;
    private String stsDate;
    private int trxMemNum;

    public int getEcdsMemNum() {
        return ecdsMemNum;
    }

    public void setEcdsMemNum(int ecdsMemNum) {
        this.ecdsMemNum = ecdsMemNum;
    }

    public String getStsDate() {
        return stsDate;
    }

    public void setStsDate(String stsDate) {
        this.stsDate = stsDate;
    }

    public int getTrxMemNum() {
        return trxMemNum;
    }

    public void setTrxMemNum(int trxMemNum) {
        this.trxMemNum = trxMemNum;
    }
}
