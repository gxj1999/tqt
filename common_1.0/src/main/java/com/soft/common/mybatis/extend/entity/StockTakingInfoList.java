package com.soft.common.mybatis.extend.entity;

import com.soft.common.model.TStockTaking;
import lombok.Data;

/**
 * 盘点信息
 *
 */
@Data
public class StockTakingInfoList extends TStockTaking{
    private static final long serialVersionUID = 1L;
    //备注
    private String remark;
    //盘点状态名称
    private String takCLsNm;
    //盘点差异区分名称
    private String takFlgNm;
    //记录人
    private String userNm;
    //仓库名称
    private String whNm;

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getTakCLsNm() {
        return takCLsNm;
    }

    public void setTakCLsNm(String takCLsNm) {
        this.takCLsNm = takCLsNm;
    }

    public String getTakFlgNm() {
        return takFlgNm;
    }

    public void setTakFlgNm(String takFlgNm) {
        this.takFlgNm = takFlgNm;
    }

    public String getUserNm() {
        return userNm;
    }

    public void setUserNm(String userNm) {
        this.userNm = userNm;
    }

    public String getWhNm() {
        return whNm;
    }

    public void setWhNm(String whNm) {
        this.whNm = whNm;
    }
}
