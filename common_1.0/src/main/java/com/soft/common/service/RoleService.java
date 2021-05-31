package com.soft.common.service;

import com.github.pagehelper.PageHelper;
import com.sjasoft.framework.bean.ResultBean;
import com.sjasoft.framework.service.AbstractService;
import com.sjasoft.framework.util.StringUtils;
import com.soft.common.mybatis.extend.dao.RoleDao;
import com.soft.common.mybatis.extend.entity.*;
import com.soft.common.mapper.MUserRoleMapper;
import com.soft.common.mapper.MRoleMapper;
import com.soft.common.model.MRole;
import com.soft.common.model.MUserRole;
import com.soft.common.web.service.MRoleModuleService;
import com.soft.common.web.service.MUserRoleService;
import com.soft.common.web.Util.*;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

@Service
public class RoleService extends AbstractService<MRole> {

    @Resource
    private MRoleModuleService mRoleModuleService;

    @Resource
    private MUserRoleService mUserRoleService;

    @Resource
    private UserService userService;

    @Resource
    private RoleDao roleDao;

    @Resource
    private MRoleMapper mRoleDao;

    @Resource
    private MUserRoleMapper mUserRoleDao;

    /**
     * 获取角色列表
     * @param page
     * @param limit
     * @return
     */
    public List<MRoleEx> listRole(MRole role, Integer page, Integer limit){
        PageHelper.startPage(page, limit);
        return roleDao.selectMRoleList(role.getCntrCd(),role.getOrgId(), role.getRoleNm());
    }

    /**
     * 获取角色用户列表
     * @param page
     * @param limit
     * @return
     */
    public List<MUserRole> listUser(Integer page, Integer limit, String roleId) {
        PageHelper.startPage(page, limit);
        return roleDao.selectRoleUser(roleId);
    }

    /**
     * 创建用户关联权限(每用户)
     */
    public ResultBean updateUserRoles(HttpServletRequest request, UserBean mUser, List<MUserRole> roles) {
        Example example = new Example(MUserRole.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("userId", mUser.getUserId());
        criteria.andEqualTo("cntrCd", mUser.getCntrCd());

        for (MUserRole mUserRole : roles){
            mUserRole.setCntrCd(mUser.getCntrCd());
            mUserRole.setUserId(mUser.getUserId());
            //add by llh 2019026 begin
            mUserRole.setAddTnmtId(CommonUtils.getIp(request));
            mUserRole.setUpdTnmtId(CommonUtils.getIp(request));
            mUserRole.setUpdDt(new Date());
            mUserRole.setAddDt(new Date());
            //add by llh 2019026 end
            boolean hasRole = false;
            for (MUserRole mUserRoleDb : mUserRoleDao.selectByExample(example)) {
                if (mUserRoleDb.getId().equals(mUserRole.getId()) ) {
                    mUserRoleDb.setRoleId(mUserRole.getRoleId());
                    mUserRoleDb.setDefCpyFlg(mUserRole.getDefCpyFlg());
//                    mUserRoleDb.setDefOrgType(mUserRole.getDefOrgType());
//                    mUserRoleDb.setUpdCnt(mUserRoleDb.getUpdCnt() + 1);
//                    mUserRoleDb.setUpdDt(new Date());
                    mUserRoleDb.setUpdEntKbn(mUser.getUpdEntKbn());
                    mUserRoleDb.setDelFlg(mUserRole.getDelFlg());
                    //add by llh 2019026 begin
//                    mUserRoleDb.setAddTnmtId(getIp(request));
//                    mUserRoleDb.setUpdTnmtId(getIp(request));
//                    mUserRoleDb.setUpdDt(new Date());
//                    mUserRoleDb.setAddDt(new Date());
                    //add by llh 2019026 end
                    CommonUtils.setCommonInfo(mUserRoleDb, request);
                    mUserRoleDb.setUpdUserId(mUser.getUserId());
                    mUserRoleDb.setUpdUserNm(mUser.getUserNm());
                    mUserRoleDb.setUpdPgmId(mUser.getUpdPgmId());

                    // add by xhs 2020-09-11 start
                    mUserRoleDb.setChar1(mUserRole.getChar1());
                    // add by xhs 2020-09-11 start
                    mUserRoleService.updateByPrimaryKey(mUserRoleDb);
                    hasRole = true;
                    break;
                }

            }
            if (!hasRole) {
//                MUserRole modelNew = new MUserRole();
//                modelNew.setCntrCd(mUser.getCntrCd());
//                modelNew.setUserId(mUser.getUserId());
//                modelNew.setRoleId(mUserRole.getRoleId());
////                modelNew.setDefOrgType(mUserRole.getDefOrgType());
//                modelNew.setDefCpyFlg(mUserRole.getDefCpyFlg());
//                modelNew.setNewFlg("0");
//                modelNew.setDisableFlg("0");
//                modelNew.setUpdCnt(1);
//                modelNew.setAddDt(new Date());
//                modelNew.setUpdDt(new Date());
//                modelNew.setAddEntKbn(mUser.getAddEntKbn());
//                modelNew.setUpdEntKbn(mUser.getUpdEntKbn());
//                modelNew.setAddUserId(mUser.getAddUserId());
//                modelNew.setAddUserNm(mUser.getAddUserNm());
//                modelNew.setUpdUserId(mUser.getUpdUserId());
//                modelNew.setUpdUserNm(mUser.getUpdUserNm());
//                //add by llh 2019026 begin
//                modelNew.setAddTnmtId(CommonUtils.getIp(request));
//                modelNew.setUpdTnmtId(CommonUtils.getIp(request));
//                modelNew.setUpdDt(new Date());
//                modelNew.setAddDt(new Date());
//                //add by llh 2019026 end
//                modelNew.setAddPgmId(mUser.getUpdPgmId());
//                modelNew.setUpdPgmId(mUser.getAddPgmId());
                mUserRole.setCntrCd(mUser.getCntrCd());
                mUserRole.setUserId(mUser.getUserId());
                mUserRole.setNewFlg("1");
                mUserRole.setDisableFlg("0");
                CommonUtils.setCommonInfo(mUserRole,request);
                mUserRoleService.insertSelective(mUserRole);
            }
        }
        return ResultBean.success("添加成功！");
    }

    /**
     * 创建用户关联权限(每用户)
     */
    public ResultBean createUserRoles(HttpServletRequest request, UserBean mUser, List<MUserRole> roles) {
        Example example = new Example(MUserRole.class);
//        Example.Criteria criteria = example.createCriteria();
//        criteria.andEqualTo("userId", mUser.getUserId());
//        criteria.andEqualTo("cntrCd",mUser.getCntrCd());
//        List<MUserRole> userRoleList = mUserRoleDao.selectByExample(example);

        for (MUserRole mUserRole : roles){
            MUserRole userRole = new MUserRole();
            userRole.setUserId(mUser.getUserId());
            userRole.setCntrCd(mUser.getCntrCd());
            userRole.setRoleId(mUserRole.getRoleId());
            userRole.setDefCpyFlg(mUserRole.getDefCpyFlg());
            // add by xhs 2020-09-11 start
            // 班组编号
            userRole.setChar1(mUserRole.getChar1());
            // add by xhs 2020-09-11 start
            userRole.setNewFlg("0");
            userRole.setDisableFlg("0");
            userRole.setUpdCnt(1);
            userRole.setAddDt(new Date());
            userRole.setUpdDt(new Date());
            userRole.setAddTnmtId(CommonUtils.getIp(request));
            mUserRoleService.insertSelective(userRole);
        }
        return ResultBean.success("添加成功！");
    }

    /**
     * 创建用户角色
     */
//    public ResultBean createUserRole(String roleId , List<MUserRole> loginUsers){
//        //判断该角色是否有该用户
//        for(MUserRole loginUser : loginUsers){
//            Example example = new Example(MUserRole.class);
//            Example.Criteria criteria = example.createCriteria();
//            criteria.andEqualTo("userId", userId);
//            criteria.andEqualTo("roleId", roleId);
//            List<MUserRole> relations = mUserRoleDao.selectByExample(example);
//            if (relations.size() > 0) {
//                return ResultBean.failure("用户已存在");
//            }
//        }
//        //把添加用户角色
//        for (MUserRole loginUser : loginUsers){
//            MUserRole userRole = new MUserRole();
//            userRole.setCntrCd("1");
//            userRole.setUserId(userId);
//            userRole.setRoleId(roleId);
//            userRole.setDefCpyFlg(userRole.getDefCpyFlg());
//            userRole.setDefOrgType(userRole.getDefOrgType());
//            userRole.setNewFlg("1");
//            userRole.setDisableFlg("1");
//
//            mUserRoleService.insertSelective((userRole));
//        }
//        return ResultBean.success("添加成功！");
//    }

    /**
     * 创建角色
     * @param role
     */
    public MRole createRole(MRole role, HttpServletRequest request) {
        //mod by llh 2019026 begin
//        role.setAddTnmtId(request.getRemoteAddr());
        role.setAddTnmtId(CommonUtils.getIp(request));
        role.setUpdTnmtId(CommonUtils.getIp(request));
        //mod by llh 2019026 end
        role.setAddDt(new Date());
        role.setUpdCnt(1);
        //del by llh 2019026 begin
//        role.setUpdTnmtId(request.getRemoteAddr());
        //del by llh 2019026 end
        role.setDelFlg("0");
        role.setUpdDt(new Date());
        insertSelective(role);
        return role;
    }

    /**
     * 修改角色
     * @param role
     */
    public void updateRole(MRole role, HttpServletRequest request) {
//        UserBean loginUser = userService.getLoginUser(request);
        role.setUpdCnt((role.getUpdCnt() == null)? 0:role.getUpdCnt() + 1);
        //mod by llh 2019026 begin
//        role.setUpdTnmtId(request.getRemoteAddr());
        role.setUpdTnmtId(CommonUtils.getIp(request));
        //mod by llh 2019026 end
        role.setUpdDt(new Date());
        updateByPrimaryKey(role);
    }
    /*    *//**
     * 创建用户角色
     *//*
    public ResultBean createUserRole(String roleId , List<SysUser> users){
        for(SysUser user : users){
            if(relationService.isExistRelation("USER_ROLE",user.getId(),roleId)){
                return ResultBean.failure("用户已存在");
            }
        }
        //把添加用户角色
        for (SysUser user : users){
            SysRelation relation = new SysRelation();
            relation.setRelationType("USER_ROLE");
            relation.setValueLeft(user.getId());
            relation.setValueRight(roleId);
            relation.setRelationValue("USER_ROLE");
            sysRelationService.insertSelective((SysRelation)userService.setCreateInfo(relation));
        }
        return ResultBean.success("添加成功！");
    }*/

    /**
     * 创建时判断角色名称是否存在
     * @param role
     * @return
     */
    public boolean checkRoleName(MRole role){
        Example.Criteria criteria = createCriteria();
        criteria.andEqualTo("cntrCd",role.getCntrCd());
        criteria.andEqualTo("orgId",role.getOrgId());
        criteria.andEqualTo("roleNm",role.getRoleNm());
        List<MRole> sysRoles = selectByCondition(criteria);
        if(sysRoles.size() > 0){
            return true;
        }
        return false;
    }
    /**
     * 编辑时判断角色名称是否存在
     * @param role
     * @return
     */
    public boolean checkRoleNaEdit(MRole role){
        Example.Criteria criteria = createCriteria();
        criteria.andEqualTo("cntrCd",role.getCntrCd());
        criteria.andEqualTo("orgId",role.getOrgId());
        criteria.andEqualTo("roleNm",role.getRoleNm());
        criteria.andNotEqualTo("id",role.getId());
        List<MRole> sysRoles = selectByCondition(criteria);
        if(sysRoles.size() > 0){
            return true;
        }
        return false;
    }

    /**
     * 删除角色
     * @param role
     */
    //mod by llh 2019026 begin
//    public void deleteRole(MRole role){
    public ResultBean deleteRole(HttpServletRequest request, MRole role){
        if (StringUtils.isNullOrEmpty(role.getId())) {
            return ResultBean.failure("删除失败！");
        }
        MRole roleDb = selectByPrimaryKey(role.getId());
        if (roleDb == null) {
            return ResultBean.failure("删除失败！");
        }
        //mod by llh 2019026 begin
        //删除用户角色
        mUserRoleService.deleteByField("roleId",role.getId());
        //删除角色权限
        mRoleModuleService.deleteByField("roleId",role.getId());

        //add by llh 2019026 begin
        roleDb.setUpdTnmtId(CommonUtils.getIp(request));
        roleDb.setUpdUserId(role.getUpdUserId());
        roleDb.setUpdUserNm(role.getUpdUserNm());
        roleDb.setUpdPgmId(role.getUpdPgmId());
        //add by llh 2019026 end
        roleDb.setDelFlg("1");
        roleDb.setUpdCnt(roleDb.getUpdCnt() + 1);
        roleDb.setUpdDt(new Date());
        roleDb.setUpdTnmtId(CommonUtils.getIp(request));
        updateByPrimaryKey(roleDb);

        return ResultBean.success("删除成功！");
    }

    /**
     * 删除用户角色
     * @param userId
     * @param roleId
     */
    public void deleteUserRole(String userId,String roleId){
        Example example = new Example(MUserRole.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("userId", userId);
        criteria.andEqualTo("roleId", roleId);
        List<MUserRole> userRoles = mUserRoleDao.selectByExample(example);
        if (userRoles.size() > 0) {
            mUserRoleDao.delete(userRoles.get(0));
        }
    }

    /**
     * 根据用户获取角色
     */
    public List<Role> getRole(String userId){
        return roleDao.getUserRole(userId);
    }

    /**
     * 获取组织阶层-权限
     */
    public List<OrgTree> listRoleTree(String cntrCd, String orgId, String roleNm) {
//        List<OrgTree> temp =  roleDao.listRoleTree(cntrCd, orgId, roleNm);
        return roleDao.listRoleTree(cntrCd, orgId, roleNm);
    }

    public List<MUserRoleEx> selectMUserRoleList(String userId,String cntrCd) {
        return roleDao.selectMUserRoleList(userId,cntrCd);
    }

//    private String getIp(HttpServletRequest request){
//
//        String ip = request.getHeader("x-forwarded-for");
//        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(getIp(request))) {
//            ip = request.getHeader("Proxy-Client-IP");
//        }
//        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(getIp(request))) {
//            ip = request.getHeader("WL-Proxy-Client-IP");
//        }
//        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(getIp(request))) {
//            ip = request.getHeader("HTTP_CLIENT_IP");
//        }
//        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(getIp(request))) {
//            ip = request.getHeader("HTTP_X_FORWARDED_FOR");
//        }
//        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(getIp(request))) {
//            ip = request.getRemoteAddr();
//        }
//
//        return ip;
//    }
}
