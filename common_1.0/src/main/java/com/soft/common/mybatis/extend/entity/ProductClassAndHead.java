package com.soft.common.mybatis.extend.entity;


import com.soft.common.model.MProductClass;
import com.soft.common.model.MProductRela;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * 商品实体类
 *
 */
@ApiModel(value = "商品信息")
@Data
public class ProductClassAndHead {
    private static final long serialVersionUID = 1L;
    @ApiModelProperty(value = "纱支")
    private String yarnCount;
    @ApiModelProperty(value = "纱支前半")
    private String yarnCountF;
    @ApiModelProperty(value = "纱支前半单位")
    private String yarnCountFunit;
    @ApiModelProperty(value = "纱支前半单位名称")
    private String yarnCountFunitNm;
    @ApiModelProperty(value = "纱支后半")
    private String  yarnCountB;
    @ApiModelProperty(value = "纱支后半单位")
    private String yarnCountBunit;
    @ApiModelProperty(value = "纱支后半单位名称")
    private String yarnCountBunitNm;
    @ApiModelProperty(value = "股数")
    private String numberOfShares;
    // add by xhs 2020-06-01 start
    @ApiModelProperty(value = "并线")
    private String char1;

    public String getChar1() {
        return char1;
    }

    public void setChar1(String char1) {
        this.char1 = char1;
    }
    // add by xhs 2020-06-01 end
    public String getYarnCount() {
        return yarnCount;
    }

    public void setYarnCount(String yarnCount) {
        this.yarnCount = yarnCount;
    }

    public String getYarnCountF() {
        return yarnCountF;
    }

    public void setYarnCountF(String yarnCountF) {
        this.yarnCountF = yarnCountF;
    }

    public String getYarnCountFunit() {
        return yarnCountFunit;
    }

    public void setYarnCountFunit(String yarnCountFunit) {
        this.yarnCountFunit = yarnCountFunit;
    }

    public String getYarnCountB() {
        return yarnCountB;
    }

    public void setYarnCountB(String yarnCountB) {
        this.yarnCountB = yarnCountB;
    }

    public String getYarnCountBunit() {
        return yarnCountBunit;
    }

    public void setYarnCountBunit(String yarnCountBunit) {
        this.yarnCountBunit = yarnCountBunit;
    }

    public String getNumberOfShares() {
        return numberOfShares;
    }

    public void setNumberOfShares(String numberOfShares) {
        this.numberOfShares = numberOfShares;
    }

    public String getYarnCountFunitNm() {
        return yarnCountFunitNm;
    }

    public void setYarnCountFunitNm(String yarnCountFunitNm) {
        this.yarnCountFunitNm = yarnCountFunitNm;
    }

    public String getYarnCountBunitNm() {
        return yarnCountBunitNm;
    }

    public void setYarnCountBunitNm(String yarnCountBunitNm) {
        this.yarnCountBunitNm = yarnCountBunitNm;
    }
}
