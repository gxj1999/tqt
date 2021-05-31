package com.soft.common.mybatis.extend.entity;


import com.soft.common.model.TStockHand;
import lombok.Data;

/**
 * 库存明细信息
 *
 */
@Data
public class StockHandList extends TStockHand {
    private static final long serialVersionUID = 1L;
    //备注
    private String remark;
    //仓库
    private String whNm;
    //区域
    private String zoneNm;
    //商品
    private String prodRemarks;
    //库位
    private String locNm;
    //类型
    private String charNm;
    //供应商
    private String supplierNm;
    //客户
    private String customerNm;
    //外发工厂
    private String outFactoryNm;
    //计量单位名称
    private String qtyUnitNm;

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getWhNm() {
        return whNm;
    }

    public void setWhNm(String whNm) {
        this.whNm = whNm;
    }

    public String getZoneNm() {
        return zoneNm;
    }

    public void setZoneNm(String zoneNm) {
        this.zoneNm = zoneNm;
    }

    public String getProdRemarks() {
        return prodRemarks;
    }

    public void setProdRemarks(String prodRemarks) {
        this.prodRemarks = prodRemarks;
    }

    public String getLocNm() {
        return locNm;
    }

    public void setLocNm(String locNm) {
        this.locNm = locNm;
    }

    public String getCharNm() {
        return charNm;
    }

    public void setCharNm(String charNm) {
        this.charNm = charNm;
    }

    public String getSupplierNm() {
        return supplierNm;
    }

    public void setSupplierNm(String supplierNm) {
        this.supplierNm = supplierNm;
    }

    public String getCustomerNm() {
        return customerNm;
    }

    public void setCustomerNm(String customerNm) {
        this.customerNm = customerNm;
    }

    public String getOutFactoryNm() {
        return outFactoryNm;
    }

    public void setOutFactoryNm(String outFactoryNm) {
        this.outFactoryNm = outFactoryNm;
    }

    public String getQtyUnitNm() {
        return qtyUnitNm;
    }

    public void setQtyUnitNm(String qtyUnitNm) {
        this.qtyUnitNm = qtyUnitNm;
    }
}
