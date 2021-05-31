package com.soft.common.mybatis.extend.dao;

import com.soft.common.mybatis.extend.entity.MWhEx;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MWhListDao {
/**
 * 查询仓库信息
 * @param cntrCd     中心编号
 * @param whCdDis       仓库编号
 * @param whNm       仓库名称
 * @param whNmJc     仓库简称
 * @param whType     仓库类型
 * @return
 */
public List<MWhEx> selectMWh(
    @Param("id") String id,
    @Param("cntrCd") String cntrCd,
    @Param("whCdDis") String whCdDis,
    @Param("whNm") String whNm,
    @Param("whNmJc") String whNmJc,
    @Param("whType") String whType);
    /**
     * 查询仓库区域信息
     * @param whId    仓库编号
     * @return
     */
    public List<MWhEx> selectMZone(
        @Param("whId") String whId);
}
