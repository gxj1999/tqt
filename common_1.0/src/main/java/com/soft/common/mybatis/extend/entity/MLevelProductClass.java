package com.soft.common.mybatis.extend.entity;

import com.soft.common.model.MProductClass;

import java.util.List;

public class MLevelProductClass extends MProductClass {

    private static final long serialVersionUID = 1L;

    private List<MLevelProductClass> children;

    public List<MLevelProductClass> getChildren() {
        return children;
    }

    public void setChildren(List<MLevelProductClass> children) {
        this.children = children;
    }
}
