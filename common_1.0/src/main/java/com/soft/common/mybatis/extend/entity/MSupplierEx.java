package com.soft.common.mybatis.extend.entity;


import com.soft.common.model.MSupplier;
import lombok.Data;

import java.util.List;

/**
 * 供应商实体类
 *
 */
@Data
public class MSupplierEx extends MSupplier {
    private static final long serialVersionUID = 1L;
    //供应商明细
    public List<MSupplierLineEx> children;
    //供应商评价等级
    private String levelNm;
    //姓名
    private String userNm;
    //用户ID
    private String userId;
    //供应商类型名称
    private String supplierTypeNm;
    //结算方式
    private String paymentTypeNm;
    //本公司联络人
    private String ownUserIdNm;
    //审批人
    private String acceptIdNm;
    //国家
    private String cntryCdNm;
    //商品资质认证
    private String prodQc;

    public List<MSupplierLineEx> getChildren() {
        return children;
    }

    public void setChildren(List<MSupplierLineEx> children) {
        this.children = children;
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

    public String getSupplierTypeNm() {
        return supplierTypeNm;
    }

    public void setSupplierTypeNm(String supplierTypeNm) {
        this.supplierTypeNm = supplierTypeNm;
    }

    public String getPaymentTypeNm() {
        return paymentTypeNm;
    }

    public void setPaymentTypeNm(String paymentTypeNm) {
        this.paymentTypeNm = paymentTypeNm;
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

    public String getCntryCdNm() {
        return cntryCdNm;
    }

    public void setCntryCdNm(String cntryCdNm) {
        this.cntryCdNm = cntryCdNm;
    }

    public String getProdQc() {
        return prodQc;
    }

    public void setProdQc(String prodQc) {
        this.prodQc = prodQc;
    }
}
