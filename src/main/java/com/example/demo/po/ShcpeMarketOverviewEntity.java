package com.example.demo.po;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
@TableName("shcpe_market_overview")
public class ShcpeMarketOverviewEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId
    private String id;

    /**
     * 市场数据时间
     */
    private String stsDate;

    /**
     * ECDS系统参与者数
     */
    private Integer ecdsMemNum;

    /**
     * 交易系统上线会员数
     */
    private Integer trxMemNum;

    /**
     * 当日承兑张数
     */
    private Integer dayAcceptNum;

    /**
     * 当日承兑金额（单位亿元）
     */
    private BigDecimal dayAcceptAmount;

    /**
     * 当日贴现张数
     */
    private Integer dayDiscountNum;

    /**
     * 当日贴现金额（单位亿元）
     */
    private BigDecimal dayDiscountAmount;

    /**
     * 当日交易笔数
     */
    private Integer dayTradeNum;

    /**
     * 当日交易金额（单位亿元）
     */
    private BigDecimal dayTradeAmount;

    /**
     * 当年累计承兑张数
     */
    private Integer yearAcceptNum;

    /**
     * 当年累计承兑金额（单位亿元）
     */
    private BigDecimal yearAcceptAmount;

    /**
     * 当年累计贴现张数
     */
    private Integer yearDiscountNum;

    /**
     * 当年累计贴现金额（单位亿元）
     */
    private BigDecimal yerDiscountAmount;

    /**
     * 当年累计交易笔数
     */
    private Integer yearTradeNum;

    /**
     * 当年累计交易金额（单位亿元）
     */
    private BigDecimal yearTradeAmount;

    private Date createTime;

    private Date updateTime;
}
