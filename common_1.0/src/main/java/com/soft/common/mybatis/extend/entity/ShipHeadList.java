package com.soft.common.mybatis.extend.entity;


import lombok.Data;

import java.math.BigDecimal;

/**
 * 预定出库信息
 *
 */
@Data
public class ShipHeadList{
    private static final long serialVersionUID = 1L;
    //出库单主键
    private String id;
    //出库单号
    private String shpNum;
    //预定出库总毛重
    private BigDecimal sumGweOrd;
    //预定出库总净重
    private BigDecimal sumNweOrd;
    //预定出库总数重
    private BigDecimal sumQtyOrd;
    //仓库编号
    private String whId;
    //库位编号
    private String locId;
    //商品编号
    private String prodId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getShpNum() {
        return shpNum;
    }

    public void setShpNum(String shpNum) {
        this.shpNum = shpNum;
    }

    public BigDecimal getSumGweOrd() {
        return sumGweOrd;
    }

    public void setSumGweOrd(BigDecimal sumGweOrd) {
        this.sumGweOrd = sumGweOrd;
    }

    public BigDecimal getSumNweOrd() {
        return sumNweOrd;
    }

    public void setSumNweOrd(BigDecimal sumNweOrd) {
        this.sumNweOrd = sumNweOrd;
    }

    public BigDecimal getSumQtyOrd() {
        return sumQtyOrd;
    }

    public void setSumQtyOrd(BigDecimal sumQtyOrd) {
        this.sumQtyOrd = sumQtyOrd;
    }

    public String getWhId() {
        return whId;
    }

    public void setWhId(String whId) {
        this.whId = whId;
    }

    public String getLocId() {
        return locId;
    }

    public void setLocId(String locId) {
        this.locId = locId;
    }

    public String getProdId() {
        return prodId;
    }

    public void setProdId(String prodId) {
        this.prodId = prodId;
    }
}
