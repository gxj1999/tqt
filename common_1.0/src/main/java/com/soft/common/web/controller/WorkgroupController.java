package com.soft.common.web.controller;

import com.sjasoft.framework.bean.ResultBean;
import com.soft.common.model.MWorkgroup;
import com.soft.common.service.WorkgroupService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: xhs
 * @Date: 2020/9/9 15:56
 * @Desc: 班组接口
 * @Veision: JDK 1.8
 */
@RestController
@Api(tags = "班组接口")
@RequestMapping("api/WorkgroupController")
public class WorkgroupController {

    @Autowired
    private WorkgroupService workgroupService;

    /**
     * 查询班组信息
     *
     * @param page
     * @param limit
     * @param cntrCd 中心编号
     * @param orgId  所属部门
     * @param teamId 班组编号
     * @param teamNm 班组名称
     * @return
     */
    @ApiOperation("查询班组信息")
    @GetMapping("/getWorkgroupList")
    public ResultBean getWorkgroupList(Integer page, Integer limit, String cntrCd, String orgId, String teamId, String teamNm) {
        ResultBean workgroupList = workgroupService.getWorkgroupList(page, limit, cntrCd, orgId, teamId, teamNm);
        return workgroupList;
    }

    /**
     * 新增班组信息
     *
     * @param mWorkgroup
     * @return
     */
    @ApiOperation("新增班组信息")
    @PostMapping("/insertWorkgroup")
    public ResultBean insertWorkgroup(HttpServletRequest request,MWorkgroup mWorkgroup) {
        ResultBean resultBean = workgroupService.insertWorkgroup(request, mWorkgroup);
        return resultBean;
    }

    /**
     * 修改班组信息
     *
     * @param mWorkgroup
     * @return
     */
    @ApiOperation("修改班组信息")
    @PostMapping("/updateWorkgroup")
    public ResultBean updateWorkgroup(HttpServletRequest request,MWorkgroup mWorkgroup) {
        ResultBean resultBean = workgroupService.updateWorkgroup(request, mWorkgroup);
        return resultBean;
    }

    /**
     * 新增班组信息
     *
     * @param mWorkgroup
     * @return
     */
    @ApiOperation("删除班组信息")
    @PostMapping("/delWorkgroup")
    public ResultBean delWorkgroup(HttpServletRequest request,MWorkgroup mWorkgroup) {
        ResultBean resultBean = workgroupService.delWorkgroup(request, mWorkgroup);
        return resultBean;
    }
}

