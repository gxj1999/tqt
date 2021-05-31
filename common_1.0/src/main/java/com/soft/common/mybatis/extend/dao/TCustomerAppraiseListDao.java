package com.soft.common.mybatis.extend.dao;

import com.soft.common.mybatis.extend.entity.TCustomerAppraiseList;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TCustomerAppraiseListDao {
/**
 * 获取客户评价信息
 * @param customerId 客户编号

 * @return
 */
public List<TCustomerAppraiseList> selectTCustomerAppraise(
    @Param("customerId") String customerId);
}
