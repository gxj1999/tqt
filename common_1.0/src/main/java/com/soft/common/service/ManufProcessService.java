package com.soft.common.service;

import com.github.pagehelper.PageHelper;
import com.sjasoft.framework.annotation.SystemLog;
import com.sjasoft.framework.bean.ResultBean;
import com.soft.common.model.*;
import com.soft.common.mybatis.extend.dao.ManufProcessDao;
import com.soft.common.mybatis.extend.entity.ManufProcessEx;
import com.soft.common.mybatis.extend.entity.ManufProcessExLine;
import com.soft.common.web.Util.CommonUtils;
import com.soft.common.web.service.MManufProcessService;
import com.soft.common.web.service.MStandardMpLineService;
import com.soft.common.web.service.MStandardMpService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ManufProcessService {
    @Resource
    private ManufProcessDao manufProcessDao;
    @Resource
    private MManufProcessService mManufProcessService;
    @Resource
    private MStandardMpService mStandardMpService;
    @Resource
    private MStandardMpLineService mStandardMpLineService;
    /**
     * 获取生产流程一览
     * @param page 页数
     * @param limit 条数
     * @param manufProcessNm 生产流程名称
     * @param manufProcessCls 生产流程状态
     * @return
     */
    @SystemLog("获取生产流程一览")
    public List<ManufProcessEx> getManufProcessList(Integer page, Integer limit, String manufProcessNm, String manufProcessCls,String orgId) {
        PageHelper.startPage(page, limit);
        return manufProcessDao.selectManufProList(manufProcessNm, manufProcessCls,orgId);
    }
    /**
     * 获取标准流程一览
     * @param page 页数
     * @param limit 条数
     * @param standardMpNm 标准流程名称
     * @return
     */
    @SystemLog("获取标准流程一览")
    public List<MStandardMp> getStandardMpList(Integer page, Integer limit, String standardMpNm) {
        PageHelper.startPage(page, limit);
        return manufProcessDao.selectStandardMpList(standardMpNm);
    }
    /**
     * 删除标准流程
     * @param mStandardMp
     * @return
     */
    @SystemLog("删除标准流程信息")
    public MStandardMp deleteStandardMp(HttpServletRequest request, MStandardMp mStandardMp) {
        CommonUtils.setCommonInfo(mStandardMp, request);
        mStandardMp.setDelFlg("1");
        mStandardMpService.updateByPrimaryKey(mStandardMp);
        return mStandardMp;
    }
    /**
     * 获取生产流程一览
     * @return
     */
    @SystemLog("获取生产流程一览")
    public List<ManufProcessEx> selectManufProcessList() {
        return manufProcessDao.selectManufProcess();
    }
    /**
     * 删除生产流程信息
     * @param mManufProcess
     * @return
     */
    @SystemLog("删除生产流程信息")
    public MManufProcess deleteManufProcess(HttpServletRequest request, MManufProcess mManufProcess) {
        CommonUtils.setCommonInfo(mManufProcess, request);
        mManufProcess.setDelFlg("1");
        mManufProcessService.updateByPrimaryKey(mManufProcess);
        return mManufProcess;
    }

    /**
     * 编辑生产流程信息
     *
     * @param mManufProcess 生产流程
     * @return
     */
    @SystemLog("编辑生产流程信息")
    public ResultBean updateManuf(HttpServletRequest request,MManufProcess mManufProcess) {
        //新增
        if (com.sjasoft.framework.util.StringUtils.isNullOrEmpty(mManufProcess.getId())) {
            //判断是否存在
            Example.Criteria criteriaNm = mManufProcessService.createCriteria();
            criteriaNm.andEqualTo("delFlg",'0');
            criteriaNm.andEqualTo("manufProcess",mManufProcess.getManufProcess());
            criteriaNm.andEqualTo("manufProcessCls",mManufProcess.getManufProcessCls());
            List<MManufProcess> mManufProcessList = mManufProcessService.select(criteriaNm);
            if(mManufProcessList.size() > 0 )
            {
                return ResultBean.failure("数据已存在！");
            }
            CommonUtils.setCommonInfo(mManufProcess, request);
            mManufProcessService.insertSelective(mManufProcess);
        }else {
            Example.Criteria criteria = mManufProcessService.createCriteria();
            criteria.andEqualTo("id", mManufProcess.getId());
            List<MManufProcess> mManufProcesss = mManufProcessService.select(criteria);
            if (!mManufProcess.getUpdCnt().equals(mManufProcesss.get(0).getUpdCnt())) {
                return ResultBean.failure("数据已被修改,请重试！");
            }
            MManufProcess manufProcessOld = mManufProcessService.selectByPrimaryKey(mManufProcess.getId());
            if(manufProcessOld.getManufProcess().equals(mManufProcess.getManufProcess())
                && manufProcessOld.getManufProcessCls().equals(mManufProcess.getManufProcessCls())){

                CommonUtils.setCommonInfo(mManufProcess, request);
                // update by xhs 2020-10-09 start
//                mManufProcessService.updateByPrimaryKey(mManufProcess);
                mManufProcessService.updateByPrimaryKeySelective(mManufProcess);
                // update by xhs 2020-10-09 end
            }else {
                //判断是否存在
                Example.Criteria criteriaNm = mManufProcessService.createCriteria();
                criteriaNm.andEqualTo("delFlg",'0');
                criteriaNm.andEqualTo("manufProcess",mManufProcess.getManufProcess());
                criteriaNm.andEqualTo("manufProcessCls",mManufProcess.getManufProcessCls());
                List<MManufProcess> mManufProcessList = mManufProcessService.select(criteriaNm);
                if(mManufProcessList.size() > 0 )
                {
                    return ResultBean.failure("数据已存在！");
                }
                CommonUtils.setCommonInfo(mManufProcess, request);
                mManufProcessService.updateByPrimaryKey(mManufProcess);
            }
        }
        return ResultBean.success("编辑生产流程成功！",mManufProcess);
    }
    /**
     * 弹框获取标准流程下拉框
     * @return
     */
    @SystemLog("弹框获取标准流程下拉框")
    public List<MStandardMp> selectMstandardMp() {
        Example.Criteria criteria = mStandardMpService.createCriteria();
        criteria.andEqualTo("delFlg",'0');
        List<MStandardMp> mStandardMpList = mStandardMpService.select(criteria);
        return mStandardMpList;
    }
    /**
     * 弹框获取标准流程下拉框
     * @return
     */
    @SystemLog("弹框获取标准流程下拉框")
    public List<ManufProcessExLine> getThisManufProcess(String standardMpId) {
        return manufProcessDao.selectThisManufProcess(standardMpId);
    }

    /**
     * 弹框确定
     * @param request
     * @param standardMpNm
     * @param manufProcessExLine
     * @return
     */
    @SystemLog("弹框确定")
    @Transactional
    public Map<String, Object> saveManufProcess(HttpServletRequest request,String standardMpNm,  List<ManufProcessExLine> manufProcessExLine) {
        Map<String, Object> maptemp = new HashMap<String, Object>();
        List<MManufProcess> lstemp = new ArrayList<>();
        List<MStandardMpLine> lstmpLine = new ArrayList<>();
        //保存标准流程
        MStandardMp mStandardMp = new MStandardMp();
        mStandardMp.setStandardMpNm(standardMpNm);
        mStandardMp.setRemark(manufProcessExLine.get(0).getRemark());
        mStandardMp.setCntrCd(manufProcessExLine.get(0).getCntrCd());
        mStandardMp.setAddEntKbn(manufProcessExLine.get(0).getAddEntKbn());
        mStandardMp.setAddPgmId(manufProcessExLine.get(0).getAddPgmId());
        mStandardMp.setAddUserId(manufProcessExLine.get(0).getAddUserId());
        mStandardMp.setAddUserNm(manufProcessExLine.get(0).getAddUserNm());
        mStandardMp.setUpdEntKbn(manufProcessExLine.get(0).getAddEntKbn());
        mStandardMp.setUpdPgmId(manufProcessExLine.get(0).getAddPgmId());
        mStandardMp.setUpdUserId(manufProcessExLine.get(0).getAddUserId());
        mStandardMp.setUpdUserNm(manufProcessExLine.get(0).getAddUserNm());
        CommonUtils.setCommonInfo(mStandardMp, request);
        mStandardMpService.insertSelective(mStandardMp);
        //同步标准流程
        maptemp.put("mStandardMp", mStandardMp);
        for(int i = 0;i<manufProcessExLine.size();i++) {
            MManufProcess mManufProcess = new MManufProcess();
            mManufProcess.setOrgId(manufProcessExLine.get(i).getOrgId());
            mManufProcess.setCntrCd(manufProcessExLine.get(i).getCntrCd());
            mManufProcess.setManufProcess(manufProcessExLine.get(i).getManufProcess());
            mManufProcess.setManufProcessCls(manufProcessExLine.get(i).getManufProcessCls());
            mManufProcess.setAddEntKbn(manufProcessExLine.get(i).getAddEntKbn());
            mManufProcess.setAddPgmId(manufProcessExLine.get(i).getAddPgmId());
            mManufProcess.setAddUserId(manufProcessExLine.get(i).getAddUserId());
            mManufProcess.setAddUserNm(manufProcessExLine.get(i).getAddUserNm());
            mManufProcess.setUpdEntKbn(manufProcessExLine.get(i).getAddEntKbn());
            mManufProcess.setUpdPgmId(manufProcessExLine.get(i).getAddPgmId());
            mManufProcess.setUpdUserId(manufProcessExLine.get(i).getAddUserId());
            mManufProcess.setUpdUserNm(manufProcessExLine.get(i).getAddUserNm());
            CommonUtils.setCommonInfo(mManufProcess, request);
            mManufProcessService.insertSelective(mManufProcess);
            lstemp.add(mManufProcess);
            //保存标准流程明细
            manufProcessExLine.get(i).setStandardMpId(mStandardMp.getId());
            ResultBean standMpLine= savemStandardMpLine(request,manufProcessExLine.get(i));
            String s = com.alibaba.fastjson.JSONObject.toJSONString(standMpLine.getData());
            MStandardMpLine mstandMpLine = com.alibaba.fastjson.JSONObject.parseObject(s,MStandardMpLine.class);
//            JSONObject objJson = JSONObject.fromObject(standMpLine.getData());
//            MStandardMpLine mstandMpLine = (MStandardMpLine) JSONObject.toBean(objJson,MStandardMpLine.class);
            lstmpLine.add(mstandMpLine);
        }
        maptemp.put("mstandMpLines", lstmpLine);
        maptemp.put("manufProcess", lstemp);
        return maptemp;
    }
    /**
     * 保存标准流程
     * @param request
     * @param standardMpNm
     * @param manufProcessExLine
     * @return
     */
    @SystemLog("保存标准流程")
    @Transactional
    public ResultBean savemStandardMp(HttpServletRequest request,String standardMpNm,List<ManufProcessExLine> manufProcessExLine) {
        MStandardMp mStandardMp = new MStandardMp();
        mStandardMp.setStandardMpNm(standardMpNm);
        mStandardMp.setRemark(manufProcessExLine.get(0).getRemark());
        mStandardMp.setCntrCd(manufProcessExLine.get(0).getCntrCd());
        mStandardMp.setAddEntKbn(manufProcessExLine.get(0).getAddEntKbn());
        mStandardMp.setAddPgmId(manufProcessExLine.get(0).getAddPgmId());
        mStandardMp.setAddUserId(manufProcessExLine.get(0).getAddUserId());
        mStandardMp.setAddUserNm(manufProcessExLine.get(0).getAddUserNm());
        mStandardMp.setUpdEntKbn(manufProcessExLine.get(0).getAddEntKbn());
        mStandardMp.setUpdPgmId(manufProcessExLine.get(0).getAddPgmId());
        mStandardMp.setUpdUserId(manufProcessExLine.get(0).getAddUserId());
        mStandardMp.setUpdUserNm(manufProcessExLine.get(0).getAddUserNm());
        CommonUtils.setCommonInfo(mStandardMp, request);
        mStandardMpService.insertSelective(mStandardMp);
        return ResultBean.success("弹框确定成功",mStandardMp.getId());
    }
    /**
     * 保存标准流程
     * @param request
     * @param manufProcessExLine
     * @return
     */
    @SystemLog("保存标准流程明细")
    @Transactional
    public ResultBean savemStandardMpLine(HttpServletRequest request,ManufProcessExLine manufProcessExLine) {
        MStandardMpLine mStandardMpLine = new MStandardMpLine();
        mStandardMpLine.setStandardMpId(manufProcessExLine.getStandardMpId());
        mStandardMpLine.setManufProcessId(manufProcessExLine.getId());
        mStandardMpLine.setProcessSort(manufProcessExLine.getProcessSort());
        mStandardMpLine.setCntrCd(manufProcessExLine.getCntrCd());
        mStandardMpLine.setAddEntKbn(manufProcessExLine.getAddEntKbn());
        mStandardMpLine.setAddPgmId(manufProcessExLine.getAddPgmId());
        mStandardMpLine.setAddUserId(manufProcessExLine.getAddUserId());
        mStandardMpLine.setAddUserNm(manufProcessExLine.getAddUserNm());
        mStandardMpLine.setUpdEntKbn(manufProcessExLine.getAddEntKbn());
        mStandardMpLine.setUpdPgmId(manufProcessExLine.getAddPgmId());
        mStandardMpLine.setUpdUserId(manufProcessExLine.getAddUserId());
        mStandardMpLine.setUpdUserNm(manufProcessExLine.getAddUserNm());
        CommonUtils.setCommonInfo(mStandardMpLine, request);
        mStandardMpLineService.insertSelective(mStandardMpLine);

        return ResultBean.success("弹框确定成功",mStandardMpLine);
    }
    /**
     * 弹框确定
     * @param request
     * @param standardMpNm
     * @param manufProcessExLine
     * @return
     */
    @SystemLog("标准流程保存")
    @Transactional
    public Map<String, Object> saveStandardMpAndLine(HttpServletRequest request,String standardMpNm,  List<ManufProcessExLine> manufProcessExLine) {
//        if(manufProcessExLine == null || manufProcessExLine.size() == 0){
//            return ResultBean.failure("无数据！");
//        }
        Map<String, Object> maptemp = new HashMap<String, Object>();
        List<MStandardMpLine> lstemp = new ArrayList<>();
        //新增
        if (com.sjasoft.framework.util.StringUtils.isNullOrEmpty(manufProcessExLine.get(0).getStandardMpId())) {
//            //判断是否存在
//            Example.Criteria criteriaNm = mStandardMpService.createCriteria();
//            criteriaNm.andEqualTo("delFlg",'0');
//            criteriaNm.andEqualTo("standardMpNm",standardMpNm);
//            List<MStandardMp> mStandardMpList = mStandardMpService.select(criteriaNm);
//            if(mStandardMpList.size() > 0 )
//            {
//                return ResultBean.failure("标准生产流程名已存在！");
//            }
            //保存标准流程
            MStandardMp mStandardMp = new MStandardMp();
            mStandardMp.setStandardMpNm(standardMpNm);
            mStandardMp.setRemark(manufProcessExLine.get(0).getRemark());
            mStandardMp.setCntrCd(manufProcessExLine.get(0).getCntrCd());
            mStandardMp.setAddEntKbn(manufProcessExLine.get(0).getAddEntKbn());
            mStandardMp.setAddPgmId(manufProcessExLine.get(0).getAddPgmId());
            mStandardMp.setAddUserId(manufProcessExLine.get(0).getAddUserId());
            mStandardMp.setAddUserNm(manufProcessExLine.get(0).getAddUserNm());
            mStandardMp.setUpdEntKbn(manufProcessExLine.get(0).getAddEntKbn());
            mStandardMp.setUpdPgmId(manufProcessExLine.get(0).getAddPgmId());
            mStandardMp.setUpdUserId(manufProcessExLine.get(0).getAddUserId());
            mStandardMp.setUpdUserNm(manufProcessExLine.get(0).getAddUserNm());
            CommonUtils.setCommonInfo(mStandardMp, request);
            mStandardMpService.insertSelective(mStandardMp);
            //同步标准流程信息
            maptemp.put("mStandardMp", mStandardMp);
//            ResultBean resultBean = savemStandardMp(request,standardMpNm,manufProcessExLine);
            for(int i = 0;i<manufProcessExLine.size();i++) {
//                MManufProcess mManufProcess = new MManufProcess();
//                mManufProcess.setCntrCd(manufProcessExLine.get(i).getCntrCd());
//                mManufProcess.setManufProcess(manufProcessExLine.get(i).getManufProcess());
//                mManufProcess.setManufProcessCls(manufProcessExLine.get(i).getManufProcessCls());
//                mManufProcess.setAddEntKbn(manufProcessExLine.get(i).getAddEntKbn());
//                mManufProcess.setAddPgmId(manufProcessExLine.get(i).getAddPgmId());
//                mManufProcess.setAddUserId(manufProcessExLine.get(i).getAddUserId());
//                mManufProcess.setAddUserNm(manufProcessExLine.get(i).getAddUserNm());
//                mManufProcess.setUpdEntKbn(manufProcessExLine.get(i).getAddEntKbn());
//                mManufProcess.setUpdPgmId(manufProcessExLine.get(i).getAddPgmId());
//                mManufProcess.setUpdUserId(manufProcessExLine.get(i).getAddUserId());
//                mManufProcess.setUpdUserNm(manufProcessExLine.get(i).getAddUserNm());
//                CommonUtils.setCommonInfo(mManufProcess, request);
//                mManufProcessService.insertSelective(mManufProcess);
//                manufProcessExLine.get(i).setStandardMpId(mStandardMp.getId());
                MStandardMpLine mStandardMpLine = new MStandardMpLine();
                mStandardMpLine.setStandardMpId(mStandardMp.getId());
                mStandardMpLine.setManufProcessId(manufProcessExLine.get(i).getId());
                mStandardMpLine.setProcessSort(manufProcessExLine.get(i).getProcessSort());
                mStandardMpLine.setCntrCd(manufProcessExLine.get(i).getCntrCd());
                mStandardMpLine.setAddEntKbn(manufProcessExLine.get(i).getAddEntKbn());
                mStandardMpLine.setAddPgmId(manufProcessExLine.get(i).getAddPgmId());
                mStandardMpLine.setAddUserId(manufProcessExLine.get(i).getAddUserId());
                mStandardMpLine.setAddUserNm(manufProcessExLine.get(i).getAddUserNm());
                mStandardMpLine.setUpdEntKbn(manufProcessExLine.get(i).getAddEntKbn());
                mStandardMpLine.setUpdPgmId(manufProcessExLine.get(i).getAddPgmId());
                mStandardMpLine.setUpdUserId(manufProcessExLine.get(i).getAddUserId());
                mStandardMpLine.setUpdUserNm(manufProcessExLine.get(i).getAddUserNm());
                CommonUtils.setCommonInfo(mStandardMpLine, request);
                mStandardMpLineService.insertSelective(mStandardMpLine);
                //保存标准流程明细
//                ResultBean tempmMp = savemStandardMpLine(request,manufProcessExLine.get(i));
//                JSONObject objJson = JSONObject.fromObject(tempmMp.getData());
//                MStandardMpLine mStandardMpLine = (MStandardMpLine) JSONObject.toBean(objJson,MStandardMpLine.class);
                lstemp.add(mStandardMpLine);
            }
        } else{
            MStandardMp mStandardMpOld = mStandardMpService.selectByPrimaryKey(manufProcessExLine.get(0).getStandardMpId());
            Example.Criteria criteria = mStandardMpLineService.createCriteria();
            criteria.andEqualTo("delFlg",'0');
            criteria.andEqualTo("standardMpId", mStandardMpOld.getId());
            List<MStandardMpLine> mStandardMpLines = mStandardMpLineService.select(criteria);
//            if(mStandardMpLines.size() <= 0){
//                return ResultBean.failure("明细无数据！");
//            }
            for (MStandardMpLine mStandardMpLine :mStandardMpLines){
                CommonUtils.setCommonInfo(mStandardMpOld, request);
                mStandardMpLine.setDelFlg("1");
                mStandardMpLineService.updateByPrimaryKey(mStandardMpLine);
                lstemp.add(mStandardMpLine);
            }
            maptemp.put("mStandardMp", mStandardMpOld);
            if(mStandardMpOld.getStandardMpNm().equals(standardMpNm)){
                CommonUtils.setCommonInfo(mStandardMpOld, request);
                mStandardMpOld.setStandardMpNm(standardMpNm);
                mStandardMpOld.setRemark(manufProcessExLine.get(0).getRemark());
                mStandardMpService.updateByPrimaryKey(mStandardMpOld);
                //同步标准流程信息
                maptemp.put("mStandardMp", mStandardMpOld);
                for(int i = 0;i<manufProcessExLine.size();i++) {
                    //保存标准流程明细
                    MStandardMpLine mStandardMpLine = new MStandardMpLine();
                    mStandardMpLine.setStandardMpId(mStandardMpOld.getId());
                    mStandardMpLine.setManufProcessId(manufProcessExLine.get(i).getId());
                    mStandardMpLine.setProcessSort(manufProcessExLine.get(i).getProcessSort());
                    mStandardMpLine.setCntrCd(manufProcessExLine.get(i).getCntrCd());
                    mStandardMpLine.setAddEntKbn(manufProcessExLine.get(i).getAddEntKbn());
                    mStandardMpLine.setAddPgmId(manufProcessExLine.get(i).getAddPgmId());
                    mStandardMpLine.setAddUserId(manufProcessExLine.get(i).getAddUserId());
                    mStandardMpLine.setAddUserNm(manufProcessExLine.get(i).getAddUserNm());
                    mStandardMpLine.setUpdEntKbn(manufProcessExLine.get(i).getAddEntKbn());
                    mStandardMpLine.setUpdPgmId(manufProcessExLine.get(i).getAddPgmId());
                    mStandardMpLine.setUpdUserId(manufProcessExLine.get(i).getAddUserId());
                    mStandardMpLine.setUpdUserNm(manufProcessExLine.get(i).getAddUserNm());
                    CommonUtils.setCommonInfo(mStandardMpLine, request);
                    mStandardMpLineService.insertSelective(mStandardMpLine);
                    lstemp.add(mStandardMpLine);
                }
            }else {
                mStandardMpOld.setStandardMpNm(standardMpNm);
                mStandardMpOld.setRemark(manufProcessExLine.get(0).getRemark());
                CommonUtils.setCommonInfo(mStandardMpOld, request);
                mStandardMpService.updateByPrimaryKey(mStandardMpOld);
                for(int i = 0;i<manufProcessExLine.size();i++) {
                    //保存标准流程明细
//                    savemStandardMpLine(request,manufProcessExLine.get(i));
                    ResultBean tempmMp = savemStandardMpLine(request,manufProcessExLine.get(i));
                    String s = com.alibaba.fastjson.JSONObject.toJSONString(tempmMp.getData());
                    MStandardMpLine mStandardMpLine = com.alibaba.fastjson.JSONObject.parseObject(s,MStandardMpLine.class);
//                    JSONObject objJson = JSONObject.fromObject(tempmMp.getData());
//                    MStandardMpLine mStandardMpLine = (MStandardMpLine) JSONObject.toBean(objJson,MStandardMpLine.class);
                    lstemp.add(mStandardMpLine);
                }
            }
        }
        maptemp.put("mStandardMpLines", lstemp);
        return maptemp;
    }

}
