package com.soft.common.web.service;

import com.sjasoft.framework.spring.mybatis.service.AbstractService;
import com.soft.common.mapper.MManufProcessMapper;
import com.soft.common.model.MManufProcess;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MManufProcessService extends AbstractService<MManufProcess> {
    @Resource
    private MManufProcessMapper MManufProcessMapper;

    public MManufProcessService() {
        super.setBaseDao(MManufProcessMapper);
    }
}
