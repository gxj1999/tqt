package com.soft.common.mybatis.extend.entity;


import com.soft.common.model.TShipOrderHead;
import lombok.Data;

import java.util.List;

/**
 * 预定出库信息
 *
 */
@Data
public class ShipOrderDetailList extends TShipOrderHead{
    private static final long serialVersionUID = 1L;
    //备注
    private String remark;
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
    //出库单明细编号
    private String shpOrdLinNum;
    //记录人
    private String lot2;
    private List<ShipOrderLineDetail> children;

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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

    public String getShpOrdLinNum() {
        return shpOrdLinNum;
    }

    public void setShpOrdLinNum(String shpOrdLinNum) {
        this.shpOrdLinNum = shpOrdLinNum;
    }

    public String getLot2() {
        return lot2;
    }

    public void setLot2(String lot2) {
        this.lot2 = lot2;
    }

    public List<ShipOrderLineDetail> getChildren() {
        return children;
    }

    public void setChildren(List<ShipOrderLineDetail> children) {
        this.children = children;
    }
}
