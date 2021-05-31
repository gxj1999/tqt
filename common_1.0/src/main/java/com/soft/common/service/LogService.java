package com.soft.common.service;

import com.sjasoft.framework.annotation.SystemLog;
import com.sjasoft.framework.service.AbstractService;
import com.soft.common.mapper.TLogMapper;
import com.soft.common.model.TLog;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class LogService extends AbstractService<TLog> {

    @Resource
    private TLogMapper tLogDao;
    /**
     * 添加日志信息
     * @param tLog 日志
     * @return
     */
    @SystemLog("添加日志信息")
    public TLog insertLogInfo(TLog tLog){
        Date date = new Date();
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd :hh:mm:ss");
        tLog.setObjStartDt(dateFormat.format(date));
        tLog.setAddDt(date);
        tLogDao.insertSelective(tLog);
        return tLog;
    }
    /**
     * 编辑日志信息
     * @param tLog 日志
     * @return
     */
    @SystemLog("编辑日志信息")
    public TLog updateLogInfo(TLog tLog){
        Date date = new Date();
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd :hh:mm:ss");
        tLog.setObjStartDt(dateFormat.format(date));
        tLog.setUpdDt(date);
        tLog.setNewType("0");
        tLogDao.updateByPrimaryKey(tLog);
        return tLog;
    }
    /**
     * 删除日志信息
     * @param tLog 日志
     * @return
     */
    @SystemLog("编辑日志信息")
    public TLog deleteLogInfo(TLog tLog){
        tLogDao.delete(tLog);
        return tLog;
    }
    /**
     * 查询日志信息
     * @return
     */
    @SystemLog("查询日志信息")
    public List<TLog> selectLogInfo(){
        List<TLog> tLogList = tLogDao.selectAll();
        return tLogList;
    }
}
