package com.soft.common.mybatis.extend.dao;

import com.soft.common.model.MBox;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MBoxListDao {
/**
 * 查询箱信息
 * @param cntrCd           中心编号
 * @param boxId            箱编号
 * @param boxNm            箱名称
 * @return
 */
public List<MBox> selectMBox(
    @Param("cntrCd") String cntrCd,
    @Param("boxId") String boxId,
    @Param("boxNm") String boxNm);
    /**
     * 查询箱编辑信息
     * @param boxId            箱编号
     * @return
     */
    public List<MBox> selectMBoxList(
        @Param("boxId") String boxId);
}
