package com.soft.common.mybatis.extend.entity;


import com.soft.common.model.TStockBook;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 库存信息
 *
 */
@Data
public class StockInfoList extends TStockBook{
    private static final long serialVersionUID = 1L;
    private BigDecimal chargeQty;

    private String prodId;

    private BigDecimal allcQty;

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
