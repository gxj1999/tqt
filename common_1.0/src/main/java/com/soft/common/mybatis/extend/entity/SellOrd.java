package com.soft.common.mybatis.extend.entity;

import lombok.Data;

/**
 * 销售订单实体类
 *
 */
@Data
public class SellOrd {
    private static final long serialVersionUID = 1L;
    //编号
    private String id;

    //销售订单号
    private String sellOrdCd;

    //客户编号
    private String customerCd;

    //订单类型
    private String ordType;

    //销售类型
    private String sellType;

    //接单日期
    private String takingDt;

    //交期
    private String deliveryDt;

    //出货方式
    private String deliveryType;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSellOrdCd() {
        return sellOrdCd;
    }

    public void setSellOrdCd(String sellOrdCd) {
        this.sellOrdCd = sellOrdCd;
    }

    public String getCustomerCd() {
        return customerCd;
    }

    public void setCustomerCd(String customerCd) {
        this.customerCd = customerCd;
    }

    public String getOrdType() {
        return ordType;
    }

    public void setOrdType(String ordType) {
        this.ordType = ordType;
    }

    public String getSellType() {
        return sellType;
    }

    public void setSellType(String sellType) {
        this.sellType = sellType;
    }

    public String getTakingDt() {
        return takingDt;
    }

    public void setTakingDt(String takingDt) {
        this.takingDt = takingDt;
    }

    public String getDeliveryDt() {
        return deliveryDt;
    }

    public void setDeliveryDt(String deliveryDt) {
        this.deliveryDt = deliveryDt;
    }

    public String getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
    }
}

