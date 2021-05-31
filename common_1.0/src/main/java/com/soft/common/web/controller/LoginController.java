package com.soft.common.web.controller;

import com.sjasoft.framework.annotation.SystemLog;
import com.sjasoft.framework.bean.ResultBean;
import com.soft.common.service.RoleService;
import com.soft.common.service.UserService;
import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.soft.common.mybatis.extend.entity.UserBean;
import com.soft.common.model.MUser;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(value = "/api/login")
public class LoginController {

    public static final String SESSION_KEY_LOGIN_ID = "login_user_id";

    @Autowired
    UserService userService;

    @Autowired
    RoleService roleService;

    @SystemLog("用户登录")
    @PostMapping(value = "login")
    public ResultBean login(HttpServletRequest request,String username, String password) {
        ResultBean result = userService.login(request,username, password);
        if (!result.isSuccess()) {
            return result;
        }
        //upd by zwd 20191114 begin
//        UserBean userBean = (UserBean)result.getData();
//        userBean.setRoles(roleService.getRole(userBean.getUserId()));
//        return ResultBean.success("已登录用户", userBean);
        return ResultBean.success("已登录用户", result.getData());
        //upd by zwd 20191114 begin
    }
    @SystemLog("判断当前用户是否为空")
    @PostMapping(value = "checkLogin")
    public ResultBean checkLogin(HttpServletRequest request) {
        MUser mUser = userService.getLoginUser();
        if (mUser == null) {
            return ResultBean.failure("未登录用户");
        }

        return ResultBean.success("已登录用户", mUser);
    }

    @SystemLog("用户登出")
    @PostMapping(value = "logout")
    public ResultBean logout(HttpServletRequest request) {
        return userService.logout(request);
    }

    @SystemLog("获取用户信息")
    @GetMapping(value = "userInfo")
    public ResultBean userInfo(HttpServletRequest request,String token) {
        UserBean userBean = userService.getLoginUser();
        if (userBean == null) {
            return ResultBean.failure("未登录用户");
        }
        userBean.setRoles(roleService.getRole(userBean.getUserId()));
        return ResultBean.success("已登录用户", userBean);
    }

    //add by xieshengjie 20191108 begin
    @SystemLog("获取用户信息")
    @GetMapping(value = "userInfobyID")
    public ResultBean userInfobyID(HttpServletRequest request,String id) {
        UserBean userBean = userService.getLoginUser(id);
        if (userBean == null) {
            return ResultBean.failure("未登录用户");
        }
        userBean.setRoles(roleService.getRole(userBean.getUserId()));
        return ResultBean.success("已登录用户", userBean);
    }
    //add by xieshengjie 20191108 end
}
