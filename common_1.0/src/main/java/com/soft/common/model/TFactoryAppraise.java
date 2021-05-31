package com.soft.common.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "`t_factory_appraise`")
public class TFactoryAppraise implements Serializable {
    @Column(name = "`ID`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "`CNTR_CD`")
    private String cntrCd;

    @Column(name = "`ORG_ID`")
    private String orgId;

    @Column(name = "`OUT_FACTORY_CD`")
    private String outFactoryCd;

    @Column(name = "`APPRAISE_TYPE`")
    private String appraiseType;

    @Column(name = "`COMMON_CD`")
    private String commonCd;

    @Column(name = "`APPRAISE_LEVEL`")
    private String appraiseLevel;

    @Column(name = "`REMARKS`")
    private String remarks;

    @Column(name = "`CHARACTER1`")
    private String character1;

    @Column(name = "`CHARACTER2`")
    private String character2;

    @Column(name = "`CHARACTER3`")
    private String character3;

    @Column(name = "`CHARACTER4`")
    private String character4;

    @Column(name = "`CHARACTER5`")
    private String character5;

    @Column(name = "`NUM1`")
    private String num1;

    @Column(name = "`NUM2`")
    private String num2;

    @Column(name = "`NUM3`")
    private String num3;

    @Column(name = "`NUM4`")
    private String num4;

    @Column(name = "`NUM5`")
    private String num5;

    @Column(name = "`UPD_CNT`")
    private Integer updCnt;

    @Column(name = "`DEL_FLG`")
    private String delFlg;

    @Column(name = "`ADD_ENT_KBN`")
    private String addEntKbn;

    @Column(name = "`ADD_PGM_ID`")
    private String addPgmId;

    @Column(name = "`ADD_USER_ID`")
    private String addUserId;

    @Column(name = "`ADD_USER_NM`")
    private String addUserNm;

    @Column(name = "`ADD_TNMT_ID`")
    private String addTnmtId;

    @Column(name = "`ADD_DT`")
    private Date addDt;

    @Column(name = "`UPD_ENT_KBN`")
    private String updEntKbn;

    @Column(name = "`UPD_PGM_ID`")
    private String updPgmId;

    @Column(name = "`UPD_USER_ID`")
    private String updUserId;

    @Column(name = "`UPD_USER_NM`")
    private String updUserNm;

    @Column(name = "`UPD_TNMT_ID`")
    private String updTnmtId;

    @Column(name = "`UPD_DT`")
    private Date updDt;

    private static final long serialVersionUID = 1L;

    /**
     * @return ID
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * @return CNTR_CD
     */
    public String getCntrCd() {
        return cntrCd;
    }

    /**
     * @param cntrCd
     */
    public void setCntrCd(String cntrCd) {
        this.cntrCd = cntrCd == null ? null : cntrCd.trim();
    }

    /**
     * @return ORG_ID
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * @param orgId
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    /**
     * @return OUT_FACTORY_CD
     */
    public String getOutFactoryCd() {
        return outFactoryCd;
    }

    /**
     * @param outFactoryCd
     */
    public void setOutFactoryCd(String outFactoryCd) {
        this.outFactoryCd = outFactoryCd == null ? null : outFactoryCd.trim();
    }

    /**
     * @return APPRAISE_TYPE
     */
    public String getAppraiseType() {
        return appraiseType;
    }

    /**
     * @param appraiseType
     */
    public void setAppraiseType(String appraiseType) {
        this.appraiseType = appraiseType == null ? null : appraiseType.trim();
    }

    /**
     * @return COMMON_CD
     */
    public String getCommonCd() {
        return commonCd;
    }

    /**
     * @param commonCd
     */
    public void setCommonCd(String commonCd) {
        this.commonCd = commonCd == null ? null : commonCd.trim();
    }

    /**
     * @return APPRAISE_LEVEL
     */
    public String getAppraiseLevel() {
        return appraiseLevel;
    }

    /**
     * @param appraiseLevel
     */
    public void setAppraiseLevel(String appraiseLevel) {
        this.appraiseLevel = appraiseLevel == null ? null : appraiseLevel.trim();
    }

    /**
     * @return REMARKS
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * @param remarks
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    /**
     * @return CHARACTER1
     */
    public String getCharacter1() {
        return character1;
    }

    /**
     * @param character1
     */
    public void setCharacter1(String character1) {
        this.character1 = character1 == null ? null : character1.trim();
    }

    /**
     * @return CHARACTER2
     */
    public String getCharacter2() {
        return character2;
    }

    /**
     * @param character2
     */
    public void setCharacter2(String character2) {
        this.character2 = character2 == null ? null : character2.trim();
    }

    /**
     * @return CHARACTER3
     */
    public String getCharacter3() {
        return character3;
    }

    /**
     * @param character3
     */
    public void setCharacter3(String character3) {
        this.character3 = character3 == null ? null : character3.trim();
    }

    /**
     * @return CHARACTER4
     */
    public String getCharacter4() {
        return character4;
    }

    /**
     * @param character4
     */
    public void setCharacter4(String character4) {
        this.character4 = character4 == null ? null : character4.trim();
    }

    /**
     * @return CHARACTER5
     */
    public String getCharacter5() {
        return character5;
    }

    /**
     * @param character5
     */
    public void setCharacter5(String character5) {
        this.character5 = character5 == null ? null : character5.trim();
    }

    /**
     * @return NUM1
     */
    public String getNum1() {
        return num1;
    }

    /**
     * @param num1
     */
    public void setNum1(String num1) {
        this.num1 = num1 == null ? null : num1.trim();
    }

    /**
     * @return NUM2
     */
    public String getNum2() {
        return num2;
    }

    /**
     * @param num2
     */
    public void setNum2(String num2) {
        this.num2 = num2 == null ? null : num2.trim();
    }

    /**
     * @return NUM3
     */
    public String getNum3() {
        return num3;
    }

    /**
     * @param num3
     */
    public void setNum3(String num3) {
        this.num3 = num3 == null ? null : num3.trim();
    }

    /**
     * @return NUM4
     */
    public String getNum4() {
        return num4;
    }

    /**
     * @param num4
     */
    public void setNum4(String num4) {
        this.num4 = num4 == null ? null : num4.trim();
    }

    /**
     * @return NUM5
     */
    public String getNum5() {
        return num5;
    }

    /**
     * @param num5
     */
    public void setNum5(String num5) {
        this.num5 = num5 == null ? null : num5.trim();
    }

    /**
     * @return UPD_CNT
     */
    public Integer getUpdCnt() {
        return updCnt;
    }

    /**
     * @param updCnt
     */
    public void setUpdCnt(Integer updCnt) {
        this.updCnt = updCnt;
    }

    /**
     * @return DEL_FLG
     */
    public String getDelFlg() {
        return delFlg;
    }

    /**
     * @param delFlg
     */
    public void setDelFlg(String delFlg) {
        this.delFlg = delFlg == null ? null : delFlg.trim();
    }

    /**
     * @return ADD_ENT_KBN
     */
    public String getAddEntKbn() {
        return addEntKbn;
    }

    /**
     * @param addEntKbn
     */
    public void setAddEntKbn(String addEntKbn) {
        this.addEntKbn = addEntKbn == null ? null : addEntKbn.trim();
    }

    /**
     * @return ADD_PGM_ID
     */
    public String getAddPgmId() {
        return addPgmId;
    }

    /**
     * @param addPgmId
     */
    public void setAddPgmId(String addPgmId) {
        this.addPgmId = addPgmId == null ? null : addPgmId.trim();
    }

    /**
     * @return ADD_USER_ID
     */
    public String getAddUserId() {
        return addUserId;
    }

    /**
     * @param addUserId
     */
    public void setAddUserId(String addUserId) {
        this.addUserId = addUserId == null ? null : addUserId.trim();
    }

    /**
     * @return ADD_USER_NM
     */
    public String getAddUserNm() {
        return addUserNm;
    }

    /**
     * @param addUserNm
     */
    public void setAddUserNm(String addUserNm) {
        this.addUserNm = addUserNm == null ? null : addUserNm.trim();
    }

    /**
     * @return ADD_TNMT_ID
     */
    public String getAddTnmtId() {
        return addTnmtId;
    }

    /**
     * @param addTnmtId
     */
    public void setAddTnmtId(String addTnmtId) {
        this.addTnmtId = addTnmtId == null ? null : addTnmtId.trim();
    }

    /**
     * @return ADD_DT
     */
    public Date getAddDt() {
        return addDt;
    }

    /**
     * @param addDt
     */
    public void setAddDt(Date addDt) {
        this.addDt = addDt;
    }

    /**
     * @return UPD_ENT_KBN
     */
    public String getUpdEntKbn() {
        return updEntKbn;
    }

    /**
     * @param updEntKbn
     */
    public void setUpdEntKbn(String updEntKbn) {
        this.updEntKbn = updEntKbn == null ? null : updEntKbn.trim();
    }

    /**
     * @return UPD_PGM_ID
     */
    public String getUpdPgmId() {
        return updPgmId;
    }

    /**
     * @param updPgmId
     */
    public void setUpdPgmId(String updPgmId) {
        this.updPgmId = updPgmId == null ? null : updPgmId.trim();
    }

    /**
     * @return UPD_USER_ID
     */
    public String getUpdUserId() {
        return updUserId;
    }

    /**
     * @param updUserId
     */
    public void setUpdUserId(String updUserId) {
        this.updUserId = updUserId == null ? null : updUserId.trim();
    }

    /**
     * @return UPD_USER_NM
     */
    public String getUpdUserNm() {
        return updUserNm;
    }

    /**
     * @param updUserNm
     */
    public void setUpdUserNm(String updUserNm) {
        this.updUserNm = updUserNm == null ? null : updUserNm.trim();
    }

    /**
     * @return UPD_TNMT_ID
     */
    public String getUpdTnmtId() {
        return updTnmtId;
    }

    /**
     * @param updTnmtId
     */
    public void setUpdTnmtId(String updTnmtId) {
        this.updTnmtId = updTnmtId == null ? null : updTnmtId.trim();
    }

    /**
     * @return UPD_DT
     */
    public Date getUpdDt() {
        return updDt;
    }

    /**
     * @param updDt
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
        TFactoryAppraise other = (TFactoryAppraise) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCntrCd() == null ? other.getCntrCd() == null : this.getCntrCd().equals(other.getCntrCd()))
            && (this.getOrgId() == null ? other.getOrgId() == null : this.getOrgId().equals(other.getOrgId()))
            && (this.getOutFactoryCd() == null ? other.getOutFactoryCd() == null : this.getOutFactoryCd().equals(other.getOutFactoryCd()))
            && (this.getAppraiseType() == null ? other.getAppraiseType() == null : this.getAppraiseType().equals(other.getAppraiseType()))
            && (this.getCommonCd() == null ? other.getCommonCd() == null : this.getCommonCd().equals(other.getCommonCd()))
            && (this.getAppraiseLevel() == null ? other.getAppraiseLevel() == null : this.getAppraiseLevel().equals(other.getAppraiseLevel()))
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
        result = prime * result + ((getOrgId() == null) ? 0 : getOrgId().hashCode());
        result = prime * result + ((getOutFactoryCd() == null) ? 0 : getOutFactoryCd().hashCode());
        result = prime * result + ((getAppraiseType() == null) ? 0 : getAppraiseType().hashCode());
        result = prime * result + ((getCommonCd() == null) ? 0 : getCommonCd().hashCode());
        result = prime * result + ((getAppraiseLevel() == null) ? 0 : getAppraiseLevel().hashCode());
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
        sb.append(", orgId=").append(orgId);
        sb.append(", outFactoryCd=").append(outFactoryCd);
        sb.append(", appraiseType=").append(appraiseType);
        sb.append(", commonCd=").append(commonCd);
        sb.append(", appraiseLevel=").append(appraiseLevel);
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
