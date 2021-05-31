package com.soft.common.mybatis.extend.dao;

import com.soft.common.mybatis.extend.entity.MOutFactoryEx;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MOutFactoryLineListDao {
    /**
     * 查询外发工厂明细
     * @param outFactoryId      外发工厂编号
     * @return
     */
    public List<MOutFactoryEx> selectMOutFactoryLine(
        @Param("outFactoryId") String outFactoryId);
}
