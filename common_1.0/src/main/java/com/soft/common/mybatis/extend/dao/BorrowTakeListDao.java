package com.soft.common.mybatis.extend.dao;

import com.soft.common.mybatis.extend.entity.BorrowTakeEx;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BorrowTakeListDao {
/**
 * 查询销售样品间信息
 * @param whId 仓库编号
 * @param locId 库位编号
 * @param prodId 商品编号
 * @param locType 库位类型
 * @param stkCls 在库区分
 * @return
 */
public List<BorrowTakeEx> selectBorrowTakeList(@Param("whId") String whId, @Param("locId") String locId, @Param("prodId") String prodId, @Param("locType") String locType, @Param("stkCls") String stkCls);
    /**
     * 取样信息
     * @param whId 仓库编号
     * @param locId 库位编号
     * @param prodId 商品编号
     * @param batchNo 库位类型
     * @return
     */
    public List<BorrowTakeEx> selectBorrowTakeInfo(@Param("whId") String whId, @Param("locId") String locId, @Param("prodId") String prodId, @Param("batchNo") String batchNo);
}
