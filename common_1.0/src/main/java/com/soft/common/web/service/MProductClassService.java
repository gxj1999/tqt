package com.soft.common.web.service;

import com.sjasoft.framework.spring.mybatis.service.AbstractService;
import com.soft.common.mapper.MProductClassMapper;
import com.soft.common.model.MProductClass;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MProductClassService extends AbstractService<MProductClass> {
    @Resource
    private MProductClassMapper MProductClassMapper;

    public MProductClassService() {
        super.setBaseDao(MProductClassMapper);
    }
}
