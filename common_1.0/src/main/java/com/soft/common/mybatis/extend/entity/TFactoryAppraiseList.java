package com.soft.common.mybatis.extend.entity;



import com.soft.common.model.TFactoryAppraise;
import lombok.Data;

/**
 * 工厂评价
 *
 */
@Data
public class TFactoryAppraiseList extends TFactoryAppraise {
    private static final long serialVersionUID = 1L;
    //组织部门编号
    private String orgId;
    //组织部门名称
    private String orgNm;
    //客户名称
    private String factoryNm;

    private String appraiseTypeNm;

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

    public String getFactoryNm() {
        return factoryNm;
    }

    public void setFactoryNm(String factoryNm) {
        this.factoryNm = factoryNm;
    }

    public String getAppraiseTypeNm() {
        return appraiseTypeNm;
    }

    public void setAppraiseTypeNm(String appraiseTypeNm) {
        this.appraiseTypeNm = appraiseTypeNm;
    }
}
