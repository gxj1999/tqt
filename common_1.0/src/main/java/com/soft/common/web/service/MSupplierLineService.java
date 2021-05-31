package com.soft.common.web.service;

import com.sjasoft.framework.service.AbstractService;
import com.soft.common.model.MSupplierLine;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MSupplierLineService extends AbstractService<MSupplierLine> {
    @Resource
    private com.soft.common.mapper.MSupplierLineMapper MSupplierLineMapper;

    public MSupplierLineService() {
        super.setBaseMapper(MSupplierLineMapper);
    }
}
