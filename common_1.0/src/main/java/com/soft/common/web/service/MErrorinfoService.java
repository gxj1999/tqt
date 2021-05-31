package com.soft.common.web.service;

import com.sjasoft.framework.service.AbstractService;
import com.soft.common.model.MErrorinfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MErrorinfoService extends AbstractService<MErrorinfo> {
    @Resource
    private com.soft.common.mapper.MErrorinfoMapper MErrorinfoMapper;

    public MErrorinfoService() {
        super.setBaseMapper(MErrorinfoMapper);
    }
}
