package com.soft.common.web.service;

import com.sjasoft.framework.spring.mybatis.service.AbstractService;
import com.soft.common.mapper.MProductRelaMapper;
import com.soft.common.model.MProductRela;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MProductRelaService extends AbstractService<MProductRela> {
    @Resource
    private MProductRelaMapper MProductRelaMapper;

    public MProductRelaService() {
        super.setBaseDao(MProductRelaMapper);
    }
}
