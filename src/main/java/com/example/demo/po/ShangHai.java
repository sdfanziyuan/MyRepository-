package com.example.demo.po;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author sdpjw
 * @email ljf8838@163.com
 * @date 2020/11/23 17:56
 */

public class ShangHai {
    private String id;
    private String sts_date;
    private int ecds_mem_num;
    private int trx_mem_num;
    private int day_accept_num;
    private BigDecimal day_accept_amount;
    private int day_discount_num;
    private BigDecimal day_discount_amount;
    private int day_trade_num;
    private BigDecimal day_trade_amount;
    private int year_accept_num;
    private BigDecimal year_accept_amount;
    private int year_discount_num;
    private BigDecimal year_discount_amount;
    private int year_trade_num;
    private BigDecimal year_trade_amount;
    private Date create_time;
    private Date update_time;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSts_date() {
        return sts_date;
    }

    public void setSts_date(String sts_date) {
        this.sts_date = sts_date;
    }

    public int getEcds_mem_num() {
        return ecds_mem_num;
    }

    public void setEcds_mem_num(int ecds_mem_num) {
        this.ecds_mem_num = ecds_mem_num;
    }

    public int getTrx_mem_num() {
        return trx_mem_num;
    }

    public void setTrx_mem_num(int trx_mem_num) {
        this.trx_mem_num = trx_mem_num;
    }

    public int getDay_accept_num() {
        return day_accept_num;
    }

    public void setDay_accept_num(int day_accept_num) {
        this.day_accept_num = day_accept_num;
    }

    public BigDecimal getDay_accept_amount() {
        return day_accept_amount;
    }

    public void setDay_accept_amount(BigDecimal day_accept_amount) {
        this.day_accept_amount = day_accept_amount;
    }

    public int getDay_discount_num() {
        return day_discount_num;
    }

    public void setDay_discount_num(int day_discount_num) {
        this.day_discount_num = day_discount_num;
    }

    public BigDecimal getDay_discount_amount() {
        return day_discount_amount;
    }

    public void setDay_discount_amount(BigDecimal day_discount_amount) {
        this.day_discount_amount = day_discount_amount;
    }

    public int getDay_trade_num() {
        return day_trade_num;
    }

    public void setDay_trade_num(int day_trade_num) {
        this.day_trade_num = day_trade_num;
    }

    public BigDecimal getDay_trade_amount() {
        return day_trade_amount;
    }

    public void setDay_trade_amount(BigDecimal day_trade_amount) {
        this.day_trade_amount = day_trade_amount;
    }

    public int getYear_accept_num() {
        return year_accept_num;
    }

    public void setYear_accept_num(int year_accept_num) {
        this.year_accept_num = year_accept_num;
    }

    public BigDecimal getYear_accept_amount() {
        return year_accept_amount;
    }

    public void setYear_accept_amount(BigDecimal year_accept_amount) {
        this.year_accept_amount = year_accept_amount;
    }

    public int getYear_discount_num() {
        return year_discount_num;
    }

    public void setYear_discount_num(int year_discount_num) {
        this.year_discount_num = year_discount_num;
    }

    public BigDecimal getYear_discount_amount() {
        return year_discount_amount;
    }

    public void setYear_discount_amount(BigDecimal year_discount_amount) {
        this.year_discount_amount = year_discount_amount;
    }

    public int getYear_trade_num() {
        return year_trade_num;
    }

    public void setYear_trade_num(int year_trade_num) {
        this.year_trade_num = year_trade_num;
    }

    public BigDecimal getYear_trade_amount() {
        return year_trade_amount;
    }

    public void setYear_trade_amount(BigDecimal year_trade_amount) {
        this.year_trade_amount = year_trade_amount;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    @Override
    public String toString() {
        return "ShangHai{" +
                "id='" + id + '\'' +
                ", sts_date='" + sts_date + '\'' +
                ", ecds_mem_num=" + ecds_mem_num +
                ", trx_mem_num=" + trx_mem_num +
                ", day_accept_num=" + day_accept_num +
                ", day_accept_amount=" + day_accept_amount +
                ", day_discount_num=" + day_discount_num +
                ", day_discount_amount=" + day_discount_amount +
                ", day_trade_num=" + day_trade_num +
                ", day_trade_amount=" + day_trade_amount +
                ", year_accept_num=" + year_accept_num +
                ", year_accept_amount=" + year_accept_amount +
                ", year_discount_num=" + year_discount_num +
                ", year_discount_amount=" + year_discount_amount +
                ", year_trade_num=" + year_trade_num +
                ", year_trade_amount=" + year_trade_amount +
                ", create_time=" + create_time +
                ", update_time=" + update_time +
                '}';
    }
}
