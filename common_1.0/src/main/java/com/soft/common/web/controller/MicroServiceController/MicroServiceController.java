package com.soft.common.web.controller.MicroServiceController;

import com.sjasoft.framework.annotation.SystemLog;
import com.sjasoft.framework.bean.ResultBean;
import com.soft.common.mybatis.extend.entity.MProductEx;
import com.soft.common.mybatis.extend.entity.MWhCloud;
import com.soft.common.service.MicroService.MicroService;
import com.soft.common.web.Util.CommonUtils;
import com.soft.common.web.controller.CommonController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Api(tags = "其他微服务调用接口")
@RestController
@RequestMapping(value = "/api/exclusive")
public class MicroServiceController {
    @Autowired
    private MicroService microService;
    @Autowired
    private CommonController commonController;

    @ApiOperation("获取仓库微服务配置")
    @GetMapping(value = "getWhCloud")
    public ResultBean getWhCloud(String cntrCd) {
        List<MWhCloud> mWhCloudList = new ArrayList<>();
        try {
            mWhCloudList = microService.getMWhCloud(cntrCd);
            return ResultBean.success("获取仓库微服务配置成功", mWhCloudList);
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("获取仓库微服务配置失败");
        }
    }

    @ApiOperation("获取仓库微服务名称")
    @GetMapping(value = "getWhCloudById/{whId}")
    public ResultBean getWhCloudById(@RequestParam("whId") String whId){
        MWhCloud mWhCloud = null;
        try {
            mWhCloud = microService.getWhCloudById(whId);
            if(mWhCloud == null){
                return ResultBean.failure("当前仓库不存在！");
            }
            return ResultBean.success("获取仓库微服务名称成功", mWhCloud.getServiceNm());
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("获取仓库微服务名称配置失败");
        }
    }
    /**
     * 打开按钮
     * @return
     */
    @ApiOperation("打开按钮")
    @PostMapping(value = "openControl")
    public ResultBean openControl(HttpServletRequest request,String cntrCd,String entkbn,String pgmId,String userId,String userNm) {
        try {
            return microService.openControl(request,cntrCd,entkbn,pgmId,userId,userNm);
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("打开按钮更新失败");
        }
    }
    /**
     * 检查权限
     * @return
     */
    @ApiOperation("检查权限")
    @GetMapping(value = "checkAuthority")
    public ResultBean checkAuthority() {
        try {
            return microService.checkAuthority();
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("检查权限失败");
        }
    }

    /**
     * 打开按钮是否显示
     * @return
     */
    @ApiOperation("打开按钮是否显示")
    @GetMapping(value = "showOpenControl")
    public ResultBean showOpenControl() {
        try {
            return microService.showOpenControl();
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("打开按钮显示失败");
        }
    }

    /**
     * add by xhs 2020-10-19
     * @param request
     * @param mProductExList
     * @param mProdRelas
     * @return
     */
    @SystemLog("批量新增商品信息")
    @PostMapping(value = "/insertProd")
    public ResultBean insertProd(HttpServletRequest request, @RequestBody List<MProductEx> mProductExList, String mProdRelas){
        ResultBean resultBean = commonController.insetMproductList(request, mProductExList, mProdRelas);
        return resultBean;
    }
}
