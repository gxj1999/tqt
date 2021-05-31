package com.soft.common.mybatis.extend.entity;


import com.soft.common.model.MSupplierLine;
import lombok.Data;

/**
 * 供应商实体类
 *
 */
@Data
public class MSupplierLineEx extends MSupplierLine {
    private static final long serialVersionUID = 1L;

    //商品名称
    private String prodNm;
    //商品编号
    private String prodCdDis;
    //商品分类
    private String prodClassId;
    //审批人
    private String acceptIdNm;

    public String getProdNm() {
        return prodNm;
    }

    public void setProdNm(String prodNm) {
        this.prodNm = prodNm;
    }

    public String getProdCdDis() {
        return prodCdDis;
    }

    public void setProdCdDis(String prodCdDis) {
        this.prodCdDis = prodCdDis;
    }

    public String getProdClassId() {
        return prodClassId;
    }

    public void setProdClassId(String prodClassId) {
        this.prodClassId = prodClassId;
    }

    public String getAcceptIdNm() {
        return acceptIdNm;
    }

    public void setAcceptIdNm(String acceptIdNm) {
        this.acceptIdNm = acceptIdNm;
    }
}
