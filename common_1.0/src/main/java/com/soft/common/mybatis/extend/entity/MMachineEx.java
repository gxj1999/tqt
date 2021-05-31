package com.soft.common.mybatis.extend.entity;


import com.soft.common.model.MMachine;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 机台实体类
 *
 */
@Data
public class MMachineEx extends MMachine {
    private static final long serialVersionUID = 1L;

    //部门名称
    private String orgNm;
    //机台种类名
    private String machineTypeNm;
    //计量单位
    private String unitNm;
    //常用色系
    private String colorSystemNm;

    @ApiModelProperty(value="生产短溢装范围")
    private BigDecimal prodShortOverRange;

    public String getOrgNm() {
        return orgNm;
    }

    public void setOrgNm(String orgNm) {
        this.orgNm = orgNm;
    }

    public String getMachineTypeNm() {
        return machineTypeNm;
    }

    public void setMachineTypeNm(String machineTypeNm) {
        this.machineTypeNm = machineTypeNm;
    }

    public String getUnitNm() {
        return unitNm;
    }

    public void setUnitNm(String unitNm) {
        this.unitNm = unitNm;
    }

    public String getColorSystemNm() {
        return colorSystemNm;
    }

    public void setColorSystemNm(String colorSystemNm) {
        this.colorSystemNm = colorSystemNm;
    }

    public BigDecimal getProdShortOverRange() {
        return prodShortOverRange;
    }

    public void setProdShortOverRange(BigDecimal prodShortOverRange) {
        this.prodShortOverRange = prodShortOverRange;
    }
}
