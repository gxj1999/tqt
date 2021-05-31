package com.soft.common.mybatis.extend.entity;


import com.soft.common.model.MProductClass;
import lombok.Data;

import java.util.List;

/**
 * 商品实体类
 *
 */
@Data
public class MProductClassEx extends MProductClass {
    private static final long serialVersionUID = 1L;

    //共通名称
    private String generalNm;

    //共通code
    private String generalCd;
    //商品类型名称
    private String prodTypeNm;
    //计量单位
    private String unitNm;

    List<MProductClass> children;
//    private String prodClassNm;
    private String keyProdClassNm;
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

    public String getProdTypeNm() {
        return prodTypeNm;
    }

    public void setProdTypeNm(String prodTypeNm) {
        this.prodTypeNm = prodTypeNm;
    }

    public String getUnitNm() {
        return unitNm;
    }

    public void setUnitNm(String unitNm) {
        this.unitNm = unitNm;
    }

    public List<MProductClass> getChildren() {
        return children;
    }

    public void setChildren(List<MProductClass> children) {
        this.children = children;
    }

    public String getKeyProdClassNm() {
        return keyProdClassNm;
    }

    public void setKeyProdClassNm(String keyProdClassNm) {
        this.keyProdClassNm = keyProdClassNm;
    }
}
