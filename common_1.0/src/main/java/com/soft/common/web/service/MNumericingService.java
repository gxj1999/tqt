package com.soft.common.web.service;

import com.sjasoft.framework.service.AbstractService;
import com.soft.common.model.MNumericing;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MNumericingService extends AbstractService<MNumericing> {
    @Resource
    private com.soft.common.mapper.MNumericingMapper MNumericingMapper;

    public MNumericingService() {
        super.setBaseMapper(MNumericingMapper);
    }
}
