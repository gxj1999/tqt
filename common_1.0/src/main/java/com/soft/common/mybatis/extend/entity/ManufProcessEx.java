package com.soft.common.mybatis.extend.entity;


import com.soft.common.model.MManufProcess;
import com.soft.common.model.MProductClass;
import lombok.Data;

import java.util.List;

/**
 * 生产流程实体类
 *
 */
@Data
public class ManufProcessEx extends MManufProcess {
    private static final long serialVersionUID = 1L;
    //共通名称
    private String generalNm;
    //共通code
    private String generalCd;

    private String manufProcessClsNm;

    List<MManufProcess> children;
    private String keyManufProcessNm;

    private String orgNm;

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

    public List<MManufProcess> getChildren() {
        return children;
    }

    public void setChildren(List<MManufProcess> children) {
        this.children = children;
    }

    public String getKeyManufProcessNm() {
        return keyManufProcessNm;
    }

    public void setKeyManufProcessNm(String keyManufProcessNm) {
        this.keyManufProcessNm = keyManufProcessNm;
    }

    public String getManufProcessClsNm() {
        return manufProcessClsNm;
    }

    public void setManufProcessClsNm(String manufProcessClsNm) {
        this.manufProcessClsNm = manufProcessClsNm;
    }

    public String getOrgNm() {
        return orgNm;
    }

    public void setOrgNm(String orgNm) {
        this.orgNm = orgNm;
    }
}
