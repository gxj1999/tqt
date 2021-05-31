package com.soft.common.mybatis.extend.dao;

import com.soft.common.mybatis.extend.entity.MCarrierEx;
import com.soft.common.mybatis.extend.entity.MCarrierLineEx;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MCarrierLineListDao {
    /**
     * 查询物流公司明细
     * @param carrierId      物流公司编号
     * @return
     */
    public List<MCarrierEx> selectMCarrierLine(
        @Param("carrierId") String carrierId);
}
