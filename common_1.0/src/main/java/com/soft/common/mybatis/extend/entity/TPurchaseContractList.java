package com.soft.common.mybatis.extend.entity;


import com.soft.common.model.TPurchaseContract;

/**
 * 采购合同明细
 *
 */
public class TPurchaseContractList extends TPurchaseContract {
    private static final long serialVersionUID = 1L;
    //数量
    private String num;
    //计量单位
    private String unit;
    //纱线属性
    private String yarnRemarks;
    //商品名称
    private String prodNm;
    //供应商名称
    private String supplierNm;
    //通用编号
    private String commonCd;
    //评价等级
    private String appraisalLevel;
    //备注
    private String remarks;

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getYarnRemarks() {
        return yarnRemarks;
    }

    public void setYarnRemarks(String yarnRemarks) {
        this.yarnRemarks = yarnRemarks;
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

    public String getCommonCd() {
        return commonCd;
    }

    public void setCommonCd(String commonCd) {
        this.commonCd = commonCd;
    }

    public String getAppraisalLevel() {
        return appraisalLevel;
    }

    public void setAppraisalLevel(String appraisalLevel) {
        this.appraisalLevel = appraisalLevel;
    }

    @Override
    public String getRemarks() {
        return remarks;
    }

    @Override
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
