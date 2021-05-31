package com.soft.common.mybatis.extend.entity;


import com.soft.common.model.TShipOrderHead;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 预定出库信息
 *
 */
@Data
public class ShipOrderInfoList extends TShipOrderHead{
    private static final long serialVersionUID = 1L;
    //备注
    private String remark;
    //实际出库总毛重
    private BigDecimal sumGweight;
    //实际出库总净重
    private BigDecimal sumNweight;
    //实际出库总数量
    private BigDecimal sumQty;
    //客户
    private String customerNm;
    //出库单状态
    private String shpCLsNm;
    //出库类型
    private String shpTypeNm;
    //供应商
    private String supplierNm;
    //关联单据类型
    private String forTypeNm;
    //物流单据号
    private String carrierNum;
    //仓库
    private String whNm;

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public BigDecimal getSumGweight() {
        return sumGweight;
    }

    public void setSumGweight(BigDecimal sumGweight) {
        this.sumGweight = sumGweight;
    }

    public BigDecimal getSumNweight() {
        return sumNweight;
    }

    public void setSumNweight(BigDecimal sumNweight) {
        this.sumNweight = sumNweight;
    }

    public BigDecimal getSumQty() {
        return sumQty;
    }

    public void setSumQty(BigDecimal sumQty) {
        this.sumQty = sumQty;
    }

    public String getCustomerNm() {
        return customerNm;
    }

    public void setCustomerNm(String customerNm) {
        this.customerNm = customerNm;
    }

    public String getShpCLsNm() {
        return shpCLsNm;
    }

    public void setShpCLsNm(String shpCLsNm) {
        this.shpCLsNm = shpCLsNm;
    }

    public String getShpTypeNm() {
        return shpTypeNm;
    }

    public void setShpTypeNm(String shpTypeNm) {
        this.shpTypeNm = shpTypeNm;
    }

    public String getSupplierNm() {
        return supplierNm;
    }

    public void setSupplierNm(String supplierNm) {
        this.supplierNm = supplierNm;
    }

    public String getForTypeNm() {
        return forTypeNm;
    }

    public void setForTypeNm(String forTypeNm) {
        this.forTypeNm = forTypeNm;
    }

    public String getCarrierNum() {
        return carrierNum;
    }

    public void setCarrierNum(String carrierNum) {
        this.carrierNum = carrierNum;
    }

    public String getWhNm() {
        return whNm;
    }

    public void setWhNm(String whNm) {
        this.whNm = whNm;
    }
}
