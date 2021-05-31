package com.soft.common.web.service;

import com.sjasoft.framework.spring.mybatis.service.AbstractService;
import com.soft.common.mapper.MWorkgroupMapper;
import com.soft.common.model.MWorkgroup;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MWorkgroupService extends AbstractService<MWorkgroup> {
    @Resource
    private MWorkgroupMapper MWorkgroupMapper;

    public MWorkgroupService() {
        super.setBaseDao(MWorkgroupMapper);
    }

}
