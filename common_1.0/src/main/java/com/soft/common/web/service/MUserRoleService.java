package com.soft.common.web.service;

import com.sjasoft.framework.service.AbstractService;
import com.soft.common.model.MUserRole;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MUserRoleService extends AbstractService<MUserRole> {
    @Resource
    private com.soft.common.mapper.MUserRoleMapper MUserRoleMapper;

    public MUserRoleService() {
        super.setBaseMapper(MUserRoleMapper);
    }
}
