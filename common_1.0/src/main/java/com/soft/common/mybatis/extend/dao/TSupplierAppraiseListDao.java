package com.soft.common.mybatis.extend.dao;

import com.soft.common.mybatis.extend.entity.TSupplierAppraiseList;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TSupplierAppraiseListDao {
/**
 * 获取供应商评价信息
 * @param supplierId

 * @return
 */
public List<TSupplierAppraiseList> selectTSupplierAppraise(
    @Param("supplierId") String supplierId);
}
