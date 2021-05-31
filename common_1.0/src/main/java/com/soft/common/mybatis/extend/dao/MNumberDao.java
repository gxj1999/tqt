package com.soft.common.mybatis.extend.dao;

import com.soft.common.model.MNumericing;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

public interface MNumberDao {
    //根据编号前缀查询採番数据
    public List<MNumericing> selectNumber(
        @Param("bizCd") String bizCd);  //编号前缀
    //更新採番数据
    public boolean updateNumber(
        @Param("presentValues") BigDecimal presentValues,//现在值 +增长值
        @Param("bizCd") String bizCd,//编号前缀
        @Param("fixedValue") String fixedValue,//固定值
        @Param("presentValue") BigDecimal presentValue,//现在值
        @Param("IncValue") BigDecimal IncValue);//增长值

//    public boolean updateNumberCls(
//            @Param("bizCd") String bizCd,//编号前缀
//            @Param("fixedValue") String fixedValue,//固定值
//            @Param("presentValue") BigDecimal presentValue,//现在值
//            @Param("IncValue") BigDecimal IncValue);//增长值
}
