package com.soft.common.mybatis.extend.dao;

import com.soft.common.model.MZone;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MZoneListDao {
/**
 * 查询仓库区域信息
 * @param whId    仓库编号
 * @return
 */
public List<MZone> selectMZone(
    @Param("whId") String whId);
}
