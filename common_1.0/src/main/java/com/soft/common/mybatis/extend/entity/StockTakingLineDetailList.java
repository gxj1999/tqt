package com.soft.common.mybatis.extend.entity;


import com.soft.common.model.TStockTakingLine;
import lombok.Data;

/**
 * 盘点信息
 *
 */
@Data
public class StockTakingLineDetailList extends TStockTakingLine{
    //备注
    private String remark;
    //盘点状态名称
    private String takCLsNm;
    //记录人
    private String zoneNm;
    //仓库名称
    private String whNm;
    //库位名称
    private String locNm;
    //商品+纱线属性
    private String prodRemarks;
    //计数单位名称
    private String qtyUnitNm;
    //供应商名称
    private String supplierNm;
    //客户名称
    private String customerNm;
}
