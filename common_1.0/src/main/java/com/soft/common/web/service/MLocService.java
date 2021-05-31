package com.soft.common.web.service;

import com.sjasoft.framework.service.AbstractService;
import com.soft.common.model.MLoc;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MLocService extends AbstractService<MLoc> {
    @Resource
    private com.soft.common.mapper.MLocMapper MLocMapper;

    public MLocService() {
        super.setBaseMapper(MLocMapper);
    }
}
