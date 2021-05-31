package com.soft.common.mybatis.extend.dao;

import com.soft.common.model.TLog;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TLogListDao {
/**
 * 查询日志信息
 * @param cntrCd         中心编号
 * @param objStartDt     対象開始日付
 * @param objEndDt       対象終了日付
 * @param logStatus      日志状态
 * @param logComment     日志内容
 * @param skriKbn         最新区分
 * @param pgmId           程序ID
 * @return
 */
public List<TLog> selectTLog(
    @Param("cntrCd") String cntrCd,
    @Param("objStartDt") String objStartDt,
    @Param("objEndDt") String objEndDt,
    @Param("logStatus") String logStatus,
    @Param("logComment") String logComment,
    @Param("skriKbn") String skriKbn,
    @Param("pgmId") String pgmId);
}
