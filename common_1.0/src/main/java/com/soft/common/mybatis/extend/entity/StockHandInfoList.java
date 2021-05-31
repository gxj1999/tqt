package com.soft.common.mybatis.extend.entity;

import com.soft.common.model.TStockHand;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 实际库存信息
 *
 */
@Data
public class StockHandInfoList extends TStockHand{
    private static final long serialVersionUID = 1L;
    //可出货数量
    private BigDecimal chargeQty;
    //商品编号
    private String prodId;
    //已出货数量
    private BigDecimal allcQty;
    //在库类别
    private String stkClsSub;

    public BigDecimal getChargeQty() {
        return chargeQty;
    }

    public void setChargeQty(BigDecimal chargeQty) {
        this.chargeQty = chargeQty;
    }

    public String getProdId() {
        return prodId;
    }

    public void setProdId(String prodId) {
        this.prodId = prodId;
    }

    public BigDecimal getAllcQty() {
        return allcQty;
    }

    public void setAllcQty(BigDecimal allcQty) {
        this.allcQty = allcQty;
    }

    public String getStkClsSub() {
        return stkClsSub;
    }

    public void setStkClsSub(String stkClsSub) {
        this.stkClsSub = stkClsSub;
    }
}
