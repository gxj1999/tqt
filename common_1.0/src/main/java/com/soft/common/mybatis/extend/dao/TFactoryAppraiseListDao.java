package com.soft.common.mybatis.extend.dao;

import com.soft.common.mybatis.extend.entity.TFactoryAppraiseList;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TFactoryAppraiseListDao {
/**
 * 获取工厂评价信息
 * @param factoryId 工厂编号

 * @return
 */
public List<TFactoryAppraiseList> selectTFactoryAppraise(
    @Param("factoryId") String factoryId);
}
