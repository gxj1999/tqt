package com.soft.common.web.service;

import com.sjasoft.framework.service.AbstractService;
import com.soft.common.model.MModule;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MModuleService extends AbstractService<MModule> {
    @Resource
    private com.soft.common.mapper.MModuleMapper MModuleMapper;

    public MModuleService() {
        super.setBaseMapper(MModuleMapper);
    }
}
