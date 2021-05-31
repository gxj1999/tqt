package com.soft.common.mybatis.extend.entity;


import com.soft.common.model.MOutFactoryLine;
import lombok.Data;

/**
 * 商品实体类
 *
 */
@Data
public class MOutFactoryLineEx extends MOutFactoryLine {
    private static final long serialVersionUID = 1L;
    //商品名
    private String prodNm;
    //审批者
    private String acceptNm;
    //商品分类ID
    private String prodClassId;
    //商品编号
    private String prodCdDis;
    public String getProdNm() {
        return prodNm;
    }

    public void setProdNm(String prodNm) {
        this.prodNm = prodNm;
    }

    public String getAcceptNm() {
        return acceptNm;
    }

    public void setAcceptNm(String acceptNm) {
        this.acceptNm = acceptNm;
    }

    public String getProdClassId() {
        return prodClassId;
    }

    public void setProdClassId(String prodClassId) {
        this.prodClassId = prodClassId;
    }

    public String getProdCdDis() {
        return prodCdDis;
    }

    public void setProdCdDis(String prodCdDis) {
        this.prodCdDis = prodCdDis;
    }
}
