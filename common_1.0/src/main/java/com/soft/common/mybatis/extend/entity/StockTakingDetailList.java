package com.soft.common.mybatis.extend.entity;


import com.soft.common.model.TStockTaking;
import lombok.Data;

import java.util.List;

/**
 * 盘点信息
 *
 */
@Data
public class StockTakingDetailList extends TStockTaking{
    private static final long serialVersionUID = 1L;
    //备注
    private String remark;
    //盘点状态名称
    private String takCLsNm;
    //记录人
    private String zoneNm;
    //仓库名称
    private String whNm;
    //库位名称
    private String locNm;
    //商品+纱线属性
    private String prodRemarks;
    //可出货数量+计数单位
    private String chargeQtyUnit;

    List<StockTakingLineDetailList> children;

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

    public String getZoneNm() {
        return zoneNm;
    }

    public void setZoneNm(String zoneNm) {
        this.zoneNm = zoneNm;
    }

    public String getWhNm() {
        return whNm;
    }

    public void setWhNm(String whNm) {
        this.whNm = whNm;
    }

    public String getLocNm() {
        return locNm;
    }

    public void setLocNm(String locNm) {
        this.locNm = locNm;
    }

    public String getProdRemarks() {
        return prodRemarks;
    }

    public void setProdRemarks(String prodRemarks) {
        this.prodRemarks = prodRemarks;
    }

    public String getChargeQtyUnit() {
        return chargeQtyUnit;
    }

    public void setChargeQtyUnit(String chargeQtyUnit) {
        this.chargeQtyUnit = chargeQtyUnit;
    }

    public List<StockTakingLineDetailList> getChildren() {
        return children;
    }

    public void setChildren(List<StockTakingLineDetailList> children) {
        this.children = children;
    }
}
