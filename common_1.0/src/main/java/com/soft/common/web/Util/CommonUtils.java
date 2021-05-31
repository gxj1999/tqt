package com.soft.common.web.Util;

import org.springframework.beans.BeanUtils;
import com.soft.common.mybatis.extend.entity.CommonInfo;
import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.math.BigDecimal;
import java.util.Date;


public class CommonUtils {

    public static String getIp(HttpServletRequest request){
        String ip = request.getHeader("x-forwarded-for");
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_CLIENT_IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_X_FORWARDED_FOR");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        return ip;
    }

    public static void setCommonInfo(Object src, HttpServletRequest request) {
        CommonInfo commonInfo = new CommonInfo();
        BeanUtils.copyProperties(src, commonInfo);
        int updCnt = (commonInfo.getUpdCnt() == null)? 0 : commonInfo.getUpdCnt() + 1;
        if (commonInfo.getAddDt() == null) {
            commonInfo.setAddTnmtId(getIp(request));
            commonInfo.setAddDt(new Date());
        }
        commonInfo.setUpdCnt(updCnt);
        commonInfo.setUpdTnmtId(getIp(request));
        commonInfo.setUpdDt(new Date());
        BeanUtils.copyProperties(commonInfo, src);
    }

    public static void setCommonInfo(Object newObj,Object oldObj, HttpServletRequest request) {
        //更新后数据
        CommonInfo commonInfo = new CommonInfo();
        BeanUtils.copyProperties(newObj, commonInfo);
        //原始数据
        CommonInfo commonInfoN = new CommonInfo();
        BeanUtils.copyProperties(oldObj, commonInfoN);
        //共通字段更新
        commonInfoN.setUpdEntKbn(commonInfo.getUpdEntKbn());
        commonInfoN.setUpdPgmId(commonInfo.getUpdPgmId());
        commonInfoN.setUpdUserId(commonInfo.getUpdUserId());
        commonInfoN.setUpdUserNm(commonInfo.getUpdUserNm());
        commonInfoN.setUpdCnt(commonInfoN.getUpdCnt()+1);
        commonInfoN.setUpdTnmtId(getIp(request));
        commonInfoN.setUpdDt(new Date());
        //把更新后的共通字段复制到原始数据中
        BeanUtils.copyProperties(commonInfoN, oldObj);
    }

    @SuppressWarnings("unchecked")
    public static <T extends Serializable> T clone(T obj){
        T cloneObj = null;
        try {
            //写入字节流
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            ObjectOutputStream obs = new ObjectOutputStream(out);
            obs.writeObject(obj);
            obs.close();

            //分配内存，写入原始对象，生成新对象
            ByteArrayInputStream ios = new ByteArrayInputStream(out.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(ios);
            //返回生成的新对象
            cloneObj = (T) ois.readObject();
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cloneObj;
    }

    /**
     * NULL和数值转成0
     *
     * @param val
     * @return
     */
    public static BigDecimal nullToZero(Object val) {
        BigDecimal ret = BigDecimal.ZERO;
        //空值判断
        if (val == null) {
            return ret;
        }
        ret = new BigDecimal(val.toString());
        return ret;
    }
}
