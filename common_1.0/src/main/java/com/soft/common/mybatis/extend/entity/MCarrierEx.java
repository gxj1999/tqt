package com.soft.common.mybatis.extend.entity;


import com.soft.common.model.MCarrier;
import com.soft.common.model.MCarrierLine;
import lombok.Data;

import java.util.List;

/**
 * 物流公司实体类
 *
 */
@Data
public class MCarrierEx extends MCarrier {
    private static final long serialVersionUID = 1L;
    //共通名称
    private String generalNm;

    //共通code
    private String generalCd;

    //评价等级名称
    private String levelNm;

    //用户ID
    private String userId;

    //姓名
    private String userNm;

    //物流公司类型名称
    private String carrierTypeNm;

    //物流公司明细
    public List<MCarrierLineEx> children;

    //国家
    private String cntryCdNm;
    //本公司联络人
    private String ownUserIdNm;
    //审批人
    private String acceptIdNm;
    //结算方式
    private String paymentTypeNm;

    public String getGeneralNm() {
        return generalNm;
    }

    public void setGeneralNm(String generalNm) {
        this.generalNm = generalNm;
    }

    public String getGeneralCd() {
        return generalCd;
    }

    public void setGeneralCd(String generalCd) {
        this.generalCd = generalCd;
    }

    public String getLevelNm() {
        return levelNm;
    }

    public void setLevelNm(String levelNm) {
        this.levelNm = levelNm;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserNm() {
        return userNm;
    }

    public void setUserNm(String userNm) {
        this.userNm = userNm;
    }

    public String getCarrierTypeNm() {
        return carrierTypeNm;
    }

    public void setCarrierTypeNm(String carrierTypeNm) {
        this.carrierTypeNm = carrierTypeNm;
    }

    public List<MCarrierLineEx> getChildren() {
        return children;
    }

    public void setChildren(List<MCarrierLineEx> children) {
        this.children = children;
    }

    public String getCntryCdNm() {
        return cntryCdNm;
    }

    public void setCntryCdNm(String cntryCdNm) {
        this.cntryCdNm = cntryCdNm;
    }

    public String getOwnUserIdNm() {
        return ownUserIdNm;
    }

    public void setOwnUserIdNm(String ownUserIdNm) {
        this.ownUserIdNm = ownUserIdNm;
    }

    public String getAcceptIdNm() {
        return acceptIdNm;
    }

    public void setAcceptIdNm(String acceptIdNm) {
        this.acceptIdNm = acceptIdNm;
    }

    public String getPaymentTypeNm() {
        return paymentTypeNm;
    }

    public void setPaymentTypeNm(String paymentTypeNm) {
        this.paymentTypeNm = paymentTypeNm;
    }
}
