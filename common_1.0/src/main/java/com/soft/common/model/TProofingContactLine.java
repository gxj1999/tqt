package com.soft.common.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "`t_proofing_contact_line`")
public class TProofingContactLine implements Serializable {
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
     * 打样联系单编号
     */
    @Column(name = "`PROOFING_CONTACT_CD`")
    private String proofingContactCd;

    /**
     * 品名
     */
    @Column(name = "`PROD_NM`")
    private String prodNm;

    /**
     * 希望交期
     */
    @Column(name = "`EXPECT_DATE`")
    private Date expectDate;

    /**
     * 操作员
     */
    @Column(name = "`OPERATOR`")
    private String operator;

    /**
     * 序号
     */
    @Column(name = "`SERIAL_NUM`")
    private String serialNum;

    /**
     * 标样
     */
    @Column(name = "`STANDARD_SAMPLE`")
    private String standardSample;

    /**
     * 色别
     */
    @Column(name = "`COLOR`")
    private String color;

    /**
     * 投染数
     */
    @Column(name = "`DYEING_NUM`")
    private BigDecimal dyeingNum;

    /**
     * 批号
     */
    @Column(name = "`LOT_NUM`")
    private String lotNum;

    /**
     * 备注
     */
    @Column(name = "`REMARKS`")
    private String remarks;

    /**
     * 料源
     */
    @Column(name = "`RESOURCE`")
    private String resource;

    /**
     * 对色光源
     */
    @Column(name = "`LIGHTSOURCE`")
    private String lightsource;

    /**
     * 质量要求
     */
    @Column(name = "`QUALITY_REQUIREMENT`")
    private String qualityRequirement;

    /**
     * 用途（纱）
     */
    @Column(name = "`PURPOSE`")
    private String purpose;

    /**
     * 其他
     */
    @Column(name = "`OTHERS`")
    private String others;

    /**
     * 送样日期
     */
    @Column(name = "`SEND_DATE`")
    private Date sendDate;

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
     * 获取打样联系单编号
     *
     * @return PROOFING_CONTACT_CD - 打样联系单编号
     */
    public String getProofingContactCd() {
        return proofingContactCd;
    }

    /**
     * 设置打样联系单编号
     *
     * @param proofingContactCd 打样联系单编号
     */
    public void setProofingContactCd(String proofingContactCd) {
        this.proofingContactCd = proofingContactCd == null ? null : proofingContactCd.trim();
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
     * 获取希望交期
     *
     * @return EXPECT_DATE - 希望交期
     */
    public Date getExpectDate() {
        return expectDate;
    }

    /**
     * 设置希望交期
     *
     * @param expectDate 希望交期
     */
    public void setExpectDate(Date expectDate) {
        this.expectDate = expectDate;
    }

    /**
     * 获取操作员
     *
     * @return OPERATOR - 操作员
     */
    public String getOperator() {
        return operator;
    }

    /**
     * 设置操作员
     *
     * @param operator 操作员
     */
    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    /**
     * 获取序号
     *
     * @return SERIAL_NUM - 序号
     */
    public String getSerialNum() {
        return serialNum;
    }

    /**
     * 设置序号
     *
     * @param serialNum 序号
     */
    public void setSerialNum(String serialNum) {
        this.serialNum = serialNum == null ? null : serialNum.trim();
    }

    /**
     * 获取标样
     *
     * @return STANDARD_SAMPLE - 标样
     */
    public String getStandardSample() {
        return standardSample;
    }

    /**
     * 设置标样
     *
     * @param standardSample 标样
     */
    public void setStandardSample(String standardSample) {
        this.standardSample = standardSample == null ? null : standardSample.trim();
    }

    /**
     * 获取色别
     *
     * @return COLOR - 色别
     */
    public String getColor() {
        return color;
    }

    /**
     * 设置色别
     *
     * @param color 色别
     */
    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
    }

    /**
     * 获取投染数
     *
     * @return DYEING_NUM - 投染数
     */
    public BigDecimal getDyeingNum() {
        return dyeingNum;
    }

    /**
     * 设置投染数
     *
     * @param dyeingNum 投染数
     */
    public void setDyeingNum(BigDecimal dyeingNum) {
        this.dyeingNum = dyeingNum;
    }

    /**
     * 获取批号
     *
     * @return LOT_NUM - 批号
     */
    public String getLotNum() {
        return lotNum;
    }

    /**
     * 设置批号
     *
     * @param lotNum 批号
     */
    public void setLotNum(String lotNum) {
        this.lotNum = lotNum == null ? null : lotNum.trim();
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
     * 获取料源
     *
     * @return RESOURCE - 料源
     */
    public String getResource() {
        return resource;
    }

    /**
     * 设置料源
     *
     * @param resource 料源
     */
    public void setResource(String resource) {
        this.resource = resource == null ? null : resource.trim();
    }

    /**
     * 获取对色光源
     *
     * @return LIGHTSOURCE - 对色光源
     */
    public String getLightsource() {
        return lightsource;
    }

    /**
     * 设置对色光源
     *
     * @param lightsource 对色光源
     */
    public void setLightsource(String lightsource) {
        this.lightsource = lightsource == null ? null : lightsource.trim();
    }

    /**
     * 获取质量要求
     *
     * @return QUALITY_REQUIREMENT - 质量要求
     */
    public String getQualityRequirement() {
        return qualityRequirement;
    }

    /**
     * 设置质量要求
     *
     * @param qualityRequirement 质量要求
     */
    public void setQualityRequirement(String qualityRequirement) {
        this.qualityRequirement = qualityRequirement == null ? null : qualityRequirement.trim();
    }

    /**
     * 获取用途（纱）
     *
     * @return PURPOSE - 用途（纱）
     */
    public String getPurpose() {
        return purpose;
    }

    /**
     * 设置用途（纱）
     *
     * @param purpose 用途（纱）
     */
    public void setPurpose(String purpose) {
        this.purpose = purpose == null ? null : purpose.trim();
    }

    /**
     * 获取其他
     *
     * @return OTHERS - 其他
     */
    public String getOthers() {
        return others;
    }

    /**
     * 设置其他
     *
     * @param others 其他
     */
    public void setOthers(String others) {
        this.others = others == null ? null : others.trim();
    }

    /**
     * 获取送样日期
     *
     * @return SEND_DATE - 送样日期
     */
    public Date getSendDate() {
        return sendDate;
    }

    /**
     * 设置送样日期
     *
     * @param sendDate 送样日期
     */
    public void setSendDate(Date sendDate) {
        this.sendDate = sendDate;
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
        TProofingContactLine other = (TProofingContactLine) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCntrCd() == null ? other.getCntrCd() == null : this.getCntrCd().equals(other.getCntrCd()))
            && (this.getSellOrdCd() == null ? other.getSellOrdCd() == null : this.getSellOrdCd().equals(other.getSellOrdCd()))
            && (this.getSellOrdMainmaterialCd() == null ? other.getSellOrdMainmaterialCd() == null : this.getSellOrdMainmaterialCd().equals(other.getSellOrdMainmaterialCd()))
            && (this.getProofingContactCd() == null ? other.getProofingContactCd() == null : this.getProofingContactCd().equals(other.getProofingContactCd()))
            && (this.getProdNm() == null ? other.getProdNm() == null : this.getProdNm().equals(other.getProdNm()))
            && (this.getExpectDate() == null ? other.getExpectDate() == null : this.getExpectDate().equals(other.getExpectDate()))
            && (this.getOperator() == null ? other.getOperator() == null : this.getOperator().equals(other.getOperator()))
            && (this.getSerialNum() == null ? other.getSerialNum() == null : this.getSerialNum().equals(other.getSerialNum()))
            && (this.getStandardSample() == null ? other.getStandardSample() == null : this.getStandardSample().equals(other.getStandardSample()))
            && (this.getColor() == null ? other.getColor() == null : this.getColor().equals(other.getColor()))
            && (this.getDyeingNum() == null ? other.getDyeingNum() == null : this.getDyeingNum().equals(other.getDyeingNum()))
            && (this.getLotNum() == null ? other.getLotNum() == null : this.getLotNum().equals(other.getLotNum()))
            && (this.getRemarks() == null ? other.getRemarks() == null : this.getRemarks().equals(other.getRemarks()))
            && (this.getResource() == null ? other.getResource() == null : this.getResource().equals(other.getResource()))
            && (this.getLightsource() == null ? other.getLightsource() == null : this.getLightsource().equals(other.getLightsource()))
            && (this.getQualityRequirement() == null ? other.getQualityRequirement() == null : this.getQualityRequirement().equals(other.getQualityRequirement()))
            && (this.getPurpose() == null ? other.getPurpose() == null : this.getPurpose().equals(other.getPurpose()))
            && (this.getOthers() == null ? other.getOthers() == null : this.getOthers().equals(other.getOthers()))
            && (this.getSendDate() == null ? other.getSendDate() == null : this.getSendDate().equals(other.getSendDate()))
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
        result = prime * result + ((getProofingContactCd() == null) ? 0 : getProofingContactCd().hashCode());
        result = prime * result + ((getProdNm() == null) ? 0 : getProdNm().hashCode());
        result = prime * result + ((getExpectDate() == null) ? 0 : getExpectDate().hashCode());
        result = prime * result + ((getOperator() == null) ? 0 : getOperator().hashCode());
        result = prime * result + ((getSerialNum() == null) ? 0 : getSerialNum().hashCode());
        result = prime * result + ((getStandardSample() == null) ? 0 : getStandardSample().hashCode());
        result = prime * result + ((getColor() == null) ? 0 : getColor().hashCode());
        result = prime * result + ((getDyeingNum() == null) ? 0 : getDyeingNum().hashCode());
        result = prime * result + ((getLotNum() == null) ? 0 : getLotNum().hashCode());
        result = prime * result + ((getRemarks() == null) ? 0 : getRemarks().hashCode());
        result = prime * result + ((getResource() == null) ? 0 : getResource().hashCode());
        result = prime * result + ((getLightsource() == null) ? 0 : getLightsource().hashCode());
        result = prime * result + ((getQualityRequirement() == null) ? 0 : getQualityRequirement().hashCode());
        result = prime * result + ((getPurpose() == null) ? 0 : getPurpose().hashCode());
        result = prime * result + ((getOthers() == null) ? 0 : getOthers().hashCode());
        result = prime * result + ((getSendDate() == null) ? 0 : getSendDate().hashCode());
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
        sb.append(", proofingContactCd=").append(proofingContactCd);
        sb.append(", prodNm=").append(prodNm);
        sb.append(", expectDate=").append(expectDate);
        sb.append(", operator=").append(operator);
        sb.append(", serialNum=").append(serialNum);
        sb.append(", standardSample=").append(standardSample);
        sb.append(", color=").append(color);
        sb.append(", dyeingNum=").append(dyeingNum);
        sb.append(", lotNum=").append(lotNum);
        sb.append(", remarks=").append(remarks);
        sb.append(", resource=").append(resource);
        sb.append(", lightsource=").append(lightsource);
        sb.append(", qualityRequirement=").append(qualityRequirement);
        sb.append(", purpose=").append(purpose);
        sb.append(", others=").append(others);
        sb.append(", sendDate=").append(sendDate);
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
