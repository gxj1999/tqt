package com.soft.common.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "`tf_business_apply`")
public class TfBusinessApply implements Serializable {
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
     * 申请ID
     */
    @Column(name = "`APPLY_ID`")
    private String applyId;

    /**
     * 任务类型
     */
    @Column(name = "`TASK_RULE`")
    private String taskRule;

    /**
     * 任务规则类型
     */
    @Column(name = "`TASK_RULE_TYPE`")
    private String taskRuleType;

    /**
     * 审批步骤
     */
    @Column(name = "`APPROVE_STEP`")
    private String approveStep;

    /**
     * 申请科室
     */
    @Column(name = "`APPLY_ORG_DEPT`")
    private String applyOrgDept;

    /**
     * 申请者
     */
    @Column(name = "`APPLY_USER`")
    private String applyUser;

    /**
     * 申请时间
     */
    @Column(name = "`APPLY_DT`")
    private Date applyDt;

    /**
     * 资产编号
     */
    @Column(name = "`ASSET_ID`")
    private String assetId;

    /**
     * 资产名称
     */
    @Column(name = "`ASSET_NM`")
    private String assetNm;

    /**
     * 资产型号
     */
    @Column(name = "`ASSET_MODEL`")
    private String assetModel;

    /**
     * 资产分类ID
     */
    @Column(name = "`ASSET_TYPE_ID`")
    private String assetTypeId;

    /**
     * 申请说明
     */
    @Column(name = "`ASSET_DESCRIBE`")
    private String assetDescribe;

    /**
     * 申请数量
     */
    @Column(name = "`APPLY_QTY`")
    private Integer applyQty;

    /**
     * 拨入科室
     */
    @Column(name = "`TO_ORG_DEPT`")
    private String toOrgDept;

    /**
     * 安放位置
     */
    @Column(name = "`ASSET_LOC`")
    private String assetLoc;

    /**
     * 申请状态
     */
    @Column(name = "`APPLY_STATUS`")
    private String applyStatus;

    /**
     * 流程实例ID
     */
    @Column(name = "`PID`")
    private String pid;

    /**
     * 备注
     */
    @Column(name = "`REMARKS`")
    private String remarks;

    /**
     * 图片ID
     */
    @Column(name = "`PHOTO_ID`")
    private String photoId;

    /**
     * 购置申请编号
     */
    @Column(name = "`SHOP_APPLY_ID`")
    private String shopApplyId;

    /**
     * 购置情况编号
     */
    @Column(name = "`SHOP_AFFAIRS_ID`")
    private String shopAffairsId;

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
     * 获取申请ID
     *
     * @return APPLY_ID - 申请ID
     */
    public String getApplyId() {
        return applyId;
    }

    /**
     * 设置申请ID
     *
     * @param applyId 申请ID
     */
    public void setApplyId(String applyId) {
        this.applyId = applyId == null ? null : applyId.trim();
    }

    /**
     * 获取任务类型
     *
     * @return TASK_RULE - 任务类型
     */
    public String getTaskRule() {
        return taskRule;
    }

    /**
     * 设置任务类型
     *
     * @param taskRule 任务类型
     */
    public void setTaskRule(String taskRule) {
        this.taskRule = taskRule == null ? null : taskRule.trim();
    }

    /**
     * 获取任务规则类型
     *
     * @return TASK_RULE_TYPE - 任务规则类型
     */
    public String getTaskRuleType() {
        return taskRuleType;
    }

    /**
     * 设置任务规则类型
     *
     * @param taskRuleType 任务规则类型
     */
    public void setTaskRuleType(String taskRuleType) {
        this.taskRuleType = taskRuleType == null ? null : taskRuleType.trim();
    }

    /**
     * 获取审批步骤
     *
     * @return APPROVE_STEP - 审批步骤
     */
    public String getApproveStep() {
        return approveStep;
    }

    /**
     * 设置审批步骤
     *
     * @param approveStep 审批步骤
     */
    public void setApproveStep(String approveStep) {
        this.approveStep = approveStep == null ? null : approveStep.trim();
    }

    /**
     * 获取申请科室
     *
     * @return APPLY_ORG_DEPT - 申请科室
     */
    public String getApplyOrgDept() {
        return applyOrgDept;
    }

    /**
     * 设置申请科室
     *
     * @param applyOrgDept 申请科室
     */
    public void setApplyOrgDept(String applyOrgDept) {
        this.applyOrgDept = applyOrgDept == null ? null : applyOrgDept.trim();
    }

    /**
     * 获取申请者
     *
     * @return APPLY_USER - 申请者
     */
    public String getApplyUser() {
        return applyUser;
    }

    /**
     * 设置申请者
     *
     * @param applyUser 申请者
     */
    public void setApplyUser(String applyUser) {
        this.applyUser = applyUser == null ? null : applyUser.trim();
    }

    /**
     * 获取申请时间
     *
     * @return APPLY_DT - 申请时间
     */
    public Date getApplyDt() {
        return applyDt;
    }

    /**
     * 设置申请时间
     *
     * @param applyDt 申请时间
     */
    public void setApplyDt(Date applyDt) {
        this.applyDt = applyDt;
    }

    /**
     * 获取资产编号
     *
     * @return ASSET_ID - 资产编号
     */
    public String getAssetId() {
        return assetId;
    }

    /**
     * 设置资产编号
     *
     * @param assetId 资产编号
     */
    public void setAssetId(String assetId) {
        this.assetId = assetId == null ? null : assetId.trim();
    }

    /**
     * 获取资产名称
     *
     * @return ASSET_NM - 资产名称
     */
    public String getAssetNm() {
        return assetNm;
    }

    /**
     * 设置资产名称
     *
     * @param assetNm 资产名称
     */
    public void setAssetNm(String assetNm) {
        this.assetNm = assetNm == null ? null : assetNm.trim();
    }

    /**
     * 获取资产型号
     *
     * @return ASSET_MODEL - 资产型号
     */
    public String getAssetModel() {
        return assetModel;
    }

    /**
     * 设置资产型号
     *
     * @param assetModel 资产型号
     */
    public void setAssetModel(String assetModel) {
        this.assetModel = assetModel == null ? null : assetModel.trim();
    }

    /**
     * 获取资产分类ID
     *
     * @return ASSET_TYPE_ID - 资产分类ID
     */
    public String getAssetTypeId() {
        return assetTypeId;
    }

    /**
     * 设置资产分类ID
     *
     * @param assetTypeId 资产分类ID
     */
    public void setAssetTypeId(String assetTypeId) {
        this.assetTypeId = assetTypeId == null ? null : assetTypeId.trim();
    }

    /**
     * 获取申请说明
     *
     * @return ASSET_DESCRIBE - 申请说明
     */
    public String getAssetDescribe() {
        return assetDescribe;
    }

    /**
     * 设置申请说明
     *
     * @param assetDescribe 申请说明
     */
    public void setAssetDescribe(String assetDescribe) {
        this.assetDescribe = assetDescribe == null ? null : assetDescribe.trim();
    }

    /**
     * 获取申请数量
     *
     * @return APPLY_QTY - 申请数量
     */
    public Integer getApplyQty() {
        return applyQty;
    }

    /**
     * 设置申请数量
     *
     * @param applyQty 申请数量
     */
    public void setApplyQty(Integer applyQty) {
        this.applyQty = applyQty;
    }

    /**
     * 获取拨入科室
     *
     * @return TO_ORG_DEPT - 拨入科室
     */
    public String getToOrgDept() {
        return toOrgDept;
    }

    /**
     * 设置拨入科室
     *
     * @param toOrgDept 拨入科室
     */
    public void setToOrgDept(String toOrgDept) {
        this.toOrgDept = toOrgDept == null ? null : toOrgDept.trim();
    }

    /**
     * 获取安放位置
     *
     * @return ASSET_LOC - 安放位置
     */
    public String getAssetLoc() {
        return assetLoc;
    }

    /**
     * 设置安放位置
     *
     * @param assetLoc 安放位置
     */
    public void setAssetLoc(String assetLoc) {
        this.assetLoc = assetLoc == null ? null : assetLoc.trim();
    }

    /**
     * 获取申请状态
     *
     * @return APPLY_STATUS - 申请状态
     */
    public String getApplyStatus() {
        return applyStatus;
    }

    /**
     * 设置申请状态
     *
     * @param applyStatus 申请状态
     */
    public void setApplyStatus(String applyStatus) {
        this.applyStatus = applyStatus == null ? null : applyStatus.trim();
    }

    /**
     * 获取流程实例ID
     *
     * @return PID - 流程实例ID
     */
    public String getPid() {
        return pid;
    }

    /**
     * 设置流程实例ID
     *
     * @param pid 流程实例ID
     */
    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
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
     * 获取图片ID
     *
     * @return PHOTO_ID - 图片ID
     */
    public String getPhotoId() {
        return photoId;
    }

    /**
     * 设置图片ID
     *
     * @param photoId 图片ID
     */
    public void setPhotoId(String photoId) {
        this.photoId = photoId == null ? null : photoId.trim();
    }

    /**
     * 获取购置申请编号
     *
     * @return SHOP_APPLY_ID - 购置申请编号
     */
    public String getShopApplyId() {
        return shopApplyId;
    }

    /**
     * 设置购置申请编号
     *
     * @param shopApplyId 购置申请编号
     */
    public void setShopApplyId(String shopApplyId) {
        this.shopApplyId = shopApplyId == null ? null : shopApplyId.trim();
    }

    /**
     * 获取购置情况编号
     *
     * @return SHOP_AFFAIRS_ID - 购置情况编号
     */
    public String getShopAffairsId() {
        return shopAffairsId;
    }

    /**
     * 设置购置情况编号
     *
     * @param shopAffairsId 购置情况编号
     */
    public void setShopAffairsId(String shopAffairsId) {
        this.shopAffairsId = shopAffairsId == null ? null : shopAffairsId.trim();
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
        TfBusinessApply other = (TfBusinessApply) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCntrCd() == null ? other.getCntrCd() == null : this.getCntrCd().equals(other.getCntrCd()))
            && (this.getApplyId() == null ? other.getApplyId() == null : this.getApplyId().equals(other.getApplyId()))
            && (this.getTaskRule() == null ? other.getTaskRule() == null : this.getTaskRule().equals(other.getTaskRule()))
            && (this.getTaskRuleType() == null ? other.getTaskRuleType() == null : this.getTaskRuleType().equals(other.getTaskRuleType()))
            && (this.getApproveStep() == null ? other.getApproveStep() == null : this.getApproveStep().equals(other.getApproveStep()))
            && (this.getApplyOrgDept() == null ? other.getApplyOrgDept() == null : this.getApplyOrgDept().equals(other.getApplyOrgDept()))
            && (this.getApplyUser() == null ? other.getApplyUser() == null : this.getApplyUser().equals(other.getApplyUser()))
            && (this.getApplyDt() == null ? other.getApplyDt() == null : this.getApplyDt().equals(other.getApplyDt()))
            && (this.getAssetId() == null ? other.getAssetId() == null : this.getAssetId().equals(other.getAssetId()))
            && (this.getAssetNm() == null ? other.getAssetNm() == null : this.getAssetNm().equals(other.getAssetNm()))
            && (this.getAssetModel() == null ? other.getAssetModel() == null : this.getAssetModel().equals(other.getAssetModel()))
            && (this.getAssetTypeId() == null ? other.getAssetTypeId() == null : this.getAssetTypeId().equals(other.getAssetTypeId()))
            && (this.getAssetDescribe() == null ? other.getAssetDescribe() == null : this.getAssetDescribe().equals(other.getAssetDescribe()))
            && (this.getApplyQty() == null ? other.getApplyQty() == null : this.getApplyQty().equals(other.getApplyQty()))
            && (this.getToOrgDept() == null ? other.getToOrgDept() == null : this.getToOrgDept().equals(other.getToOrgDept()))
            && (this.getAssetLoc() == null ? other.getAssetLoc() == null : this.getAssetLoc().equals(other.getAssetLoc()))
            && (this.getApplyStatus() == null ? other.getApplyStatus() == null : this.getApplyStatus().equals(other.getApplyStatus()))
            && (this.getPid() == null ? other.getPid() == null : this.getPid().equals(other.getPid()))
            && (this.getRemarks() == null ? other.getRemarks() == null : this.getRemarks().equals(other.getRemarks()))
            && (this.getPhotoId() == null ? other.getPhotoId() == null : this.getPhotoId().equals(other.getPhotoId()))
            && (this.getShopApplyId() == null ? other.getShopApplyId() == null : this.getShopApplyId().equals(other.getShopApplyId()))
            && (this.getShopAffairsId() == null ? other.getShopAffairsId() == null : this.getShopAffairsId().equals(other.getShopAffairsId()))
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
        result = prime * result + ((getApplyId() == null) ? 0 : getApplyId().hashCode());
        result = prime * result + ((getTaskRule() == null) ? 0 : getTaskRule().hashCode());
        result = prime * result + ((getTaskRuleType() == null) ? 0 : getTaskRuleType().hashCode());
        result = prime * result + ((getApproveStep() == null) ? 0 : getApproveStep().hashCode());
        result = prime * result + ((getApplyOrgDept() == null) ? 0 : getApplyOrgDept().hashCode());
        result = prime * result + ((getApplyUser() == null) ? 0 : getApplyUser().hashCode());
        result = prime * result + ((getApplyDt() == null) ? 0 : getApplyDt().hashCode());
        result = prime * result + ((getAssetId() == null) ? 0 : getAssetId().hashCode());
        result = prime * result + ((getAssetNm() == null) ? 0 : getAssetNm().hashCode());
        result = prime * result + ((getAssetModel() == null) ? 0 : getAssetModel().hashCode());
        result = prime * result + ((getAssetTypeId() == null) ? 0 : getAssetTypeId().hashCode());
        result = prime * result + ((getAssetDescribe() == null) ? 0 : getAssetDescribe().hashCode());
        result = prime * result + ((getApplyQty() == null) ? 0 : getApplyQty().hashCode());
        result = prime * result + ((getToOrgDept() == null) ? 0 : getToOrgDept().hashCode());
        result = prime * result + ((getAssetLoc() == null) ? 0 : getAssetLoc().hashCode());
        result = prime * result + ((getApplyStatus() == null) ? 0 : getApplyStatus().hashCode());
        result = prime * result + ((getPid() == null) ? 0 : getPid().hashCode());
        result = prime * result + ((getRemarks() == null) ? 0 : getRemarks().hashCode());
        result = prime * result + ((getPhotoId() == null) ? 0 : getPhotoId().hashCode());
        result = prime * result + ((getShopApplyId() == null) ? 0 : getShopApplyId().hashCode());
        result = prime * result + ((getShopAffairsId() == null) ? 0 : getShopAffairsId().hashCode());
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
        sb.append(", applyId=").append(applyId);
        sb.append(", taskRule=").append(taskRule);
        sb.append(", taskRuleType=").append(taskRuleType);
        sb.append(", approveStep=").append(approveStep);
        sb.append(", applyOrgDept=").append(applyOrgDept);
        sb.append(", applyUser=").append(applyUser);
        sb.append(", applyDt=").append(applyDt);
        sb.append(", assetId=").append(assetId);
        sb.append(", assetNm=").append(assetNm);
        sb.append(", assetModel=").append(assetModel);
        sb.append(", assetTypeId=").append(assetTypeId);
        sb.append(", assetDescribe=").append(assetDescribe);
        sb.append(", applyQty=").append(applyQty);
        sb.append(", toOrgDept=").append(toOrgDept);
        sb.append(", assetLoc=").append(assetLoc);
        sb.append(", applyStatus=").append(applyStatus);
        sb.append(", pid=").append(pid);
        sb.append(", remarks=").append(remarks);
        sb.append(", photoId=").append(photoId);
        sb.append(", shopApplyId=").append(shopApplyId);
        sb.append(", shopAffairsId=").append(shopAffairsId);
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