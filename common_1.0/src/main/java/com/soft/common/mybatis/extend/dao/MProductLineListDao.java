package com.soft.common.mybatis.extend.dao;

import com.soft.common.mybatis.extend.entity.MProductEx;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MProductLineListDao {
/**
 * 查询商品名称
 * @param prodNm    商品名称
 * @param prodType  商品种类
 * @param cntrCd    中心编号
 * @return
 */
public List<MProductEx> selectmproduct(
    @Param("prodNm") String prodNm,
    @Param("prodType") String prodType,
    @Param("cntrCd") String cntrCd);
    /**
     * 查询商品明细
     * @param prodId    商品编号
     * @return
     */
    public List<MProductEx> selectmproductLine(
        @Param("prodId") String prodId);
    /**
     * 纱线选择一览
     * @param prodType  商品种类
     * @param cntrCd    中心编号
     * @return
     */
    public List<MProductEx> selectMProductByClass(
        @Param("prodType") String prodType,
        @Param("cntrCd") String cntrCd,
        @Param("prodClassId") List<String> prodClassId);
}
