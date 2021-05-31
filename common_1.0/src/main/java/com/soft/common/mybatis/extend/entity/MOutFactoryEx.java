package com.soft.common.mybatis.extend.entity;


import com.soft.common.model.MOutFactory;
import com.soft.common.model.MOutFactoryLine;
import lombok.Data;

import java.util.List;

/**
 * 外发工厂实体类
 *
 */
@Data
public class MOutFactoryEx extends MOutFactory {
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

    //商品名称
    private String prodNm;

    //本公司联络人
    private String ownUserNm;

    //审批人
    private String acceptNm;
    //外发工厂类型名称
    private String outFactoryTypeNm;
    //邮编
//    private String zipCodeNm;
    //国家
    private String cntryCdNm;
    //结算方式
    private String paymentTypeNm;


    //外发工厂明细
    public List<MOutFactoryLineEx> children;

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

    public String getProdNm() {
        return prodNm;
    }

    public void setProdNm(String prodNm) {
        this.prodNm = prodNm;
    }

    public String getOwnUserNm() {
        return ownUserNm;
    }

    public void setOwnUserNm(String ownUserNm) {
        this.ownUserNm = ownUserNm;
    }

    public String getAcceptNm() {
        return acceptNm;
    }

    public void setAcceptNm(String acceptNm) {
        this.acceptNm = acceptNm;
    }

    public String getOutFactoryTypeNm() {
        return outFactoryTypeNm;
    }

    public void setOutFactoryTypeNm(String outFactoryTypeNm) {
        this.outFactoryTypeNm = outFactoryTypeNm;
    }

//    public String getZipCodeNm() {
//        return zipCodeNm;
//    }
//
//    public void setZipCodeNm(String zipCodeNm) {
//        this.zipCodeNm = zipCodeNm;
//    }

    public String getCntryCdNm() {
        return cntryCdNm;
    }

    public void setCntryCdNm(String cntryCdNm) {
        this.cntryCdNm = cntryCdNm;
    }

    public String getPaymentTypeNm() {
        return paymentTypeNm;
    }

    public void setPaymentTypeNm(String paymentTypeNm) {
        this.paymentTypeNm = paymentTypeNm;
    }

    public List<MOutFactoryLineEx> getChildren() {
        return children;
    }

    public void setChildren(List<MOutFactoryLineEx> children) {
        this.children = children;
    }
}
