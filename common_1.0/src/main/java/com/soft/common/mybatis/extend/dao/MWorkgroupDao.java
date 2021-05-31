package com.soft.common.mybatis.extend.dao;

import com.soft.common.mybatis.extend.entity.WorkgroupEx;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface MWorkgroupDao {

    List<WorkgroupEx> getMworkgroupList(@Param("cntrCd") String cntrCd, @Param("orgId") String orgId,
                                        @Param("teamId") String teamId, @Param("teamNm") String teamNm);
}
