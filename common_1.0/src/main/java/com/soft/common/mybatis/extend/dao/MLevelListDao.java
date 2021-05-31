package com.soft.common.mybatis.extend.dao;

import com.soft.common.mybatis.extend.entity.MLevelEx;
import com.soft.common.model.MLevel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MLevelListDao {
/**
 * 获取评价信息
 * @param cntrCd        中心编号
 * @param levelNm       评价等级名称
 * @param levelType       评价等级类型
 * @return
 */
public List<MLevel> selectMLevel(
    @Param("cntrCd") String cntrCd,
    @Param("levelNm") String levelNm,
    @Param("levelType") String levelType);

    /**
     * 获取评价明细
     * @param levelId       评价等级编号
     * @return
     */
    public MLevelEx selectMLevelLineList(
        @Param("levelId") String levelId);
}
