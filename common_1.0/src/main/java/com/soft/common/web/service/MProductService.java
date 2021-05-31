package com.soft.common.web.service;

import com.sjasoft.framework.spring.mybatis.service.AbstractService;
import com.soft.common.mapper.MProductMapper;
import com.soft.common.model.MProduct;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MProductService extends AbstractService<MProduct> {
    @Resource
    private MProductMapper MProductMapper;

    public MProductService() {
        super.setBaseDao(MProductMapper);
    }
}
