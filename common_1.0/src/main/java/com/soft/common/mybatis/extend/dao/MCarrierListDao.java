package com.soft.common.mybatis.extend.dao;

import com.soft.common.mybatis.extend.entity.MCarrierEx;
import com.soft.common.model.MCarrierLine;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MCarrierListDao {
/**
 * 查询物流公司信息
 * @param carrierCdDis      物流公司表示用编号
 * @param carrierNm         物流公司名称
 * @param carrierNmEn       物流公司英文名称
 * @param carrierJc         物流公司简称
 * @param carrierType       物流公司商种类
 * @param levelId            物流公司评价等级
 * @param cntryCd            国家编号
 * @param paymentType       结算方式
 * @return
 */
public List<MCarrierEx> selectMCarrier(
    @Param("carrierCdDis") String carrierCdDis,
    @Param("carrierNm") String carrierNm,
    @Param("carrierNmEn") String carrierNmEn,
    @Param("carrierJc") String carrierJc,
    @Param("carrierType") String carrierType,
    @Param("levelId") String levelId,
    @Param("cntryCd") String cntryCd,
    @Param("paymentType") String paymentType);
    /**
     * 查询物流公司明细
     * @param carrierId      物流公司编号
     * @return
     */
    public List<MCarrierEx> selectMCarrierLine(
        @Param("carrierId") String carrierId);
}
