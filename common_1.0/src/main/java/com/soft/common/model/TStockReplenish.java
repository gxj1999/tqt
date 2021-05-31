package com.soft.common.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "`t_stock_replenish`")
public class TStockReplenish implements Serializable {
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
     * 补货编号
     */
    @Column(name = "`REP_CD`")
    private String repCd;

    /**
     * 补货区分
     */
    @Column(name = "`TRN_TYPE`")
    private String trnType;

    /**
     * 源仓库
     */
    @Column(name = "`WH_CD`")
    private String whCd;

    /**
     * 成品编号
     */
    @Column(name = "`PROD_CD`")
    private String prodCd;

    /**
     * 目标仓库
     */
    @Column(name = "`TAG_WH_CD`")
    private String tagWhCd;

    /**
     * 补充数量
     */
    @Column(name = "`REP_NUM`")
    private String repNum;

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
     * 获取补货编号
     *
     * @return REP_CD - 补货编号
     */
    public String getRepCd() {
        return repCd;
    }

    /**
     * 设置补货编号
     *
     * @param repCd 补货编号
     */
    public void setRepCd(String repCd) {
        this.repCd = repCd == null ? null : repCd.trim();
    }

    /**
     * 获取补货区分
     *
     * @return TRN_TYPE - 补货区分
     */
    public String getTrnType() {
        return trnType;
    }

    /**
     * 设置补货区分
     *
     * @param trnType 补货区分
     */
    public void setTrnType(String trnType) {
        this.trnType = trnType == null ? null : trnType.trim();
    }

    /**
     * 获取源仓库
     *
     * @return WH_CD - 源仓库
     */
    public String getWhCd() {
        return whCd;
    }

    /**
     * 设置源仓库
     *
     * @param whCd 源仓库
     */
    public void setWhCd(String whCd) {
        this.whCd = whCd == null ? null : whCd.trim();
    }

    /**
     * 获取成品编号
     *
     * @return PROD_CD - 成品编号
     */
    public String getProdCd() {
        return prodCd;
    }

    /**
     * 设置成品编号
     *
     * @param prodCd 成品编号
     */
    public void setProdCd(String prodCd) {
        this.prodCd = prodCd == null ? null : prodCd.trim();
    }

    /**
     * 获取目标仓库
     *
     * @return TAG_WH_CD - 目标仓库
     */
    public String getTagWhCd() {
        return tagWhCd;
    }

    /**
     * 设置目标仓库
     *
     * @param tagWhCd 目标仓库
     */
    public void setTagWhCd(String tagWhCd) {
        this.tagWhCd = tagWhCd == null ? null : tagWhCd.trim();
    }

    /**
     * 获取补充数量
     *
     * @return REP_NUM - 补充数量
     */
    public String getRepNum() {
        return repNum;
    }

    /**
     * 设置补充数量
     *
     * @param repNum 补充数量
     */
    public void setRepNum(String repNum) {
        this.repNum = repNum == null ? null : repNum.trim();
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
        TStockReplenish other = (TStockReplenish) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCntrCd() == null ? other.getCntrCd() == null : this.getCntrCd().equals(other.getCntrCd()))
            && (this.getRepCd() == null ? other.getRepCd() == null : this.getRepCd().equals(other.getRepCd()))
            && (this.getTrnType() == null ? other.getTrnType() == null : this.getTrnType().equals(other.getTrnType()))
            && (this.getWhCd() == null ? other.getWhCd() == null : this.getWhCd().equals(other.getWhCd()))
            && (this.getProdCd() == null ? other.getProdCd() == null : this.getProdCd().equals(other.getProdCd()))
            && (this.getTagWhCd() == null ? other.getTagWhCd() == null : this.getTagWhCd().equals(other.getTagWhCd()))
            && (this.getRepNum() == null ? other.getRepNum() == null : this.getRepNum().equals(other.getRepNum()))
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
        result = prime * result + ((getRepCd() == null) ? 0 : getRepCd().hashCode());
        result = prime * result + ((getTrnType() == null) ? 0 : getTrnType().hashCode());
        result = prime * result + ((getWhCd() == null) ? 0 : getWhCd().hashCode());
        result = prime * result + ((getProdCd() == null) ? 0 : getProdCd().hashCode());
        result = prime * result + ((getTagWhCd() == null) ? 0 : getTagWhCd().hashCode());
        result = prime * result + ((getRepNum() == null) ? 0 : getRepNum().hashCode());
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
        sb.append(", repCd=").append(repCd);
        sb.append(", trnType=").append(trnType);
        sb.append(", whCd=").append(whCd);
        sb.append(", prodCd=").append(prodCd);
        sb.append(", tagWhCd=").append(tagWhCd);
        sb.append(", repNum=").append(repNum);
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
