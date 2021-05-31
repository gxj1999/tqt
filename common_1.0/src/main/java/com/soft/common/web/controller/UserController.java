package com.soft.common.web.controller;

import com.alibaba.fastjson.JSONArray;
import com.github.pagehelper.PageInfo;
import com.sjasoft.framework.annotation.SystemLog;
import com.sjasoft.framework.bean.ResultBean;
import com.soft.common.mybatis.extend.entity.MUserEx;
import com.soft.common.mybatis.extend.entity.UserBean;
import com.soft.common.model.MLogin;
import com.soft.common.model.MUser;
import com.soft.common.model.MUserRole;
import com.soft.common.web.service.MRoleModuleService;
import com.soft.common.web.service.MUserRoleService;
import com.soft.common.service.CommonService;
import com.soft.common.service.RoleService;
import com.soft.common.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/api/user")
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    RoleService roleService;

    @Autowired
    MUserRoleService userRoleService;

    @Autowired
    CommonService commonService;

    @Autowired
    MRoleModuleService mRoleModuleService;

    @Autowired
    private ExtraServiceController extraServiceController;

    @SystemLog("获取用户一览")
    @GetMapping(value = "list")
    public ResultBean list(HttpServletRequest request,
                           @RequestParam(value = "page",  defaultValue = "0") Integer page,
                           @RequestParam(value = "limit", defaultValue = "0") Integer limit,
                           MUser mUser, String loginId,String roleNm,String orgNm) {
        List<MUserEx> mUserList = new ArrayList<>();
        try {
            mUserList = commonService.getMUser(page,limit,mUser.getUserId(), mUser.getCntrCd(),mUser.getWorkId(),loginId,mUser.getUserNm(), mUser.getUserNmEn(),roleNm,orgNm);
            return ResultBean.success("获取用户信息成功", new PageInfo<>(mUserList));
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("获取用户信息失败");
        }
    }

    @SystemLog("创建用户")
    @PostMapping(value = "create")
    public ResultBean create(HttpServletRequest request, UserBean userBean, String roleStr) {
        try {
            List<MUserRole> mUserRoles = JSONArray.parseArray(roleStr).toJavaList(MUserRole.class);
//            MUser check = userService.getUserByName(userBean.getUserNm());
//
//            if (check != null) {
//                return ResultBean.failure("用户名已存在!");
//            }
//            MLogin check2 = userService.getUserByLoginId(userBean.getCntrCd(), userBean.getUserNm());
            MLogin check2 = userService.getUserByLoginId(userBean.getCntrCd(), userBean.getLoginId());
            if (check2 != null) {
                return ResultBean.failure("登陆账号已存在!");
            }
            UserBean user = userService.getLoginUser();
            userService.createUser(userBean, request);
            // 同步服务数据
            extraServiceController.insertMUser((MUser)userBean);

            roleService.createUserRoles(request, userBean, mUserRoles);
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("创建用户失败");
        }
        return ResultBean.success("创建用户成功");
    }

    @SystemLog("修改用户")
    @PostMapping(value = "update")
    public ResultBean update(HttpServletRequest request, UserBean userBean, String roleStr) {
        try {
            List<MUserRole> mUserRoles = JSONArray.parseArray(roleStr).toJavaList(MUserRole.class);
//            MUser check = userService.getUserByNameNotSelf(userBean.getUserNm(), userBean.getId());
            MLogin check = userService.getUserByLoginId(userBean.getCntrCd(), userBean.getLoginId());
            if (check != null && !check.getUserId().equals(userBean.getUserId())) {
                return ResultBean.failure("用户名已存在!");
            }

            userService.updateUser(request, userBean);
            // 同步服务数据
            extraServiceController.updateMUser((MUser)userBean);
            roleService.updateUserRoles(request, userBean, mUserRoles);
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("修改用户失败");
        }
        return ResultBean.success("修改用户成功");
    }
//    @SystemLog("修改用户启用状态")
//    @PostMapping(value = "isEnabled")
//    public ResultBean isEnabled(String userId,String isEnabled) {
//        try {
//            MUser user = userService.selectByPrimaryKey(userId);
//            user.setIsEnabled(isEnabled);
//            userService.updateUser(user);
//        } catch (Exception ex) {
//            ex.printStackTrace();
//            return ResultBean.failure("修改用户启用状态失败");
//        }
//        return ResultBean.success("修改用户启用状态成功");
//    }

    @SystemLog("删除用户")
    @PostMapping(value = "delete")
    public ResultBean delete(HttpServletRequest request, UserBean mUser) {
        try {
            userRoleService.deleteByField("userId",mUser.getUserId());

            UserBean user = userService.getLoginUser();
            userService.deleteUser(request, mUser);
            // 同步服务数据
            extraServiceController.deleteMUser((MUser)mUser);
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("删除用户失败");
        }
        return ResultBean.success("删除用户成功");
    }

    // add by xhs 2020-05-09 start
    @SystemLog("重置密码")
    @PostMapping(value = "resetPwd")
    public ResultBean resetPwd(HttpServletRequest request, UserBean userBean){
        ResultBean resultBean = userService.resetPwd(request,userBean);
        return resultBean;
    }
    // add by xhs 2020-05-09 end

    @SystemLog("修改密码")
    @PostMapping(value = "changePwd")
    public ResultBean changePwd(HttpServletRequest request, UserBean userBean){
        try{
//            return  userService.changePwd(request, userBean);
            return  userService.changeByPwd(request, userBean);
        }catch (Exception ex){
            ex.printStackTrace();
            return ResultBean.failure("修改失败！");
        }
    }


}
