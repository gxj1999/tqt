package com.soft.common.mybatis.extend.entity;


import com.soft.common.model.TReceiptOrderHead;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 预定入库信息
 *
 */
@Data
public class ReceiptOrderInfoList extends TReceiptOrderHead{
    private static final long serialVersionUID = 1L;
    //备注
    private String remark;
    //实际入库总毛重
    private BigDecimal sumGweight;
    //实际入库总净重
    private BigDecimal sumNweight;
    //实际入库总数量
    private BigDecimal sumQty;
    //供应商
    private String supplierNm;
    //客户
    private String customerNm;
    //入库单状态
    private String rcvCLsNm;
    //入库类型
    private String rcvTypeNm;
    //仓库
    private String whNm;
    //关联单据类型
    private String forTypeNm;
    //预定入库单打印
    private String printTypeNm;
    //外发工厂名称
    private String outFactoryNm;
    //组织部门名称
    private String orgNm;
    //记录人
    private String userNm;

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

    public String getRcvCLsNm() {
        return rcvCLsNm;
    }

    public void setRcvCLsNm(String rcvCLsNm) {
        this.rcvCLsNm = rcvCLsNm;
    }

    public String getRcvTypeNm() {
        return rcvTypeNm;
    }

    public void setRcvTypeNm(String rcvTypeNm) {
        this.rcvTypeNm = rcvTypeNm;
    }

    public String getWhNm() {
        return whNm;
    }

    public void setWhNm(String whNm) {
        this.whNm = whNm;
    }

    public String getForTypeNm() {
        return forTypeNm;
    }

    public void setForTypeNm(String forTypeNm) {
        this.forTypeNm = forTypeNm;
    }

    public String getPrintTypeNm() {
        return printTypeNm;
    }

    public void setPrintTypeNm(String printTypeNm) {
        this.printTypeNm = printTypeNm;
    }

    public String getOutFactoryNm() {
        return outFactoryNm;
    }

    public void setOutFactoryNm(String outFactoryNm) {
        this.outFactoryNm = outFactoryNm;
    }

    public String getOrgNm() {
        return orgNm;
    }

    public void setOrgNm(String orgNm) {
        this.orgNm = orgNm;
    }

    public String getUserNm() {
        return userNm;
    }

    public void setUserNm(String userNm) {
        this.userNm = userNm;
    }
}
