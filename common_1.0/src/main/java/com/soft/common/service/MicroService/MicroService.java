package com.soft.common.service.MicroService;

import com.sjasoft.framework.annotation.SystemLog;
import com.sjasoft.framework.bean.ResultBean;
import com.sjasoft.framework.util.StringUtils;
import com.sjasoft.framework.utils.StringUtil;
import com.soft.common.model.MMachine;
import com.soft.common.model.TManufOrd;
import com.soft.common.model.TmSystemPara;
import com.soft.common.mybatis.extend.dao.*;
import com.soft.common.mybatis.extend.entity.*;
import com.soft.common.web.Util.CommonUtils;
import com.soft.common.web.service.TmSystemParaService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;


@Service
public class MicroService {
    @Resource
    private MWhCloudDao mWhCloudDaoDao;
    @Resource
    private TmSystemParaService tmSystemParaService;

    @SystemLog("获取仓库微服务配置")
    public List<MWhCloud> getMWhCloud(String cntrCd) {
        List<MWhCloud> sysWhCloud = mWhCloudDaoDao.selectMWhCloud(cntrCd);
        return sysWhCloud;
    }

    @SystemLog("获取仓库微服务名称")
    public  MWhCloud getWhCloudById(String id) {
        return mWhCloudDaoDao.getMwhCloudById(id);
    }
    /**
     * 打开按钮更新
     * @param request
     * @param cntrCd 中心编号
     * @return
     */
    @SystemLog("打开按钮更新")
    public ResultBean openControl(HttpServletRequest request,String cntrCd,String entkbn,String pgmId,String userId,String userNm)
    {
        //系统参数设置表
        TmSystemPara tmSystemPara= new TmSystemPara();
        CommonUtils.setCommonInfo(tmSystemPara,request);
        //中心编号
        tmSystemPara.setCntrCd(cntrCd);
        //计划处理FLG
        tmSystemPara.setManufOrdFlg("1");
        //计划处理时间
        tmSystemPara.setManufOrdDate(StringUtils.formatDate(new Date(), "yyyyMMdd"));
        tmSystemPara.setAddEntKbn(entkbn);
        tmSystemPara.setAddPgmId(pgmId);
        tmSystemPara.setAddUserId(userId);
        tmSystemPara.setAddUserNm(userNm);
        tmSystemPara.setUpdEntKbn(entkbn);
        tmSystemPara.setUpdPgmId(pgmId);
        tmSystemPara.setUpdUserId(userId);
        tmSystemPara.setUpdUserNm(userNm);
        tmSystemParaService.insertSelective(tmSystemPara);

        return ResultBean.success("打开按钮更新成功");
    }

    @SystemLog("检查权限")
    public  ResultBean checkAuthority() {
        Example.Criteria criteria = tmSystemParaService.createCriteria();
        criteria.andEqualTo("manufOrdFlg", "1");
        criteria.andEqualTo("manufOrdDate",StringUtils.formatDate(new Date(), "yyyyMMdd"));
        criteria.andEqualTo("delFlg", "0");
        List<TmSystemPara> tmSystemParas = tmSystemParaService.select(criteria);
        if (tmSystemParas.size() == 0) {
            return ResultBean.failure("开关未打开，如有急需请和射阳计划部联系！");
        }
        return ResultBean.success("权限查询成功");
    }

    @SystemLog("打开按钮是否显示")
    public  ResultBean showOpenControl() {
        Example.Criteria criteria = tmSystemParaService.createCriteria();
        criteria.andEqualTo("cntrCd", "002");
        criteria.andEqualTo("manufOrdFlg", "1");
        criteria.andEqualTo("manufOrdDate",StringUtils.formatDate(new Date(), "yyyyMMdd"));
        criteria.andEqualTo("delFlg", "0");
        List<TmSystemPara> tmSystemParas = tmSystemParaService.select(criteria);
        if (tmSystemParas.size() > 0) {
            return ResultBean.failure("打开按钮显示失败");
        }
        return ResultBean.success("打开按钮显示成功");
    }
}
