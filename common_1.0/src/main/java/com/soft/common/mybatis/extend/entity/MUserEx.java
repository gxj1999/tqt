package com.soft.common.mybatis.extend.entity;


import com.soft.common.model.MUser;
import lombok.Data;

/**
 * 用户体类
 *
 */
@Data
public class MUserEx extends MUser {
    private static final long serialVersionUID = 1L;
    //共通名称
    private String generalNm;

    //共通code
    private String generalCd;

    //登录ID
    private String loginId;

    //角色ID
    private String roleId;

    //角色名称
    private String roleNm;

    //组织部门ID
    private String orgId;

    //组织部门名称
    private String orgNm;

    //默认
    private String defCpyFlg;

    private String sexCdNm;
    private String userKbnNm;

    /**
     * add by xhs 2020-09-11
     * 班组名称
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
    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
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

    public String getDefCpyFlg() {
        return defCpyFlg;
    }

    public void setDefCpyFlg(String defCpyFlg) {
        this.defCpyFlg = defCpyFlg;
    }

    public String getSexCdNm() {
        return sexCdNm;
    }

    public void setSexCdNm(String sexCdNm) {
        this.sexCdNm = sexCdNm;
    }

    public String getUserKbnNm() {
        return userKbnNm;
    }

    public void setUserKbnNm(String userKbnNm) {
        this.userKbnNm = userKbnNm;
    }

    public String getBzNm() {
        return bzNm;
    }

    public void setBzNm(String bzNm) {
        this.bzNm = bzNm;
    }
}
