package com.soft.common.mybatis.extend.entity;


import com.soft.common.model.TSupplierAppraise;
import lombok.Data;

/**
 * 供应商评价
 *
 */
@Data
public class TSupplierAppraiseList extends TSupplierAppraise {
    private static final long serialVersionUID = 1L;
    //组织部门编号
    private String orgId;
    //组织部门名称
    private String orgNm;
    //供应商名称
    private String supplierNm;

    private String  appTypeNm;

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getOrgNm() {
        return orgNm;
    }

    public void setOrgNm(String orgNm) {
        this.orgNm = orgNm;
    }

    public String getSupplierNm() {
        return supplierNm;
    }

    public void setSupplierNm(String supplierNm) {
        this.supplierNm = supplierNm;
    }

    public String getAppTypeNm() {
        return appTypeNm;
    }

    public void setAppTypeNm(String appTypeNm) {
        this.appTypeNm = appTypeNm;
    }
}
