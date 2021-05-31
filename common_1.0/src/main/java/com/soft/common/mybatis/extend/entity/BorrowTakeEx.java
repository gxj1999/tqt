package com.soft.common.mybatis.extend.entity;


import com.soft.common.model.TBorrowTakeRegister;


/**
 * 借取样登记信息
 *
 */
public class BorrowTakeEx extends TBorrowTakeRegister{

    //编号
    private String id;

    //仓库编号
    private String whId;

    //库位编号
    private String locId;

    //商品编号
    private String prodId;

    //缸号
    private String batchNo;

    //色号
    private String colorCd;

    //色系
    private String colorSystem;

    //色别
    private String colorNM;

    //生产批次号1
    private String lot1;

    //生产批次号2
    private String lot2;

    //在库区分
    private String stkCls;

    //库位类型
    private String locType;

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }


    @Override
    public String getWhId() {
        return whId;
    }

    @Override
    public void setWhId(String whId) {
        this.whId = whId;
    }

    @Override
    public String getLocId() {
        return locId;
    }

    @Override
    public void setLocId(String locId) {
        this.locId = locId;
    }

    @Override
    public String getProdId() {
        return prodId;
    }

    @Override
    public void setProdId(String prodId) {
        this.prodId = prodId;
    }

    @Override
    public String getBatchNo() {
        return batchNo;
    }

    @Override
    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public String getColorCd() {
        return colorCd;
    }

    public void setColorCd(String colorCd) {
        this.colorCd = colorCd;
    }

    public String getColorSystem() {
        return colorSystem;
    }

    public void setColorSystem(String colorSystem) {
        this.colorSystem = colorSystem;
    }

    public String getColorNM() {
        return colorNM;
    }

    public void setColorNM(String colorNM) {
        this.colorNM = colorNM;
    }

    public String getLot1() {
        return lot1;
    }

    public void setLot1(String lot1) {
        this.lot1 = lot1;
    }

    public String getLot2() {
        return lot2;
    }

    public void setLot2(String lot2) {
        this.lot2 = lot2;
    }

    public String getStkCls() {
        return stkCls;
    }

    public void setStkCls(String stkCls) {
        this.stkCls = stkCls;
    }

    public String getLocType() {
        return locType;
    }

    public void setLocType(String locType) {
        this.locType = locType;
    }

}
