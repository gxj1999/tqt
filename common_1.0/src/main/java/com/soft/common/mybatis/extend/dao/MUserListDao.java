package com.soft.common.mybatis.extend.dao;

import com.soft.common.mybatis.extend.entity.MUserEx;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MUserListDao {
/**
 * 查询用户信息
 * @param cntrCd       中心编号
 * @param workId       工号
 * @param loginId      登录账户
 * @param userNm        用户名称
 * @return
 */
public List<MUserEx> selectMUser(
    @Param("userId") String userId,
    @Param("cntrCd") String cntrCd,
    @Param("workId") String workId,
    @Param("loginId") String loginId,
    @Param("userNm") String userNm,
    @Param("userNmEn") String userNmEn,
    @Param("roleNm") String roleNm,
    @Param("orgNm") String orgNm);

    /**
     * 查询库位明细
     * @param userId         用户编号
     * @return
     */
    public List<MUserEx> selectMUserLine(
        @Param("userId") String userId);
    /**
     * 获取人员信息
     *
     * @param cntrCd      中心编号
     * @param userId    用户ID
     * @param userNm    姓名
     * @param userNmEn    英文名
     * @param loginId   登录账户
     * @return 需求列表
     */
    public List<MUserEx> selectMUserList(
        @Param("cntrCd") String cntrCd,
        @Param("userId") String userId,
        @Param("userNm") String userNm,
        @Param("userNmEn") String userNmEn,
        @Param("loginId") String loginId,
        @Param("roleNm") String roleNm);
}
