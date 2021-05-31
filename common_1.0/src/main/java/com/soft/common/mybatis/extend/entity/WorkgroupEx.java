package com.soft.common.mybatis.extend.entity;

import com.soft.common.model.MWorkgroup;

/**
 * @Author: xhs
 * @Date: 2020/9/10 0010 17:51
 * @Desc:
 * @Veision: JDK 1.8
 */
public class WorkgroupEx extends MWorkgroup {
    /**
     * 中心名称
     */
    private String cntrNm;

    /**
     * 所属组织
     */
    private String orgNm;

    /**
     * 负责人
     */
    private String userNm;

    public String getCntrNm() {
        return cntrNm;
    }

    public void setCntrNm(String cntrNm) {
        this.cntrNm = cntrNm;
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
