package com.soft.common.mybatis.extend.entity;



import com.soft.common.model.TCustomerAppraise;
import lombok.Data;

/**
 * 采购信息
 *
 */
@Data
public class TCustomerAppraiseList extends TCustomerAppraise {
    private static final long serialVersionUID = 1L;
    //组织部门编号
    private String orgId;
    //组织部门名称
    private String orgNm;
    //客户名称
    private String customerNm;

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

    public String getCustomerNm() {
        return customerNm;
    }

    public void setCustomerNm(String customerNm) {
        this.customerNm = customerNm;
    }

    public String getAppTypeNm() {
        return appTypeNm;
    }

    public void setAppTypeNm(String appTypeNm) {
        this.appTypeNm = appTypeNm;
    }
}
