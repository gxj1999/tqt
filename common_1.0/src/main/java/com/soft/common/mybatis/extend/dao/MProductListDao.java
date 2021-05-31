package com.soft.common.mybatis.extend.dao;

import com.soft.common.mybatis.extend.entity.MProductClassExRatio;
import com.soft.common.mybatis.extend.entity.MProductEx;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MProductListDao {
/**
 * 查询商品名称
 * @param prodCdDis  商品表示用编号
 * @param prodNm     商品名称
 * @param prodJc     商品简称
 * @param prodNmEn   商品英文名称
 * @param prodType   商品种类
 * @param assetModel   规格型号
 * @param yarnCount     纱支
 * @param ratio      成分比例
 * @return
 */
public List<MProductEx> selectmproduct(
    @Param("prodCdDis") String prodCdDis,
    @Param("prodNm") String prodNm,
    @Param("prodJc") String prodJc,
    @Param("prodNmEn") String prodNmEn,
    @Param("prodType") String prodType,
    @Param("assetModel") String assetModel,
    @Param("yarnCount") String yarnCount,
    @Param("ratio") String ratio);
    /**
     * 查询商品明细
     * @param prodId    商品编号
     * @return
     */
    public List<MProductEx> selectMproductLine(
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
        @Param("prodClassNm") List<String> prodClassNm);

    /**
     * 纱线选择一览
     * @param prodType  商品种类
     * @param cntrCd    中心编号
     * @return
     */
    public List<MProductEx> selectMProductByClassNew(
        @Param("prodType") String prodType,
        @Param("cntrCd") String cntrCd,
        @Param("yarnCount") String yarnCount,
        @Param("ratio") String ratio,
        @Param("prodClassNm") List<String> prodClassNm);

    public List<MProductEx> selectMProduct(@Param("prodId") String prodId);
}
