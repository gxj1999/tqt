package com.soft.common.web.service;

import com.sjasoft.framework.service.AbstractService;
import com.soft.common.model.MUser;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MUserService extends AbstractService<MUser> {
    @Resource
    private com.soft.common.mapper.MUserMapper MUserMapper;

    public MUserService() {
        super.setBaseMapper(MUserMapper);
    }
}
