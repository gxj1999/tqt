package com.soft.common.web.service;

import com.sjasoft.framework.service.AbstractService;
import com.soft.common.model.MSupplier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MSupplierService extends AbstractService<MSupplier> {
    @Resource
    private com.soft.common.mapper.MSupplierMapper MSupplierMapper;

    public MSupplierService() {
        super.setBaseMapper(MSupplierMapper);
    }
}
