package com.soft.common.service;

import com.sjasoft.framework.annotation.SystemLog;
import com.sjasoft.framework.service.AbstractService;
import com.soft.common.mybatis.extend.dao.MGeneralListDao;
import com.soft.common.model.MGeneral;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MGeneralListService extends AbstractService<MGeneral> {

    @Resource
    private MGeneralListDao mGeneralListDao;
    /**
     * 查询共通配置根据共通配置类型
     * @param generalType    共通配置类型
     * @return
     */
    @SystemLog("查询共通配置根据共通配置类型")
    //modify by xieshengjie 2019/11/28 begin
    //public List<MGeneral> selectGeneral(String generalType){
    //    return mGeneralListDao.selectMgeneralByType(generalType);
    //}
    public List<MGeneral> selectGeneral(String generalType,
                                        String char1, String char2,String char3,
                                        String char4, String char5,String char6,
                                        String char7, String char8,String char9,
                                        String char10
    ){
        return mGeneralListDao.selectMgeneralByType(generalType, char1,  char2, char3,
            char4,  char5, char6,
            char7,  char8, char9,
            char10);
    }
    //modify by xieshengjie 2019/11/28 end

    /**
     * @author wyy
     * @date 2020/7/27
     * 获取打样执行状态(除未打样)根据共通配置类型
     * @param generalType 共通配置类型
     * @return
     */
    @SystemLog("查询共通配置根据共通配置类型")
    public List<MGeneral> selectGeneral(String generalType){
        Example.Criteria criteria = this.createCriteria();
        criteria.andEqualTo("delFlg","0");
        criteria.andEqualTo("generalMasterType",generalType);
        criteria.andNotEqualTo("generalCd","0");//未打样
        List<MGeneral> generalList = this.selectByCondition(criteria,"GENERAL_MASTER_TYPE,GENERAL_CD");
        return generalList;
    }

    /**
     * 查询共通配置根据共通配置编号和共通配置类型
     * @param generalCd    共通配置编号
     * @param generalType    共通配置类型
     * @return
     */
    @SystemLog("查询共通配置根据共通配置编号和共通配置类型")
    public MGeneral selectGeneral(String generalType,String generalCd){
        return mGeneralListDao.selectMgeneralByCd(generalType,generalCd);
    }

}
