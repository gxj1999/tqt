package com.soft.common.web.service;

import com.sjasoft.framework.service.AbstractService;
import com.soft.common.model.MRole;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MRoleService extends AbstractService<MRole> {
    @Resource
    private com.soft.common.mapper.MRoleMapper MRoleMapper;

    public MRoleService() {
        super.setBaseMapper(MRoleMapper);
    }
}
