package com.soft.common.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "`t_stock_taking_line`")
public class TStockTakingLine implements Serializable {
    /**
     * 主键
     */
    @Id
    @Column(name = "`ID`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 盘点编号
     */
    @Column(name = "`TAK_NUM`")
    private String takNum;

    /**
     * 盘点明细行号
     */
    @Column(name = "`TAK_LINE_NUM`")
    private String takLineNum;

    /**
     * 实际库存编号
     */
    @Column(name = "`HND_NUM`")
    private String hndNum;

    /**
     * 仓库编号
     */
    @Column(name = "`WH_ID`")
    private String whId;

    /**
     * 中心编号
     */
    @Column(name = "`CNTR_CD`")
    private String cntrCd;

    /**
     * 盘点状态
     */
    @Column(name = "`TAK_CLS`")
    private String takCls;

    /**
     * 库位编号
     */
    @Column(name = "`LOC_ID`")
    private String locId;

    /**
     * 区域编号
     */
    @Column(name = "`ZONE_ID`")
    private String zoneId;

    /**
     * 箱种类编号
     */
    @Column(name = "`BOX_ID`")
    private String boxId;

    /**
     * 商品编号
     */
    @Column(name = "`PROD_ID`")
    private String prodId;

    /**
     * 纱线属性
     */
    @Column(name = "`YARN_REMARKS`")
    private String yarnRemarks;

    /**
     * 销售订单号
     */
    @Column(name = "`SALE_CD`")
    private String saleCd;

    /**
     * 销售合约号
     */
    @Column(name = "`CONTRACT_CD`")
    private String contractCd;

    /**
     * 客户编号
     */
    @Column(name = "`CUSTOMER_ID`")
    private String customerId;

    /**
     * 供应商编号
     */
    @Column(name = "`SUPPLIER_ID`")
    private String supplierId;

    /**
     * 外发工厂编号
     */
    @Column(name = "`OUT_FACTORY_ID`")
    private String outFactoryId;

    /**
     * 入库日期
     */
    @Column(name = "`RCV_DT`")
    private String rcvDt;

    /**
     * 型号
     */
    @Column(name = "`MODEL`")
    private String model;

    /**
     * 规格
     */
    @Column(name = "`SPEC`")
    private String spec;

    /**
     * 缸号
     */
    @Column(name = "`BATCH_NO`")
    private String batchNo;

    /**
     * 机台号
     */
    @Column(name = "`MACHINE_NO`")
    private String machineNo;

    /**
     * 工艺号
     */
    @Column(name = "`CRAFT_SN`")
    private String craftSn;

    /**
     * 色号
     */
    @Column(name = "`COLOR_CD`")
    private String colorCd;

    /**
     * 色系
     */
    @Column(name = "`COLOR_SYSTEM`")
    private String colorSystem;

    /**
     * 色别
     */
    @Column(name = "`COLOR_NM`")
    private String colorNm;

    /**
     * 生产批次号1
     */
    @Column(name = "`LOT1`")
    private String lot1;

    /**
     * 生产批次号2
     */
    @Column(name = "`LOT2`")
    private String lot2;

    /**
     * 交货日期
     */
    @Column(name = "`DELIVERY_DT`")
    private String deliveryDt;

    /**
     * 生产日期
     */
    @Column(name = "`MANUF_DT`")
    private String manufDt;

    /**
     * 保质期限
     */
    @Column(name = "`CONSUME_DT`")
    private String consumeDt;

    /**
     * 使用期限
     */
    @Column(name = "`EXPIRATION_DT`")
    private String expirationDt;

    /**
     * 总长度
     */
    @Column(name = "`GLENGTH`")
    private BigDecimal glength;

    /**
     * 净长度
     */
    @Column(name = "`NLENGTH`")
    private BigDecimal nlength;

    /**
     * 让米数
     */
    @Column(name = "`BLENGTH`")
    private BigDecimal blength;

    /**
     * 计数单位
     */
    @Column(name = "`QTY_UNIT`")
    private String qtyUnit;

    /**
     * 库存毛重
     */
    @Column(name = "`STOCK_GWEIGHT`")
    private BigDecimal stockGweight;

    /**
     * 库存净重
     */
    @Column(name = "`STOCK_NWEIGHT`")
    private BigDecimal stockNweight;

    /**
     * 库存数量
     */
    @Column(name = "`STOCK_QTY`")
    private BigDecimal stockQty;

    /**
     * 盘点毛重
     */
    @Column(name = "`STOCK_TAK_GWEIGHT`")
    private BigDecimal stockTakGweight;

    /**
     * 盘点净重
     */
    @Column(name = "`STOCK_TAK_NWEIGHT`")
    private BigDecimal stockTakNweight;

    /**
     * 盘点数量
     */
    @Column(name = "`STOCK_TAK_QTY`")
    private BigDecimal stockTakQty;

    /**
     * 盘点结果
     */
    @Column(name = "`TAK_RESULT`")
    private String takResult;

    /**
     * 记录标志
     */
    @Column(name = "`INPUT_TAK_FLG`")
    private String inputTakFlg;

    /**
     * 记录人编号
     */
    @Column(name = "`INPUT_USER_ID`")
    private String inputUserId;

    /**
     * 记录时间
     */
    @Column(name = "`INPUT_DT`")
    private Date inputDt;

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
     * 获取盘点编号
     *
     * @return TAK_NUM - 盘点编号
     */
    public String getTakNum() {
        return takNum;
    }

    /**
     * 设置盘点编号
     *
     * @param takNum 盘点编号
     */
    public void setTakNum(String takNum) {
        this.takNum = takNum == null ? null : takNum.trim();
    }

    /**
     * 获取盘点明细行号
     *
     * @return TAK_LINE_NUM - 盘点明细行号
     */
    public String getTakLineNum() {
        return takLineNum;
    }

    /**
     * 设置盘点明细行号
     *
     * @param takLineNum 盘点明细行号
     */
    public void setTakLineNum(String takLineNum) {
        this.takLineNum = takLineNum == null ? null : takLineNum.trim();
    }

    /**
     * 获取实际库存编号
     *
     * @return HND_NUM - 实际库存编号
     */
    public String getHndNum() {
        return hndNum;
    }

    /**
     * 设置实际库存编号
     *
     * @param hndNum 实际库存编号
     */
    public void setHndNum(String hndNum) {
        this.hndNum = hndNum == null ? null : hndNum.trim();
    }

    /**
     * 获取仓库编号
     *
     * @return WH_ID - 仓库编号
     */
    public String getWhId() {
        return whId;
    }

    /**
     * 设置仓库编号
     *
     * @param whId 仓库编号
     */
    public void setWhId(String whId) {
        this.whId = whId == null ? null : whId.trim();
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
     * 获取盘点状态
     *
     * @return TAK_CLS - 盘点状态
     */
    public String getTakCls() {
        return takCls;
    }

    /**
     * 设置盘点状态
     *
     * @param takCls 盘点状态
     */
    public void setTakCls(String takCls) {
        this.takCls = takCls == null ? null : takCls.trim();
    }

    /**
     * 获取库位编号
     *
     * @return LOC_ID - 库位编号
     */
    public String getLocId() {
        return locId;
    }

    /**
     * 设置库位编号
     *
     * @param locId 库位编号
     */
    public void setLocId(String locId) {
        this.locId = locId == null ? null : locId.trim();
    }

    /**
     * 获取区域编号
     *
     * @return ZONE_ID - 区域编号
     */
    public String getZoneId() {
        return zoneId;
    }

    /**
     * 设置区域编号
     *
     * @param zoneId 区域编号
     */
    public void setZoneId(String zoneId) {
        this.zoneId = zoneId == null ? null : zoneId.trim();
    }

    /**
     * 获取箱种类编号
     *
     * @return BOX_ID - 箱种类编号
     */
    public String getBoxId() {
        return boxId;
    }

    /**
     * 设置箱种类编号
     *
     * @param boxId 箱种类编号
     */
    public void setBoxId(String boxId) {
        this.boxId = boxId == null ? null : boxId.trim();
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
     * 获取销售订单号
     *
     * @return SALE_CD - 销售订单号
     */
    public String getSaleCd() {
        return saleCd;
    }

    /**
     * 设置销售订单号
     *
     * @param saleCd 销售订单号
     */
    public void setSaleCd(String saleCd) {
        this.saleCd = saleCd == null ? null : saleCd.trim();
    }

    /**
     * 获取销售合约号
     *
     * @return CONTRACT_CD - 销售合约号
     */
    public String getContractCd() {
        return contractCd;
    }

    /**
     * 设置销售合约号
     *
     * @param contractCd 销售合约号
     */
    public void setContractCd(String contractCd) {
        this.contractCd = contractCd == null ? null : contractCd.trim();
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
     * 获取供应商编号
     *
     * @return SUPPLIER_ID - 供应商编号
     */
    public String getSupplierId() {
        return supplierId;
    }

    /**
     * 设置供应商编号
     *
     * @param supplierId 供应商编号
     */
    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId == null ? null : supplierId.trim();
    }

    /**
     * 获取外发工厂编号
     *
     * @return OUT_FACTORY_ID - 外发工厂编号
     */
    public String getOutFactoryId() {
        return outFactoryId;
    }

    /**
     * 设置外发工厂编号
     *
     * @param outFactoryId 外发工厂编号
     */
    public void setOutFactoryId(String outFactoryId) {
        this.outFactoryId = outFactoryId == null ? null : outFactoryId.trim();
    }

    /**
     * 获取入库日期
     *
     * @return RCV_DT - 入库日期
     */
    public String getRcvDt() {
        return rcvDt;
    }

    /**
     * 设置入库日期
     *
     * @param rcvDt 入库日期
     */
    public void setRcvDt(String rcvDt) {
        this.rcvDt = rcvDt == null ? null : rcvDt.trim();
    }

    /**
     * 获取型号
     *
     * @return MODEL - 型号
     */
    public String getModel() {
        return model;
    }

    /**
     * 设置型号
     *
     * @param model 型号
     */
    public void setModel(String model) {
        this.model = model == null ? null : model.trim();
    }

    /**
     * 获取规格
     *
     * @return SPEC - 规格
     */
    public String getSpec() {
        return spec;
    }

    /**
     * 设置规格
     *
     * @param spec 规格
     */
    public void setSpec(String spec) {
        this.spec = spec == null ? null : spec.trim();
    }

    /**
     * 获取缸号
     *
     * @return BATCH_NO - 缸号
     */
    public String getBatchNo() {
        return batchNo;
    }

    /**
     * 设置缸号
     *
     * @param batchNo 缸号
     */
    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo == null ? null : batchNo.trim();
    }

    /**
     * 获取机台号
     *
     * @return MACHINE_NO - 机台号
     */
    public String getMachineNo() {
        return machineNo;
    }

    /**
     * 设置机台号
     *
     * @param machineNo 机台号
     */
    public void setMachineNo(String machineNo) {
        this.machineNo = machineNo == null ? null : machineNo.trim();
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
     * 获取色别
     *
     * @return COLOR_NM - 色别
     */
    public String getColorNm() {
        return colorNm;
    }

    /**
     * 设置色别
     *
     * @param colorNm 色别
     */
    public void setColorNm(String colorNm) {
        this.colorNm = colorNm == null ? null : colorNm.trim();
    }

    /**
     * 获取生产批次号1
     *
     * @return LOT1 - 生产批次号1
     */
    public String getLot1() {
        return lot1;
    }

    /**
     * 设置生产批次号1
     *
     * @param lot1 生产批次号1
     */
    public void setLot1(String lot1) {
        this.lot1 = lot1 == null ? null : lot1.trim();
    }

    /**
     * 获取生产批次号2
     *
     * @return LOT2 - 生产批次号2
     */
    public String getLot2() {
        return lot2;
    }

    /**
     * 设置生产批次号2
     *
     * @param lot2 生产批次号2
     */
    public void setLot2(String lot2) {
        this.lot2 = lot2 == null ? null : lot2.trim();
    }

    /**
     * 获取交货日期
     *
     * @return DELIVERY_DT - 交货日期
     */
    public String getDeliveryDt() {
        return deliveryDt;
    }

    /**
     * 设置交货日期
     *
     * @param deliveryDt 交货日期
     */
    public void setDeliveryDt(String deliveryDt) {
        this.deliveryDt = deliveryDt == null ? null : deliveryDt.trim();
    }

    /**
     * 获取生产日期
     *
     * @return MANUF_DT - 生产日期
     */
    public String getManufDt() {
        return manufDt;
    }

    /**
     * 设置生产日期
     *
     * @param manufDt 生产日期
     */
    public void setManufDt(String manufDt) {
        this.manufDt = manufDt == null ? null : manufDt.trim();
    }

    /**
     * 获取保质期限
     *
     * @return CONSUME_DT - 保质期限
     */
    public String getConsumeDt() {
        return consumeDt;
    }

    /**
     * 设置保质期限
     *
     * @param consumeDt 保质期限
     */
    public void setConsumeDt(String consumeDt) {
        this.consumeDt = consumeDt == null ? null : consumeDt.trim();
    }

    /**
     * 获取使用期限
     *
     * @return EXPIRATION_DT - 使用期限
     */
    public String getExpirationDt() {
        return expirationDt;
    }

    /**
     * 设置使用期限
     *
     * @param expirationDt 使用期限
     */
    public void setExpirationDt(String expirationDt) {
        this.expirationDt = expirationDt == null ? null : expirationDt.trim();
    }

    /**
     * 获取总长度
     *
     * @return GLENGTH - 总长度
     */
    public BigDecimal getGlength() {
        return glength;
    }

    /**
     * 设置总长度
     *
     * @param glength 总长度
     */
    public void setGlength(BigDecimal glength) {
        this.glength = glength;
    }

    /**
     * 获取净长度
     *
     * @return NLENGTH - 净长度
     */
    public BigDecimal getNlength() {
        return nlength;
    }

    /**
     * 设置净长度
     *
     * @param nlength 净长度
     */
    public void setNlength(BigDecimal nlength) {
        this.nlength = nlength;
    }

    /**
     * 获取让米数
     *
     * @return BLENGTH - 让米数
     */
    public BigDecimal getBlength() {
        return blength;
    }

    /**
     * 设置让米数
     *
     * @param blength 让米数
     */
    public void setBlength(BigDecimal blength) {
        this.blength = blength;
    }

    /**
     * 获取计数单位
     *
     * @return QTY_UNIT - 计数单位
     */
    public String getQtyUnit() {
        return qtyUnit;
    }

    /**
     * 设置计数单位
     *
     * @param qtyUnit 计数单位
     */
    public void setQtyUnit(String qtyUnit) {
        this.qtyUnit = qtyUnit == null ? null : qtyUnit.trim();
    }

    /**
     * 获取库存毛重
     *
     * @return STOCK_GWEIGHT - 库存毛重
     */
    public BigDecimal getStockGweight() {
        return stockGweight;
    }

    /**
     * 设置库存毛重
     *
     * @param stockGweight 库存毛重
     */
    public void setStockGweight(BigDecimal stockGweight) {
        this.stockGweight = stockGweight;
    }

    /**
     * 获取库存净重
     *
     * @return STOCK_NWEIGHT - 库存净重
     */
    public BigDecimal getStockNweight() {
        return stockNweight;
    }

    /**
     * 设置库存净重
     *
     * @param stockNweight 库存净重
     */
    public void setStockNweight(BigDecimal stockNweight) {
        this.stockNweight = stockNweight;
    }

    /**
     * 获取库存数量
     *
     * @return STOCK_QTY - 库存数量
     */
    public BigDecimal getStockQty() {
        return stockQty;
    }

    /**
     * 设置库存数量
     *
     * @param stockQty 库存数量
     */
    public void setStockQty(BigDecimal stockQty) {
        this.stockQty = stockQty;
    }

    /**
     * 获取盘点毛重
     *
     * @return STOCK_TAK_GWEIGHT - 盘点毛重
     */
    public BigDecimal getStockTakGweight() {
        return stockTakGweight;
    }

    /**
     * 设置盘点毛重
     *
     * @param stockTakGweight 盘点毛重
     */
    public void setStockTakGweight(BigDecimal stockTakGweight) {
        this.stockTakGweight = stockTakGweight;
    }

    /**
     * 获取盘点净重
     *
     * @return STOCK_TAK_NWEIGHT - 盘点净重
     */
    public BigDecimal getStockTakNweight() {
        return stockTakNweight;
    }

    /**
     * 设置盘点净重
     *
     * @param stockTakNweight 盘点净重
     */
    public void setStockTakNweight(BigDecimal stockTakNweight) {
        this.stockTakNweight = stockTakNweight;
    }

    /**
     * 获取盘点数量
     *
     * @return STOCK_TAK_QTY - 盘点数量
     */
    public BigDecimal getStockTakQty() {
        return stockTakQty;
    }

    /**
     * 设置盘点数量
     *
     * @param stockTakQty 盘点数量
     */
    public void setStockTakQty(BigDecimal stockTakQty) {
        this.stockTakQty = stockTakQty;
    }

    /**
     * 获取盘点结果
     *
     * @return TAK_RESULT - 盘点结果
     */
    public String getTakResult() {
        return takResult;
    }

    /**
     * 设置盘点结果
     *
     * @param takResult 盘点结果
     */
    public void setTakResult(String takResult) {
        this.takResult = takResult == null ? null : takResult.trim();
    }

    /**
     * 获取记录标志
     *
     * @return INPUT_TAK_FLG - 记录标志
     */
    public String getInputTakFlg() {
        return inputTakFlg;
    }

    /**
     * 设置记录标志
     *
     * @param inputTakFlg 记录标志
     */
    public void setInputTakFlg(String inputTakFlg) {
        this.inputTakFlg = inputTakFlg == null ? null : inputTakFlg.trim();
    }

    /**
     * 获取记录人编号
     *
     * @return INPUT_USER_ID - 记录人编号
     */
    public String getInputUserId() {
        return inputUserId;
    }

    /**
     * 设置记录人编号
     *
     * @param inputUserId 记录人编号
     */
    public void setInputUserId(String inputUserId) {
        this.inputUserId = inputUserId == null ? null : inputUserId.trim();
    }

    /**
     * 获取记录时间
     *
     * @return INPUT_DT - 记录时间
     */
    public Date getInputDt() {
        return inputDt;
    }

    /**
     * 设置记录时间
     *
     * @param inputDt 记录时间
     */
    public void setInputDt(Date inputDt) {
        this.inputDt = inputDt;
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
        TStockTakingLine other = (TStockTakingLine) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTakNum() == null ? other.getTakNum() == null : this.getTakNum().equals(other.getTakNum()))
            && (this.getTakLineNum() == null ? other.getTakLineNum() == null : this.getTakLineNum().equals(other.getTakLineNum()))
            && (this.getHndNum() == null ? other.getHndNum() == null : this.getHndNum().equals(other.getHndNum()))
            && (this.getWhId() == null ? other.getWhId() == null : this.getWhId().equals(other.getWhId()))
            && (this.getCntrCd() == null ? other.getCntrCd() == null : this.getCntrCd().equals(other.getCntrCd()))
            && (this.getTakCls() == null ? other.getTakCls() == null : this.getTakCls().equals(other.getTakCls()))
            && (this.getLocId() == null ? other.getLocId() == null : this.getLocId().equals(other.getLocId()))
            && (this.getZoneId() == null ? other.getZoneId() == null : this.getZoneId().equals(other.getZoneId()))
            && (this.getBoxId() == null ? other.getBoxId() == null : this.getBoxId().equals(other.getBoxId()))
            && (this.getProdId() == null ? other.getProdId() == null : this.getProdId().equals(other.getProdId()))
            && (this.getYarnRemarks() == null ? other.getYarnRemarks() == null : this.getYarnRemarks().equals(other.getYarnRemarks()))
            && (this.getSaleCd() == null ? other.getSaleCd() == null : this.getSaleCd().equals(other.getSaleCd()))
            && (this.getContractCd() == null ? other.getContractCd() == null : this.getContractCd().equals(other.getContractCd()))
            && (this.getCustomerId() == null ? other.getCustomerId() == null : this.getCustomerId().equals(other.getCustomerId()))
            && (this.getSupplierId() == null ? other.getSupplierId() == null : this.getSupplierId().equals(other.getSupplierId()))
            && (this.getOutFactoryId() == null ? other.getOutFactoryId() == null : this.getOutFactoryId().equals(other.getOutFactoryId()))
            && (this.getRcvDt() == null ? other.getRcvDt() == null : this.getRcvDt().equals(other.getRcvDt()))
            && (this.getModel() == null ? other.getModel() == null : this.getModel().equals(other.getModel()))
            && (this.getSpec() == null ? other.getSpec() == null : this.getSpec().equals(other.getSpec()))
            && (this.getBatchNo() == null ? other.getBatchNo() == null : this.getBatchNo().equals(other.getBatchNo()))
            && (this.getMachineNo() == null ? other.getMachineNo() == null : this.getMachineNo().equals(other.getMachineNo()))
            && (this.getCraftSn() == null ? other.getCraftSn() == null : this.getCraftSn().equals(other.getCraftSn()))
            && (this.getColorCd() == null ? other.getColorCd() == null : this.getColorCd().equals(other.getColorCd()))
            && (this.getColorSystem() == null ? other.getColorSystem() == null : this.getColorSystem().equals(other.getColorSystem()))
            && (this.getColorNm() == null ? other.getColorNm() == null : this.getColorNm().equals(other.getColorNm()))
            && (this.getLot1() == null ? other.getLot1() == null : this.getLot1().equals(other.getLot1()))
            && (this.getLot2() == null ? other.getLot2() == null : this.getLot2().equals(other.getLot2()))
            && (this.getDeliveryDt() == null ? other.getDeliveryDt() == null : this.getDeliveryDt().equals(other.getDeliveryDt()))
            && (this.getManufDt() == null ? other.getManufDt() == null : this.getManufDt().equals(other.getManufDt()))
            && (this.getConsumeDt() == null ? other.getConsumeDt() == null : this.getConsumeDt().equals(other.getConsumeDt()))
            && (this.getExpirationDt() == null ? other.getExpirationDt() == null : this.getExpirationDt().equals(other.getExpirationDt()))
            && (this.getGlength() == null ? other.getGlength() == null : this.getGlength().equals(other.getGlength()))
            && (this.getNlength() == null ? other.getNlength() == null : this.getNlength().equals(other.getNlength()))
            && (this.getBlength() == null ? other.getBlength() == null : this.getBlength().equals(other.getBlength()))
            && (this.getQtyUnit() == null ? other.getQtyUnit() == null : this.getQtyUnit().equals(other.getQtyUnit()))
            && (this.getStockGweight() == null ? other.getStockGweight() == null : this.getStockGweight().equals(other.getStockGweight()))
            && (this.getStockNweight() == null ? other.getStockNweight() == null : this.getStockNweight().equals(other.getStockNweight()))
            && (this.getStockQty() == null ? other.getStockQty() == null : this.getStockQty().equals(other.getStockQty()))
            && (this.getStockTakGweight() == null ? other.getStockTakGweight() == null : this.getStockTakGweight().equals(other.getStockTakGweight()))
            && (this.getStockTakNweight() == null ? other.getStockTakNweight() == null : this.getStockTakNweight().equals(other.getStockTakNweight()))
            && (this.getStockTakQty() == null ? other.getStockTakQty() == null : this.getStockTakQty().equals(other.getStockTakQty()))
            && (this.getTakResult() == null ? other.getTakResult() == null : this.getTakResult().equals(other.getTakResult()))
            && (this.getInputTakFlg() == null ? other.getInputTakFlg() == null : this.getInputTakFlg().equals(other.getInputTakFlg()))
            && (this.getInputUserId() == null ? other.getInputUserId() == null : this.getInputUserId().equals(other.getInputUserId()))
            && (this.getInputDt() == null ? other.getInputDt() == null : this.getInputDt().equals(other.getInputDt()))
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
        result = prime * result + ((getTakNum() == null) ? 0 : getTakNum().hashCode());
        result = prime * result + ((getTakLineNum() == null) ? 0 : getTakLineNum().hashCode());
        result = prime * result + ((getHndNum() == null) ? 0 : getHndNum().hashCode());
        result = prime * result + ((getWhId() == null) ? 0 : getWhId().hashCode());
        result = prime * result + ((getCntrCd() == null) ? 0 : getCntrCd().hashCode());
        result = prime * result + ((getTakCls() == null) ? 0 : getTakCls().hashCode());
        result = prime * result + ((getLocId() == null) ? 0 : getLocId().hashCode());
        result = prime * result + ((getZoneId() == null) ? 0 : getZoneId().hashCode());
        result = prime * result + ((getBoxId() == null) ? 0 : getBoxId().hashCode());
        result = prime * result + ((getProdId() == null) ? 0 : getProdId().hashCode());
        result = prime * result + ((getYarnRemarks() == null) ? 0 : getYarnRemarks().hashCode());
        result = prime * result + ((getSaleCd() == null) ? 0 : getSaleCd().hashCode());
        result = prime * result + ((getContractCd() == null) ? 0 : getContractCd().hashCode());
        result = prime * result + ((getCustomerId() == null) ? 0 : getCustomerId().hashCode());
        result = prime * result + ((getSupplierId() == null) ? 0 : getSupplierId().hashCode());
        result = prime * result + ((getOutFactoryId() == null) ? 0 : getOutFactoryId().hashCode());
        result = prime * result + ((getRcvDt() == null) ? 0 : getRcvDt().hashCode());
        result = prime * result + ((getModel() == null) ? 0 : getModel().hashCode());
        result = prime * result + ((getSpec() == null) ? 0 : getSpec().hashCode());
        result = prime * result + ((getBatchNo() == null) ? 0 : getBatchNo().hashCode());
        result = prime * result + ((getMachineNo() == null) ? 0 : getMachineNo().hashCode());
        result = prime * result + ((getCraftSn() == null) ? 0 : getCraftSn().hashCode());
        result = prime * result + ((getColorCd() == null) ? 0 : getColorCd().hashCode());
        result = prime * result + ((getColorSystem() == null) ? 0 : getColorSystem().hashCode());
        result = prime * result + ((getColorNm() == null) ? 0 : getColorNm().hashCode());
        result = prime * result + ((getLot1() == null) ? 0 : getLot1().hashCode());
        result = prime * result + ((getLot2() == null) ? 0 : getLot2().hashCode());
        result = prime * result + ((getDeliveryDt() == null) ? 0 : getDeliveryDt().hashCode());
        result = prime * result + ((getManufDt() == null) ? 0 : getManufDt().hashCode());
        result = prime * result + ((getConsumeDt() == null) ? 0 : getConsumeDt().hashCode());
        result = prime * result + ((getExpirationDt() == null) ? 0 : getExpirationDt().hashCode());
        result = prime * result + ((getGlength() == null) ? 0 : getGlength().hashCode());
        result = prime * result + ((getNlength() == null) ? 0 : getNlength().hashCode());
        result = prime * result + ((getBlength() == null) ? 0 : getBlength().hashCode());
        result = prime * result + ((getQtyUnit() == null) ? 0 : getQtyUnit().hashCode());
        result = prime * result + ((getStockGweight() == null) ? 0 : getStockGweight().hashCode());
        result = prime * result + ((getStockNweight() == null) ? 0 : getStockNweight().hashCode());
        result = prime * result + ((getStockQty() == null) ? 0 : getStockQty().hashCode());
        result = prime * result + ((getStockTakGweight() == null) ? 0 : getStockTakGweight().hashCode());
        result = prime * result + ((getStockTakNweight() == null) ? 0 : getStockTakNweight().hashCode());
        result = prime * result + ((getStockTakQty() == null) ? 0 : getStockTakQty().hashCode());
        result = prime * result + ((getTakResult() == null) ? 0 : getTakResult().hashCode());
        result = prime * result + ((getInputTakFlg() == null) ? 0 : getInputTakFlg().hashCode());
        result = prime * result + ((getInputUserId() == null) ? 0 : getInputUserId().hashCode());
        result = prime * result + ((getInputDt() == null) ? 0 : getInputDt().hashCode());
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
        sb.append(", takNum=").append(takNum);
        sb.append(", takLineNum=").append(takLineNum);
        sb.append(", hndNum=").append(hndNum);
        sb.append(", whId=").append(whId);
        sb.append(", cntrCd=").append(cntrCd);
        sb.append(", takCls=").append(takCls);
        sb.append(", locId=").append(locId);
        sb.append(", zoneId=").append(zoneId);
        sb.append(", boxId=").append(boxId);
        sb.append(", prodId=").append(prodId);
        sb.append(", yarnRemarks=").append(yarnRemarks);
        sb.append(", saleCd=").append(saleCd);
        sb.append(", contractCd=").append(contractCd);
        sb.append(", customerId=").append(customerId);
        sb.append(", supplierId=").append(supplierId);
        sb.append(", outFactoryId=").append(outFactoryId);
        sb.append(", rcvDt=").append(rcvDt);
        sb.append(", model=").append(model);
        sb.append(", spec=").append(spec);
        sb.append(", batchNo=").append(batchNo);
        sb.append(", machineNo=").append(machineNo);
        sb.append(", craftSn=").append(craftSn);
        sb.append(", colorCd=").append(colorCd);
        sb.append(", colorSystem=").append(colorSystem);
        sb.append(", colorNm=").append(colorNm);
        sb.append(", lot1=").append(lot1);
        sb.append(", lot2=").append(lot2);
        sb.append(", deliveryDt=").append(deliveryDt);
        sb.append(", manufDt=").append(manufDt);
        sb.append(", consumeDt=").append(consumeDt);
        sb.append(", expirationDt=").append(expirationDt);
        sb.append(", glength=").append(glength);
        sb.append(", nlength=").append(nlength);
        sb.append(", blength=").append(blength);
        sb.append(", qtyUnit=").append(qtyUnit);
        sb.append(", stockGweight=").append(stockGweight);
        sb.append(", stockNweight=").append(stockNweight);
        sb.append(", stockQty=").append(stockQty);
        sb.append(", stockTakGweight=").append(stockTakGweight);
        sb.append(", stockTakNweight=").append(stockTakNweight);
        sb.append(", stockTakQty=").append(stockTakQty);
        sb.append(", takResult=").append(takResult);
        sb.append(", inputTakFlg=").append(inputTakFlg);
        sb.append(", inputUserId=").append(inputUserId);
        sb.append(", inputDt=").append(inputDt);
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
