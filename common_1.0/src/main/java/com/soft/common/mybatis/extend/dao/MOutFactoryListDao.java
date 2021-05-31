package com.soft.common.mybatis.extend.dao;

import com.soft.common.mybatis.extend.entity.MOutFactoryEx;
import com.soft.common.model.MOutFactoryLine;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MOutFactoryListDao {
/**
 * 查询外发工厂信息
// * @param outFactoryId      外发工厂编号zwd deleted 0923
 * @param outFactoryCdDis   外发工厂表示用编号
 * @param outFactoryNm      外发工厂名称
 * @param outFactoryNmEn    外发工厂英文名称
 * @param outFactoryJc      外发工厂简称
 * @param outFactoryType    外发工厂商种类
 * @param levelId            外发工厂评价等级
 * @param cntryCd            国家编号
 * @param paymentType       结算方式
 * @return
 */
public List<MOutFactoryEx> selectMOutFactory(
//        @Param("outFactoryId") String outFactoryId, zwd deleted 0923
    @Param("outFactoryCdDis") String outFactoryCdDis,
    @Param("outFactoryNm") String outFactoryNm,
    @Param("outFactoryNmEn") String outFactoryNmEn,
    @Param("outFactoryJc") String outFactoryJc,
    @Param("outFactoryType") String outFactoryType,
    @Param("levelId") String levelId,
    @Param("cntryCd") String cntryCd,
    @Param("paymentType") String paymentType);
    /**
     * 查询外发工厂明细
     * @param outFactoryId      外发工厂编号
     * @return
     */
    public List<MOutFactoryEx> selectMOutFactoryLine(
        @Param("outFactoryId") String outFactoryId);
}
