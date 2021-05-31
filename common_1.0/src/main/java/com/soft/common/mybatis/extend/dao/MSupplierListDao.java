package com.soft.common.mybatis.extend.dao;

import com.soft.common.mybatis.extend.entity.MSupplierEx;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MSupplierListDao {
/**
 * 查询供应商信息
 * @param supplierCdDis   供应商表示用编号
 * @param supplierNm      供应商名称
 * @param supplierJc      供应商简称
 * @param supplierType    供应商种类
 * @param supplierNmEn    供应商英文名称
 * @param levelId          供应商评价等级
 * @param cntryCd          国家编号
 * @param paymentType     结算方式
 * @return
 */
public List<MSupplierEx> selectMSupplier(
    @Param("supplierCdDis") String supplierCdDis,
    @Param("supplierNm") String supplierNm,
    @Param("supplierJc") String supplierJc,
    @Param("supplierType") String supplierType,
    @Param("supplierNmEn") String supplierNmEn,
    @Param("levelId") String levelId,
    @Param("cntryCd") String cntryCd,
    @Param("paymentType") String paymentType
);
 /**
 * 查询供应商明细
 * @param supplierId      供应商编号
 * @return
 */
 public List<MSupplierEx> selectMSupplierLine(
     @Param("supplierId") String supplierId);

}
