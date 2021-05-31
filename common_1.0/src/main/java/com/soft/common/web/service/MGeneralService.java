package com.soft.common.web.service;

import com.sjasoft.framework.service.AbstractService;
import com.soft.common.model.MGeneral;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MGeneralService extends AbstractService<MGeneral> {
    @Resource
    private com.soft.common.mapper.MGeneralMapper MGeneralMapper;

    public MGeneralService() {
        super.setBaseMapper(MGeneralMapper);
    }
}
