package com.soft.common.mybatis.extend.dao;

import com.soft.common.model.MErrorinfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MErrorinfoListDao {
/**
 * 查询提示信息

 * @param errId       提示信息ID
 * @param errInfo     提示信息内容
 * @return
 */
public List<MErrorinfo> selectMErrorinfo(
    @Param("errId") String errId,
    @Param("errInfo") String errInfo);
    /**
     * 查询提示编辑信息
     * @param errId       提示信息ID
     * @return
     */
    public List<MErrorinfo> selectMErrorinfoList(
        @Param("errId") String errId);
}
