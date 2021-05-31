package com.soft.common.web.service;

import com.sjasoft.framework.service.AbstractService;
import com.soft.common.model.MWh;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MWhService extends AbstractService<MWh> {
    @Resource
    private com.soft.common.mapper.MWhMapper MWhMapper;

    public MWhService() {
        super.setBaseMapper(MWhMapper);
    }
}
