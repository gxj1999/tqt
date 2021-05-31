package com.soft.common.web.service;

import com.sjasoft.framework.spring.mybatis.service.AbstractService;
import com.soft.common.mapper.MMachineMapper;
import com.soft.common.model.MMachine;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MMachineService extends AbstractService<MMachine> {
    @Resource
    private MMachineMapper MMachineMapper;

    public MMachineService() {
        super.setBaseDao(MMachineMapper);
    }
}
