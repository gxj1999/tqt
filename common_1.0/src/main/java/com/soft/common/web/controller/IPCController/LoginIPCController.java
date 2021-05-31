package com.soft.common.web.controller.IPCController;

import com.sjasoft.framework.annotation.SystemLog;
import com.sjasoft.framework.bean.ResultBean;
import com.soft.common.model.MUser;
import com.soft.common.mybatis.extend.entity.UserBean;
import com.soft.common.service.IPCService.UserIPCService;
import com.soft.common.service.RoleService;
import com.soft.common.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(value = "/api/ipc/login")
public class LoginIPCController {

    public static final String SESSION_KEY_LOGIN_ID = "login_user_id";

    @Autowired
    UserIPCService userIPCService;

    @Autowired
    RoleService roleService;

    @SystemLog("用户登录")
    @PostMapping(value = "login")
    public ResultBean login(HttpServletRequest request,String workId) {
        ResultBean result = userIPCService.login(request,workId);
        if (!result.isSuccess()) {
            return result;
        }
        return ResultBean.success("已登录用户", result.getData());
    }
    @SystemLog("判断当前用户是否为空")
    @PostMapping(value = "checkLogin")
    public ResultBean checkLogin(HttpServletRequest request) {
        MUser mUser = userIPCService.getLoginUser();
        if (mUser == null) {
            return ResultBean.failure("未登录用户");
        }

        return ResultBean.success("已登录用户", mUser);
    }

    @SystemLog("用户登出")
    @PostMapping(value = "logout")
    public ResultBean logout(HttpServletRequest request) {
        return userIPCService.logout(request);
    }

    @SystemLog("获取用户信息")
    @GetMapping(value = "userInfo")
    public ResultBean userInfo(HttpServletRequest request,String token) {
        UserBean userBean = userIPCService.getLoginUser();
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
        UserBean userBean = userIPCService.getLoginUser(id);
        if (userBean == null) {
            return ResultBean.failure("未登录用户");
        }
        userBean.setRoles(roleService.getRole(userBean.getUserId()));
        return ResultBean.success("已登录用户", userBean);
    }
    //add by xieshengjie 20191108 end
}
