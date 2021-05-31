package com.soft.common.mybatis.extend.entity;

import com.soft.common.model.TProofingContactLine;
import lombok.Data;

/**
 * 打样联系单明细
 *
 */
@Data
public class ProofingContactInfo extends TProofingContactLine {
    private static final long serialVersionUID = 1L;
    //编号
    private String id;

    //客户编号
    private String customerCd;

    //品名
    private String prodNm;

    //销售订单号
    private String sellOrdCd;

    //跟单员
    private String follower;

    //颜色组合
    private String colorCombiner;

    //备注
    private String remarks;

    //销售主料明细编号
    private String sellOrdMainmaterialCd;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomerCd() {
        return customerCd;
    }

    public void setCustomerCd(String customerCd) {
        this.customerCd = customerCd;
    }

    public String getProdNm() {
        return prodNm;
    }

    public void setProdNm(String prodNm) {
        this.prodNm = prodNm;
    }

    public String getSellOrdCd() {
        return sellOrdCd;
    }

    public void setSellOrdCd(String sellOrdCd) {
        this.sellOrdCd = sellOrdCd;
    }

    public String getFollower() {
        return follower;
    }

    public void setFollower(String follower) {
        this.follower = follower;
    }

    public String getColorCombiner() {
        return colorCombiner;
    }

    public void setColorCombiner(String colorCombiner) {
        this.colorCombiner = colorCombiner;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getSellOrdMainmaterialCd() {
        return sellOrdMainmaterialCd;
    }

    public void setSellOrdMainmaterialCd(String sellOrdMainmaterialCd) {
        this.sellOrdMainmaterialCd = sellOrdMainmaterialCd;
    }
}
