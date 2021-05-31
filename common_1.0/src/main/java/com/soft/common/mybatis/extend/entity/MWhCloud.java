package com.soft.common.mybatis.extend.entity;


import com.soft.common.model.MWh;
import com.soft.common.model.MZone;
import lombok.Data;

import java.util.List;

/**
 * 仓库微服务配置类
 *
 */
@Data
public class MWhCloud extends MWh {
    private static final long serialVersionUID = 1L;
    //微服务名
    private String serviceNm;

    public String getServiceNm() {
        return serviceNm;
    }

    public void setServiceNm(String serviceNm) {
        this.serviceNm = serviceNm;
    }
}
