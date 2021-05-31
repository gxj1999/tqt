package com.soft.common.web.service;

import com.sjasoft.framework.service.AbstractService;
import com.soft.common.model.MLevel;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MLevelService extends AbstractService<MLevel> {
    @Resource
    private com.soft.common.mapper.MLevelMapper MLevelMapper;

    public MLevelService() {
        super.setBaseMapper(MLevelMapper);
    }
}
