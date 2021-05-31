package com.soft.common.web.service;

import com.sjasoft.framework.service.AbstractService;
import com.soft.common.model.MRoleModule;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MRoleModuleService extends AbstractService<MRoleModule> {
    @Resource
    private com.soft.common.mapper.MRoleModuleMapper MRoleModuleMapper;

    public MRoleModuleService() {
        super.setBaseMapper(MRoleModuleMapper);
    }
}
