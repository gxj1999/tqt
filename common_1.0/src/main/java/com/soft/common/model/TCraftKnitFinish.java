package com.soft.common.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "`t_craft_knit_finish`")
public class TCraftKnitFinish implements Serializable {
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
     * 后整理编号
     */
    @Column(name = "`CRAFT_FINISH_NUM`")
    private String craftFinishNum;

    /**
     * 色号
     */
    @Column(name = "`COLOR_CD`")
    private String colorCd;

    /**
     * 染洗机型
     */
    @Column(name = "`DYE_MACHINE_TYPE`")
    private String dyeMachineType;

    /**
     * 煮练机型
     */
    @Column(name = "`SCOUR_MACHINE_TYPE`")
    private String scourMachineType;

    /**
     * 烘干机型
     */
    @Column(name = "`DRY_MACHINE_TYPE`")
    private String dryMachineType;

    /**
     * 花型
     */
    @Column(name = "`PATTERN`")
    private String pattern;

    /**
     * 手感要求
     */
    @Column(name = "`NEED_FEEL`")
    private String needFeel;

    /**
     * 酶洗配方
     */
    @Column(name = "`ENZYME_FORMULA`")
    private String enzymeFormula;

    /**
     * 扭曲
     */
    @Column(name = "`DISTORT`")
    private BigDecimal distort;

    /**
     * 弯曲
     */
    @Column(name = "`BEND`")
    private BigDecimal bend;

    /**
     * 布强力
     */
    @Column(name = "`CLOTH_STRENGTH`")
    private String clothStrength;

    /**
     * 起毛起球
     */
    @Column(name = "`PILLING`")
    private String pilling;

    /**
     * 最小纬斜度
     */
    @Column(name = "`MIN_LAT_SLOPE`")
    private BigDecimal minLatSlope;

    /**
     * 最大纬斜度
     */
    @Column(name = "`MAX_LAT_SLOPE`")
    private BigDecimal maxLatSlope;

    /**
     * 湿摩擦
     */
    @Column(name = "`WET_RUBBING`")
    private String wetRubbing;

    /**
     * 特殊整理
     */
    @Column(name = "`SPECIAL_FINISH`")
    private String specialFinish;

    /**
     * 洗水后克重
     */
    @Column(name = "`WASH_WEIGHT_AFTER`")
    private BigDecimal washWeightAfter;

    /**
     * 测试方法
     */
    @Column(name = "`TEST`")
    private String test;

    /**
     * 循环长
     */
    @Column(name = "`FOR_LENGTH`")
    private BigDecimal forLength;

    /**
     * 循环宽
     */
    @Column(name = "`FOR_WIDTH`")
    private BigDecimal forWidth;

    /**
     * 匹染备注
     */
    @Column(name = "`DYE_REMARK`")
    private String dyeRemark;

    /**
     * 整理备注
     */
    @Column(name = "`FINISH_REMARK`")
    private String finishRemark;

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
     * 获取后整理编号
     *
     * @return CRAFT_FINISH_NUM - 后整理编号
     */
    public String getCraftFinishNum() {
        return craftFinishNum;
    }

    /**
     * 设置后整理编号
     *
     * @param craftFinishNum 后整理编号
     */
    public void setCraftFinishNum(String craftFinishNum) {
        this.craftFinishNum = craftFinishNum == null ? null : craftFinishNum.trim();
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
     * 获取染洗机型
     *
     * @return DYE_MACHINE_TYPE - 染洗机型
     */
    public String getDyeMachineType() {
        return dyeMachineType;
    }

    /**
     * 设置染洗机型
     *
     * @param dyeMachineType 染洗机型
     */
    public void setDyeMachineType(String dyeMachineType) {
        this.dyeMachineType = dyeMachineType == null ? null : dyeMachineType.trim();
    }

    /**
     * 获取煮练机型
     *
     * @return SCOUR_MACHINE_TYPE - 煮练机型
     */
    public String getScourMachineType() {
        return scourMachineType;
    }

    /**
     * 设置煮练机型
     *
     * @param scourMachineType 煮练机型
     */
    public void setScourMachineType(String scourMachineType) {
        this.scourMachineType = scourMachineType == null ? null : scourMachineType.trim();
    }

    /**
     * 获取烘干机型
     *
     * @return DRY_MACHINE_TYPE - 烘干机型
     */
    public String getDryMachineType() {
        return dryMachineType;
    }

    /**
     * 设置烘干机型
     *
     * @param dryMachineType 烘干机型
     */
    public void setDryMachineType(String dryMachineType) {
        this.dryMachineType = dryMachineType == null ? null : dryMachineType.trim();
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
     * 获取手感要求
     *
     * @return NEED_FEEL - 手感要求
     */
    public String getNeedFeel() {
        return needFeel;
    }

    /**
     * 设置手感要求
     *
     * @param needFeel 手感要求
     */
    public void setNeedFeel(String needFeel) {
        this.needFeel = needFeel == null ? null : needFeel.trim();
    }

    /**
     * 获取酶洗配方
     *
     * @return ENZYME_FORMULA - 酶洗配方
     */
    public String getEnzymeFormula() {
        return enzymeFormula;
    }

    /**
     * 设置酶洗配方
     *
     * @param enzymeFormula 酶洗配方
     */
    public void setEnzymeFormula(String enzymeFormula) {
        this.enzymeFormula = enzymeFormula == null ? null : enzymeFormula.trim();
    }

    /**
     * 获取扭曲
     *
     * @return DISTORT - 扭曲
     */
    public BigDecimal getDistort() {
        return distort;
    }

    /**
     * 设置扭曲
     *
     * @param distort 扭曲
     */
    public void setDistort(BigDecimal distort) {
        this.distort = distort;
    }

    /**
     * 获取弯曲
     *
     * @return BEND - 弯曲
     */
    public BigDecimal getBend() {
        return bend;
    }

    /**
     * 设置弯曲
     *
     * @param bend 弯曲
     */
    public void setBend(BigDecimal bend) {
        this.bend = bend;
    }

    /**
     * 获取布强力
     *
     * @return CLOTH_STRENGTH - 布强力
     */
    public String getClothStrength() {
        return clothStrength;
    }

    /**
     * 设置布强力
     *
     * @param clothStrength 布强力
     */
    public void setClothStrength(String clothStrength) {
        this.clothStrength = clothStrength == null ? null : clothStrength.trim();
    }

    /**
     * 获取起毛起球
     *
     * @return PILLING - 起毛起球
     */
    public String getPilling() {
        return pilling;
    }

    /**
     * 设置起毛起球
     *
     * @param pilling 起毛起球
     */
    public void setPilling(String pilling) {
        this.pilling = pilling == null ? null : pilling.trim();
    }

    /**
     * 获取最小纬斜度
     *
     * @return MIN_LAT_SLOPE - 最小纬斜度
     */
    public BigDecimal getMinLatSlope() {
        return minLatSlope;
    }

    /**
     * 设置最小纬斜度
     *
     * @param minLatSlope 最小纬斜度
     */
    public void setMinLatSlope(BigDecimal minLatSlope) {
        this.minLatSlope = minLatSlope;
    }

    /**
     * 获取最大纬斜度
     *
     * @return MAX_LAT_SLOPE - 最大纬斜度
     */
    public BigDecimal getMaxLatSlope() {
        return maxLatSlope;
    }

    /**
     * 设置最大纬斜度
     *
     * @param maxLatSlope 最大纬斜度
     */
    public void setMaxLatSlope(BigDecimal maxLatSlope) {
        this.maxLatSlope = maxLatSlope;
    }

    /**
     * 获取湿摩擦
     *
     * @return WET_RUBBING - 湿摩擦
     */
    public String getWetRubbing() {
        return wetRubbing;
    }

    /**
     * 设置湿摩擦
     *
     * @param wetRubbing 湿摩擦
     */
    public void setWetRubbing(String wetRubbing) {
        this.wetRubbing = wetRubbing == null ? null : wetRubbing.trim();
    }

    /**
     * 获取特殊整理
     *
     * @return SPECIAL_FINISH - 特殊整理
     */
    public String getSpecialFinish() {
        return specialFinish;
    }

    /**
     * 设置特殊整理
     *
     * @param specialFinish 特殊整理
     */
    public void setSpecialFinish(String specialFinish) {
        this.specialFinish = specialFinish == null ? null : specialFinish.trim();
    }

    /**
     * 获取洗水后克重
     *
     * @return WASH_WEIGHT_AFTER - 洗水后克重
     */
    public BigDecimal getWashWeightAfter() {
        return washWeightAfter;
    }

    /**
     * 设置洗水后克重
     *
     * @param washWeightAfter 洗水后克重
     */
    public void setWashWeightAfter(BigDecimal washWeightAfter) {
        this.washWeightAfter = washWeightAfter;
    }

    /**
     * 获取测试方法
     *
     * @return TEST - 测试方法
     */
    public String getTest() {
        return test;
    }

    /**
     * 设置测试方法
     *
     * @param test 测试方法
     */
    public void setTest(String test) {
        this.test = test == null ? null : test.trim();
    }

    /**
     * 获取循环长
     *
     * @return FOR_LENGTH - 循环长
     */
    public BigDecimal getForLength() {
        return forLength;
    }

    /**
     * 设置循环长
     *
     * @param forLength 循环长
     */
    public void setForLength(BigDecimal forLength) {
        this.forLength = forLength;
    }

    /**
     * 获取循环宽
     *
     * @return FOR_WIDTH - 循环宽
     */
    public BigDecimal getForWidth() {
        return forWidth;
    }

    /**
     * 设置循环宽
     *
     * @param forWidth 循环宽
     */
    public void setForWidth(BigDecimal forWidth) {
        this.forWidth = forWidth;
    }

    /**
     * 获取匹染备注
     *
     * @return DYE_REMARK - 匹染备注
     */
    public String getDyeRemark() {
        return dyeRemark;
    }

    /**
     * 设置匹染备注
     *
     * @param dyeRemark 匹染备注
     */
    public void setDyeRemark(String dyeRemark) {
        this.dyeRemark = dyeRemark == null ? null : dyeRemark.trim();
    }

    /**
     * 获取整理备注
     *
     * @return FINISH_REMARK - 整理备注
     */
    public String getFinishRemark() {
        return finishRemark;
    }

    /**
     * 设置整理备注
     *
     * @param finishRemark 整理备注
     */
    public void setFinishRemark(String finishRemark) {
        this.finishRemark = finishRemark == null ? null : finishRemark.trim();
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
        TCraftKnitFinish other = (TCraftKnitFinish) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCraftSn() == null ? other.getCraftSn() == null : this.getCraftSn().equals(other.getCraftSn()))
            && (this.getCraftFinishNum() == null ? other.getCraftFinishNum() == null : this.getCraftFinishNum().equals(other.getCraftFinishNum()))
            && (this.getColorCd() == null ? other.getColorCd() == null : this.getColorCd().equals(other.getColorCd()))
            && (this.getDyeMachineType() == null ? other.getDyeMachineType() == null : this.getDyeMachineType().equals(other.getDyeMachineType()))
            && (this.getScourMachineType() == null ? other.getScourMachineType() == null : this.getScourMachineType().equals(other.getScourMachineType()))
            && (this.getDryMachineType() == null ? other.getDryMachineType() == null : this.getDryMachineType().equals(other.getDryMachineType()))
            && (this.getPattern() == null ? other.getPattern() == null : this.getPattern().equals(other.getPattern()))
            && (this.getNeedFeel() == null ? other.getNeedFeel() == null : this.getNeedFeel().equals(other.getNeedFeel()))
            && (this.getEnzymeFormula() == null ? other.getEnzymeFormula() == null : this.getEnzymeFormula().equals(other.getEnzymeFormula()))
            && (this.getDistort() == null ? other.getDistort() == null : this.getDistort().equals(other.getDistort()))
            && (this.getBend() == null ? other.getBend() == null : this.getBend().equals(other.getBend()))
            && (this.getClothStrength() == null ? other.getClothStrength() == null : this.getClothStrength().equals(other.getClothStrength()))
            && (this.getPilling() == null ? other.getPilling() == null : this.getPilling().equals(other.getPilling()))
            && (this.getMinLatSlope() == null ? other.getMinLatSlope() == null : this.getMinLatSlope().equals(other.getMinLatSlope()))
            && (this.getMaxLatSlope() == null ? other.getMaxLatSlope() == null : this.getMaxLatSlope().equals(other.getMaxLatSlope()))
            && (this.getWetRubbing() == null ? other.getWetRubbing() == null : this.getWetRubbing().equals(other.getWetRubbing()))
            && (this.getSpecialFinish() == null ? other.getSpecialFinish() == null : this.getSpecialFinish().equals(other.getSpecialFinish()))
            && (this.getWashWeightAfter() == null ? other.getWashWeightAfter() == null : this.getWashWeightAfter().equals(other.getWashWeightAfter()))
            && (this.getTest() == null ? other.getTest() == null : this.getTest().equals(other.getTest()))
            && (this.getForLength() == null ? other.getForLength() == null : this.getForLength().equals(other.getForLength()))
            && (this.getForWidth() == null ? other.getForWidth() == null : this.getForWidth().equals(other.getForWidth()))
            && (this.getDyeRemark() == null ? other.getDyeRemark() == null : this.getDyeRemark().equals(other.getDyeRemark()))
            && (this.getFinishRemark() == null ? other.getFinishRemark() == null : this.getFinishRemark().equals(other.getFinishRemark()))
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
        result = prime * result + ((getCraftFinishNum() == null) ? 0 : getCraftFinishNum().hashCode());
        result = prime * result + ((getColorCd() == null) ? 0 : getColorCd().hashCode());
        result = prime * result + ((getDyeMachineType() == null) ? 0 : getDyeMachineType().hashCode());
        result = prime * result + ((getScourMachineType() == null) ? 0 : getScourMachineType().hashCode());
        result = prime * result + ((getDryMachineType() == null) ? 0 : getDryMachineType().hashCode());
        result = prime * result + ((getPattern() == null) ? 0 : getPattern().hashCode());
        result = prime * result + ((getNeedFeel() == null) ? 0 : getNeedFeel().hashCode());
        result = prime * result + ((getEnzymeFormula() == null) ? 0 : getEnzymeFormula().hashCode());
        result = prime * result + ((getDistort() == null) ? 0 : getDistort().hashCode());
        result = prime * result + ((getBend() == null) ? 0 : getBend().hashCode());
        result = prime * result + ((getClothStrength() == null) ? 0 : getClothStrength().hashCode());
        result = prime * result + ((getPilling() == null) ? 0 : getPilling().hashCode());
        result = prime * result + ((getMinLatSlope() == null) ? 0 : getMinLatSlope().hashCode());
        result = prime * result + ((getMaxLatSlope() == null) ? 0 : getMaxLatSlope().hashCode());
        result = prime * result + ((getWetRubbing() == null) ? 0 : getWetRubbing().hashCode());
        result = prime * result + ((getSpecialFinish() == null) ? 0 : getSpecialFinish().hashCode());
        result = prime * result + ((getWashWeightAfter() == null) ? 0 : getWashWeightAfter().hashCode());
        result = prime * result + ((getTest() == null) ? 0 : getTest().hashCode());
        result = prime * result + ((getForLength() == null) ? 0 : getForLength().hashCode());
        result = prime * result + ((getForWidth() == null) ? 0 : getForWidth().hashCode());
        result = prime * result + ((getDyeRemark() == null) ? 0 : getDyeRemark().hashCode());
        result = prime * result + ((getFinishRemark() == null) ? 0 : getFinishRemark().hashCode());
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
        sb.append(", craftFinishNum=").append(craftFinishNum);
        sb.append(", colorCd=").append(colorCd);
        sb.append(", dyeMachineType=").append(dyeMachineType);
        sb.append(", scourMachineType=").append(scourMachineType);
        sb.append(", dryMachineType=").append(dryMachineType);
        sb.append(", pattern=").append(pattern);
        sb.append(", needFeel=").append(needFeel);
        sb.append(", enzymeFormula=").append(enzymeFormula);
        sb.append(", distort=").append(distort);
        sb.append(", bend=").append(bend);
        sb.append(", clothStrength=").append(clothStrength);
        sb.append(", pilling=").append(pilling);
        sb.append(", minLatSlope=").append(minLatSlope);
        sb.append(", maxLatSlope=").append(maxLatSlope);
        sb.append(", wetRubbing=").append(wetRubbing);
        sb.append(", specialFinish=").append(specialFinish);
        sb.append(", washWeightAfter=").append(washWeightAfter);
        sb.append(", test=").append(test);
        sb.append(", forLength=").append(forLength);
        sb.append(", forWidth=").append(forWidth);
        sb.append(", dyeRemark=").append(dyeRemark);
        sb.append(", finishRemark=").append(finishRemark);
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