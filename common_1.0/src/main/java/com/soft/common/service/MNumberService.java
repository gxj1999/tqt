package com.soft.common.service;

import com.sjasoft.framework.annotation.SystemLog;
import com.sjasoft.framework.service.AbstractService;
import com.sjasoft.framework.util.StringUtils;
import com.soft.common.mybatis.extend.dao.MNumberDao;
import com.soft.common.model.*;
import org.hibernate.validator.internal.util.StringHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class MNumberService extends AbstractService<MNumericing> {

    @Resource
    private MNumberDao mNumberDao;

    /**
     * 获得採番信息
     * @param bizCd 採番区分
     * @return
     */
    @SystemLog("获得採番信息")
    public String getMNumberList(String bizCd) {
        String numbeing=null;
        String fixedValue="";
        //根据编号前缀检索採番表的数据是否存在
        List<MNumericing> numberList= mNumberDao.selectNumber(bizCd);
        if(!numberList.isEmpty() && numberList.size() != 0) {
            boolean flag = false;
            //编号前缀
            String bizCdKbn = numberList.get(0).getFixedValue();
            //现在值
            BigDecimal presentValue = numberList.get(0).getPresentValue();
            // 增长值
            BigDecimal incValue = numberList.get(0).getIncValue();
            BigDecimal numOfDigit = BigDecimal.valueOf(numberList.get(0).getNumOfDigit());
            BigDecimal presentValues = presentValue.add(incValue);
            //最大位数
            if (presentValues.compareTo(numberList.get(0).getMaxValue()) == 1) {
                presentValues = numberList.get(0).getMinValue();
            }
            //固定值
            if (!StringHelper.isNullOrEmptyString(numberList.get(0).getFixedDtFormat())) {
                SimpleDateFormat dateStr = new SimpleDateFormat(numberList.get(0).getFixedDtFormat());
                fixedValue = dateStr.format(new Date());
            }
            flag = mNumberDao.updateNumber(presentValues, bizCd, bizCdKbn,presentValue, incValue);
            if (flag == true) {
                //判断採番区分是否等于1
                if (numberList.get(0).getNumingCls().equals("1")) {
                    // 数字采番位数
                    String present = String.format("%0" + numOfDigit.intValue() + "d", presentValues.intValue());
                    //若无固定值的情况下，只拼接当前值加上日期固定值
                    if(!StringUtils.isNullOrEmpty(bizCdKbn)){
                        numbeing = bizCdKbn + fixedValue + present;
                    }else {
                        numbeing = fixedValue + present;
                    }
                } else {
                    numbeing = presentValues.toString();
                }
            }
//            else {
//                return getMNumberList(bizCd);
//            }
        }
//        } else {
//            //不存在的情况下
//            mNumberDao.updateNumberCls(bizCd, fixedValue, new BigDecimal(1.0) ,new BigDecimal(1.0));
//            List<MNumericing> names= mNumberDao.selectNumber(bizCd);
//            if(!names.isEmpty() && names.size() != 0) {
//                BigDecimal numOfDigit = BigDecimal.valueOf(names.get(0).getNumOfDigit());
//                BigDecimal presentValue = names.get(0).getPresentValue();
//                if (!StringHelper.isNullOrEmptyString(names.get(0).getFixedValue())) {
//                    SimpleDateFormat dateStr = new SimpleDateFormat("yyyyMMdd");
//                    fixedValue = dateStr.format(new Date());
//                }
//                String bizCdKbn = names.get(0).getBizCd();
//                String present = String.format("%0" + numOfDigit.intValue() + "d", presentValue.intValue());
//                numbeing = bizCdKbn + fixedValue + present;
//            }

        return numbeing;
    }

}
