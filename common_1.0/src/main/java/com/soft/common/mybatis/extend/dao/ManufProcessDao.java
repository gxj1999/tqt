package com.soft.common.mybatis.extend.dao;

import com.soft.common.model.MStandardMp;
import com.soft.common.mybatis.extend.entity.ManufProcessEx;
import com.soft.common.mybatis.extend.entity.ManufProcessExLine;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ManufProcessDao {
    /**
     * 获取生产流程一览
     * @param manufProcessNm 生产流程名称
     * @param manufProcessCls 生产流程状态
     * @return
     */
    public List<ManufProcessEx> selectManufProList(@Param("manufProcessNm") String manufProcessNm, @Param("manufProcessCls") String manufProcessCls,@Param("orgId") String orgId);
    /**
     * 获取生产流程一览
     * @param standardMpNm 标准流程名称
     * @return
     */
    public List<MStandardMp> selectStandardMpList(@Param("standardMpNm") String standardMpNm);
    /**
     * 获取生产流程一览
     * @return
     */
    public List<ManufProcessEx> selectManufProcess();

    /**
     * 获取生产流程一览
     * @return
     */
    public List<ManufProcessExLine> selectThisManufProcess(@Param("standardMpId") String standardMpId);
}
