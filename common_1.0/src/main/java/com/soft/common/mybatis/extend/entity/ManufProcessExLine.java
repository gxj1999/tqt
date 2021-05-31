package com.soft.common.mybatis.extend.entity;


import com.soft.common.model.MManufProcess;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * 生产流程实体类
 *
 */
@ApiModel(value = "生产流程和标准流程信息")
@Data
public class ManufProcessExLine extends MManufProcess {
    private static final long serialVersionUID = 1L;
    @ApiModelProperty(value = "流程顺序")
    private int processSort;
    @ApiModelProperty(value = "标准生产流程编号")
    private String standardMpId;
    @ApiModelProperty(value = "执行部门")
    private String orgNm;

    public int getProcessSort() {
        return processSort;
    }

    public void setProcessSort(int processSort) {
        this.processSort = processSort;
    }

    public String getStandardMpId() {
        return standardMpId;
    }

    public void setStandardMpId(String standardMpId) {
        this.standardMpId = standardMpId;
    }

    public String getOrgNm() {
        return orgNm;
    }

    public void setOrgNm(String orgNm) {
        this.orgNm = orgNm;
    }
}
