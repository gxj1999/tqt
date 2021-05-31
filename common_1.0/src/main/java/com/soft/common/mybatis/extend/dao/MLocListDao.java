package com.soft.common.mybatis.extend.dao;

import com.soft.common.mybatis.extend.entity.MLocEx;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MLocListDao {
/**
 * 查询库位信息
 * @param cntrCd       中心编号
 * @param whId         仓库编号
 * @param zoneId       区域名称
 * @param locType      库位类型
 * @param locCdDis     库位表示用编号
 * @param locNm         库位名称
 * @return
 */
public List<MLocEx> selectMLoc(
    @Param("cntrCd") String cntrCd,
    @Param("whId") String whId,
    @Param("zoneId") String zoneId,
    @Param("locType") String locType,
    @Param("locCdDis") String locCdDis,
    @Param("locNm") String locNm);

    /**
     * 查询库位明细
     * @param locId         库位编号
     * @return
     */
    public List<MLocEx> selectMLocList(
        @Param("locId") String locId);


    public List<MLocEx> selectLocList(
        @Param("cntrCd") String cntrCd,
        @Param("whId") String whId,
        @Param("zoneId") String zoneId);
}
