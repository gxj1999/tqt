package com.soft.common.mybatis.extend.dao;

import com.soft.common.model.MCenter;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MCenterListDao {
    /**
     * 取得中心列表
     * @param centerType      中心类型
     * @return
     */
    public List<MCenter> selectMCenter(@Param("cntrType") String centerType);

    /**
     * 查询中心信息
     * @param cntrCdDis 中心编号
     * @param cntrNm 中心名称
     * @param cntrNmDis 中心全称
     * @param cntrType 中心类型
     * @return
     */
    public List<MCenter> getCentrList(@Param("cntrCdDis") String cntrCdDis,
                                      @Param("cntrNm") String cntrNm,
                                      @Param("cntrNmDis") String cntrNmDis,
                                      @Param("cntrType") String cntrType);

}
