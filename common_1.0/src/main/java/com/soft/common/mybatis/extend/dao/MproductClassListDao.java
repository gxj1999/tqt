package com.soft.common.mybatis.extend.dao;

import com.soft.common.mybatis.extend.entity.MLevelProductClass;
import com.soft.common.mybatis.extend.entity.MProductClassEx;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MproductClassListDao {
/**
 * 查询商品分类名称,
 * @param prodClassCdDis 商品分类表示用编号
 * @param prodClassNm    商品分类名称
 * @param prodClassJc    商品分类简称
 * @param prodClassNmEn  商品分类英文名称
 * @param prodType    商品种类
 * @return
 * */
public List<MProductClassEx> selectMProductClass(
    @Param("prodClassCdDis") String prodClassCdDis,
    @Param("prodClassNm") String prodClassNm,
    @Param("prodClassJc") String prodClassJc,
    @Param("prodClassNmEn") String prodClassNmEn,
    @Param("prodType") String prodType
    );
//    /**
//     * 查询商品分类名称（树状）
//     * @param prodClassCdDis 商品分类表示用编号
//     * @param prodClassNm    商品分类名称
//     * @param prodClassJc    商品分类简称
//     * @param prodClassNmEn  商品分类英文名称
//     * @param prodType    商品种类
//     * @return
//     * */
//    public List<MProductClassEx> selectMProductClassTree(
//        @Param("prodClassCdDis") String prodClassCdDis,
//        @Param("prodClassNm") String prodClassNm,
//        @Param("prodClassJc") String prodClassJc,
//        @Param("prodClassNmEn") String prodClassNmEn,
//        @Param("prodType") String prodType
//    );

    public List<MProductClassEx> selectMProductClassNew(
        @Param("prodClassNm") String prodClassNm,
        @Param("prodType") String prodType);



//    public List<MProductClass> selectLine();
    /**
     * 查询商品分类明细
     * @param  prodClassId  商品分类编号
     * @return
     * */
    public List<MProductClassEx> selectMProductClassLine(
        @Param("prodClassId") String prodClassId);

    public List<MLevelProductClass> selectLevel(
        @Param("prodType") String prodType);

    public List<MLevelProductClass> selectParent();

    public List<MLevelProductClass> selectChild(
        @Param("parentClass") String parentClass);
}
