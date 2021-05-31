package com.soft.common.web.service;

import com.sjasoft.framework.spring.mybatis.service.AbstractService;
import com.soft.common.mapper.MStandardMpMapper;
import com.soft.common.model.MStandardMp;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MStandardMpService extends AbstractService<MStandardMp> {
    @Resource
    private MStandardMpMapper MStandardMpMapper;

    public MStandardMpService() {
        super.setBaseDao(MStandardMpMapper);
    }
}
