package com.soft.common.mybatis.extend.dao;

import com.soft.common.mybatis.extend.entity.MMachineEx;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MMachineListDao {
/**
 * 查询组织部门信息
 * @param cntrCd        中心编号
 * @param machineCd     机台号
 * @param machineNm     机台名称
 * @param machineType   机台种类
 * @param assetModel    规格型号
 * @return
 */
public List<MMachineEx> getMachineList(
    @Param("cntrCd") String cntrCd,
    @Param("machineCd") String machineCd,
    @Param("machineNm") String machineNm,
    @Param("machineType") String machineType,
    @Param("assetModel") String assetModel,
    @Param("id") String id);

}
