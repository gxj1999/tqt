package com.soft.common.web.service;

import com.sjasoft.framework.spring.mybatis.service.AbstractService;
import com.soft.common.mapper.MStandardMpLineMapper;
import com.soft.common.model.MStandardMpLine;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MStandardMpLineService extends AbstractService<MStandardMpLine> {
    @Resource
    private MStandardMpLineMapper MStandardMpLineMapper;

    public MStandardMpLineService() {
        super.setBaseDao(MStandardMpLineMapper);
    }
}
