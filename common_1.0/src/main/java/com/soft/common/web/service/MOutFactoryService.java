package com.soft.common.web.service;

import com.sjasoft.framework.service.AbstractService;
import com.soft.common.model.MOutFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MOutFactoryService extends AbstractService<MOutFactory> {
    @Resource
    private com.soft.common.mapper.MOutFactoryMapper MOutFactoryMapper;

    public MOutFactoryService() {
        super.setBaseMapper(MOutFactoryMapper);
    }
}
