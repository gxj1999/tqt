package com.soft.common.web.service;

import com.sjasoft.framework.service.AbstractService;
import com.soft.common.model.MCarrierLine;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MCarrierLineService extends AbstractService<MCarrierLine> {
    @Resource
    private com.soft.common.mapper.MCarrierLineMapper MCarrierLineMapper;

    public MCarrierLineService() {
        super.setBaseMapper(MCarrierLineMapper);
    }
}
