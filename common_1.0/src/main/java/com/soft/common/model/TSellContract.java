package com.soft.common.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "`t_sell_contract`")
public class TSellContract implements Serializable {
    /**
     * 主键
     */
    @Id
    @Column(name = "`ID`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 中心编号
     */
    @Column(name = "`CNTR_CD`")
    private String cntrCd;

    /**
     * 销售订单号
     */
    @Column(name = "`SELL_ORD_CD`")
    private String sellOrdCd;

    /**
     * 销售主料明细编号
     */
    @Column(name = "`SELL_ORD_MAINMATERIAL_CD`")
    private String sellOrdMainmaterialCd;

    /**
     * 销售合同编号
     */
    @Column(name = "`SELL_ORD_CONTRACT_CD`")
    private String sellOrdContractCd;

    /**
     * 实际合同编号
     */
    @Column(name = "`SELL_CONTRACT_CD`")
    private String sellContractCd;

    /**
     * 实际客户编号
     */
    @Column(name = "`CUSTOMER_CD`")
    private String customerCd;

    /**
     * 出货方式
     */
    @Column(name = "`SHIP_TYPE`")
    private String shipType;

    /**
     * 交货地点
     */
    @Column(name = "`DELIVERY_ADDR`")
    private String deliveryAddr;

    /**
     * 关闭标志
     */
    @Column(name = "`CLOSE_FLG`")
    private String closeFlg;

    /**
     * 接单日期
     */
    @Column(name = "`TAKING_DT`")
    private Date takingDt;

    /**
     * 交期
     */
    @Column(name = "`DELIVERY_DT`")
    private Date deliveryDt;

    /**
     * 款号
     */
    @Column(name = "`SECTION_CD`")
    private String sectionCd;

    /**
     * 纱支面料
     */
    @Column(name = "`PROD_CD`")
    private String prodCd;

    /**
     * 纱线属性
     */
    @Column(name = "`YARN_REMARKS`")
    private String yarnRemarks;

    /**
     * 色系
     */
    @Column(name = "`COLOR_SYSTEM`")
    private String colorSystem;

    /**
     * 色号
     */
    @Column(name = "`COLOR_CD`")
    private String colorCd;

    /**
     * 颜色组合
     */
    @Column(name = "`COLOR_COMBINER`")
    private String colorCombiner;

    /**
     * 品名
     */
    @Column(name = "`PROD_NM`")
    private String prodNm;

    /**
     * 循环
     */
    @Column(name = "`CIRCLE`")
    private BigDecimal circle;

    /**
     * 有效门幅上限
     */
    @Column(name = "`EFFECTIVE_WIDTH_UP`")
    private BigDecimal effectiveWidthUp;

    /**
     * 有效门幅下限
     */
    @Column(name = "`EFFECTIVE_WIDTH_DOWN`")
    private BigDecimal effectiveWidthDown;

    /**
     * 克重
     */
    @Column(name = "`GTRAMMAGE`")
    private BigDecimal gtrammage;

    /**
     * 缩率
     */
    @Column(name = "`SHRINKAGE`")
    private BigDecimal shrinkage;

    /**
     * 数量(光坯)
     */
    @Column(name = "`KGS`")
    private BigDecimal kgs;

    /**
     * 单价
     */
    @Column(name = "`PRICE`")
    private BigDecimal price;

    /**
     * 总价
     */
    @Column(name = "`ALL_PRICE`")
    private BigDecimal allPrice;

    /**
     * 备注
     */
    @Column(name = "`REMARKS`")
    private String remarks;

    /**
     * 备用字段1
     */
    @Column(name = "`CHARACTER1`")
    private String character1;

    /**
     * 备用字段2
     */
    @Column(name = "`CHARACTER2`")
    private String character2;

    /**
     * 备用字段3
     */
    @Column(name = "`CHARACTER3`")
    private String character3;

    /**
     * 备用字段4
     */
    @Column(name = "`CHARACTER4`")
    private String character4;

    /**
     * 备用字段5
     */
    @Column(name = "`CHARACTER5`")
    private String character5;

    /**
     * 备用数值1
     */
    @Column(name = "`NUM1`")
    private BigDecimal num1;

    /**
     * 备用数值2
     */
    @Column(name = "`NUM2`")
    private BigDecimal num2;

    /**
     * 备用数值3
     */
    @Column(name = "`NUM3`")
    private BigDecimal num3;

    /**
     * 备用数值4
     */
    @Column(name = "`NUM4`")
    private BigDecimal num4;

    /**
     * 备用数值5
     */
    @Column(name = "`NUM5`")
    private BigDecimal num5;

    /**
     * 更新次数
     */
    @Column(name = "`UPD_CNT`")
    private Integer updCnt;

    /**
     * 删除区分
     */
    @Column(name = "`DEL_FLG`")
    private String delFlg;

    /**
     * 登录时输入区分
     */
    @Column(name = "`ADD_ENT_KBN`")
    private String addEntKbn;

    /**
     * 登录时程序ID
     */
    @Column(name = "`ADD_PGM_ID`")
    private String addPgmId;

    /**
     * 登录时用户ID
     */
    @Column(name = "`ADD_USER_ID`")
    private String addUserId;

    /**
     * 登录时用户名称
     */
    @Column(name = "`ADD_USER_NM`")
    private String addUserNm;

    /**
     * 登录时端末ID
     */
    @Column(name = "`ADD_TNMT_ID`")
    private String addTnmtId;

    /**
     * 登录日期
     */
    @Column(name = "`ADD_DT`")
    private Date addDt;

    /**
     * 更新时输入区分
     */
    @Column(name = "`UPD_ENT_KBN`")
    private String updEntKbn;

    /**
     * 更新时程序ID
     */
    @Column(name = "`UPD_PGM_ID`")
    private String updPgmId;

    /**
     * 更新时用户ID
     */
    @Column(name = "`UPD_USER_ID`")
    private String updUserId;

    /**
     * 更新时用户名称
     */
    @Column(name = "`UPD_USER_NM`")
    private String updUserNm;

    /**
     * 更新时端末ID
     */
    @Column(name = "`UPD_TNMT_ID`")
    private String updTnmtId;

    /**
     * 更新日期
     */
    @Column(name = "`UPD_DT`")
    private Date updDt;

    private static final long serialVersionUID = 1L;

    /**
     * 获取主键
     *
     * @return ID - 主键
     */
    public String getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 获取中心编号
     *
     * @return CNTR_CD - 中心编号
     */
    public String getCntrCd() {
        return cntrCd;
    }

    /**
     * 设置中心编号
     *
     * @param cntrCd 中心编号
     */
    public void setCntrCd(String cntrCd) {
        this.cntrCd = cntrCd == null ? null : cntrCd.trim();
    }

    /**
     * 获取销售订单号
     *
     * @return SELL_ORD_CD - 销售订单号
     */
    public String getSellOrdCd() {
        return sellOrdCd;
    }

    /**
     * 设置销售订单号
     *
     * @param sellOrdCd 销售订单号
     */
    public void setSellOrdCd(String sellOrdCd) {
        this.sellOrdCd = sellOrdCd == null ? null : sellOrdCd.trim();
    }

    /**
     * 获取销售主料明细编号
     *
     * @return SELL_ORD_MAINMATERIAL_CD - 销售主料明细编号
     */
    public String getSellOrdMainmaterialCd() {
        return sellOrdMainmaterialCd;
    }

    /**
     * 设置销售主料明细编号
     *
     * @param sellOrdMainmaterialCd 销售主料明细编号
     */
    public void setSellOrdMainmaterialCd(String sellOrdMainmaterialCd) {
        this.sellOrdMainmaterialCd = sellOrdMainmaterialCd == null ? null : sellOrdMainmaterialCd.trim();
    }

    /**
     * 获取销售合同编号
     *
     * @return SELL_ORD_CONTRACT_CD - 销售合同编号
     */
    public String getSellOrdContractCd() {
        return sellOrdContractCd;
    }

    /**
     * 设置销售合同编号
     *
     * @param sellOrdContractCd 销售合同编号
     */
    public void setSellOrdContractCd(String sellOrdContractCd) {
        this.sellOrdContractCd = sellOrdContractCd == null ? null : sellOrdContractCd.trim();
    }

    /**
     * 获取实际合同编号
     *
     * @return SELL_CONTRACT_CD - 实际合同编号
     */
    public String getSellContractCd() {
        return sellContractCd;
    }

    /**
     * 设置实际合同编号
     *
     * @param sellContractCd 实际合同编号
     */
    public void setSellContractCd(String sellContractCd) {
        this.sellContractCd = sellContractCd == null ? null : sellContractCd.trim();
    }

    /**
     * 获取实际客户编号
     *
     * @return CUSTOMER_CD - 实际客户编号
     */
    public String getCustomerCd() {
        return customerCd;
    }

    /**
     * 设置实际客户编号
     *
     * @param customerCd 实际客户编号
     */
    public void setCustomerCd(String customerCd) {
        this.customerCd = customerCd == null ? null : customerCd.trim();
    }

    /**
     * 获取出货方式
     *
     * @return SHIP_TYPE - 出货方式
     */
    public String getShipType() {
        return shipType;
    }

    /**
     * 设置出货方式
     *
     * @param shipType 出货方式
     */
    public void setShipType(String shipType) {
        this.shipType = shipType == null ? null : shipType.trim();
    }

    /**
     * 获取交货地点
     *
     * @return DELIVERY_ADDR - 交货地点
     */
    public String getDeliveryAddr() {
        return deliveryAddr;
    }

    /**
     * 设置交货地点
     *
     * @param deliveryAddr 交货地点
     */
    public void setDeliveryAddr(String deliveryAddr) {
        this.deliveryAddr = deliveryAddr == null ? null : deliveryAddr.trim();
    }

    /**
     * 获取关闭标志
     *
     * @return CLOSE_FLG - 关闭标志
     */
    public String getCloseFlg() {
        return closeFlg;
    }

    /**
     * 设置关闭标志
     *
     * @param closeFlg 关闭标志
     */
    public void setCloseFlg(String closeFlg) {
        this.closeFlg = closeFlg == null ? null : closeFlg.trim();
    }

    /**
     * 获取接单日期
     *
     * @return TAKING_DT - 接单日期
     */
    public Date getTakingDt() {
        return takingDt;
    }

    /**
     * 设置接单日期
     *
     * @param takingDt 接单日期
     */
    public void setTakingDt(Date takingDt) {
        this.takingDt = takingDt;
    }

    /**
     * 获取交期
     *
     * @return DELIVERY_DT - 交期
     */
    public Date getDeliveryDt() {
        return deliveryDt;
    }

    /**
     * 设置交期
     *
     * @param deliveryDt 交期
     */
    public void setDeliveryDt(Date deliveryDt) {
        this.deliveryDt = deliveryDt;
    }

    /**
     * 获取款号
     *
     * @return SECTION_CD - 款号
     */
    public String getSectionCd() {
        return sectionCd;
    }

    /**
     * 设置款号
     *
     * @param sectionCd 款号
     */
    public void setSectionCd(String sectionCd) {
        this.sectionCd = sectionCd == null ? null : sectionCd.trim();
    }

    /**
     * 获取纱支面料
     *
     * @return PROD_CD - 纱支面料
     */
    public String getProdCd() {
        return prodCd;
    }

    /**
     * 设置纱支面料
     *
     * @param prodCd 纱支面料
     */
    public void setProdCd(String prodCd) {
        this.prodCd = prodCd == null ? null : prodCd.trim();
    }

    /**
     * 获取纱线属性
     *
     * @return YARN_REMARKS - 纱线属性
     */
    public String getYarnRemarks() {
        return yarnRemarks;
    }

    /**
     * 设置纱线属性
     *
     * @param yarnRemarks 纱线属性
     */
    public void setYarnRemarks(String yarnRemarks) {
        this.yarnRemarks = yarnRemarks == null ? null : yarnRemarks.trim();
    }

    /**
     * 获取色系
     *
     * @return COLOR_SYSTEM - 色系
     */
    public String getColorSystem() {
        return colorSystem;
    }

    /**
     * 设置色系
     *
     * @param colorSystem 色系
     */
    public void setColorSystem(String colorSystem) {
        this.colorSystem = colorSystem == null ? null : colorSystem.trim();
    }

    /**
     * 获取色号
     *
     * @return COLOR_CD - 色号
     */
    public String getColorCd() {
        return colorCd;
    }

    /**
     * 设置色号
     *
     * @param colorCd 色号
     */
    public void setColorCd(String colorCd) {
        this.colorCd = colorCd == null ? null : colorCd.trim();
    }

    /**
     * 获取颜色组合
     *
     * @return COLOR_COMBINER - 颜色组合
     */
    public String getColorCombiner() {
        return colorCombiner;
    }

    /**
     * 设置颜色组合
     *
     * @param colorCombiner 颜色组合
     */
    public void setColorCombiner(String colorCombiner) {
        this.colorCombiner = colorCombiner == null ? null : colorCombiner.trim();
    }

    /**
     * 获取品名
     *
     * @return PROD_NM - 品名
     */
    public String getProdNm() {
        return prodNm;
    }

    /**
     * 设置品名
     *
     * @param prodNm 品名
     */
    public void setProdNm(String prodNm) {
        this.prodNm = prodNm == null ? null : prodNm.trim();
    }

    /**
     * 获取循环
     *
     * @return CIRCLE - 循环
     */
    public BigDecimal getCircle() {
        return circle;
    }

    /**
     * 设置循环
     *
     * @param circle 循环
     */
    public void setCircle(BigDecimal circle) {
        this.circle = circle;
    }

    /**
     * 获取有效门幅上限
     *
     * @return EFFECTIVE_WIDTH_UP - 有效门幅上限
     */
    public BigDecimal getEffectiveWidthUp() {
        return effectiveWidthUp;
    }

    /**
     * 设置有效门幅上限
     *
     * @param effectiveWidthUp 有效门幅上限
     */
    public void setEffectiveWidthUp(BigDecimal effectiveWidthUp) {
        this.effectiveWidthUp = effectiveWidthUp;
    }

    /**
     * 获取有效门幅下限
     *
     * @return EFFECTIVE_WIDTH_DOWN - 有效门幅下限
     */
    public BigDecimal getEffectiveWidthDown() {
        return effectiveWidthDown;
    }

    /**
     * 设置有效门幅下限
     *
     * @param effectiveWidthDown 有效门幅下限
     */
    public void setEffectiveWidthDown(BigDecimal effectiveWidthDown) {
        this.effectiveWidthDown = effectiveWidthDown;
    }

    /**
     * 获取克重
     *
     * @return GTRAMMAGE - 克重
     */
    public BigDecimal getGtrammage() {
        return gtrammage;
    }

    /**
     * 设置克重
     *
     * @param gtrammage 克重
     */
    public void setGtrammage(BigDecimal gtrammage) {
        this.gtrammage = gtrammage;
    }

    /**
     * 获取缩率
     *
     * @return SHRINKAGE - 缩率
     */
    public BigDecimal getShrinkage() {
        return shrinkage;
    }

    /**
     * 设置缩率
     *
     * @param shrinkage 缩率
     */
    public void setShrinkage(BigDecimal shrinkage) {
        this.shrinkage = shrinkage;
    }

    /**
     * 获取数量(光坯)
     *
     * @return KGS - 数量(光坯)
     */
    public BigDecimal getKgs() {
        return kgs;
    }

    /**
     * 设置数量(光坯)
     *
     * @param kgs 数量(光坯)
     */
    public void setKgs(BigDecimal kgs) {
        this.kgs = kgs;
    }

    /**
     * 获取单价
     *
     * @return PRICE - 单价
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 设置单价
     *
     * @param price 单价
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * 获取总价
     *
     * @return ALL_PRICE - 总价
     */
    public BigDecimal getAllPrice() {
        return allPrice;
    }

    /**
     * 设置总价
     *
     * @param allPrice 总价
     */
    public void setAllPrice(BigDecimal allPrice) {
        this.allPrice = allPrice;
    }

    /**
     * 获取备注
     *
     * @return REMARKS - 备注
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * 设置备注
     *
     * @param remarks 备注
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    /**
     * 获取备用字段1
     *
     * @return CHARACTER1 - 备用字段1
     */
    public String getCharacter1() {
        return character1;
    }

    /**
     * 设置备用字段1
     *
     * @param character1 备用字段1
     */
    public void setCharacter1(String character1) {
        this.character1 = character1 == null ? null : character1.trim();
    }

    /**
     * 获取备用字段2
     *
     * @return CHARACTER2 - 备用字段2
     */
    public String getCharacter2() {
        return character2;
    }

    /**
     * 设置备用字段2
     *
     * @param character2 备用字段2
     */
    public void setCharacter2(String character2) {
        this.character2 = character2 == null ? null : character2.trim();
    }

    /**
     * 获取备用字段3
     *
     * @return CHARACTER3 - 备用字段3
     */
    public String getCharacter3() {
        return character3;
    }

    /**
     * 设置备用字段3
     *
     * @param character3 备用字段3
     */
    public void setCharacter3(String character3) {
        this.character3 = character3 == null ? null : character3.trim();
    }

    /**
     * 获取备用字段4
     *
     * @return CHARACTER4 - 备用字段4
     */
    public String getCharacter4() {
        return character4;
    }

    /**
     * 设置备用字段4
     *
     * @param character4 备用字段4
     */
    public void setCharacter4(String character4) {
        this.character4 = character4 == null ? null : character4.trim();
    }

    /**
     * 获取备用字段5
     *
     * @return CHARACTER5 - 备用字段5
     */
    public String getCharacter5() {
        return character5;
    }

    /**
     * 设置备用字段5
     *
     * @param character5 备用字段5
     */
    public void setCharacter5(String character5) {
        this.character5 = character5 == null ? null : character5.trim();
    }

    /**
     * 获取备用数值1
     *
     * @return NUM1 - 备用数值1
     */
    public BigDecimal getNum1() {
        return num1;
    }

    /**
     * 设置备用数值1
     *
     * @param num1 备用数值1
     */
    public void setNum1(BigDecimal num1) {
        this.num1 = num1;
    }

    /**
     * 获取备用数值2
     *
     * @return NUM2 - 备用数值2
     */
    public BigDecimal getNum2() {
        return num2;
    }

    /**
     * 设置备用数值2
     *
     * @param num2 备用数值2
     */
    public void setNum2(BigDecimal num2) {
        this.num2 = num2;
    }

    /**
     * 获取备用数值3
     *
     * @return NUM3 - 备用数值3
     */
    public BigDecimal getNum3() {
        return num3;
    }

    /**
     * 设置备用数值3
     *
     * @param num3 备用数值3
     */
    public void setNum3(BigDecimal num3) {
        this.num3 = num3;
    }

    /**
     * 获取备用数值4
     *
     * @return NUM4 - 备用数值4
     */
    public BigDecimal getNum4() {
        return num4;
    }

    /**
     * 设置备用数值4
     *
     * @param num4 备用数值4
     */
    public void setNum4(BigDecimal num4) {
        this.num4 = num4;
    }

    /**
     * 获取备用数值5
     *
     * @return NUM5 - 备用数值5
     */
    public BigDecimal getNum5() {
        return num5;
    }

    /**
     * 设置备用数值5
     *
     * @param num5 备用数值5
     */
    public void setNum5(BigDecimal num5) {
        this.num5 = num5;
    }

    /**
     * 获取更新次数
     *
     * @return UPD_CNT - 更新次数
     */
    public Integer getUpdCnt() {
        return updCnt;
    }

    /**
     * 设置更新次数
     *
     * @param updCnt 更新次数
     */
    public void setUpdCnt(Integer updCnt) {
        this.updCnt = updCnt;
    }

    /**
     * 获取删除区分
     *
     * @return DEL_FLG - 删除区分
     */
    public String getDelFlg() {
        return delFlg;
    }

    /**
     * 设置删除区分
     *
     * @param delFlg 删除区分
     */
    public void setDelFlg(String delFlg) {
        this.delFlg = delFlg == null ? null : delFlg.trim();
    }

    /**
     * 获取登录时输入区分
     *
     * @return ADD_ENT_KBN - 登录时输入区分
     */
    public String getAddEntKbn() {
        return addEntKbn;
    }

    /**
     * 设置登录时输入区分
     *
     * @param addEntKbn 登录时输入区分
     */
    public void setAddEntKbn(String addEntKbn) {
        this.addEntKbn = addEntKbn == null ? null : addEntKbn.trim();
    }

    /**
     * 获取登录时程序ID
     *
     * @return ADD_PGM_ID - 登录时程序ID
     */
    public String getAddPgmId() {
        return addPgmId;
    }

    /**
     * 设置登录时程序ID
     *
     * @param addPgmId 登录时程序ID
     */
    public void setAddPgmId(String addPgmId) {
        this.addPgmId = addPgmId == null ? null : addPgmId.trim();
    }

    /**
     * 获取登录时用户ID
     *
     * @return ADD_USER_ID - 登录时用户ID
     */
    public String getAddUserId() {
        return addUserId;
    }

    /**
     * 设置登录时用户ID
     *
     * @param addUserId 登录时用户ID
     */
    public void setAddUserId(String addUserId) {
        this.addUserId = addUserId == null ? null : addUserId.trim();
    }

    /**
     * 获取登录时用户名称
     *
     * @return ADD_USER_NM - 登录时用户名称
     */
    public String getAddUserNm() {
        return addUserNm;
    }

    /**
     * 设置登录时用户名称
     *
     * @param addUserNm 登录时用户名称
     */
    public void setAddUserNm(String addUserNm) {
        this.addUserNm = addUserNm == null ? null : addUserNm.trim();
    }

    /**
     * 获取登录时端末ID
     *
     * @return ADD_TNMT_ID - 登录时端末ID
     */
    public String getAddTnmtId() {
        return addTnmtId;
    }

    /**
     * 设置登录时端末ID
     *
     * @param addTnmtId 登录时端末ID
     */
    public void setAddTnmtId(String addTnmtId) {
        this.addTnmtId = addTnmtId == null ? null : addTnmtId.trim();
    }

    /**
     * 获取登录日期
     *
     * @return ADD_DT - 登录日期
     */
    public Date getAddDt() {
        return addDt;
    }

    /**
     * 设置登录日期
     *
     * @param addDt 登录日期
     */
    public void setAddDt(Date addDt) {
        this.addDt = addDt;
    }

    /**
     * 获取更新时输入区分
     *
     * @return UPD_ENT_KBN - 更新时输入区分
     */
    public String getUpdEntKbn() {
        return updEntKbn;
    }

    /**
     * 设置更新时输入区分
     *
     * @param updEntKbn 更新时输入区分
     */
    public void setUpdEntKbn(String updEntKbn) {
        this.updEntKbn = updEntKbn == null ? null : updEntKbn.trim();
    }

    /**
     * 获取更新时程序ID
     *
     * @return UPD_PGM_ID - 更新时程序ID
     */
    public String getUpdPgmId() {
        return updPgmId;
    }

    /**
     * 设置更新时程序ID
     *
     * @param updPgmId 更新时程序ID
     */
    public void setUpdPgmId(String updPgmId) {
        this.updPgmId = updPgmId == null ? null : updPgmId.trim();
    }

    /**
     * 获取更新时用户ID
     *
     * @return UPD_USER_ID - 更新时用户ID
     */
    public String getUpdUserId() {
        return updUserId;
    }

    /**
     * 设置更新时用户ID
     *
     * @param updUserId 更新时用户ID
     */
    public void setUpdUserId(String updUserId) {
        this.updUserId = updUserId == null ? null : updUserId.trim();
    }

    /**
     * 获取更新时用户名称
     *
     * @return UPD_USER_NM - 更新时用户名称
     */
    public String getUpdUserNm() {
        return updUserNm;
    }

    /**
     * 设置更新时用户名称
     *
     * @param updUserNm 更新时用户名称
     */
    public void setUpdUserNm(String updUserNm) {
        this.updUserNm = updUserNm == null ? null : updUserNm.trim();
    }

    /**
     * 获取更新时端末ID
     *
     * @return UPD_TNMT_ID - 更新时端末ID
     */
    public String getUpdTnmtId() {
        return updTnmtId;
    }

    /**
     * 设置更新时端末ID
     *
     * @param updTnmtId 更新时端末ID
     */
    public void setUpdTnmtId(String updTnmtId) {
        this.updTnmtId = updTnmtId == null ? null : updTnmtId.trim();
    }

    /**
     * 获取更新日期
     *
     * @return UPD_DT - 更新日期
     */
    public Date getUpdDt() {
        return updDt;
    }

    /**
     * 设置更新日期
     *
     * @param updDt 更新日期
     */
    public void setUpdDt(Date updDt) {
        this.updDt = updDt;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        TSellContract other = (TSellContract) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCntrCd() == null ? other.getCntrCd() == null : this.getCntrCd().equals(other.getCntrCd()))
            && (this.getSellOrdCd() == null ? other.getSellOrdCd() == null : this.getSellOrdCd().equals(other.getSellOrdCd()))
            && (this.getSellOrdMainmaterialCd() == null ? other.getSellOrdMainmaterialCd() == null : this.getSellOrdMainmaterialCd().equals(other.getSellOrdMainmaterialCd()))
            && (this.getSellOrdContractCd() == null ? other.getSellOrdContractCd() == null : this.getSellOrdContractCd().equals(other.getSellOrdContractCd()))
            && (this.getSellContractCd() == null ? other.getSellContractCd() == null : this.getSellContractCd().equals(other.getSellContractCd()))
            && (this.getCustomerCd() == null ? other.getCustomerCd() == null : this.getCustomerCd().equals(other.getCustomerCd()))
            && (this.getShipType() == null ? other.getShipType() == null : this.getShipType().equals(other.getShipType()))
            && (this.getDeliveryAddr() == null ? other.getDeliveryAddr() == null : this.getDeliveryAddr().equals(other.getDeliveryAddr()))
            && (this.getCloseFlg() == null ? other.getCloseFlg() == null : this.getCloseFlg().equals(other.getCloseFlg()))
            && (this.getTakingDt() == null ? other.getTakingDt() == null : this.getTakingDt().equals(other.getTakingDt()))
            && (this.getDeliveryDt() == null ? other.getDeliveryDt() == null : this.getDeliveryDt().equals(other.getDeliveryDt()))
            && (this.getSectionCd() == null ? other.getSectionCd() == null : this.getSectionCd().equals(other.getSectionCd()))
            && (this.getProdCd() == null ? other.getProdCd() == null : this.getProdCd().equals(other.getProdCd()))
            && (this.getYarnRemarks() == null ? other.getYarnRemarks() == null : this.getYarnRemarks().equals(other.getYarnRemarks()))
            && (this.getColorSystem() == null ? other.getColorSystem() == null : this.getColorSystem().equals(other.getColorSystem()))
            && (this.getColorCd() == null ? other.getColorCd() == null : this.getColorCd().equals(other.getColorCd()))
            && (this.getColorCombiner() == null ? other.getColorCombiner() == null : this.getColorCombiner().equals(other.getColorCombiner()))
            && (this.getProdNm() == null ? other.getProdNm() == null : this.getProdNm().equals(other.getProdNm()))
            && (this.getCircle() == null ? other.getCircle() == null : this.getCircle().equals(other.getCircle()))
            && (this.getEffectiveWidthUp() == null ? other.getEffectiveWidthUp() == null : this.getEffectiveWidthUp().equals(other.getEffectiveWidthUp()))
            && (this.getEffectiveWidthDown() == null ? other.getEffectiveWidthDown() == null : this.getEffectiveWidthDown().equals(other.getEffectiveWidthDown()))
            && (this.getGtrammage() == null ? other.getGtrammage() == null : this.getGtrammage().equals(other.getGtrammage()))
            && (this.getShrinkage() == null ? other.getShrinkage() == null : this.getShrinkage().equals(other.getShrinkage()))
            && (this.getKgs() == null ? other.getKgs() == null : this.getKgs().equals(other.getKgs()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getAllPrice() == null ? other.getAllPrice() == null : this.getAllPrice().equals(other.getAllPrice()))
            && (this.getRemarks() == null ? other.getRemarks() == null : this.getRemarks().equals(other.getRemarks()))
            && (this.getCharacter1() == null ? other.getCharacter1() == null : this.getCharacter1().equals(other.getCharacter1()))
            && (this.getCharacter2() == null ? other.getCharacter2() == null : this.getCharacter2().equals(other.getCharacter2()))
            && (this.getCharacter3() == null ? other.getCharacter3() == null : this.getCharacter3().equals(other.getCharacter3()))
            && (this.getCharacter4() == null ? other.getCharacter4() == null : this.getCharacter4().equals(other.getCharacter4()))
            && (this.getCharacter5() == null ? other.getCharacter5() == null : this.getCharacter5().equals(other.getCharacter5()))
            && (this.getNum1() == null ? other.getNum1() == null : this.getNum1().equals(other.getNum1()))
            && (this.getNum2() == null ? other.getNum2() == null : this.getNum2().equals(other.getNum2()))
            && (this.getNum3() == null ? other.getNum3() == null : this.getNum3().equals(other.getNum3()))
            && (this.getNum4() == null ? other.getNum4() == null : this.getNum4().equals(other.getNum4()))
            && (this.getNum5() == null ? other.getNum5() == null : this.getNum5().equals(other.getNum5()))
            && (this.getUpdCnt() == null ? other.getUpdCnt() == null : this.getUpdCnt().equals(other.getUpdCnt()))
            && (this.getDelFlg() == null ? other.getDelFlg() == null : this.getDelFlg().equals(other.getDelFlg()))
            && (this.getAddEntKbn() == null ? other.getAddEntKbn() == null : this.getAddEntKbn().equals(other.getAddEntKbn()))
            && (this.getAddPgmId() == null ? other.getAddPgmId() == null : this.getAddPgmId().equals(other.getAddPgmId()))
            && (this.getAddUserId() == null ? other.getAddUserId() == null : this.getAddUserId().equals(other.getAddUserId()))
            && (this.getAddUserNm() == null ? other.getAddUserNm() == null : this.getAddUserNm().equals(other.getAddUserNm()))
            && (this.getAddTnmtId() == null ? other.getAddTnmtId() == null : this.getAddTnmtId().equals(other.getAddTnmtId()))
            && (this.getAddDt() == null ? other.getAddDt() == null : this.getAddDt().equals(other.getAddDt()))
            && (this.getUpdEntKbn() == null ? other.getUpdEntKbn() == null : this.getUpdEntKbn().equals(other.getUpdEntKbn()))
            && (this.getUpdPgmId() == null ? other.getUpdPgmId() == null : this.getUpdPgmId().equals(other.getUpdPgmId()))
            && (this.getUpdUserId() == null ? other.getUpdUserId() == null : this.getUpdUserId().equals(other.getUpdUserId()))
            && (this.getUpdUserNm() == null ? other.getUpdUserNm() == null : this.getUpdUserNm().equals(other.getUpdUserNm()))
            && (this.getUpdTnmtId() == null ? other.getUpdTnmtId() == null : this.getUpdTnmtId().equals(other.getUpdTnmtId()))
            && (this.getUpdDt() == null ? other.getUpdDt() == null : this.getUpdDt().equals(other.getUpdDt()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCntrCd() == null) ? 0 : getCntrCd().hashCode());
        result = prime * result + ((getSellOrdCd() == null) ? 0 : getSellOrdCd().hashCode());
        result = prime * result + ((getSellOrdMainmaterialCd() == null) ? 0 : getSellOrdMainmaterialCd().hashCode());
        result = prime * result + ((getSellOrdContractCd() == null) ? 0 : getSellOrdContractCd().hashCode());
        result = prime * result + ((getSellContractCd() == null) ? 0 : getSellContractCd().hashCode());
        result = prime * result + ((getCustomerCd() == null) ? 0 : getCustomerCd().hashCode());
        result = prime * result + ((getShipType() == null) ? 0 : getShipType().hashCode());
        result = prime * result + ((getDeliveryAddr() == null) ? 0 : getDeliveryAddr().hashCode());
        result = prime * result + ((getCloseFlg() == null) ? 0 : getCloseFlg().hashCode());
        result = prime * result + ((getTakingDt() == null) ? 0 : getTakingDt().hashCode());
        result = prime * result + ((getDeliveryDt() == null) ? 0 : getDeliveryDt().hashCode());
        result = prime * result + ((getSectionCd() == null) ? 0 : getSectionCd().hashCode());
        result = prime * result + ((getProdCd() == null) ? 0 : getProdCd().hashCode());
        result = prime * result + ((getYarnRemarks() == null) ? 0 : getYarnRemarks().hashCode());
        result = prime * result + ((getColorSystem() == null) ? 0 : getColorSystem().hashCode());
        result = prime * result + ((getColorCd() == null) ? 0 : getColorCd().hashCode());
        result = prime * result + ((getColorCombiner() == null) ? 0 : getColorCombiner().hashCode());
        result = prime * result + ((getProdNm() == null) ? 0 : getProdNm().hashCode());
        result = prime * result + ((getCircle() == null) ? 0 : getCircle().hashCode());
        result = prime * result + ((getEffectiveWidthUp() == null) ? 0 : getEffectiveWidthUp().hashCode());
        result = prime * result + ((getEffectiveWidthDown() == null) ? 0 : getEffectiveWidthDown().hashCode());
        result = prime * result + ((getGtrammage() == null) ? 0 : getGtrammage().hashCode());
        result = prime * result + ((getShrinkage() == null) ? 0 : getShrinkage().hashCode());
        result = prime * result + ((getKgs() == null) ? 0 : getKgs().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getAllPrice() == null) ? 0 : getAllPrice().hashCode());
        result = prime * result + ((getRemarks() == null) ? 0 : getRemarks().hashCode());
        result = prime * result + ((getCharacter1() == null) ? 0 : getCharacter1().hashCode());
        result = prime * result + ((getCharacter2() == null) ? 0 : getCharacter2().hashCode());
        result = prime * result + ((getCharacter3() == null) ? 0 : getCharacter3().hashCode());
        result = prime * result + ((getCharacter4() == null) ? 0 : getCharacter4().hashCode());
        result = prime * result + ((getCharacter5() == null) ? 0 : getCharacter5().hashCode());
        result = prime * result + ((getNum1() == null) ? 0 : getNum1().hashCode());
        result = prime * result + ((getNum2() == null) ? 0 : getNum2().hashCode());
        result = prime * result + ((getNum3() == null) ? 0 : getNum3().hashCode());
        result = prime * result + ((getNum4() == null) ? 0 : getNum4().hashCode());
        result = prime * result + ((getNum5() == null) ? 0 : getNum5().hashCode());
        result = prime * result + ((getUpdCnt() == null) ? 0 : getUpdCnt().hashCode());
        result = prime * result + ((getDelFlg() == null) ? 0 : getDelFlg().hashCode());
        result = prime * result + ((getAddEntKbn() == null) ? 0 : getAddEntKbn().hashCode());
        result = prime * result + ((getAddPgmId() == null) ? 0 : getAddPgmId().hashCode());
        result = prime * result + ((getAddUserId() == null) ? 0 : getAddUserId().hashCode());
        result = prime * result + ((getAddUserNm() == null) ? 0 : getAddUserNm().hashCode());
        result = prime * result + ((getAddTnmtId() == null) ? 0 : getAddTnmtId().hashCode());
        result = prime * result + ((getAddDt() == null) ? 0 : getAddDt().hashCode());
        result = prime * result + ((getUpdEntKbn() == null) ? 0 : getUpdEntKbn().hashCode());
        result = prime * result + ((getUpdPgmId() == null) ? 0 : getUpdPgmId().hashCode());
        result = prime * result + ((getUpdUserId() == null) ? 0 : getUpdUserId().hashCode());
        result = prime * result + ((getUpdUserNm() == null) ? 0 : getUpdUserNm().hashCode());
        result = prime * result + ((getUpdTnmtId() == null) ? 0 : getUpdTnmtId().hashCode());
        result = prime * result + ((getUpdDt() == null) ? 0 : getUpdDt().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", cntrCd=").append(cntrCd);
        sb.append(", sellOrdCd=").append(sellOrdCd);
        sb.append(", sellOrdMainmaterialCd=").append(sellOrdMainmaterialCd);
        sb.append(", sellOrdContractCd=").append(sellOrdContractCd);
        sb.append(", sellContractCd=").append(sellContractCd);
        sb.append(", customerCd=").append(customerCd);
        sb.append(", shipType=").append(shipType);
        sb.append(", deliveryAddr=").append(deliveryAddr);
        sb.append(", closeFlg=").append(closeFlg);
        sb.append(", takingDt=").append(takingDt);
        sb.append(", deliveryDt=").append(deliveryDt);
        sb.append(", sectionCd=").append(sectionCd);
        sb.append(", prodCd=").append(prodCd);
        sb.append(", yarnRemarks=").append(yarnRemarks);
        sb.append(", colorSystem=").append(colorSystem);
        sb.append(", colorCd=").append(colorCd);
        sb.append(", colorCombiner=").append(colorCombiner);
        sb.append(", prodNm=").append(prodNm);
        sb.append(", circle=").append(circle);
        sb.append(", effectiveWidthUp=").append(effectiveWidthUp);
        sb.append(", effectiveWidthDown=").append(effectiveWidthDown);
        sb.append(", gtrammage=").append(gtrammage);
        sb.append(", shrinkage=").append(shrinkage);
        sb.append(", kgs=").append(kgs);
        sb.append(", price=").append(price);
        sb.append(", allPrice=").append(allPrice);
        sb.append(", remarks=").append(remarks);
        sb.append(", character1=").append(character1);
        sb.append(", character2=").append(character2);
        sb.append(", character3=").append(character3);
        sb.append(", character4=").append(character4);
        sb.append(", character5=").append(character5);
        sb.append(", num1=").append(num1);
        sb.append(", num2=").append(num2);
        sb.append(", num3=").append(num3);
        sb.append(", num4=").append(num4);
        sb.append(", num5=").append(num5);
        sb.append(", updCnt=").append(updCnt);
        sb.append(", delFlg=").append(delFlg);
        sb.append(", addEntKbn=").append(addEntKbn);
        sb.append(", addPgmId=").append(addPgmId);
        sb.append(", addUserId=").append(addUserId);
        sb.append(", addUserNm=").append(addUserNm);
        sb.append(", addTnmtId=").append(addTnmtId);
        sb.append(", addDt=").append(addDt);
        sb.append(", updEntKbn=").append(updEntKbn);
        sb.append(", updPgmId=").append(updPgmId);
        sb.append(", updUserId=").append(updUserId);
        sb.append(", updUserNm=").append(updUserNm);
        sb.append(", updTnmtId=").append(updTnmtId);
        sb.append(", updDt=").append(updDt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
