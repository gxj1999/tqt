package com.soft.common.mybatis.extend.entity;

import com.alibaba.fastjson.JSON;
import com.soft.common.model.MOrg;
import com.soft.common.web.controller.LoginController;
import lombok.Data;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

@Data
public class OrgTree extends MOrg {
    private static final Logger LOG = LoggerFactory.getLogger(OrgTree.class);
    // 扩展符号
    private Boolean expanded = true;
    // 判断节点是否角色
    private Boolean leaf = false;
    // 条件角色名（子查询传递用）
    private String keyRoleNm;

    // 部门子集
    private List<OrgTree> children = new ArrayList<OrgTree>();
    // 角色列表
    List<MRoleEx> subRoleList = new ArrayList<MRoleEx>();

    public List<OrgTree> getChildren() {
        return children;
    }

    public Boolean getExpanded() {
        return expanded;
    }

    public List<MRoleEx> getSubRoleList() {
        return subRoleList;
    }

    public String getKeyRoleNm() {
        return keyRoleNm;
    }

    public Boolean getLeaf() {
        return leaf;
    }

    public void setChildren(List<OrgTree> children) {
        this.children = children;
    }

    public void setExpanded(Boolean expanded) {
        this.expanded = expanded;
    }

    public void setSubRoleList(List<MRoleEx> subRoleList) {
        this.subRoleList = subRoleList;
    }

    public void setKeyRoleNm(String keyRoleNm) {
        this.keyRoleNm = keyRoleNm;
    }

    public void setLeaf(Boolean leaf) {
        this.leaf = leaf;
    }
}
