package com.soft.common.mybatis.extend.entity;


import com.soft.common.model.MUserRole;

/**
 * 用户体类
 *
 */
public class MUserRoleEx extends MUserRole {
    private static final long serialVersionUID = 1L;
    //共通名称
    private String generalNm;

    //共通code
    private String generalCd;


    //登录ID
    private String loginId;


    //角色名称
    private String roleNm;

    //组织部门ID
    private String orgId;

    //组织部门名称
    private String orgNm;

    //组织部门名称
    private String orgCdDis;


    /**
     * add by xhs 2020-09-11
     * 班组名称
     * @return
     */
    private String bzNm;

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

    public String getRoleNm() {
        return roleNm;
    }

    public void setRoleNm(String roleNm) {
        this.roleNm = roleNm;
    }

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

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getOrgCdDis() {
        return orgCdDis;
    }

    public void setOrgCdDis(String orgCdDis) {
        this.orgCdDis = orgCdDis;
    }

    public String getBzNm() {
        return bzNm;
    }

    public void setBzNm(String bzNm) {
        this.bzNm = bzNm;
    }
}
