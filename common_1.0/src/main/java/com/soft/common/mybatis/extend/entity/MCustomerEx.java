package com.soft.common.mybatis.extend.entity;


import com.soft.common.model.MCustomer;
import lombok.Data;

/**
 * 供应商实体类
 *
 */
@Data
public class MCustomerEx extends MCustomer {
    private static final long serialVersionUID = 1L;
    //共通名称
    private String generalNm;

    //共通code
    private String generalCd;

    //供应商评价等级
    private String levelNm;

    //姓名
    private String userNm;

    //用户ID
    private String userId;
    //用户类型名称
    private String customerTypeNm;
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

    public String getUserNm() {
        return userNm;
    }

    public void setUserNm(String userNm) {
        this.userNm = userNm;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCustomerTypeNm() {
        return customerTypeNm;
    }

    public void setCustomerTypeNm(String customerTypeNm) {
        this.customerTypeNm = customerTypeNm;
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
