package com.soft.common.mybatis.extend.entity;

import com.soft.common.model.MProductClass;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@ApiModel(description="商品分类")
public class MProductClassExRatio extends MProductClass {
    @ApiModelProperty(value = "成分比例")
    private String ratio;
    private String prodRelaId;
    public String getRatio() {
        return ratio;
    }
    public void setRatio(String ratio) {
        this.ratio = ratio;
    }

    public String getProdRelaId() {
        return prodRelaId;
    }

    public void setProdRelaId(String prodRelaId) {
        this.prodRelaId = prodRelaId;
    }
}
