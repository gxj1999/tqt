package com.soft.common.mybatis.extend.dao;

import com.soft.common.model.MGeneral;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MGeneralListDao {
/**
 * 查询共通配置
 * @param generalMasterType 共通区分
 * @param generalMasterTypeNm 共通区分名称
 * @return
 */
public List<MGeneral> selectMGeneral(
    @Param("generalMasterTypeNm") String generalMasterTypeNm,
    @Param("generalMasterType") String generalMasterType);
    /**
     * 查询共通配置根据共通配置类型
     * @param generalType    共通配置类型
     * @return
     */
//modify by xieshengjie 2019/11/28 begin
//public List<MGeneral> selectMgeneralByType(
//        @Param("generalType") String generalType);
    public List<MGeneral> selectMgeneralByType(
        @Param("generalType") String generalType,
        @Param("char1") String char1,
        @Param("char2") String char2,
        @Param("char3") String char3,
        @Param("char4") String char4,
        @Param("char5") String char5,
        @Param("char6") String char6,
        @Param("char7") String char7,
        @Param("char8") String char8,
        @Param("char9") String char9,
        @Param("char10") String char10
    );
//modify by xieshengjie 2019/11/28 end
/**
 * 查询共通配置根据共通配置编号和共通配置类型
 * @param generalCd    共通配置编号
 * @param generalType    共通配置类型
 * @return
 */
public MGeneral selectMgeneralByCd(
    @Param("generalType") String generalType,
    @Param("generalCd") String generalCd
);
    /**
     * 查询共通配置明细
     * @param generalMasterType
     * @return
     */
    public List<MGeneral> selectMGeneralLine(
        @Param("generalMasterType") String generalMasterType
    );
}
