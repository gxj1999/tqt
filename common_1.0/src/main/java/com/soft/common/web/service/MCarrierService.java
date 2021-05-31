package com.soft.common.web.service;

import com.sjasoft.framework.service.AbstractService;
import com.soft.common.model.MCarrier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MCarrierService extends AbstractService<MCarrier> {
    @Resource
    private com.soft.common.mapper.MCarrierMapper MCarrierMapper;

    public MCarrierService() {
        super.setBaseMapper(MCarrierMapper);
    }
}
