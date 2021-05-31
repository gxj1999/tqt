package com.soft.common.mybatis.extend.entity;

import com.soft.common.model.TStockBook;
import lombok.Data;

/**
 * 账面库存信息
 *
 */
@Data
public class StockBookInfoList extends TStockBook{
    private static final long serialVersionUID = 1L;
    //备注
    private String remark;
    //商品
    private String prodRemarks;
    //被预留数量
    private String allQty;
    //供应商
    private String supplierNm;
    //类型
    private String charNm;
    //仓库
    private String whNm;
    //商品名称
    private String prodNm;
    //商品名称
    private String qtyUnitNm;

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getProdRemarks() {
        return prodRemarks;
    }

    public void setProdRemarks(String prodRemarks) {
        this.prodRemarks = prodRemarks;
    }

    public String getAllQty() {
        return allQty;
    }

    public void setAllQty(String allQty) {
        this.allQty = allQty;
    }

    public String getSupplierNm() {
        return supplierNm;
    }

    public void setSupplierNm(String supplierNm) {
        this.supplierNm = supplierNm;
    }

    public String getCharNm() {
        return charNm;
    }

    public void setCharNm(String charNm) {
        this.charNm = charNm;
    }

    public String getWhNm() {
        return whNm;
    }

    public void setWhNm(String whNm) {
        this.whNm = whNm;
    }

    public String getProdNm() {
        return prodNm;
    }

    public void setProdNm(String prodNm) {
        this.prodNm = prodNm;
    }

    public String getQtyUnitNm() {
        return qtyUnitNm;
    }

    public void setQtyUnitNm(String qtyUnitNm) {
        this.qtyUnitNm = qtyUnitNm;
    }
}
