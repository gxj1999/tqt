package com.soft.common.mybatis.extend.entity;


import com.soft.common.model.MProduct;
import com.soft.common.model.MProductRela;
import lombok.Data;

import java.util.List;

/**
 * 商品实体类
 *
 */
@Data
public class MProductRelaEx extends MProductRela {
    private static final long serialVersionUID = 1L;

    //商品分类名称
    private String prodClassNm;
    private String path;

    public String getProdClassNm() {
        return prodClassNm;
    }

    public void setProdClassNm(String prodClassNm) {
        this.prodClassNm = prodClassNm;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
