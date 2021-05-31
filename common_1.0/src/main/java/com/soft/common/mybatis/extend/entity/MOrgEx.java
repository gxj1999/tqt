package com.soft.common.mybatis.extend.entity;



import com.soft.common.model.MOrg;
import lombok.Data;

/**
 * 仓库实体类
 *
 */
@Data
public class MOrgEx extends MOrg {
    private static final long serialVersionUID = 1L;
    //共通名称
    private String generalNm;

    //共通code
    private String generalCd;
    //组织部门类型名称
    private String orgTypeNm;
    //是否管理部门
    private String isFinancialNm;
    //仓库名称
    private String whNm;
    //上位组织部门名称
    private String higherOrgCdNm;

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

    public String getOrgTypeNm() {
        return orgTypeNm;
    }

    public void setOrgTypeNm(String orgTypeNm) {
        this.orgTypeNm = orgTypeNm;
    }

    public String getIsFinancialNm() {
        return isFinancialNm;
    }

    public void setIsFinancialNm(String isFinancialNm) {
        this.isFinancialNm = isFinancialNm;
    }

    public String getWhNm() {
        return whNm;
    }

    public void setWhNm(String whNm) {
        this.whNm = whNm;
    }

    public String getHigherOrgCdNm() {
        return higherOrgCdNm;
    }

    public void setHigherOrgCdNm(String higherOrgCdNm) {
        this.higherOrgCdNm = higherOrgCdNm;
    }
}
