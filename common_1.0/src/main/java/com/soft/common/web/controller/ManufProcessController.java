package com.soft.common.web.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import com.sjasoft.framework.bean.ResultBean;
import com.soft.common.model.*;
import com.soft.common.mybatis.extend.entity.ManufProcessEx;
import com.soft.common.mybatis.extend.entity.ManufProcessExLine;
import com.soft.common.service.ManufProcessService;
import com.soft.common.web.Util.CommonUtils;
import com.soft.common.web.service.MManufProcessService;
import com.soft.common.web.service.MStandardMpLineService;
import com.soft.common.web.service.MStandardMpService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.mapper.entity.Example;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Api(tags = "生产流程接口")
@RestController
@RequestMapping(value = "/api/manufProcess")
public class ManufProcessController {
    @Autowired
    private ManufProcessService manufProcessService;
    @Autowired
    private MManufProcessService mManufProcessService;
    @Autowired
    private ExtraServiceController extraServiceController;
    @Autowired
    private MStandardMpService mStandardMpService;
    @Autowired
    private MStandardMpLineService mStandardMpLineService;
    /**
     * 获取生产流程一览
     * @param page 页数
     * @param limit 条数
     * @param manufProcessNm 生产流程名称
     * @param manufProcessCls 生产流程状态
     * @return
     */
    @ApiOperation("获取生产流程一览")
    @GetMapping(value = "getManufProcessList")
    public ResultBean getManufProcessList( Integer page, Integer limit,String manufProcessNm, String manufProcessCls,String orgId) {
        List<ManufProcessEx> tmanufOrdExList = new ArrayList<>();
        try {
            tmanufOrdExList = manufProcessService.getManufProcessList( page,limit,manufProcessNm, manufProcessCls,orgId);
            return ResultBean.success("获取生产流程一览成功！",new PageInfo<>(tmanufOrdExList));
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("获取生产流程一览失败！");
        }
    }
    /**
     * 获取标准流程一览
     * @param page 页数
     * @param limit 条数
     * @param standardMpNm 标准流程名称
     * @return
     */
    @ApiOperation("获取标准流程一览")
    @GetMapping(value = "getStandardMpList")
    public ResultBean getStandardMpList( Integer page, Integer limit,String standardMpNm) {
        List<MStandardMp> mStandardMpList = new ArrayList<>();
        try {
            mStandardMpList = manufProcessService.getStandardMpList( page,limit,standardMpNm);
            return ResultBean.success("获取标准流程一览成功！",new PageInfo<>(mStandardMpList));
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("获取标准流程一览失败！");
        }
    }
    /**
     * 删除标准流程信息
     * @param mStandardMp
     * @return
     */
    @ApiOperation("删除标准流程信息")
    @PostMapping(value = "deleteStandardMp")
    public ResultBean deleteStandardMp(HttpServletRequest request, MStandardMp mStandardMp) {
        try {
            Example.Criteria criteria = mStandardMpService.createCriteria();
            criteria.andEqualTo("id", mStandardMp.getId());
            List<MStandardMp> mStandardMpList = mStandardMpService.select(criteria);
            if (!mStandardMp.getUpdCnt().equals(mStandardMpList.get(0).getUpdCnt())) {
                return ResultBean.failure("数据已被修改,请重试！");
            }
            MStandardMp tempMStandardMp = CommonUtils.clone(mStandardMp);
            manufProcessService.deleteStandardMp(request, mStandardMp);
            // 同步其他服务数据
            extraServiceController.deleteStandardMp(tempMStandardMp);
            return ResultBean.success("删除标准流程成功！");
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("删除标准流程失败！");
        }
    }
    /**
     * 删除生产流程信息
     * @param mManufProcess
     * @return
     */
    @ApiOperation("删除生产流程信息")
    @PostMapping(value = "deleteManufProcess")
    public ResultBean deleteManufProcess(HttpServletRequest request, MManufProcess mManufProcess) {
        try {
            Example.Criteria criteria = mManufProcessService.createCriteria();
            criteria.andEqualTo("id", mManufProcess.getId());
            List<MManufProcess> mManufProcessList = mManufProcessService.select(criteria);
            if (!mManufProcess.getUpdCnt().equals(mManufProcessList.get(0).getUpdCnt())) {
                return ResultBean.failure("数据已被修改,请重试！");
            }
            MManufProcess tempmManufProcess = CommonUtils.clone(mManufProcess);
            manufProcessService.deleteManufProcess(request, mManufProcess);
            // 同步其他服务数据
            extraServiceController.deleteManufProcess(tempmManufProcess);
            return ResultBean.success("删除生产流程成功！");
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("删除生产流程失败！");
        }
    }
    /**
     * 编辑生产流程
     *
     * @param request
     * @param mManufProcess
     * @return
     */
    @ApiOperation("编辑生产流程")
    @PostMapping(value = "updateManuf")
    public ResultBean updateManuf(HttpServletRequest request, MManufProcess mManufProcess) {
        try {
            ResultBean tempmManufProcess = manufProcessService.updateManuf(request, mManufProcess);
            if(!tempmManufProcess.isSuccess()){
                return ResultBean.failure(tempmManufProcess.getMessage());
            }
            String s = JSONObject.toJSONString(tempmManufProcess.getData());
            MManufProcess manufProcess = JSONObject.parseObject(s,MManufProcess.class);
            //新增
            if (mManufProcess.getUpdCnt() == 0) {
                // 同步其他服务数据
                extraServiceController.insertManuf(manufProcess);
            }else {
                // 同步其他服务数据
                extraServiceController.updateManuf(manufProcess);
            }
            return ResultBean.success("编辑生产流程成功！");
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("编辑生产流程失败！");
        }
    }
    /**
     * 弹框获取生产流程一览
     * @return
     */
    @ApiOperation("弹框获取生产流程一览")
    @GetMapping(value = "selectManufProcess")
    public ResultBean selectManufProcess() {
        List<ManufProcessEx> tmanufOrdExList = new ArrayList<>();
        try {
            tmanufOrdExList = manufProcessService.selectManufProcessList();
            return ResultBean.success("弹框获取生产流程一览成功！",tmanufOrdExList);
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("弹框获取生产流程一览失败！");
        }
    }
    /**
     * 弹框获取标准流程下拉框
     * @return
     */
    @ApiOperation("弹框获取标准流程下拉框")
    @GetMapping(value = "selectMstandardMp")
    public ResultBean selectMstandardMp() {
        List<MStandardMp> mStandardMps = new ArrayList<>();
        try {
            mStandardMps = manufProcessService.selectMstandardMp();
            return ResultBean.success("弹框获取标准流程下拉框成功！",mStandardMps);
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("弹框获取标准流程下拉框失败！");
        }
    }
    /**
     * 弹框获取本次生产流程
     * @return
     */
    @ApiOperation("弹框获取本次生产流程")
    @GetMapping(value = "getThisManufProcess")
    public ResultBean getThisManufProcess(String standardMpId) {
        List<ManufProcessExLine> mStandardMps = new ArrayList<>();
        try {
            mStandardMps = manufProcessService.getThisManufProcess(standardMpId);
            return ResultBean.success("弹框获取本次生产流程成功！",mStandardMps);
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("弹框获取本次生产流程失败！");
        }
    }
    @ApiOperation("弹框保存并确定")
    @PostMapping(value = "saveManufProcess")
    public ResultBean saveManufProcess(HttpServletRequest request,String standardMpNm,String manufProcessExLine) {
        try {
            List<ManufProcessExLine> manufProcessList = (List<ManufProcessExLine>)  JSONArray.parseArray(manufProcessExLine, ManufProcessExLine.class);
            if(manufProcessExLine == null){
                return ResultBean.failure("无数据！");
            }
            //判断是否存在
            Example.Criteria criteriaNm = mStandardMpService.createCriteria();
            criteriaNm.andEqualTo("delFlg",'0');
            criteriaNm.andEqualTo("standardMpNm",standardMpNm);
            List<MStandardMp> mStandardMpList = mStandardMpService.select(criteriaNm);
            if(mStandardMpList.size() > 0 )
            {
                return ResultBean.failure("标准生产流程名已存在！");
            }
            Map<String, Object> tempMap = manufProcessService.saveManufProcess(request,standardMpNm,manufProcessList);
            // 同步其他服务数据
            extraServiceController.saveManufProcess(tempMap);
            return  ResultBean.success("弹框保存并确定成功！");
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("弹框保存并确定失败！");
        }
    }
    @ApiOperation("标准流程保存")
    @PostMapping(value = "saveStandardMp")
    public ResultBean saveStandardMp(HttpServletRequest request,String openFlg,String standardMpNm,String manufProcessExLine) {
        try {
            List<ManufProcessExLine> manufProcessList = (List<ManufProcessExLine>)  JSONArray.parseArray(manufProcessExLine, ManufProcessExLine.class);
            if(manufProcessList == null || manufProcessList.size() == 0){
                return ResultBean.failure("无数据！");
            }
            //新增
            if (com.sjasoft.framework.util.StringUtils.isNullOrEmpty(manufProcessList.get(0).getStandardMpId())) {
                //判断是否存在
                Example.Criteria criteriaNm = mStandardMpService.createCriteria();
                criteriaNm.andEqualTo("delFlg",'0');
                criteriaNm.andEqualTo("standardMpNm",standardMpNm);
                List<MStandardMp> mStandardMpList = mStandardMpService.select(criteriaNm);
                if(mStandardMpList.size() > 0 )
                {
                    return ResultBean.failure("标准生产流程名已存在！");
                }
            } else{
                MStandardMp mStandardMpOld = mStandardMpService.selectByPrimaryKey(manufProcessList.get(0).getStandardMpId());
                Example.Criteria criteria = mStandardMpLineService.createCriteria();
                criteria.andEqualTo("delFlg",'0');
                criteria.andEqualTo("standardMpId", mStandardMpOld.getId());
                List<MStandardMpLine> mStandardMpLines = mStandardMpLineService.select(criteria);
                if(mStandardMpLines.size() <= 0){
                    return ResultBean.failure("明细无数据！");
                }
                if(!mStandardMpOld.getStandardMpNm().equals(standardMpNm)){
                    //判断是否存在
                    Example.Criteria criteriaNm = mStandardMpService.createCriteria();
                    criteriaNm.andEqualTo("delFlg",'0');
                    criteriaNm.andEqualTo("standardMpNm",standardMpNm);
                    List<MStandardMp> mStandardMpList = mStandardMpService.select(criteriaNm);
                    if(mStandardMpList.size() > 0 )
                    {
                        return ResultBean.failure("数据已存在！");
                    }
                }
            }
            Map<String, Object> tempMap = manufProcessService.saveStandardMpAndLine(request,standardMpNm,manufProcessList);
            if(openFlg.equals("0")){
                // 同步其他服务数据
                extraServiceController.inStandardMpAndLine(tempMap);
            }else {
                // 同步其他服务数据
                extraServiceController.saveStandardMpAndLine(tempMap);
            }
            return ResultBean.success("标准流程保存成功！");
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("标准流程保存失败！");
        }
    }
}
