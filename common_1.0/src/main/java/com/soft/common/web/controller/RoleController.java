package com.soft.common.web.controller;

import com.alibaba.fastjson.JSONArray;
import com.github.pagehelper.PageInfo;
import com.sjasoft.framework.annotation.SystemLog;
import com.sjasoft.framework.bean.ResultBean;
import com.soft.common.mybatis.extend.entity.*;
import com.soft.common.service.RoleService;
import com.soft.common.service.UserService;
import com.soft.common.web.service.MOrgService;
import com.soft.common.model.MRole;
import com.soft.common.model.MUserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value = "/api/role")
public class RoleController {
    @Autowired
    private RoleService roleService;
    @Autowired
    private MOrgService mOrgService;
    @Autowired
    private UserService userService;

    @SystemLog("获取角色列表")
    @GetMapping(value = "listRole")
    public ResultBean listRole(MRole role, Integer page, Integer limit){
        List<MRoleEx> roles = new ArrayList<MRoleEx>();
        try{
            roles = roleService.listRole(role, page,limit);
        }catch (Exception ex){
            ex.printStackTrace();
            return ResultBean.failure("获取角色一览失败");
        }
        return  ResultBean.success("获取成功",new PageInfo<>(roles));
    }

    @SystemLog("获取角色列表")
    @GetMapping(value = "listRoleTree")
    public ResultBean listRoleTree(String cntrCd, String orgId, String roleNm){
        List<OrgTree> roles = new ArrayList<OrgTree>();
        try{
            roles = roleService.listRoleTree(cntrCd, orgId, roleNm);
        }catch (Exception ex){
            ex.printStackTrace();
            return ResultBean.failure("获取角色一览失败");
        }
        return  ResultBean.success("获取成功", roles);
    }

    @SystemLog("创建角色")
    @PostMapping(value="createRole")
    public ResultBean createRole(HttpServletRequest request, MRole role){
        try{
            if (roleService.checkRoleName(role)) {
                return ResultBean.failure("角色名称已存在！");
            }
          return ResultBean.success("创建成功！", roleService.createRole(role,request));
        }catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("创建失败！");
        }
    }

    @SystemLog("修改角色")
    @PostMapping(value="updateRole")
    public ResultBean updateRole(HttpServletRequest request, MRole role){
        try{
            if (roleService.checkRoleNaEdit(role)) {
                return ResultBean.failure("角色名称已存在！");
            }
            roleService.updateRole(role,request);
            return  ResultBean.success("修改成功！");
        }catch (Exception ex){
            ex.printStackTrace();
            return ResultBean.failure("修改失败！");
        }
    }

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(true);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }
    @SystemLog("删除角色")
    @PostMapping("deleteRole")
    public ResultBean deleteRole(HttpServletRequest request, MRole role){
        try{
            UserBean userBean = userService.getLoginUser();
            return roleService.deleteRole(request, role);
//            return  ResultBean.success("删除成功！");
        }catch (Exception ex){
            ex.printStackTrace();
            return  ResultBean.failure("删除失败！");
        }
    }
    @SystemLog("获取角色用户")
    @GetMapping(value="listUser")
    public ResultBean listUser(
            @RequestParam(value = "page", defaultValue = "0") Integer page,
            @RequestParam(value = "limit", defaultValue = "0") Integer limit,
            String roleId){
        try{
            return ResultBean.success("获取成功！",new PageInfo<>(roleService.listUser(page, limit,roleId)));
        } catch (Exception ex){
            ex.printStackTrace();
            return ResultBean.failure("获取失败！");
        }
    }

    @SystemLog("创建角色用户")
    @PostMapping(value="createUserRole")
    public ResultBean createUserRole(HttpServletRequest request, UserBean mUser, String userStr){
        try{
            List<MUserRole> loginUsers = JSONArray.parseArray(userStr).toJavaList(MUserRole.class);
            return roleService.updateUserRoles(request, mUser, loginUsers);
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("创建失败！");
        }
    }

    @SystemLog("获取用户角色")
    @GetMapping(value = "getRoles")
    public List<Role> getRoles(String userId) {
        try {
            return roleService.getRole(userId);
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    @SystemLog("获取用户角色")
    @GetMapping(value = "getUserRoles")
    public ResultBean getUserRoles(String userId,String cntrCd) {
       try {
           // add by xhs 2020-09-11 start
           if(cntrCd.isEmpty()){
               return ResultBean.failure("中心编号不能为空！");
           }
           // add by xhs 2020-09-11 end
            return ResultBean.success("获取成功！",new PageInfo<>(roleService.selectMUserRoleList(userId,cntrCd)));
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("获取失败！");
        }
    }

    @SystemLog("删除用户角色")
    @PostMapping(value = "deleteRoleUser")
    public ResultBean deleteRoleUser(String userId, String roleId){
        try {
            roleService.deleteUserRole(userId,roleId);
            return ResultBean.success("删除成功！");
        }catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("删除失败！");
        }
    }
}
