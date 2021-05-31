package com.soft.common.web.controller;

import com.alibaba.fastjson.JSONArray;
import com.sjasoft.framework.annotation.SystemLog;
import com.sjasoft.framework.bean.ResultBean;
import com.sjasoft.framework.util.StringUtils;
import com.soft.common.model.MModule;
import com.soft.common.model.MRole;
import com.soft.common.mybatis.extend.entity.Module;
import com.soft.common.service.ModuleService;
import com.soft.common.service.UserService;
import com.soft.common.web.Util.CommonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/api/module")
public class ModuleController {

    @Autowired
    private ModuleService moduleService;

    @Autowired
    private UserService userService;

    @SystemLog("创建模块")
    @PostMapping(value = "create")
    public ResultBean create(HttpServletRequest request, MModule sysModule) {
        try {
            MModule check = moduleService.getModuleByParent(sysModule.getParentId(), sysModule.getModuleCd());
            if (check != null) {
                return ResultBean.failure("模块编号已存在!");
            }
            if(moduleService.checkModuleText(sysModule)){
                return ResultBean.failure("模块名称已存在!");
            }

            // mod by zwd 20191114 start
//            MUser mUser = userService.getLoginUser();
//            if (mUser == null) {
//                return ResultBean.failure("未登录用户或者会话超时!");
//            }
            //mod by llh 2019026 begin
//            moduleService.createModule(request, sysModule, mUser);
            moduleService.createModule(request, sysModule);
            //mod by llh 2019026 end
            //mod by zwd 20191114 end
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("创建模块失败");
        }
        return ResultBean.success("创建模块成功", sysModule);
    }

    @SystemLog("修改模块")
    @PostMapping(value = "update")
    public ResultBean update(HttpServletRequest request, MModule sysModule) {
        try {
            if(StringUtils.isNullOrEmpty(sysModule.getParentId())){
                if(moduleService.checkMoNoEdit(sysModule)){
                    return ResultBean.failure("模块编号已存在!");
                }
                if(moduleService.checkMoTextEdit(sysModule)){
                    return ResultBean.failure("模块名称已存在!");
                }
            }
            if(moduleService.checkModuleNoEdit(sysModule)){
                return ResultBean.failure("模块编号已存在!");
            }
            if(moduleService.checkModuleTextEdit(sysModule)){
                return ResultBean.failure("模块名称已存在!");
            }
            // mod by zwd 20191114 start
//            MUser mUser = userService.getLoginUser();
//            if (mUser == null) {
//                return ResultBean.failure("未登录用户或者会话超时!");
//            }
            //mod by llh 2019026 begin
//           moduleService.updateModule(request, sysModule, mUser);
            moduleService.updateModule(request, sysModule);
            //mod by llh 2019026 end
            // mod by zwd 20191114 end

        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("修改模块失败");
        }
        return ResultBean.success("修改模块成功", sysModule);
    }

    @SystemLog("删除模块")
    @PostMapping(value = "delete")
// mod by zwd20191231 start
    public ResultBean delete(HttpServletRequest request, MModule module) {
//        MUser mUser = userService.getLoginUser();
// mod by zwd20191231 end
//        if (mUser == null) {
//            return ResultBean.failure("未登录用户或者会话超时!");
//        }
        // del by zwd 20191114 end
        try {
            moduleService.deleteModule(module, request);
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("删除模块失败");
        }
        return ResultBean.success("删除模块成功");
    }

    @SystemLog("获取模块树")
    @GetMapping(value = "listTree")
    public ResultBean listTree(String parentCode, Module module) {
        List<Module> list = new ArrayList<>();
        try {
            list = moduleService.listModuleTree(module);
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("获取模块树失败", list);
        }
        return ResultBean.success("获取模块树成功", list);
    }

    /***
     * 返回全部模块及其子模块、角色编号、关系编号
     * @param roleCode
     * @return
     */
    @SystemLog("获取角色模块")
    @GetMapping(value = "listRoleModule")
    public ResultBean listRoleModule(String roleCode, String cntrCd) {
        List<Module> list = new ArrayList<>();
        try {
            list = moduleService.listRoleModule(roleCode, cntrCd);
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("获取角色模块失败", list);
        }
        return ResultBean.success("获取角色模块成功", list);
    }

    @SystemLog("修改角色模块")
    @PostMapping(value = "updateRoleModule")
    public ResultBean updateRoleModule(HttpServletRequest request,  MRole roleForm) {
        try {
            String jsonModuleIds = request.getParameter("moduleIds");
            List<String> moduleIds = JSONArray.parseArray(jsonModuleIds).toJavaList(String.class);
            //mod by llh 2019026 begin
            //           moduleService.updateRoleModule(roleCode, moduleIds, request);
            moduleService.updateRoleModule(roleForm, moduleIds, request,CommonUtils.getIp(request));
            //mod by llh 2019026 end
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("修改角色模块失败");
        }
        return ResultBean.success("修改角色模块成功");
    }
}
