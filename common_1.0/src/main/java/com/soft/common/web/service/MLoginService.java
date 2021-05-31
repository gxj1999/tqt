package com.soft.common.web.service;

import com.sjasoft.framework.service.AbstractService;
import com.soft.common.model.MLogin;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MLoginService extends AbstractService<MLogin> {
    @Resource
    private com.soft.common.mapper.MLoginMapper MLoginMapper;

    public MLoginService() {
        super.setBaseMapper(MLoginMapper);
    }
}
