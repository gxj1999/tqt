package com.soft.common.mybatis.extend.entity;


import com.soft.common.model.MProduct;
import lombok.Data;

import java.util.List;

/**
 * 商品实体类
 *
 */
@Data
public class MProductEx extends MProduct {
    private static final long serialVersionUID = 1L;

    //商品类型名称
    private String prodTypeNm;

    //计量单位
    private String unitNm;

    //商品分类名称
    private String prodClassNm;
    //纱比
    private String ratioRela;
    //路径
    private String path;

    /**
     * 组别
     */
    private String groupNo;
    /**
     * 产成品行号
     */
    private String prodLineNo;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    List<MProductEx>  children;

    private String yarnCountBUnitNm;
    private String yarnCountFUnitNm;

    public String getProdTypeNm() {
        return prodTypeNm;
    }

    public void setProdTypeNm(String prodTypeNm) {
        this.prodTypeNm = prodTypeNm;
    }

    public String getUnitNm() {
        return unitNm;
    }

    public void setUnitNm(String unitNm) {
        this.unitNm = unitNm;
    }

    public String getProdClassNm() {
        return prodClassNm;
    }

    public void setProdClassNm(String prodClassNm) {
        this.prodClassNm = prodClassNm;
    }

    public String getRatioRela() {
        return ratioRela;
    }

    public void setRatioRela(String ratioRela) {
        this.ratioRela = ratioRela;
    }

    public List<MProductEx> getChildren() {
        return children;
    }

    public void setChildren(List<MProductEx> children) {
        this.children = children;
    }

    public String getYarnCountBUnitNm() {
        return yarnCountBUnitNm;
    }

    public void setYarnCountBUnitNm(String yarnCountBUnitNm) {
        this.yarnCountBUnitNm = yarnCountBUnitNm;
    }

    public String getYarnCountFUnitNm() {
        return yarnCountFUnitNm;
    }

    public void setYarnCountFUnitNm(String yarnCountFUnitNm) {
        this.yarnCountFUnitNm = yarnCountFUnitNm;
    }

    public String getGroupNo() {
        return groupNo;
    }

    public void setGroupNo(String groupNo) {
        this.groupNo = groupNo;
    }

    public String getProdLineNo() {
        return prodLineNo;
    }

    public void setProdLineNo(String prodLineNo) {
        this.prodLineNo = prodLineNo;
    }
}
