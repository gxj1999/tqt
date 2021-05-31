package com.soft.common.web.service;

import com.sjasoft.framework.service.AbstractService;
import com.soft.common.model.MCenter;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MCenterService extends AbstractService<MCenter> {
    @Resource
    private com.soft.common.mapper.MCenterMapper MCenterMapper;

    public MCenterService() {
        super.setBaseMapper(MCenterMapper);
    }
}
