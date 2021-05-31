package com.soft.common.web.service;

import com.sjasoft.framework.service.AbstractService;
import com.soft.common.model.MOutFactoryLine;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MOutFactoryLineService extends AbstractService<MOutFactoryLine> {
    @Resource
    private com.soft.common.mapper.MOutFactoryLineMapper MOutFactoryLineMapper;

    public MOutFactoryLineService() {
        super.setBaseMapper(MOutFactoryLineMapper);
    }
}
