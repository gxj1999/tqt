package com.soft.common.mybatis.extend.entity;


import com.soft.common.model.MWh;
import com.soft.common.model.MZone;
import lombok.Data;

import java.util.List;

/**
 * 仓库实体类
 *
 */
@Data
public class MWhEx extends MWh {
    private static final long serialVersionUID = 1L;
    //姓名
    private String userNm;
    //用户ID
    private String userId;
    //仓库类型
    private String whTypeNm;
    //查询用仓库名
    private String whNm;
    //审批人
    private String acceptIdNm;
    //仓库区域
    public List<MZone> children;

    public String getUserNm() {
        return userNm;
    }

    public void setUserNm(String userNm) {
        this.userNm = userNm;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getWhTypeNm() {
        return whTypeNm;
    }

    public void setWhTypeNm(String whTypeNm) {
        this.whTypeNm = whTypeNm;
    }

    public String getAcceptIdNm() {
        return acceptIdNm;
    }

    public void setAcceptIdNm(String acceptIdNm) {
        this.acceptIdNm = acceptIdNm;
    }

    public List<MZone> getChildren() {
        return children;
    }

    public void setChildren(List<MZone> children) {
        this.children = children;
    }

    public String getWhNm() {
        return whNm;
    }

    public void setWhNm(String whNm) {
        this.whNm = whNm;
    }
}
