package com.soft.common.mybatis.extend.entity;


import com.soft.common.model.TPurchaseOrd;

/**
 * 采购信息
 *
 */
public class TPurchaseOrdList extends TPurchaseOrd {
    private static final long serialVersionUID = 1L;
    //共通名称
    private String generalNm;

    //共通code
    private String generalCd;

    //商品名称
    private String prodNm;

    //供应商名称
    private String supplierNm;

    //评价标志
    private String falg;
    //价格
    private String amount;

    //预定入库单号
    private String  rcvOrdNum;

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

    public String getProdNm() {
        return prodNm;
    }

    public void setProdNm(String prodNm) {
        this.prodNm = prodNm;
    }

    public String getSupplierNm() {
        return supplierNm;
    }

    public void setSupplierNm(String supplierNm) {
        this.supplierNm = supplierNm;
    }

    public String getFlag() {
        return falg;
    }

    public void setFlag(String falg) {
        this.falg = falg;
    }
    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getRcvOrdNum() {
        return rcvOrdNum;
    }

    public void setRcvOrdNum(String rcvOrdNum) {
        this.rcvOrdNum = rcvOrdNum;
    }
}
