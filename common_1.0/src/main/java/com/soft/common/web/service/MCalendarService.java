package com.soft.common.web.service;

import com.sjasoft.framework.service.AbstractService;
import com.soft.common.model.MCalendar;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MCalendarService extends AbstractService<MCalendar> {
    @Resource
    private com.soft.common.mapper.MCalendarMapper MCalendarMapper;

    public MCalendarService() {
        super.setBaseMapper(MCalendarMapper);
    }
}
