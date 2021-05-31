package com.soft.common.mybatis.extend.entity;

import com.soft.common.model.MModule;

import java.util.ArrayList;
import java.util.List;

public class Module extends MModule {
    private static final long serialVersionUID = 1L;
    /** 子模块 */
    private List<Module> children = new ArrayList<>();

    // 角色关系用
    /** 角色编号 */
    private String roleCode = "";
    /** 角色关系ID */
    private String roleRelationId = "";

    public List<Module> getChildren() {
        return children;
    }

    public void setChildren(List<Module> children) {
        this.children = children;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    public String getRoleRelationId() {
        return roleRelationId;
    }

    public void setRoleRelationId(String roleRelationId) {
        this.roleRelationId = roleRelationId;
    }
}
