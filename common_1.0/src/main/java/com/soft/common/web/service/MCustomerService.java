package com.soft.common.web.service;

import com.sjasoft.framework.service.AbstractService;
import com.soft.common.model.MCustomer;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MCustomerService extends AbstractService<MCustomer> {
    @Resource
    private com.soft.common.mapper.MCustomerMapper MCustomerMapper;

    public MCustomerService() {
        super.setBaseMapper(MCustomerMapper);
    }
}
