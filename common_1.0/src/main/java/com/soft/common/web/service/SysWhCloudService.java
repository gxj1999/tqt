package com.soft.common.web.service;

import com.sjasoft.framework.service.AbstractService;
import com.soft.common.mapper.SysWhCloudMapper;
import com.soft.common.model.SysWhCloud;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SysWhCloudService extends AbstractService<SysWhCloud> {
    @Resource
    private SysWhCloudMapper sysWhCloudMapper;

    public SysWhCloudService() {
        super.setBaseMapper(sysWhCloudMapper);
    }
}
