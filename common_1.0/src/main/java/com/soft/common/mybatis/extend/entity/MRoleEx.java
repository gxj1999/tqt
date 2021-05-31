package com.soft.common.mybatis.extend.entity;

import com.soft.common.model.MRole;
import lombok.Data;

@Data
public class MRoleEx extends MRole{
    private static final long serialVersionUID = 1L;
    private String orgCdDis;
    private String orgNm;
    private String orgAbbr;
    private String orgEngNm;

    public String getOrgCdDis() {
        return orgCdDis;
    }

    public void setOrgCdDis(String orgCdDis) {
        this.orgCdDis = orgCdDis;
    }

    public String getOrgNm() {
        return orgNm;
    }

    public void setOrgNm(String orgNm) {
        this.orgNm = orgNm;
    }

    public String getOrgAbbr() {
        return orgAbbr;
    }

    public void setOrgAbbr(String orgAbbr) {
        this.orgAbbr = orgAbbr;
    }

    public String getOrgEngNm() {
        return orgEngNm;
    }

    public void setOrgEngNm(String orgEngNm) {
        this.orgEngNm = orgEngNm;
    }
}
