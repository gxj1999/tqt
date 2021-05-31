package com.soft.common.mybatis.extend.entity;


import com.soft.common.model.MCarrierLine;
import lombok.Data;


/**
 * 物流公司实体类
 *
 */
@Data
public class MCarrierLineEx extends MCarrierLine {
    //审批人
    private String acceptNm;
    //计量单位
    private String unitNm;

    public String getAcceptNm() {
        return acceptNm;
    }

    public void setAcceptNm(String acceptNm) {
        this.acceptNm = acceptNm;
    }

    public String getUnitNm() {
        return unitNm;
    }

    public void setUnitNm(String unitNm) {
        this.unitNm = unitNm;
    }
}
