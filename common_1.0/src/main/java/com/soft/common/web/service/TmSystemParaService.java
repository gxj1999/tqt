package com.soft.common.web.service;

import com.sjasoft.framework.spring.mybatis.service.AbstractService;
import com.soft.common.mapper.TmSystemParaMapper;
import com.soft.common.model.TmSystemPara;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TmSystemParaService extends AbstractService<TmSystemPara> {
    @Resource
    private TmSystemParaMapper tmSystemParaMapper;

    public TmSystemParaService() {
        super.setBaseDao(tmSystemParaMapper);
    }

}
