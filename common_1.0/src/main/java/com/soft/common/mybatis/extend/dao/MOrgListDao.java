package com.soft.common.mybatis.extend.dao;

import com.soft.common.mybatis.extend.entity.MOrgEx;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MOrgListDao {
/**
 * 查询组织部门信息
 * @param cntrCd     中心编号
 * @param orgNm       组织部门名称
 * @return
 */
public List<MOrgEx> selectMOrg(
    @Param("cntrCd") String cntrCd,
    @Param("orgCdDis") String orgCdDis,
    @Param("orgNm") String orgNm,
    @Param("orgAbbr") String orgAbbr,
    @Param("orgEngNm") String orgEngNm);

    /**
     * 查询组织部门明细
     * @param orgId   组织部门编号
     * @return
     */
    public List<MOrgEx> selectMOrgLine(
        @Param("orgId") String orgId);

    public int countLeaf(
        @Param("orgId") String orgId,
        @Param("cntrCd") String cntrCd);
}
