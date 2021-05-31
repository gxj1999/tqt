package com.soft.common.web.controller;

import com.sjasoft.framework.bean.ResultBean;
import com.soft.common.mapper.MUserMapper;
import com.soft.common.model.MUser;
import com.soft.common.mybatis.extend.dao.MUserListDao;
import com.soft.common.mybatis.extend.entity.User;
import com.soft.common.web.service.MUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @author xhs
 * @date 2019/10/10 14:05
 * @since jdk 1.8
 */

@RestController
@RequestMapping(value = "/api/UserTest")
@Slf4j
public class UserTestContoller {

    @GetMapping(value = "/common")
    public String common() {
        return "测试122";
    }

    @Resource
    private MUserMapper mUserMapper;

    // #zjl get 请求测试
    @GetMapping("/getUserInfo/{userId}")
    public ResultBean getUserInfo(@PathVariable("userId") String userId){
        return ResultBean.success("获取成功","用户信息：" + mUserMapper.selectByPrimaryKey(userId));
    }
    // #zjl post json请求测试
    @PostMapping("/printTestUserInfo")
    public ResultBean getUserInfo(HttpServletRequest request,@RequestBody Map<String,MUser> map){
        return ResultBean.success("用户信息：",map);
    }
}
