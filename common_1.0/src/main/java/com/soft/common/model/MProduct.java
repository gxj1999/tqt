package com.soft.common.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@ApiModel(description="商品")
@Table(name = "m_product")
public class MProduct implements Serializable {
    /**
     * 主键
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value="主键")
    private String id;

    /**
     * 中心编号
     */
    @Column(name = "CNTR_CD")
    @ApiModelProperty(value="中心编号")
    private String cntrCd;

    /**
     * 商品表示用编号
     */
    @Column(name = "PROD_CD_DIS")
    @ApiModelProperty(value="商品表示用编号")
    private String prodCdDis;

    /**
     * 商品名称
     */
    @Column(name = "PROD_NM")
    @ApiModelProperty(value="商品名称")
    private String prodNm;

    /**
     * 商品简称
     */
    @Column(name = "PROD_JC")
    @ApiModelProperty(value="商品简称")
    private String prodJc;

    /**
     * 商品英文名称
     */
    @Column(name = "PROD_NM_EN")
    @ApiModelProperty(value="商品英文名称")
    private String prodNmEn;

    /**
     * 商品种类
     */
    @Column(name = "PROD_TYPE")
    @ApiModelProperty(value="商品种类")
    private String prodType;

    /**
     * 商品分类编号
     */
    @Column(name = "PROD_CLASS_ID")
    @ApiModelProperty(value="商品分类编号")
    private String prodClassId;

    /**
     * 规格型号
     */
    @Column(name = "ASSET_MODEL")
    @ApiModelProperty(value="规格型号")
    private String assetModel;

    /**
     * 纱支
     */
    @Column(name = "YARN_COUNT")
    @ApiModelProperty(value="纱支")
    private String yarnCount;

    /**
     * 纱支前半
     */
    @Column(name = "YARN_COUNT_F")
    @ApiModelProperty(value="纱支前半")
    private String yarnCountF;

    /**
     * 纱支前半单位
     */
    @Column(name = "YARN_COUNT_F_UNIT")
    @ApiModelProperty(value="纱支前半单位")
    private String yarnCountFUnit;

    /**
     * 纱支后半
     */
    @Column(name = "YARN_COUNT_B")
    @ApiModelProperty(value="纱支后半")
    private String yarnCountB;

    /**
     * 纱支后半单位
     */
    @Column(name = "YARN_COUNT_B_UNIT")
    @ApiModelProperty(value="纱支后半单位")
    private String yarnCountBUnit;

    /**
     * 成分比例
     */
    @Column(name = "RATIO")
    @ApiModelProperty(value="成分比例")
    private String ratio;

    /**
     * 捻法
     */
    @Column(name = "TWIST")
    @ApiModelProperty(value="捻法")
    private String twist;

    /**
     * 股数
     */
    @Column(name = "NUMBER_OF_SHARES")
    @ApiModelProperty(value="股数")
    private String numberOfShares;

    /**
     * 粗细
     */
    @Column(name = "THICKNESS")
    @ApiModelProperty(value="粗细")
    private String thickness;

    /**
     * 保质期（天）
     */
    @Column(name = "CONSUME_DT")
    @ApiModelProperty(value="保质期（天）")
    private Long consumeDt;

    /**
     * 计量单位
     */
    @Column(name = "UNIT")
    @ApiModelProperty(value="计量单位")
    private String unit;

    /**
     * 单包总重
     */
    @Column(name = "PIECE_GROSS_WGT")
    @ApiModelProperty(value="单包总重")
    private BigDecimal pieceGrossWgt;

    /**
     * 单包净重
     */
    @Column(name = "PIECE_NET_WGT")
    @ApiModelProperty(value="单包净重")
    private BigDecimal pieceNetWgt;

    /**
     * 单包容积
     */
    @Column(name = "PIECE_VOL")
    @ApiModelProperty(value="单包容积")
    private BigDecimal pieceVol;

    /**
     * 单包高
     */
    @Column(name = "PIECE_HEIGHT")
    @ApiModelProperty(value="单包高")
    private BigDecimal pieceHeight;

    /**
     * 单包宽
     */
    @Column(name = "PIECE_WIDTH")
    @ApiModelProperty(value="单包宽")
    private BigDecimal pieceWidth;

    /**
     * 单包长
     */
    @Column(name = "PIECE_DEPTH")
    @ApiModelProperty(value="单包长")
    private BigDecimal pieceDepth;

    /**
     * 每垛包数
     */
    @Column(name = "CASE_UNIT_NUM")
    @ApiModelProperty(value="每垛包数")
    private BigDecimal caseUnitNum;

    /**
     * 每垛总重
     */
    @Column(name = "CASE_GROSS_WGT")
    @ApiModelProperty(value="每垛总重")
    private BigDecimal caseGrossWgt;

    /**
     * 每垛净重
     */
    @Column(name = "CASE_NET_WGT")
    @ApiModelProperty(value="每垛净重")
    private BigDecimal caseNetWgt;

    /**
     * 每垛容积
     */
    @Column(name = "CASE_VOL")
    @ApiModelProperty(value="每垛容积")
    private BigDecimal caseVol;

    /**
     * 每垛高
     */
    @Column(name = "CASE_HEIGHT")
    @ApiModelProperty(value="每垛高")
    private BigDecimal caseHeight;

    /**
     * 每垛宽
     */
    @Column(name = "CASE_WIDTH")
    @ApiModelProperty(value="每垛宽")
    private BigDecimal caseWidth;

    /**
     * 每垛长
     */
    @Column(name = "CASE_DEPTH")
    @ApiModelProperty(value="每垛长")
    private BigDecimal caseDepth;

    /**
     * 预警重量
     */
    @Column(name = "WARNING_WGT")
    @ApiModelProperty(value="预警重量")
    private BigDecimal warningWgt;

    /**
     * 备注
     */
    @Column(name = "REMARKS")
    @ApiModelProperty(value="备注")
    private String remarks;

    /**
     * 文本1
     */
    @Column(name = "CHAR1")
    @ApiModelProperty(value="文本1")
    private String char1;

    /**
     * 文本2
     */
    @Column(name = "CHAR2")
    @ApiModelProperty(value="文本2")
    private String char2;

    /**
     * 文本3
     */
    @Column(name = "CHAR3")
    @ApiModelProperty(value="文本3")
    private String char3;

    /**
     * 文本4
     */
    @Column(name = "CHAR4")
    @ApiModelProperty(value="文本4")
    private String char4;

    /**
     * 文本5
     */
    @Column(name = "CHAR5")
    @ApiModelProperty(value="文本5")
    private String char5;

    /**
     * 文本6
     */
    @Column(name = "CHAR6")
    @ApiModelProperty(value="文本6")
    private String char6;

    /**
     * 文本7
     */
    @Column(name = "CHAR7")
    @ApiModelProperty(value="文本7")
    private String char7;

    /**
     * 文本8
     */
    @Column(name = "CHAR8")
    @ApiModelProperty(value="文本8")
    private String char8;

    /**
     * 文本9
     */
    @Column(name = "CHAR9")
    @ApiModelProperty(value="文本9")
    private String char9;

    /**
     * 文本10
     */
    @Column(name = "CHAR10")
    @ApiModelProperty(value="文本10")
    private String char10;

    /**
     * 数值1
     */
    @Column(name = "NUM1")
    @ApiModelProperty(value="数值1")
    private BigDecimal num1;

    /**
     * 数值2
     */
    @Column(name = "NUM2")
    @ApiModelProperty(value="数值2")
    private BigDecimal num2;

    /**
     * 数值3
     */
    @Column(name = "NUM3")
    @ApiModelProperty(value="数值3")
    private BigDecimal num3;

    /**
     * 数值4
     */
    @Column(name = "NUM4")
    @ApiModelProperty(value="数值4")
    private BigDecimal num4;

    /**
     * 数值5
     */
    @Column(name = "NUM5")
    @ApiModelProperty(value="数值5")
    private BigDecimal num5;

    /**
     * 数值6
     */
    @Column(name = "NUM6")
    @ApiModelProperty(value="数值6")
    private BigDecimal num6;

    /**
     * 数值7
     */
    @Column(name = "NUM7")
    @ApiModelProperty(value="数值7")
    private BigDecimal num7;

    /**
     * 数值8
     */
    @Column(name = "NUM8")
    @ApiModelProperty(value="数值8")
    private BigDecimal num8;

    /**
     * 数值9
     */
    @Column(name = "NUM9")
    @ApiModelProperty(value="数值9")
    private BigDecimal num9;

    /**
     * 数值10
     */
    @Column(name = "NUM10")
    @ApiModelProperty(value="数值10")
    private BigDecimal num10;

    /**
     * 更新次数
     */
    @Column(name = "UPD_CNT")
    @ApiModelProperty(value="更新次数")
    private Integer updCnt;

    /**
     * 删除区分
     */
    @Column(name = "DEL_FLG")
    @ApiModelProperty(value="删除区分")
    private String delFlg;

    /**
     * 登录时输入区分
     */
    @Column(name = "ADD_ENT_KBN")
    @ApiModelProperty(value="登录时输入区分")
    private String addEntKbn;

    /**
     * 登录时程序ID
     */
    @Column(name = "ADD_PGM_ID")
    @ApiModelProperty(value="登录时程序ID")
    private String addPgmId;

    /**
     * 登录时用户ID
     */
    @Column(name = "ADD_USER_ID")
    @ApiModelProperty(value="登录时用户ID")
    private String addUserId;

    /**
     * 登录时用户名称
     */
    @Column(name = "ADD_USER_NM")
    @ApiModelProperty(value="登录时用户名称")
    private String addUserNm;

    /**
     * 登录时端末ID
     */
    @Column(name = "ADD_TNMT_ID")
    @ApiModelProperty(value="登录时端末ID")
    private String addTnmtId;

    /**
     * 登录日期
     */
    @Column(name = "ADD_DT")
    @ApiModelProperty(value="登录日期")
    private Date addDt;

    /**
     * 更新时输入区分
     */
    @Column(name = "UPD_ENT_KBN")
    @ApiModelProperty(value="更新时输入区分")
    private String updEntKbn;

    /**
     * 更新时程序ID
     */
    @Column(name = "UPD_PGM_ID")
    @ApiModelProperty(value="更新时程序ID")
    private String updPgmId;

    /**
     * 更新时用户ID
     */
    @Column(name = "UPD_USER_ID")
    @ApiModelProperty(value="更新时用户ID")
    private String updUserId;

    /**
     * 更新时用户名称
     */
    @Column(name = "UPD_USER_NM")
    @ApiModelProperty(value="更新时用户名称")
    private String updUserNm;

    /**
     * 更新时端末ID
     */
    @Column(name = "UPD_TNMT_ID")
    @ApiModelProperty(value="更新时端末ID")
    private String updTnmtId;

    /**
     * 更新日期
     */
    @Column(name = "UPD_DT")
    @ApiModelProperty(value="更新日期")
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
    public MProduct setId(String id) {
        this.id = id == null ? null : id.trim();
        return this;
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
    public MProduct setCntrCd(String cntrCd) {
        this.cntrCd = cntrCd == null ? null : cntrCd.trim();
        return this;
    }

    /**
     * 获取商品表示用编号
     *
     * @return PROD_CD_DIS - 商品表示用编号
     */
    public String getProdCdDis() {
        return prodCdDis;
    }

    /**
     * 设置商品表示用编号
     *
     * @param prodCdDis 商品表示用编号
     */
    public MProduct setProdCdDis(String prodCdDis) {
        this.prodCdDis = prodCdDis == null ? null : prodCdDis.trim();
        return this;
    }

    /**
     * 获取商品名称
     *
     * @return PROD_NM - 商品名称
     */
    public String getProdNm() {
        return prodNm;
    }

    /**
     * 设置商品名称
     *
     * @param prodNm 商品名称
     */
    public MProduct setProdNm(String prodNm) {
        this.prodNm = prodNm == null ? null : prodNm.trim();
        return this;
    }

    /**
     * 获取商品简称
     *
     * @return PROD_JC - 商品简称
     */
    public String getProdJc() {
        return prodJc;
    }

    /**
     * 设置商品简称
     *
     * @param prodJc 商品简称
     */
    public MProduct setProdJc(String prodJc) {
        this.prodJc = prodJc == null ? null : prodJc.trim();
        return this;
    }

    /**
     * 获取商品英文名称
     *
     * @return PROD_NM_EN - 商品英文名称
     */
    public String getProdNmEn() {
        return prodNmEn;
    }

    /**
     * 设置商品英文名称
     *
     * @param prodNmEn 商品英文名称
     */
    public MProduct setProdNmEn(String prodNmEn) {
        this.prodNmEn = prodNmEn == null ? null : prodNmEn.trim();
        return this;
    }

    /**
     * 获取商品种类
     *
     * @return PROD_TYPE - 商品种类
     */
    public String getProdType() {
        return prodType;
    }

    /**
     * 设置商品种类
     *
     * @param prodType 商品种类
     */
    public MProduct setProdType(String prodType) {
        this.prodType = prodType == null ? null : prodType.trim();
        return this;
    }

    /**
     * 获取商品分类编号
     *
     * @return PROD_CLASS_ID - 商品分类编号
     */
    public String getProdClassId() {
        return prodClassId;
    }

    /**
     * 设置商品分类编号
     *
     * @param prodClassId 商品分类编号
     */
    public MProduct setProdClassId(String prodClassId) {
        this.prodClassId = prodClassId == null ? null : prodClassId.trim();
        return this;
    }

    /**
     * 获取规格型号
     *
     * @return ASSET_MODEL - 规格型号
     */
    public String getAssetModel() {
        return assetModel;
    }

    /**
     * 设置规格型号
     *
     * @param assetModel 规格型号
     */
    public MProduct setAssetModel(String assetModel) {
        this.assetModel = assetModel == null ? null : assetModel.trim();
        return this;
    }

    /**
     * 获取纱支
     *
     * @return YARN_COUNT - 纱支
     */
    public String getYarnCount() {
        return yarnCount;
    }

    /**
     * 设置纱支
     *
     * @param yarnCount 纱支
     */
    public MProduct setYarnCount(String yarnCount) {
        this.yarnCount = yarnCount == null ? null : yarnCount.trim();
        return this;
    }

    /**
     * 获取纱支前半
     *
     * @return YARN_COUNT_F - 纱支前半
     */
    public String getYarnCountF() {
        return yarnCountF;
    }

    /**
     * 设置纱支前半
     *
     * @param yarnCountF 纱支前半
     */
    public MProduct setYarnCountF(String yarnCountF) {
        this.yarnCountF = yarnCountF == null ? null : yarnCountF.trim();
        return this;
    }

    /**
     * 获取纱支前半单位
     *
     * @return YARN_COUNT_F_UNIT - 纱支前半单位
     */
    public String getYarnCountFUnit() {
        return yarnCountFUnit;
    }

    /**
     * 设置纱支前半单位
     *
     * @param yarnCountFUnit 纱支前半单位
     */
    public MProduct setYarnCountFUnit(String yarnCountFUnit) {
        this.yarnCountFUnit = yarnCountFUnit == null ? null : yarnCountFUnit.trim();
        return this;
    }

    /**
     * 获取纱支后半
     *
     * @return YARN_COUNT_B - 纱支后半
     */
    public String getYarnCountB() {
        return yarnCountB;
    }

    /**
     * 设置纱支后半
     *
     * @param yarnCountB 纱支后半
     */
    public MProduct setYarnCountB(String yarnCountB) {
        this.yarnCountB = yarnCountB == null ? null : yarnCountB.trim();
        return this;
    }

    /**
     * 获取纱支后半单位
     *
     * @return YARN_COUNT_B_UNIT - 纱支后半单位
     */
    public String getYarnCountBUnit() {
        return yarnCountBUnit;
    }

    /**
     * 设置纱支后半单位
     *
     * @param yarnCountBUnit 纱支后半单位
     */
    public MProduct setYarnCountBUnit(String yarnCountBUnit) {
        this.yarnCountBUnit = yarnCountBUnit == null ? null : yarnCountBUnit.trim();
        return this;
    }

    /**
     * 获取成分比例
     *
     * @return RATIO - 成分比例
     */
    public String getRatio() {
        return ratio;
    }

    /**
     * 设置成分比例
     *
     * @param ratio 成分比例
     */
    public MProduct setRatio(String ratio) {
        this.ratio = ratio == null ? null : ratio.trim();
        return this;
    }

    /**
     * 获取捻法
     *
     * @return TWIST - 捻法
     */
    public String getTwist() {
        return twist;
    }

    /**
     * 设置捻法
     *
     * @param twist 捻法
     */
    public MProduct setTwist(String twist) {
        this.twist = twist == null ? null : twist.trim();
        return this;
    }

    /**
     * 获取股数
     *
     * @return NUMBER_OF_SHARES - 股数
     */
    public String getNumberOfShares() {
        return numberOfShares;
    }

    /**
     * 设置股数
     *
     * @param numberOfShares 股数
     */
    public MProduct setNumberOfShares(String numberOfShares) {
        this.numberOfShares = numberOfShares == null ? null : numberOfShares.trim();
        return this;
    }

    /**
     * 获取粗细
     *
     * @return THICKNESS - 粗细
     */
    public String getThickness() {
        return thickness;
    }

    /**
     * 设置粗细
     *
     * @param thickness 粗细
     */
    public MProduct setThickness(String thickness) {
        this.thickness = thickness == null ? null : thickness.trim();
        return this;
    }

    /**
     * 获取保质期（天）
     *
     * @return CONSUME_DT - 保质期（天）
     */
    public Long getConsumeDt() {
        return consumeDt;
    }

    /**
     * 设置保质期（天）
     *
     * @param consumeDt 保质期（天）
     */
    public MProduct setConsumeDt(Long consumeDt) {
        this.consumeDt = consumeDt;
        return this;
    }

    /**
     * 获取计量单位
     *
     * @return UNIT - 计量单位
     */
    public String getUnit() {
        return unit;
    }

    /**
     * 设置计量单位
     *
     * @param unit 计量单位
     */
    public MProduct setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
        return this;
    }

    /**
     * 获取单包总重
     *
     * @return PIECE_GROSS_WGT - 单包总重
     */
    public BigDecimal getPieceGrossWgt() {
        return pieceGrossWgt;
    }

    /**
     * 设置单包总重
     *
     * @param pieceGrossWgt 单包总重
     */
    public MProduct setPieceGrossWgt(BigDecimal pieceGrossWgt) {
        this.pieceGrossWgt = pieceGrossWgt;
        return this;
    }

    /**
     * 获取单包净重
     *
     * @return PIECE_NET_WGT - 单包净重
     */
    public BigDecimal getPieceNetWgt() {
        return pieceNetWgt;
    }

    /**
     * 设置单包净重
     *
     * @param pieceNetWgt 单包净重
     */
    public MProduct setPieceNetWgt(BigDecimal pieceNetWgt) {
        this.pieceNetWgt = pieceNetWgt;
        return this;
    }

    /**
     * 获取单包容积
     *
     * @return PIECE_VOL - 单包容积
     */
    public BigDecimal getPieceVol() {
        return pieceVol;
    }

    /**
     * 设置单包容积
     *
     * @param pieceVol 单包容积
     */
    public MProduct setPieceVol(BigDecimal pieceVol) {
        this.pieceVol = pieceVol;
        return this;
    }

    /**
     * 获取单包高
     *
     * @return PIECE_HEIGHT - 单包高
     */
    public BigDecimal getPieceHeight() {
        return pieceHeight;
    }

    /**
     * 设置单包高
     *
     * @param pieceHeight 单包高
     */
    public MProduct setPieceHeight(BigDecimal pieceHeight) {
        this.pieceHeight = pieceHeight;
        return this;
    }

    /**
     * 获取单包宽
     *
     * @return PIECE_WIDTH - 单包宽
     */
    public BigDecimal getPieceWidth() {
        return pieceWidth;
    }

    /**
     * 设置单包宽
     *
     * @param pieceWidth 单包宽
     */
    public MProduct setPieceWidth(BigDecimal pieceWidth) {
        this.pieceWidth = pieceWidth;
        return this;
    }

    /**
     * 获取单包长
     *
     * @return PIECE_DEPTH - 单包长
     */
    public BigDecimal getPieceDepth() {
        return pieceDepth;
    }

    /**
     * 设置单包长
     *
     * @param pieceDepth 单包长
     */
    public MProduct setPieceDepth(BigDecimal pieceDepth) {
        this.pieceDepth = pieceDepth;
        return this;
    }

    /**
     * 获取每垛包数
     *
     * @return CASE_UNIT_NUM - 每垛包数
     */
    public BigDecimal getCaseUnitNum() {
        return caseUnitNum;
    }

    /**
     * 设置每垛包数
     *
     * @param caseUnitNum 每垛包数
     */
    public MProduct setCaseUnitNum(BigDecimal caseUnitNum) {
        this.caseUnitNum = caseUnitNum;
        return this;
    }

    /**
     * 获取每垛总重
     *
     * @return CASE_GROSS_WGT - 每垛总重
     */
    public BigDecimal getCaseGrossWgt() {
        return caseGrossWgt;
    }

    /**
     * 设置每垛总重
     *
     * @param caseGrossWgt 每垛总重
     */
    public MProduct setCaseGrossWgt(BigDecimal caseGrossWgt) {
        this.caseGrossWgt = caseGrossWgt;
        return this;
    }

    /**
     * 获取每垛净重
     *
     * @return CASE_NET_WGT - 每垛净重
     */
    public BigDecimal getCaseNetWgt() {
        return caseNetWgt;
    }

    /**
     * 设置每垛净重
     *
     * @param caseNetWgt 每垛净重
     */
    public MProduct setCaseNetWgt(BigDecimal caseNetWgt) {
        this.caseNetWgt = caseNetWgt;
        return this;
    }

    /**
     * 获取每垛容积
     *
     * @return CASE_VOL - 每垛容积
     */
    public BigDecimal getCaseVol() {
        return caseVol;
    }

    /**
     * 设置每垛容积
     *
     * @param caseVol 每垛容积
     */
    public MProduct setCaseVol(BigDecimal caseVol) {
        this.caseVol = caseVol;
        return this;
    }

    /**
     * 获取每垛高
     *
     * @return CASE_HEIGHT - 每垛高
     */
    public BigDecimal getCaseHeight() {
        return caseHeight;
    }

    /**
     * 设置每垛高
     *
     * @param caseHeight 每垛高
     */
    public MProduct setCaseHeight(BigDecimal caseHeight) {
        this.caseHeight = caseHeight;
        return this;
    }

    /**
     * 获取每垛宽
     *
     * @return CASE_WIDTH - 每垛宽
     */
    public BigDecimal getCaseWidth() {
        return caseWidth;
    }

    /**
     * 设置每垛宽
     *
     * @param caseWidth 每垛宽
     */
    public MProduct setCaseWidth(BigDecimal caseWidth) {
        this.caseWidth = caseWidth;
        return this;
    }

    /**
     * 获取每垛长
     *
     * @return CASE_DEPTH - 每垛长
     */
    public BigDecimal getCaseDepth() {
        return caseDepth;
    }

    /**
     * 设置每垛长
     *
     * @param caseDepth 每垛长
     */
    public MProduct setCaseDepth(BigDecimal caseDepth) {
        this.caseDepth = caseDepth;
        return this;
    }

    /**
     * 获取预警重量
     *
     * @return WARNING_WGT - 预警重量
     */
    public BigDecimal getWarningWgt() {
        return warningWgt;
    }

    /**
     * 设置预警重量
     *
     * @param warningWgt 预警重量
     */
    public MProduct setWarningWgt(BigDecimal warningWgt) {
        this.warningWgt = warningWgt;
        return this;
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
    public MProduct setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
        return this;
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
    public MProduct setChar1(String char1) {
        this.char1 = char1 == null ? null : char1.trim();
        return this;
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
    public MProduct setChar2(String char2) {
        this.char2 = char2 == null ? null : char2.trim();
        return this;
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
    public MProduct setChar3(String char3) {
        this.char3 = char3 == null ? null : char3.trim();
        return this;
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
    public MProduct setChar4(String char4) {
        this.char4 = char4 == null ? null : char4.trim();
        return this;
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
    public MProduct setChar5(String char5) {
        this.char5 = char5 == null ? null : char5.trim();
        return this;
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
    public MProduct setChar6(String char6) {
        this.char6 = char6 == null ? null : char6.trim();
        return this;
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
    public MProduct setChar7(String char7) {
        this.char7 = char7 == null ? null : char7.trim();
        return this;
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
    public MProduct setChar8(String char8) {
        this.char8 = char8 == null ? null : char8.trim();
        return this;
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
    public MProduct setChar9(String char9) {
        this.char9 = char9 == null ? null : char9.trim();
        return this;
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
    public MProduct setChar10(String char10) {
        this.char10 = char10 == null ? null : char10.trim();
        return this;
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
    public MProduct setNum1(BigDecimal num1) {
        this.num1 = num1;
        return this;
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
    public MProduct setNum2(BigDecimal num2) {
        this.num2 = num2;
        return this;
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
    public MProduct setNum3(BigDecimal num3) {
        this.num3 = num3;
        return this;
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
    public MProduct setNum4(BigDecimal num4) {
        this.num4 = num4;
        return this;
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
    public MProduct setNum5(BigDecimal num5) {
        this.num5 = num5;
        return this;
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
    public MProduct setNum6(BigDecimal num6) {
        this.num6 = num6;
        return this;
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
    public MProduct setNum7(BigDecimal num7) {
        this.num7 = num7;
        return this;
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
    public MProduct setNum8(BigDecimal num8) {
        this.num8 = num8;
        return this;
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
    public MProduct setNum9(BigDecimal num9) {
        this.num9 = num9;
        return this;
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
    public MProduct setNum10(BigDecimal num10) {
        this.num10 = num10;
        return this;
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
    public MProduct setUpdCnt(Integer updCnt) {
        this.updCnt = updCnt;
        return this;
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
    public MProduct setDelFlg(String delFlg) {
        this.delFlg = delFlg == null ? null : delFlg.trim();
        return this;
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
    public MProduct setAddEntKbn(String addEntKbn) {
        this.addEntKbn = addEntKbn == null ? null : addEntKbn.trim();
        return this;
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
    public MProduct setAddPgmId(String addPgmId) {
        this.addPgmId = addPgmId == null ? null : addPgmId.trim();
        return this;
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
    public MProduct setAddUserId(String addUserId) {
        this.addUserId = addUserId == null ? null : addUserId.trim();
        return this;
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
    public MProduct setAddUserNm(String addUserNm) {
        this.addUserNm = addUserNm == null ? null : addUserNm.trim();
        return this;
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
    public MProduct setAddTnmtId(String addTnmtId) {
        this.addTnmtId = addTnmtId == null ? null : addTnmtId.trim();
        return this;
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
    public MProduct setAddDt(Date addDt) {
        this.addDt = addDt;
        return this;
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
    public MProduct setUpdEntKbn(String updEntKbn) {
        this.updEntKbn = updEntKbn == null ? null : updEntKbn.trim();
        return this;
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
    public MProduct setUpdPgmId(String updPgmId) {
        this.updPgmId = updPgmId == null ? null : updPgmId.trim();
        return this;
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
    public MProduct setUpdUserId(String updUserId) {
        this.updUserId = updUserId == null ? null : updUserId.trim();
        return this;
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
    public MProduct setUpdUserNm(String updUserNm) {
        this.updUserNm = updUserNm == null ? null : updUserNm.trim();
        return this;
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
    public MProduct setUpdTnmtId(String updTnmtId) {
        this.updTnmtId = updTnmtId == null ? null : updTnmtId.trim();
        return this;
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
    public MProduct setUpdDt(Date updDt) {
        this.updDt = updDt;
        return this;
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
        MProduct other = (MProduct) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCntrCd() == null ? other.getCntrCd() == null : this.getCntrCd().equals(other.getCntrCd()))
            && (this.getProdCdDis() == null ? other.getProdCdDis() == null : this.getProdCdDis().equals(other.getProdCdDis()))
            && (this.getProdNm() == null ? other.getProdNm() == null : this.getProdNm().equals(other.getProdNm()))
            && (this.getProdJc() == null ? other.getProdJc() == null : this.getProdJc().equals(other.getProdJc()))
            && (this.getProdNmEn() == null ? other.getProdNmEn() == null : this.getProdNmEn().equals(other.getProdNmEn()))
            && (this.getProdType() == null ? other.getProdType() == null : this.getProdType().equals(other.getProdType()))
            && (this.getProdClassId() == null ? other.getProdClassId() == null : this.getProdClassId().equals(other.getProdClassId()))
            && (this.getAssetModel() == null ? other.getAssetModel() == null : this.getAssetModel().equals(other.getAssetModel()))
            && (this.getYarnCount() == null ? other.getYarnCount() == null : this.getYarnCount().equals(other.getYarnCount()))
            && (this.getYarnCountF() == null ? other.getYarnCountF() == null : this.getYarnCountF().equals(other.getYarnCountF()))
            && (this.getYarnCountFUnit() == null ? other.getYarnCountFUnit() == null : this.getYarnCountFUnit().equals(other.getYarnCountFUnit()))
            && (this.getYarnCountB() == null ? other.getYarnCountB() == null : this.getYarnCountB().equals(other.getYarnCountB()))
            && (this.getYarnCountBUnit() == null ? other.getYarnCountBUnit() == null : this.getYarnCountBUnit().equals(other.getYarnCountBUnit()))
            && (this.getRatio() == null ? other.getRatio() == null : this.getRatio().equals(other.getRatio()))
            && (this.getTwist() == null ? other.getTwist() == null : this.getTwist().equals(other.getTwist()))
            && (this.getNumberOfShares() == null ? other.getNumberOfShares() == null : this.getNumberOfShares().equals(other.getNumberOfShares()))
            && (this.getThickness() == null ? other.getThickness() == null : this.getThickness().equals(other.getThickness()))
            && (this.getConsumeDt() == null ? other.getConsumeDt() == null : this.getConsumeDt().equals(other.getConsumeDt()))
            && (this.getUnit() == null ? other.getUnit() == null : this.getUnit().equals(other.getUnit()))
            && (this.getPieceGrossWgt() == null ? other.getPieceGrossWgt() == null : this.getPieceGrossWgt().equals(other.getPieceGrossWgt()))
            && (this.getPieceNetWgt() == null ? other.getPieceNetWgt() == null : this.getPieceNetWgt().equals(other.getPieceNetWgt()))
            && (this.getPieceVol() == null ? other.getPieceVol() == null : this.getPieceVol().equals(other.getPieceVol()))
            && (this.getPieceHeight() == null ? other.getPieceHeight() == null : this.getPieceHeight().equals(other.getPieceHeight()))
            && (this.getPieceWidth() == null ? other.getPieceWidth() == null : this.getPieceWidth().equals(other.getPieceWidth()))
            && (this.getPieceDepth() == null ? other.getPieceDepth() == null : this.getPieceDepth().equals(other.getPieceDepth()))
            && (this.getCaseUnitNum() == null ? other.getCaseUnitNum() == null : this.getCaseUnitNum().equals(other.getCaseUnitNum()))
            && (this.getCaseGrossWgt() == null ? other.getCaseGrossWgt() == null : this.getCaseGrossWgt().equals(other.getCaseGrossWgt()))
            && (this.getCaseNetWgt() == null ? other.getCaseNetWgt() == null : this.getCaseNetWgt().equals(other.getCaseNetWgt()))
            && (this.getCaseVol() == null ? other.getCaseVol() == null : this.getCaseVol().equals(other.getCaseVol()))
            && (this.getCaseHeight() == null ? other.getCaseHeight() == null : this.getCaseHeight().equals(other.getCaseHeight()))
            && (this.getCaseWidth() == null ? other.getCaseWidth() == null : this.getCaseWidth().equals(other.getCaseWidth()))
            && (this.getCaseDepth() == null ? other.getCaseDepth() == null : this.getCaseDepth().equals(other.getCaseDepth()))
            && (this.getWarningWgt() == null ? other.getWarningWgt() == null : this.getWarningWgt().equals(other.getWarningWgt()))
            && (this.getRemarks() == null ? other.getRemarks() == null : this.getRemarks().equals(other.getRemarks()))
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
        result = prime * result + ((getCntrCd() == null) ? 0 : getCntrCd().hashCode());
        result = prime * result + ((getProdCdDis() == null) ? 0 : getProdCdDis().hashCode());
        result = prime * result + ((getProdNm() == null) ? 0 : getProdNm().hashCode());
        result = prime * result + ((getProdJc() == null) ? 0 : getProdJc().hashCode());
        result = prime * result + ((getProdNmEn() == null) ? 0 : getProdNmEn().hashCode());
        result = prime * result + ((getProdType() == null) ? 0 : getProdType().hashCode());
        result = prime * result + ((getProdClassId() == null) ? 0 : getProdClassId().hashCode());
        result = prime * result + ((getAssetModel() == null) ? 0 : getAssetModel().hashCode());
        result = prime * result + ((getYarnCount() == null) ? 0 : getYarnCount().hashCode());
        result = prime * result + ((getYarnCountF() == null) ? 0 : getYarnCountF().hashCode());
        result = prime * result + ((getYarnCountFUnit() == null) ? 0 : getYarnCountFUnit().hashCode());
        result = prime * result + ((getYarnCountB() == null) ? 0 : getYarnCountB().hashCode());
        result = prime * result + ((getYarnCountBUnit() == null) ? 0 : getYarnCountBUnit().hashCode());
        result = prime * result + ((getRatio() == null) ? 0 : getRatio().hashCode());
        result = prime * result + ((getTwist() == null) ? 0 : getTwist().hashCode());
        result = prime * result + ((getNumberOfShares() == null) ? 0 : getNumberOfShares().hashCode());
        result = prime * result + ((getThickness() == null) ? 0 : getThickness().hashCode());
        result = prime * result + ((getConsumeDt() == null) ? 0 : getConsumeDt().hashCode());
        result = prime * result + ((getUnit() == null) ? 0 : getUnit().hashCode());
        result = prime * result + ((getPieceGrossWgt() == null) ? 0 : getPieceGrossWgt().hashCode());
        result = prime * result + ((getPieceNetWgt() == null) ? 0 : getPieceNetWgt().hashCode());
        result = prime * result + ((getPieceVol() == null) ? 0 : getPieceVol().hashCode());
        result = prime * result + ((getPieceHeight() == null) ? 0 : getPieceHeight().hashCode());
        result = prime * result + ((getPieceWidth() == null) ? 0 : getPieceWidth().hashCode());
        result = prime * result + ((getPieceDepth() == null) ? 0 : getPieceDepth().hashCode());
        result = prime * result + ((getCaseUnitNum() == null) ? 0 : getCaseUnitNum().hashCode());
        result = prime * result + ((getCaseGrossWgt() == null) ? 0 : getCaseGrossWgt().hashCode());
        result = prime * result + ((getCaseNetWgt() == null) ? 0 : getCaseNetWgt().hashCode());
        result = prime * result + ((getCaseVol() == null) ? 0 : getCaseVol().hashCode());
        result = prime * result + ((getCaseHeight() == null) ? 0 : getCaseHeight().hashCode());
        result = prime * result + ((getCaseWidth() == null) ? 0 : getCaseWidth().hashCode());
        result = prime * result + ((getCaseDepth() == null) ? 0 : getCaseDepth().hashCode());
        result = prime * result + ((getWarningWgt() == null) ? 0 : getWarningWgt().hashCode());
        result = prime * result + ((getRemarks() == null) ? 0 : getRemarks().hashCode());
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
        sb.append(", cntrCd=").append(cntrCd);
        sb.append(", prodCdDis=").append(prodCdDis);
        sb.append(", prodNm=").append(prodNm);
        sb.append(", prodJc=").append(prodJc);
        sb.append(", prodNmEn=").append(prodNmEn);
        sb.append(", prodType=").append(prodType);
        sb.append(", prodClassId=").append(prodClassId);
        sb.append(", assetModel=").append(assetModel);
        sb.append(", yarnCount=").append(yarnCount);
        sb.append(", yarnCountF=").append(yarnCountF);
        sb.append(", yarnCountFUnit=").append(yarnCountFUnit);
        sb.append(", yarnCountB=").append(yarnCountB);
        sb.append(", yarnCountBUnit=").append(yarnCountBUnit);
        sb.append(", ratio=").append(ratio);
        sb.append(", twist=").append(twist);
        sb.append(", numberOfShares=").append(numberOfShares);
        sb.append(", thickness=").append(thickness);
        sb.append(", consumeDt=").append(consumeDt);
        sb.append(", unit=").append(unit);
        sb.append(", pieceGrossWgt=").append(pieceGrossWgt);
        sb.append(", pieceNetWgt=").append(pieceNetWgt);
        sb.append(", pieceVol=").append(pieceVol);
        sb.append(", pieceHeight=").append(pieceHeight);
        sb.append(", pieceWidth=").append(pieceWidth);
        sb.append(", pieceDepth=").append(pieceDepth);
        sb.append(", caseUnitNum=").append(caseUnitNum);
        sb.append(", caseGrossWgt=").append(caseGrossWgt);
        sb.append(", caseNetWgt=").append(caseNetWgt);
        sb.append(", caseVol=").append(caseVol);
        sb.append(", caseHeight=").append(caseHeight);
        sb.append(", caseWidth=").append(caseWidth);
        sb.append(", caseDepth=").append(caseDepth);
        sb.append(", warningWgt=").append(warningWgt);
        sb.append(", remarks=").append(remarks);
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