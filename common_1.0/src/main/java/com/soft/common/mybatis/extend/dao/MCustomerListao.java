package com.soft.common.mybatis.extend.dao;

import com.soft.common.mybatis.extend.entity.MCustomerEx;
import com.soft.common.model.MCustomer;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MCustomerListao {
/**
 * 查询客户信息
 * @param customerCdDis   客户表示用编号
 * @param customerNm      客户名称
 * @param customerJc    客户简称
 * @param customerType    客户种类
 * @param customerNmEn    客户英文名称
 * @param levelId          客户评价等级
 * @param cntryCd          国家编号
 * @param paymentType     结算方式
 * @return
 */
public List<MCustomerEx> selectMCustomer(
    @Param("customerCdDis") String customerCdDis,
    @Param("customerNm") String customerNm,
    @Param("customerJc") String customerJc,
    @Param("customerType") String customerType,
    @Param("customerNmEn") String customerNmEn,
    @Param("levelId") String levelId,
    @Param("cntryCd") String cntryCd,
    @Param("paymentType") String paymentType,
    @Param("Id") String Id
);

    /**
     * 查询客户明细
     * @param customerId      客户编号
     * @return
     */
    public List<MCustomerEx> selectMCustomeLineList(
        @Param("customerId") String customerId);
    /**
     * 实际库存查询客户信息
     */
    public List<MCustomer> selectStockCustomer();
}
