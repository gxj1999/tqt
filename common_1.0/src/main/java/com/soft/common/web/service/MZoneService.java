package com.soft.common.web.service;

import com.sjasoft.framework.service.AbstractService;
import com.soft.common.model.MZone;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MZoneService extends AbstractService<MZone> {
    @Resource
    private com.soft.common.mapper.MZoneMapper MZoneMapper;

    public MZoneService() {
        super.setBaseMapper(MZoneMapper);
    }
}
