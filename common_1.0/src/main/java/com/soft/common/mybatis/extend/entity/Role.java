package com.soft.common.mybatis.extend.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class Role implements Serializable {
    private static final long serialVersionUID = 1L;

    private String moduleCd;

    public String getModuleCd() {
        return moduleCd;
    }

    public void setModuleCd(String moduleCd) {
        this.moduleCd = moduleCd;
    }

    public String getModuleType() {
        return moduleType;
    }

    public void setModuleType(String moduleType) {
        this.moduleType = moduleType;
    }

    public List<Role> getChildren() {
        return children;
    }

    public void setChildren(List<Role> children) {
        this.children = children;
    }

    private String moduleType;
    private List<Role> children;

}
