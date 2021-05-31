package com.soft.common.mybatis.extend.entity;

import com.soft.common.model.MRoleModule;

import java.util.List;

public class UpdateRelation extends MRoleModule {


    public List<String> getModuleIdList() {
        return moduleIdList;
    }

    public void setModuleIdList(List<String> moduleIdList) {
        this.moduleIdList = moduleIdList;
    }

    private List<String> moduleIdList;

}
