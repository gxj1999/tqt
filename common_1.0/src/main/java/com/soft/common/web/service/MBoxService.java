package com.soft.common.web.service;

import com.sjasoft.framework.service.AbstractService;
import com.soft.common.model.MBox;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MBoxService extends AbstractService<MBox> {
    @Resource
    private com.soft.common.mapper.MBoxMapper MBoxMapper;

    public MBoxService() {
        super.setBaseMapper(MBoxMapper);
    }
}
