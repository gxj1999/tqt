package com.soft.common.mybatis.extend.entity;


import com.soft.common.model.TSellOrdMainmaterialLine;
import com.soft.common.model.TSellOrdSpecsLine;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * 销售订单信息
 *
 */
@Data
public class SellOrderList {
    private static final long serialVersionUID = 1L;
    //订单主料明细
    public List<TSellOrdMainmaterialLine> children1;

    //订单规格明细
    public List<TSellOrdSpecsLine> children3;

    //编号
    private String id;

    //中心编号
    private String cntrCd;

    //销售订单号
    private String sellOrdCd;

    //客户编号
    private String customerCd;

    //订单类型
    private String ordType;

    //销售类型
    private String sellType;

    //客供订单号
    private String ordFrmcd;

    //短溢装上限
    private String overchargeUp;

    //短溢装下限
    private String overchargeDown;

    //交货地点
    private String deliveryAddr;

    //接单日期
    private Date takingDt;

    //交期
    private Date deliveryDt;

    //跟单员
    private String follower;

    //出货方式
    private String deliveryType;

    //备注
    private String remarks;

    public List<TSellOrdMainmaterialLine> getChildren1() {
        return children1;
    }

    public void setChildren1(List<TSellOrdMainmaterialLine> children1) {
        this.children1 = children1;
    }

    public List<TSellOrdSpecsLine> getChildren3() {
        return children3;
    }

    public void setChildren3(List<TSellOrdSpecsLine> children3) {
        this.children3 = children3;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCntrCd() {
        return cntrCd;
    }

    public void setCntrCd(String cntrCd) {
        this.cntrCd = cntrCd;
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

    public String getOrdFrmcd() {
        return ordFrmcd;
    }

    public void setOrdFrmcd(String ordFrmcd) {
        this.ordFrmcd = ordFrmcd;
    }

    public String getOverchargeUp() {
        return overchargeUp;
    }

    public void setOverchargeUp(String overchargeUp) {
        this.overchargeUp = overchargeUp;
    }

    public String getOverchargeDown() {
        return overchargeDown;
    }

    public void setOverchargeDown(String overchargeDown) {
        this.overchargeDown = overchargeDown;
    }

    public String getDeliveryAddr() {
        return deliveryAddr;
    }

    public void setDeliveryAddr(String deliveryAddr) {
        this.deliveryAddr = deliveryAddr;
    }

    public Date getTakingDt() {
        return takingDt;
    }

    public void setTakingDt(Date takingDt) {
        this.takingDt = takingDt;
    }

    public Date getDeliveryDt() {
        return deliveryDt;
    }

    public void setDeliveryDt(Date deliveryDt) {
        this.deliveryDt = deliveryDt;
    }

    public String getFollower() {
        return follower;
    }

    public void setFollower(String follower) {
        this.follower = follower;
    }

    public String getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
