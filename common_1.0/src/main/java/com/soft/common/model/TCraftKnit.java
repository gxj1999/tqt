package com.soft.common.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "`t_craft_knit`")
public class TCraftKnit implements Serializable {
    /**
     * 主键
     */
    @Id
    @Column(name = "`ID`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 工艺号
     */
    @Column(name = "`CRAFT_SN`")
    private String craftSn;

    /**
     * 工艺编号
     */
    @Column(name = "`CRAFT_CD`")
    private String craftCd;

    /**
     * 工艺明细号
     */
    @Column(name = "`CRAFT_LINE_NUM`")
    private String craftLineNum;

    /**
     * 销售订单编号
     */
    @Column(name = "`SELL_ORD_CD`")
    private String sellOrdCd;

    /**
     * 销售订单明细编号
     */
    @Column(name = "`SELL_ORD_MAINMATERIAL_CD`")
    private String sellOrdMainmaterialCd;

    /**
     * 商品编号
     */
    @Column(name = "`PROD_ID`")
    private String prodId;

    /**
     * 中心编号
     */
    @Column(name = "`CNTR_CD`")
    private String cntrCd;

    /**
     * 客户编号
     */
    @Column(name = "`CUSTOMER_ID`")
    private String customerId;

    /**
     * 花型
     */
    @Column(name = "`PATTERN`")
    private String pattern;

    /**
     * 染方式
     */
    @Column(name = "`DYE_MODE`")
    private String dyeMode;

    /**
     * 机型
     */
    @Column(name = "`MACHINE_TYPE`")
    private String machineType;

    /**
     * 直径
     */
    @Column(name = "`DIAMETER`")
    private BigDecimal diameter;

    /**
     * 针筒数
     */
    @Column(name = "`GAUGE`")
    private BigDecimal gauge;

    /**
     * 开机模数
     */
    @Column(name = "`BOOT`")
    private BigDecimal boot;

    /**
     * 总针数
     */
    @Column(name = "`TOTAL_NEEDLES`")
    private BigDecimal totalNeedles;

    /**
     * 是否开幅
     */
    @Column(name = "`SCUTCHING_FLG`")
    private String scutchingFlg;

    /**
     * 是否成衣洗水
     */
    @Column(name = "`WASH_FLG`")
    private String washFlg;

    /**
     * 是否过树脂
     */
    @Column(name = "`RESIN_FLG`")
    private String resinFlg;

    /**
     * 布成分
     */
    @Column(name = "`CLOTH_COMPONENT`")
    private String clothComponent;

    /**
     * 织物正面
     */
    @Column(name = "`CLOTH_FACE`")
    private String clothFace;

    /**
     * 布种
     */
    @Column(name = "`PROD_CLASS_ID`")
    private String prodClassId;

    /**
     * CPI
     */
    @Column(name = "`CPI`")
    private BigDecimal cpi;

    /**
     * WPI
     */
    @Column(name = "`WPI`")
    private BigDecimal wpi;

    /**
     * 最小幅宽
     */
    @Column(name = "`MIN_WIDTH`")
    private BigDecimal minWidth;

    /**
     * 最大幅宽
     */
    @Column(name = "`MAX_WIDTH`")
    private BigDecimal maxWidth;

    /**
     * 调机纱长
     */
    @Column(name = "`YARN_LENGTH`")
    private String yarnLength;

    /**
     * 最小克重
     */
    @Column(name = "`MIN_WEIGHT`")
    private BigDecimal minWeight;

    /**
     * 最大克重
     */
    @Column(name = "`MAX_WEIGHT`")
    private BigDecimal maxWeight;

    /**
     * 经向缩水
     */
    @Column(name = "`SHRINK_LNG`")
    private BigDecimal shrinkLng;

    /**
     * 纬向缩水
     */
    @Column(name = "`SHRINK_LAT`")
    private BigDecimal shrinkLat;

    /**
     * 码重
     */
    @Column(name = "`WEIGHT`")
    private BigDecimal weight;

    /**
     * 编织工艺编号
     */
    @Column(name = "`CRAFT_KNIT_ID`")
    private String craftKnitId;

    /**
     * 备注1
     */
    @Column(name = "`REMARK1`")
    private String remark1;

    /**
     * 备注2
     */
    @Column(name = "`REMARK2`")
    private String remark2;

    /**
     * 备注3
     */
    @Column(name = "`REMARK3`")
    private String remark3;

    /**
     * 文本1
     */
    @Column(name = "`CHAR1`")
    private String char1;

    /**
     * 文本2
     */
    @Column(name = "`CHAR2`")
    private String char2;

    /**
     * 文本3
     */
    @Column(name = "`CHAR3`")
    private String char3;

    /**
     * 文本4
     */
    @Column(name = "`CHAR4`")
    private String char4;

    /**
     * 文本5
     */
    @Column(name = "`CHAR5`")
    private String char5;

    /**
     * 文本6
     */
    @Column(name = "`CHAR6`")
    private String char6;

    /**
     * 文本7
     */
    @Column(name = "`CHAR7`")
    private String char7;

    /**
     * 文本8
     */
    @Column(name = "`CHAR8`")
    private String char8;

    /**
     * 文本9
     */
    @Column(name = "`CHAR9`")
    private String char9;

    /**
     * 文本10
     */
    @Column(name = "`CHAR10`")
    private String char10;

    /**
     * 数值1
     */
    @Column(name = "`NUM1`")
    private BigDecimal num1;

    /**
     * 数值2
     */
    @Column(name = "`NUM2`")
    private BigDecimal num2;

    /**
     * 数值3
     */
    @Column(name = "`NUM3`")
    private BigDecimal num3;

    /**
     * 数值4
     */
    @Column(name = "`NUM4`")
    private BigDecimal num4;

    /**
     * 数值5
     */
    @Column(name = "`NUM5`")
    private BigDecimal num5;

    /**
     * 数值6
     */
    @Column(name = "`NUM6`")
    private BigDecimal num6;

    /**
     * 数值7
     */
    @Column(name = "`NUM7`")
    private BigDecimal num7;

    /**
     * 数值8
     */
    @Column(name = "`NUM8`")
    private BigDecimal num8;

    /**
     * 数值9
     */
    @Column(name = "`NUM9`")
    private BigDecimal num9;

    /**
     * 数值10
     */
    @Column(name = "`NUM10`")
    private BigDecimal num10;

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
     * 获取工艺号
     *
     * @return CRAFT_SN - 工艺号
     */
    public String getCraftSn() {
        return craftSn;
    }

    /**
     * 设置工艺号
     *
     * @param craftSn 工艺号
     */
    public void setCraftSn(String craftSn) {
        this.craftSn = craftSn == null ? null : craftSn.trim();
    }

    /**
     * 获取工艺编号
     *
     * @return CRAFT_CD - 工艺编号
     */
    public String getCraftCd() {
        return craftCd;
    }

    /**
     * 设置工艺编号
     *
     * @param craftCd 工艺编号
     */
    public void setCraftCd(String craftCd) {
        this.craftCd = craftCd == null ? null : craftCd.trim();
    }

    /**
     * 获取工艺明细号
     *
     * @return CRAFT_LINE_NUM - 工艺明细号
     */
    public String getCraftLineNum() {
        return craftLineNum;
    }

    /**
     * 设置工艺明细号
     *
     * @param craftLineNum 工艺明细号
     */
    public void setCraftLineNum(String craftLineNum) {
        this.craftLineNum = craftLineNum == null ? null : craftLineNum.trim();
    }

    /**
     * 获取销售订单编号
     *
     * @return SELL_ORD_CD - 销售订单编号
     */
    public String getSellOrdCd() {
        return sellOrdCd;
    }

    /**
     * 设置销售订单编号
     *
     * @param sellOrdCd 销售订单编号
     */
    public void setSellOrdCd(String sellOrdCd) {
        this.sellOrdCd = sellOrdCd == null ? null : sellOrdCd.trim();
    }

    /**
     * 获取销售订单明细编号
     *
     * @return SELL_ORD_MAINMATERIAL_CD - 销售订单明细编号
     */
    public String getSellOrdMainmaterialCd() {
        return sellOrdMainmaterialCd;
    }

    /**
     * 设置销售订单明细编号
     *
     * @param sellOrdMainmaterialCd 销售订单明细编号
     */
    public void setSellOrdMainmaterialCd(String sellOrdMainmaterialCd) {
        this.sellOrdMainmaterialCd = sellOrdMainmaterialCd == null ? null : sellOrdMainmaterialCd.trim();
    }

    /**
     * 获取商品编号
     *
     * @return PROD_ID - 商品编号
     */
    public String getProdId() {
        return prodId;
    }

    /**
     * 设置商品编号
     *
     * @param prodId 商品编号
     */
    public void setProdId(String prodId) {
        this.prodId = prodId == null ? null : prodId.trim();
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
     * 获取客户编号
     *
     * @return CUSTOMER_ID - 客户编号
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * 设置客户编号
     *
     * @param customerId 客户编号
     */
    public void setCustomerId(String customerId) {
        this.customerId = customerId == null ? null : customerId.trim();
    }

    /**
     * 获取花型
     *
     * @return PATTERN - 花型
     */
    public String getPattern() {
        return pattern;
    }

    /**
     * 设置花型
     *
     * @param pattern 花型
     */
    public void setPattern(String pattern) {
        this.pattern = pattern == null ? null : pattern.trim();
    }

    /**
     * 获取染方式
     *
     * @return DYE_MODE - 染方式
     */
    public String getDyeMode() {
        return dyeMode;
    }

    /**
     * 设置染方式
     *
     * @param dyeMode 染方式
     */
    public void setDyeMode(String dyeMode) {
        this.dyeMode = dyeMode == null ? null : dyeMode.trim();
    }

    /**
     * 获取机型
     *
     * @return MACHINE_TYPE - 机型
     */
    public String getMachineType() {
        return machineType;
    }

    /**
     * 设置机型
     *
     * @param machineType 机型
     */
    public void setMachineType(String machineType) {
        this.machineType = machineType == null ? null : machineType.trim();
    }

    /**
     * 获取直径
     *
     * @return DIAMETER - 直径
     */
    public BigDecimal getDiameter() {
        return diameter;
    }

    /**
     * 设置直径
     *
     * @param diameter 直径
     */
    public void setDiameter(BigDecimal diameter) {
        this.diameter = diameter;
    }

    /**
     * 获取针筒数
     *
     * @return GAUGE - 针筒数
     */
    public BigDecimal getGauge() {
        return gauge;
    }

    /**
     * 设置针筒数
     *
     * @param gauge 针筒数
     */
    public void setGauge(BigDecimal gauge) {
        this.gauge = gauge;
    }

    /**
     * 获取开机模数
     *
     * @return BOOT - 开机模数
     */
    public BigDecimal getBoot() {
        return boot;
    }

    /**
     * 设置开机模数
     *
     * @param boot 开机模数
     */
    public void setBoot(BigDecimal boot) {
        this.boot = boot;
    }

    /**
     * 获取总针数
     *
     * @return TOTAL_NEEDLES - 总针数
     */
    public BigDecimal getTotalNeedles() {
        return totalNeedles;
    }

    /**
     * 设置总针数
     *
     * @param totalNeedles 总针数
     */
    public void setTotalNeedles(BigDecimal totalNeedles) {
        this.totalNeedles = totalNeedles;
    }

    /**
     * 获取是否开幅
     *
     * @return SCUTCHING_FLG - 是否开幅
     */
    public String getScutchingFlg() {
        return scutchingFlg;
    }

    /**
     * 设置是否开幅
     *
     * @param scutchingFlg 是否开幅
     */
    public void setScutchingFlg(String scutchingFlg) {
        this.scutchingFlg = scutchingFlg == null ? null : scutchingFlg.trim();
    }

    /**
     * 获取是否成衣洗水
     *
     * @return WASH_FLG - 是否成衣洗水
     */
    public String getWashFlg() {
        return washFlg;
    }

    /**
     * 设置是否成衣洗水
     *
     * @param washFlg 是否成衣洗水
     */
    public void setWashFlg(String washFlg) {
        this.washFlg = washFlg == null ? null : washFlg.trim();
    }

    /**
     * 获取是否过树脂
     *
     * @return RESIN_FLG - 是否过树脂
     */
    public String getResinFlg() {
        return resinFlg;
    }

    /**
     * 设置是否过树脂
     *
     * @param resinFlg 是否过树脂
     */
    public void setResinFlg(String resinFlg) {
        this.resinFlg = resinFlg == null ? null : resinFlg.trim();
    }

    /**
     * 获取布成分
     *
     * @return CLOTH_COMPONENT - 布成分
     */
    public String getClothComponent() {
        return clothComponent;
    }

    /**
     * 设置布成分
     *
     * @param clothComponent 布成分
     */
    public void setClothComponent(String clothComponent) {
        this.clothComponent = clothComponent == null ? null : clothComponent.trim();
    }

    /**
     * 获取织物正面
     *
     * @return CLOTH_FACE - 织物正面
     */
    public String getClothFace() {
        return clothFace;
    }

    /**
     * 设置织物正面
     *
     * @param clothFace 织物正面
     */
    public void setClothFace(String clothFace) {
        this.clothFace = clothFace == null ? null : clothFace.trim();
    }

    /**
     * 获取布种
     *
     * @return PROD_CLASS_ID - 布种
     */
    public String getProdClassId() {
        return prodClassId;
    }

    /**
     * 设置布种
     *
     * @param prodClassId 布种
     */
    public void setProdClassId(String prodClassId) {
        this.prodClassId = prodClassId == null ? null : prodClassId.trim();
    }

    /**
     * 获取CPI
     *
     * @return CPI - CPI
     */
    public BigDecimal getCpi() {
        return cpi;
    }

    /**
     * 设置CPI
     *
     * @param cpi CPI
     */
    public void setCpi(BigDecimal cpi) {
        this.cpi = cpi;
    }

    /**
     * 获取WPI
     *
     * @return WPI - WPI
     */
    public BigDecimal getWpi() {
        return wpi;
    }

    /**
     * 设置WPI
     *
     * @param wpi WPI
     */
    public void setWpi(BigDecimal wpi) {
        this.wpi = wpi;
    }

    /**
     * 获取最小幅宽
     *
     * @return MIN_WIDTH - 最小幅宽
     */
    public BigDecimal getMinWidth() {
        return minWidth;
    }

    /**
     * 设置最小幅宽
     *
     * @param minWidth 最小幅宽
     */
    public void setMinWidth(BigDecimal minWidth) {
        this.minWidth = minWidth;
    }

    /**
     * 获取最大幅宽
     *
     * @return MAX_WIDTH - 最大幅宽
     */
    public BigDecimal getMaxWidth() {
        return maxWidth;
    }

    /**
     * 设置最大幅宽
     *
     * @param maxWidth 最大幅宽
     */
    public void setMaxWidth(BigDecimal maxWidth) {
        this.maxWidth = maxWidth;
    }

    /**
     * 获取调机纱长
     *
     * @return YARN_LENGTH - 调机纱长
     */
    public String getYarnLength() {
        return yarnLength;
    }

    /**
     * 设置调机纱长
     *
     * @param yarnLength 调机纱长
     */
    public void setYarnLength(String yarnLength) {
        this.yarnLength = yarnLength == null ? null : yarnLength.trim();
    }

    /**
     * 获取最小克重
     *
     * @return MIN_WEIGHT - 最小克重
     */
    public BigDecimal getMinWeight() {
        return minWeight;
    }

    /**
     * 设置最小克重
     *
     * @param minWeight 最小克重
     */
    public void setMinWeight(BigDecimal minWeight) {
        this.minWeight = minWeight;
    }

    /**
     * 获取最大克重
     *
     * @return MAX_WEIGHT - 最大克重
     */
    public BigDecimal getMaxWeight() {
        return maxWeight;
    }

    /**
     * 设置最大克重
     *
     * @param maxWeight 最大克重
     */
    public void setMaxWeight(BigDecimal maxWeight) {
        this.maxWeight = maxWeight;
    }

    /**
     * 获取经向缩水
     *
     * @return SHRINK_LNG - 经向缩水
     */
    public BigDecimal getShrinkLng() {
        return shrinkLng;
    }

    /**
     * 设置经向缩水
     *
     * @param shrinkLng 经向缩水
     */
    public void setShrinkLng(BigDecimal shrinkLng) {
        this.shrinkLng = shrinkLng;
    }

    /**
     * 获取纬向缩水
     *
     * @return SHRINK_LAT - 纬向缩水
     */
    public BigDecimal getShrinkLat() {
        return shrinkLat;
    }

    /**
     * 设置纬向缩水
     *
     * @param shrinkLat 纬向缩水
     */
    public void setShrinkLat(BigDecimal shrinkLat) {
        this.shrinkLat = shrinkLat;
    }

    /**
     * 获取码重
     *
     * @return WEIGHT - 码重
     */
    public BigDecimal getWeight() {
        return weight;
    }

    /**
     * 设置码重
     *
     * @param weight 码重
     */
    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    /**
     * 获取编织工艺编号
     *
     * @return CRAFT_KNIT_ID - 编织工艺编号
     */
    public String getCraftKnitId() {
        return craftKnitId;
    }

    /**
     * 设置编织工艺编号
     *
     * @param craftKnitId 编织工艺编号
     */
    public void setCraftKnitId(String craftKnitId) {
        this.craftKnitId = craftKnitId == null ? null : craftKnitId.trim();
    }

    /**
     * 获取备注1
     *
     * @return REMARK1 - 备注1
     */
    public String getRemark1() {
        return remark1;
    }

    /**
     * 设置备注1
     *
     * @param remark1 备注1
     */
    public void setRemark1(String remark1) {
        this.remark1 = remark1 == null ? null : remark1.trim();
    }

    /**
     * 获取备注2
     *
     * @return REMARK2 - 备注2
     */
    public String getRemark2() {
        return remark2;
    }

    /**
     * 设置备注2
     *
     * @param remark2 备注2
     */
    public void setRemark2(String remark2) {
        this.remark2 = remark2 == null ? null : remark2.trim();
    }

    /**
     * 获取备注3
     *
     * @return REMARK3 - 备注3
     */
    public String getRemark3() {
        return remark3;
    }

    /**
     * 设置备注3
     *
     * @param remark3 备注3
     */
    public void setRemark3(String remark3) {
        this.remark3 = remark3 == null ? null : remark3.trim();
    }

    /**
     * 获取文本1
     *
     * @return CHAR1 - 文本1
     */
    public String getChar1() {
        return char1;
    }

    /**
     * 设置文本1
     *
     * @param char1 文本1
     */
    public void setChar1(String char1) {
        this.char1 = char1 == null ? null : char1.trim();
    }

    /**
     * 获取文本2
     *
     * @return CHAR2 - 文本2
     */
    public String getChar2() {
        return char2;
    }

    /**
     * 设置文本2
     *
     * @param char2 文本2
     */
    public void setChar2(String char2) {
        this.char2 = char2 == null ? null : char2.trim();
    }

    /**
     * 获取文本3
     *
     * @return CHAR3 - 文本3
     */
    public String getChar3() {
        return char3;
    }

    /**
     * 设置文本3
     *
     * @param char3 文本3
     */
    public void setChar3(String char3) {
        this.char3 = char3 == null ? null : char3.trim();
    }

    /**
     * 获取文本4
     *
     * @return CHAR4 - 文本4
     */
    public String getChar4() {
        return char4;
    }

    /**
     * 设置文本4
     *
     * @param char4 文本4
     */
    public void setChar4(String char4) {
        this.char4 = char4 == null ? null : char4.trim();
    }

    /**
     * 获取文本5
     *
     * @return CHAR5 - 文本5
     */
    public String getChar5() {
        return char5;
    }

    /**
     * 设置文本5
     *
     * @param char5 文本5
     */
    public void setChar5(String char5) {
        this.char5 = char5 == null ? null : char5.trim();
    }

    /**
     * 获取文本6
     *
     * @return CHAR6 - 文本6
     */
    public String getChar6() {
        return char6;
    }

    /**
     * 设置文本6
     *
     * @param char6 文本6
     */
    public void setChar6(String char6) {
        this.char6 = char6 == null ? null : char6.trim();
    }

    /**
     * 获取文本7
     *
     * @return CHAR7 - 文本7
     */
    public String getChar7() {
        return char7;
    }

    /**
     * 设置文本7
     *
     * @param char7 文本7
     */
    public void setChar7(String char7) {
        this.char7 = char7 == null ? null : char7.trim();
    }

    /**
     * 获取文本8
     *
     * @return CHAR8 - 文本8
     */
    public String getChar8() {
        return char8;
    }

    /**
     * 设置文本8
     *
     * @param char8 文本8
     */
    public void setChar8(String char8) {
        this.char8 = char8 == null ? null : char8.trim();
    }

    /**
     * 获取文本9
     *
     * @return CHAR9 - 文本9
     */
    public String getChar9() {
        return char9;
    }

    /**
     * 设置文本9
     *
     * @param char9 文本9
     */
    public void setChar9(String char9) {
        this.char9 = char9 == null ? null : char9.trim();
    }

    /**
     * 获取文本10
     *
     * @return CHAR10 - 文本10
     */
    public String getChar10() {
        return char10;
    }

    /**
     * 设置文本10
     *
     * @param char10 文本10
     */
    public void setChar10(String char10) {
        this.char10 = char10 == null ? null : char10.trim();
    }

    /**
     * 获取数值1
     *
     * @return NUM1 - 数值1
     */
    public BigDecimal getNum1() {
        return num1;
    }

    /**
     * 设置数值1
     *
     * @param num1 数值1
     */
    public void setNum1(BigDecimal num1) {
        this.num1 = num1;
    }

    /**
     * 获取数值2
     *
     * @return NUM2 - 数值2
     */
    public BigDecimal getNum2() {
        return num2;
    }

    /**
     * 设置数值2
     *
     * @param num2 数值2
     */
    public void setNum2(BigDecimal num2) {
        this.num2 = num2;
    }

    /**
     * 获取数值3
     *
     * @return NUM3 - 数值3
     */
    public BigDecimal getNum3() {
        return num3;
    }

    /**
     * 设置数值3
     *
     * @param num3 数值3
     */
    public void setNum3(BigDecimal num3) {
        this.num3 = num3;
    }

    /**
     * 获取数值4
     *
     * @return NUM4 - 数值4
     */
    public BigDecimal getNum4() {
        return num4;
    }

    /**
     * 设置数值4
     *
     * @param num4 数值4
     */
    public void setNum4(BigDecimal num4) {
        this.num4 = num4;
    }

    /**
     * 获取数值5
     *
     * @return NUM5 - 数值5
     */
    public BigDecimal getNum5() {
        return num5;
    }

    /**
     * 设置数值5
     *
     * @param num5 数值5
     */
    public void setNum5(BigDecimal num5) {
        this.num5 = num5;
    }

    /**
     * 获取数值6
     *
     * @return NUM6 - 数值6
     */
    public BigDecimal getNum6() {
        return num6;
    }

    /**
     * 设置数值6
     *
     * @param num6 数值6
     */
    public void setNum6(BigDecimal num6) {
        this.num6 = num6;
    }

    /**
     * 获取数值7
     *
     * @return NUM7 - 数值7
     */
    public BigDecimal getNum7() {
        return num7;
    }

    /**
     * 设置数值7
     *
     * @param num7 数值7
     */
    public void setNum7(BigDecimal num7) {
        this.num7 = num7;
    }

    /**
     * 获取数值8
     *
     * @return NUM8 - 数值8
     */
    public BigDecimal getNum8() {
        return num8;
    }

    /**
     * 设置数值8
     *
     * @param num8 数值8
     */
    public void setNum8(BigDecimal num8) {
        this.num8 = num8;
    }

    /**
     * 获取数值9
     *
     * @return NUM9 - 数值9
     */
    public BigDecimal getNum9() {
        return num9;
    }

    /**
     * 设置数值9
     *
     * @param num9 数值9
     */
    public void setNum9(BigDecimal num9) {
        this.num9 = num9;
    }

    /**
     * 获取数值10
     *
     * @return NUM10 - 数值10
     */
    public BigDecimal getNum10() {
        return num10;
    }

    /**
     * 设置数值10
     *
     * @param num10 数值10
     */
    public void setNum10(BigDecimal num10) {
        this.num10 = num10;
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
        TCraftKnit other = (TCraftKnit) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCraftSn() == null ? other.getCraftSn() == null : this.getCraftSn().equals(other.getCraftSn()))
            && (this.getCraftCd() == null ? other.getCraftCd() == null : this.getCraftCd().equals(other.getCraftCd()))
            && (this.getCraftLineNum() == null ? other.getCraftLineNum() == null : this.getCraftLineNum().equals(other.getCraftLineNum()))
            && (this.getSellOrdCd() == null ? other.getSellOrdCd() == null : this.getSellOrdCd().equals(other.getSellOrdCd()))
            && (this.getSellOrdMainmaterialCd() == null ? other.getSellOrdMainmaterialCd() == null : this.getSellOrdMainmaterialCd().equals(other.getSellOrdMainmaterialCd()))
            && (this.getProdId() == null ? other.getProdId() == null : this.getProdId().equals(other.getProdId()))
            && (this.getCntrCd() == null ? other.getCntrCd() == null : this.getCntrCd().equals(other.getCntrCd()))
            && (this.getCustomerId() == null ? other.getCustomerId() == null : this.getCustomerId().equals(other.getCustomerId()))
            && (this.getPattern() == null ? other.getPattern() == null : this.getPattern().equals(other.getPattern()))
            && (this.getDyeMode() == null ? other.getDyeMode() == null : this.getDyeMode().equals(other.getDyeMode()))
            && (this.getMachineType() == null ? other.getMachineType() == null : this.getMachineType().equals(other.getMachineType()))
            && (this.getDiameter() == null ? other.getDiameter() == null : this.getDiameter().equals(other.getDiameter()))
            && (this.getGauge() == null ? other.getGauge() == null : this.getGauge().equals(other.getGauge()))
            && (this.getBoot() == null ? other.getBoot() == null : this.getBoot().equals(other.getBoot()))
            && (this.getTotalNeedles() == null ? other.getTotalNeedles() == null : this.getTotalNeedles().equals(other.getTotalNeedles()))
            && (this.getScutchingFlg() == null ? other.getScutchingFlg() == null : this.getScutchingFlg().equals(other.getScutchingFlg()))
            && (this.getWashFlg() == null ? other.getWashFlg() == null : this.getWashFlg().equals(other.getWashFlg()))
            && (this.getResinFlg() == null ? other.getResinFlg() == null : this.getResinFlg().equals(other.getResinFlg()))
            && (this.getClothComponent() == null ? other.getClothComponent() == null : this.getClothComponent().equals(other.getClothComponent()))
            && (this.getClothFace() == null ? other.getClothFace() == null : this.getClothFace().equals(other.getClothFace()))
            && (this.getProdClassId() == null ? other.getProdClassId() == null : this.getProdClassId().equals(other.getProdClassId()))
            && (this.getCpi() == null ? other.getCpi() == null : this.getCpi().equals(other.getCpi()))
            && (this.getWpi() == null ? other.getWpi() == null : this.getWpi().equals(other.getWpi()))
            && (this.getMinWidth() == null ? other.getMinWidth() == null : this.getMinWidth().equals(other.getMinWidth()))
            && (this.getMaxWidth() == null ? other.getMaxWidth() == null : this.getMaxWidth().equals(other.getMaxWidth()))
            && (this.getYarnLength() == null ? other.getYarnLength() == null : this.getYarnLength().equals(other.getYarnLength()))
            && (this.getMinWeight() == null ? other.getMinWeight() == null : this.getMinWeight().equals(other.getMinWeight()))
            && (this.getMaxWeight() == null ? other.getMaxWeight() == null : this.getMaxWeight().equals(other.getMaxWeight()))
            && (this.getShrinkLng() == null ? other.getShrinkLng() == null : this.getShrinkLng().equals(other.getShrinkLng()))
            && (this.getShrinkLat() == null ? other.getShrinkLat() == null : this.getShrinkLat().equals(other.getShrinkLat()))
            && (this.getWeight() == null ? other.getWeight() == null : this.getWeight().equals(other.getWeight()))
            && (this.getCraftKnitId() == null ? other.getCraftKnitId() == null : this.getCraftKnitId().equals(other.getCraftKnitId()))
            && (this.getRemark1() == null ? other.getRemark1() == null : this.getRemark1().equals(other.getRemark1()))
            && (this.getRemark2() == null ? other.getRemark2() == null : this.getRemark2().equals(other.getRemark2()))
            && (this.getRemark3() == null ? other.getRemark3() == null : this.getRemark3().equals(other.getRemark3()))
            && (this.getChar1() == null ? other.getChar1() == null : this.getChar1().equals(other.getChar1()))
            && (this.getChar2() == null ? other.getChar2() == null : this.getChar2().equals(other.getChar2()))
            && (this.getChar3() == null ? other.getChar3() == null : this.getChar3().equals(other.getChar3()))
            && (this.getChar4() == null ? other.getChar4() == null : this.getChar4().equals(other.getChar4()))
            && (this.getChar5() == null ? other.getChar5() == null : this.getChar5().equals(other.getChar5()))
            && (this.getChar6() == null ? other.getChar6() == null : this.getChar6().equals(other.getChar6()))
            && (this.getChar7() == null ? other.getChar7() == null : this.getChar7().equals(other.getChar7()))
            && (this.getChar8() == null ? other.getChar8() == null : this.getChar8().equals(other.getChar8()))
            && (this.getChar9() == null ? other.getChar9() == null : this.getChar9().equals(other.getChar9()))
            && (this.getChar10() == null ? other.getChar10() == null : this.getChar10().equals(other.getChar10()))
            && (this.getNum1() == null ? other.getNum1() == null : this.getNum1().equals(other.getNum1()))
            && (this.getNum2() == null ? other.getNum2() == null : this.getNum2().equals(other.getNum2()))
            && (this.getNum3() == null ? other.getNum3() == null : this.getNum3().equals(other.getNum3()))
            && (this.getNum4() == null ? other.getNum4() == null : this.getNum4().equals(other.getNum4()))
            && (this.getNum5() == null ? other.getNum5() == null : this.getNum5().equals(other.getNum5()))
            && (this.getNum6() == null ? other.getNum6() == null : this.getNum6().equals(other.getNum6()))
            && (this.getNum7() == null ? other.getNum7() == null : this.getNum7().equals(other.getNum7()))
            && (this.getNum8() == null ? other.getNum8() == null : this.getNum8().equals(other.getNum8()))
            && (this.getNum9() == null ? other.getNum9() == null : this.getNum9().equals(other.getNum9()))
            && (this.getNum10() == null ? other.getNum10() == null : this.getNum10().equals(other.getNum10()))
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
        result = prime * result + ((getCraftSn() == null) ? 0 : getCraftSn().hashCode());
        result = prime * result + ((getCraftCd() == null) ? 0 : getCraftCd().hashCode());
        result = prime * result + ((getCraftLineNum() == null) ? 0 : getCraftLineNum().hashCode());
        result = prime * result + ((getSellOrdCd() == null) ? 0 : getSellOrdCd().hashCode());
        result = prime * result + ((getSellOrdMainmaterialCd() == null) ? 0 : getSellOrdMainmaterialCd().hashCode());
        result = prime * result + ((getProdId() == null) ? 0 : getProdId().hashCode());
        result = prime * result + ((getCntrCd() == null) ? 0 : getCntrCd().hashCode());
        result = prime * result + ((getCustomerId() == null) ? 0 : getCustomerId().hashCode());
        result = prime * result + ((getPattern() == null) ? 0 : getPattern().hashCode());
        result = prime * result + ((getDyeMode() == null) ? 0 : getDyeMode().hashCode());
        result = prime * result + ((getMachineType() == null) ? 0 : getMachineType().hashCode());
        result = prime * result + ((getDiameter() == null) ? 0 : getDiameter().hashCode());
        result = prime * result + ((getGauge() == null) ? 0 : getGauge().hashCode());
        result = prime * result + ((getBoot() == null) ? 0 : getBoot().hashCode());
        result = prime * result + ((getTotalNeedles() == null) ? 0 : getTotalNeedles().hashCode());
        result = prime * result + ((getScutchingFlg() == null) ? 0 : getScutchingFlg().hashCode());
        result = prime * result + ((getWashFlg() == null) ? 0 : getWashFlg().hashCode());
        result = prime * result + ((getResinFlg() == null) ? 0 : getResinFlg().hashCode());
        result = prime * result + ((getClothComponent() == null) ? 0 : getClothComponent().hashCode());
        result = prime * result + ((getClothFace() == null) ? 0 : getClothFace().hashCode());
        result = prime * result + ((getProdClassId() == null) ? 0 : getProdClassId().hashCode());
        result = prime * result + ((getCpi() == null) ? 0 : getCpi().hashCode());
        result = prime * result + ((getWpi() == null) ? 0 : getWpi().hashCode());
        result = prime * result + ((getMinWidth() == null) ? 0 : getMinWidth().hashCode());
        result = prime * result + ((getMaxWidth() == null) ? 0 : getMaxWidth().hashCode());
        result = prime * result + ((getYarnLength() == null) ? 0 : getYarnLength().hashCode());
        result = prime * result + ((getMinWeight() == null) ? 0 : getMinWeight().hashCode());
        result = prime * result + ((getMaxWeight() == null) ? 0 : getMaxWeight().hashCode());
        result = prime * result + ((getShrinkLng() == null) ? 0 : getShrinkLng().hashCode());
        result = prime * result + ((getShrinkLat() == null) ? 0 : getShrinkLat().hashCode());
        result = prime * result + ((getWeight() == null) ? 0 : getWeight().hashCode());
        result = prime * result + ((getCraftKnitId() == null) ? 0 : getCraftKnitId().hashCode());
        result = prime * result + ((getRemark1() == null) ? 0 : getRemark1().hashCode());
        result = prime * result + ((getRemark2() == null) ? 0 : getRemark2().hashCode());
        result = prime * result + ((getRemark3() == null) ? 0 : getRemark3().hashCode());
        result = prime * result + ((getChar1() == null) ? 0 : getChar1().hashCode());
        result = prime * result + ((getChar2() == null) ? 0 : getChar2().hashCode());
        result = prime * result + ((getChar3() == null) ? 0 : getChar3().hashCode());
        result = prime * result + ((getChar4() == null) ? 0 : getChar4().hashCode());
        result = prime * result + ((getChar5() == null) ? 0 : getChar5().hashCode());
        result = prime * result + ((getChar6() == null) ? 0 : getChar6().hashCode());
        result = prime * result + ((getChar7() == null) ? 0 : getChar7().hashCode());
        result = prime * result + ((getChar8() == null) ? 0 : getChar8().hashCode());
        result = prime * result + ((getChar9() == null) ? 0 : getChar9().hashCode());
        result = prime * result + ((getChar10() == null) ? 0 : getChar10().hashCode());
        result = prime * result + ((getNum1() == null) ? 0 : getNum1().hashCode());
        result = prime * result + ((getNum2() == null) ? 0 : getNum2().hashCode());
        result = prime * result + ((getNum3() == null) ? 0 : getNum3().hashCode());
        result = prime * result + ((getNum4() == null) ? 0 : getNum4().hashCode());
        result = prime * result + ((getNum5() == null) ? 0 : getNum5().hashCode());
        result = prime * result + ((getNum6() == null) ? 0 : getNum6().hashCode());
        result = prime * result + ((getNum7() == null) ? 0 : getNum7().hashCode());
        result = prime * result + ((getNum8() == null) ? 0 : getNum8().hashCode());
        result = prime * result + ((getNum9() == null) ? 0 : getNum9().hashCode());
        result = prime * result + ((getNum10() == null) ? 0 : getNum10().hashCode());
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
        sb.append(", craftSn=").append(craftSn);
        sb.append(", craftCd=").append(craftCd);
        sb.append(", craftLineNum=").append(craftLineNum);
        sb.append(", sellOrdCd=").append(sellOrdCd);
        sb.append(", sellOrdMainmaterialCd=").append(sellOrdMainmaterialCd);
        sb.append(", prodId=").append(prodId);
        sb.append(", cntrCd=").append(cntrCd);
        sb.append(", customerId=").append(customerId);
        sb.append(", pattern=").append(pattern);
        sb.append(", dyeMode=").append(dyeMode);
        sb.append(", machineType=").append(machineType);
        sb.append(", diameter=").append(diameter);
        sb.append(", gauge=").append(gauge);
        sb.append(", boot=").append(boot);
        sb.append(", totalNeedles=").append(totalNeedles);
        sb.append(", scutchingFlg=").append(scutchingFlg);
        sb.append(", washFlg=").append(washFlg);
        sb.append(", resinFlg=").append(resinFlg);
        sb.append(", clothComponent=").append(clothComponent);
        sb.append(", clothFace=").append(clothFace);
        sb.append(", prodClassId=").append(prodClassId);
        sb.append(", cpi=").append(cpi);
        sb.append(", wpi=").append(wpi);
        sb.append(", minWidth=").append(minWidth);
        sb.append(", maxWidth=").append(maxWidth);
        sb.append(", yarnLength=").append(yarnLength);
        sb.append(", minWeight=").append(minWeight);
        sb.append(", maxWeight=").append(maxWeight);
        sb.append(", shrinkLng=").append(shrinkLng);
        sb.append(", shrinkLat=").append(shrinkLat);
        sb.append(", weight=").append(weight);
        sb.append(", craftKnitId=").append(craftKnitId);
        sb.append(", remark1=").append(remark1);
        sb.append(", remark2=").append(remark2);
        sb.append(", remark3=").append(remark3);
        sb.append(", char1=").append(char1);
        sb.append(", char2=").append(char2);
        sb.append(", char3=").append(char3);
        sb.append(", char4=").append(char4);
        sb.append(", char5=").append(char5);
        sb.append(", char6=").append(char6);
        sb.append(", char7=").append(char7);
        sb.append(", char8=").append(char8);
        sb.append(", char9=").append(char9);
        sb.append(", char10=").append(char10);
        sb.append(", num1=").append(num1);
        sb.append(", num2=").append(num2);
        sb.append(", num3=").append(num3);
        sb.append(", num4=").append(num4);
        sb.append(", num5=").append(num5);
        sb.append(", num6=").append(num6);
        sb.append(", num7=").append(num7);
        sb.append(", num8=").append(num8);
        sb.append(", num9=").append(num9);
        sb.append(", num10=").append(num10);
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
