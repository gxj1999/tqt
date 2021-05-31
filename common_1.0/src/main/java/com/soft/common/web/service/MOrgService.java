package com.soft.common.web.service;

import com.sjasoft.framework.service.AbstractService;
import com.soft.common.model.MOrg;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import com.soft.common.mapper.MOrgMapper;
@Service
public class MOrgService extends AbstractService<MOrg> {
    @Resource
    private  MOrgMapper MOrgMapper;

    public MOrgService() {
        super.setBaseMapper(MOrgMapper);
    }
}
