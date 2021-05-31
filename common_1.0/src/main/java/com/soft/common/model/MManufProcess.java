package com.soft.common.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@ApiModel(description="生产流程")
@Table(name = "m_manuf_process")
public class MManufProcess implements Serializable {
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
     * 生产流程名称
     */
    @Column(name = "MANUF_PROCESS")
    @ApiModelProperty(value="生产流程名称")
    private String manufProcess;

    /**
     * 生产流程类型
     */
    @Column(name = "MANUF_PROCESS_CLS")
    @ApiModelProperty(value="生产流程类型")
    private String manufProcessCls;

    /**
     * 备注
     */
    @Column(name = "REMARK")
    @ApiModelProperty(value="备注")
    private String remark;

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

    /**
     * 执行部门
     */
    @Column(name = "ORG_ID")
    @ApiModelProperty(value="执行部门")
    private String orgId;

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
    public MManufProcess setId(String id) {
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
    public MManufProcess setCntrCd(String cntrCd) {
        this.cntrCd = cntrCd == null ? null : cntrCd.trim();
        return this;
    }

    /**
     * 获取生产流程名称
     *
     * @return MANUF_PROCESS - 生产流程名称
     */
    public String getManufProcess() {
        return manufProcess;
    }

    /**
     * 设置生产流程名称
     *
     * @param manufProcess 生产流程名称
     */
    public MManufProcess setManufProcess(String manufProcess) {
        this.manufProcess = manufProcess == null ? null : manufProcess.trim();
        return this;
    }

    /**
     * 获取生产流程类型
     *
     * @return MANUF_PROCESS_CLS - 生产流程类型
     */
    public String getManufProcessCls() {
        return manufProcessCls;
    }

    /**
     * 设置生产流程类型
     *
     * @param manufProcessCls 生产流程类型
     */
    public MManufProcess setManufProcessCls(String manufProcessCls) {
        this.manufProcessCls = manufProcessCls == null ? null : manufProcessCls.trim();
        return this;
    }

    /**
     * 获取备注
     *
     * @return REMARK - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public MManufProcess setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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
    public MManufProcess setChar1(String char1) {
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
    public MManufProcess setChar2(String char2) {
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
    public MManufProcess setChar3(String char3) {
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
    public MManufProcess setChar4(String char4) {
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
    public MManufProcess setChar5(String char5) {
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
    public MManufProcess setChar6(String char6) {
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
    public MManufProcess setChar7(String char7) {
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
    public MManufProcess setChar8(String char8) {
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
    public MManufProcess setChar9(String char9) {
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
    public MManufProcess setChar10(String char10) {
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
    public MManufProcess setNum1(BigDecimal num1) {
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
    public MManufProcess setNum2(BigDecimal num2) {
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
    public MManufProcess setNum3(BigDecimal num3) {
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
    public MManufProcess setNum4(BigDecimal num4) {
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
    public MManufProcess setNum5(BigDecimal num5) {
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
    public MManufProcess setNum6(BigDecimal num6) {
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
    public MManufProcess setNum7(BigDecimal num7) {
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
    public MManufProcess setNum8(BigDecimal num8) {
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
    public MManufProcess setNum9(BigDecimal num9) {
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
    public MManufProcess setNum10(BigDecimal num10) {
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
    public MManufProcess setUpdCnt(Integer updCnt) {
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
    public MManufProcess setDelFlg(String delFlg) {
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
    public MManufProcess setAddEntKbn(String addEntKbn) {
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
    public MManufProcess setAddPgmId(String addPgmId) {
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
    public MManufProcess setAddUserId(String addUserId) {
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
    public MManufProcess setAddUserNm(String addUserNm) {
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
    public MManufProcess setAddTnmtId(String addTnmtId) {
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
    public MManufProcess setAddDt(Date addDt) {
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
    public MManufProcess setUpdEntKbn(String updEntKbn) {
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
    public MManufProcess setUpdPgmId(String updPgmId) {
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
    public MManufProcess setUpdUserId(String updUserId) {
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
    public MManufProcess setUpdUserNm(String updUserNm) {
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
    public MManufProcess setUpdTnmtId(String updTnmtId) {
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
    public MManufProcess setUpdDt(Date updDt) {
        this.updDt = updDt;
        return this;
    }

    /**
     * 获取执行部门
     *
     * @return ORG_ID - 执行部门
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * 设置执行部门
     *
     * @param orgId 执行部门
     */
    public MManufProcess setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
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
        MManufProcess other = (MManufProcess) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCntrCd() == null ? other.getCntrCd() == null : this.getCntrCd().equals(other.getCntrCd()))
            && (this.getManufProcess() == null ? other.getManufProcess() == null : this.getManufProcess().equals(other.getManufProcess()))
            && (this.getManufProcessCls() == null ? other.getManufProcessCls() == null : this.getManufProcessCls().equals(other.getManufProcessCls()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
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
            && (this.getUpdDt() == null ? other.getUpdDt() == null : this.getUpdDt().equals(other.getUpdDt()))
            && (this.getOrgId() == null ? other.getOrgId() == null : this.getOrgId().equals(other.getOrgId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCntrCd() == null) ? 0 : getCntrCd().hashCode());
        result = prime * result + ((getManufProcess() == null) ? 0 : getManufProcess().hashCode());
        result = prime * result + ((getManufProcessCls() == null) ? 0 : getManufProcessCls().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
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
        result = prime * result + ((getOrgId() == null) ? 0 : getOrgId().hashCode());
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
        sb.append(", manufProcess=").append(manufProcess);
        sb.append(", manufProcessCls=").append(manufProcessCls);
        sb.append(", remark=").append(remark);
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
        sb.append(", orgId=").append(orgId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}