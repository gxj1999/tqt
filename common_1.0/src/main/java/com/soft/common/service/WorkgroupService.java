package com.soft.common.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sjasoft.framework.bean.ResultBean;
import com.soft.common.model.MUserRole;
import com.soft.common.model.MWorkgroup;
import com.soft.common.mybatis.extend.dao.MWorkgroupDao;
import com.soft.common.mybatis.extend.entity.WorkgroupEx;
import com.soft.common.web.Util.CommonUtils;
import com.soft.common.web.service.MUserRoleService;
import com.soft.common.web.service.MWorkgroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.interceptor.TransactionAspectSupport;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @Author: xhs
 * @Date: 2020/9/9 16:08
 * @Desc:
 * @Veision: JDK 1.8
 */
@Service
public class WorkgroupService {
    @Resource
    private MWorkgroupDao mWorkgroupDao;
    @Autowired
    private MWorkgroupService mWorkgroupService;
    @Autowired
    private MUserRoleService mUserRoleService;
    /**
     *  查询班组信息
     * @param page
     * @param limit
     * @param cntrCd    中心编号
     * @param orgId     所属部门
     * @param teamId    班组编号
     * @param teamNm    班组名称
     * @return
     */
    public ResultBean getWorkgroupList(Integer page, Integer limit, String cntrCd, String orgId, String teamId, String teamNm){
        try{
            PageHelper.startPage(page, limit);
            List<WorkgroupEx> mworkgroupList = mWorkgroupDao.getMworkgroupList(cntrCd, orgId, teamId, teamNm);
            if(mworkgroupList == null || mworkgroupList.isEmpty()){
                return ResultBean.success("暂无数据！");
            }
            return ResultBean.success("获取班组信息成功！",new PageInfo<>(mworkgroupList));
        }catch (Exception e){
           e.printStackTrace();
            return ResultBean.failure("获取班组信息异常");
        }
    }

    /**
     * 新增班组信息
     *
     * @param mWorkgroup
     * @return
     */
    public ResultBean insertWorkgroup(HttpServletRequest request, MWorkgroup mWorkgroup){
        try{
            // 验证必传参数
            if(mWorkgroup.getCntrCd().isEmpty()){
                return ResultBean.failure("中心不能为空！");
            }
            if(mWorkgroup.getOrgId().isEmpty()){
                return ResultBean.failure("所属部门不能为空！");
            }
            if(mWorkgroup.getWorkgroupNm().isEmpty()){
                return ResultBean.failure("班组名称不能为空！");
            }
            // 验证班组编号是否存在
            if(!mWorkgroup.getWorkgroupCd().isEmpty()){
                Example.Criteria criteria = mWorkgroupService.createCriteria();
                criteria.andEqualTo("delFlg",0);
                criteria.andEqualTo("workgroupCd",mWorkgroup.getWorkgroupCd());
                criteria.andEqualTo("cntrCd",mWorkgroup.getCntrCd());
                // 根据班组编号查询，验证是否存在
                List<MWorkgroup> selectList = mWorkgroupService.select(criteria);
                if(selectList != null && !selectList.isEmpty()){
                    return ResultBean.failure("班组编号已存在，请重新输入！");
                }
            }
            // 验证所属部门、班组名称 是否存在
            Example.Criteria serviceCriteria = mWorkgroupService.createCriteria();
            serviceCriteria.andEqualTo("delFlg",0);
            serviceCriteria.andEqualTo("orgId",mWorkgroup.getOrgId());
            serviceCriteria.andEqualTo("workgroupNm",mWorkgroup.getWorkgroupNm());
            serviceCriteria.andEqualTo("cntrCd",mWorkgroup.getCntrCd());
            List<MWorkgroup> mWorkgroupList = mWorkgroupService.select(serviceCriteria);
            if(mWorkgroupList != null && !mWorkgroupList.isEmpty()){
                return ResultBean.failure("所属部门对应的班组名称已存在，请重新输入！");
            }
            String uuid = UUID.randomUUID().toString().replace("-", "");
            mWorkgroup.setId(uuid);
            mWorkgroup.setDelFlg("0");
            // 设置共通字段
            CommonUtils.setCommonInfo(mWorkgroup,request);
            mWorkgroupService.insert(mWorkgroup);
            return ResultBean.success("新增班组信息成功！");
        }catch (Exception e){
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            e.printStackTrace();
            return ResultBean.failure("新增班组信息异常！");
        }
    }

    /**
     * 修改班组信息
     *
     * @param mWorkgroup
     * @return
     */
    public ResultBean updateWorkgroup(HttpServletRequest request,MWorkgroup mWorkgroup) {
        try{
            // 验证必传参数
            if(mWorkgroup.getCntrCd().isEmpty()){
                return ResultBean.failure("中心不能为空！");
            }
            if(mWorkgroup.getOrgId().isEmpty()){
                return ResultBean.failure("所属部门不能为空！");
            }
            if(mWorkgroup.getWorkgroupNm().isEmpty()){
                return ResultBean.failure("班组名称不能为空！");
            }
            // 根据Id查询班组信息
            MWorkgroup workgroup = new MWorkgroup();
            if(!mWorkgroup.getId().isEmpty()){
                workgroup = mWorkgroupService.selectByPrimaryKey(mWorkgroup.getId());
            }

            // 验证班组编号是否存在
            if(!mWorkgroup.getWorkgroupCd().isEmpty()){
                if(!workgroup.getWorkgroupCd().equals(mWorkgroup.getWorkgroupCd())){
                    Example.Criteria criteria = mWorkgroupService.createCriteria();
                    criteria.andEqualTo("delFlg",0);
                    criteria.andEqualTo("workgroupCd",mWorkgroup.getWorkgroupCd());
                    criteria.andEqualTo("cntrCd",mWorkgroup.getCntrCd());
                    // 根据班组编号查询，验证是否存在
                    List<MWorkgroup> selectList = mWorkgroupService.select(criteria);
                    if(selectList != null && !selectList.isEmpty()){
                        return ResultBean.failure("班组编号已存在，请重新输入！");
                    }
                }
            }
            // 验证所属部门、班组名称 是否存在
            if(!workgroup.getOrgId().equals(mWorkgroup.getOrgId()) || !workgroup.getWorkgroupNm().equals(mWorkgroup.getWorkgroupNm())){
                Example.Criteria serviceCriteria = mWorkgroupService.createCriteria();
                serviceCriteria.andEqualTo("delFlg",0);
                serviceCriteria.andEqualTo("orgId",mWorkgroup.getOrgId());
                serviceCriteria.andEqualTo("workgroupNm",mWorkgroup.getWorkgroupNm());
                serviceCriteria.andEqualTo("cntrCd",mWorkgroup.getCntrCd());
                List<MWorkgroup> mWorkgroupList = mWorkgroupService.select(serviceCriteria);
                if(mWorkgroupList != null && !mWorkgroupList.isEmpty()){
                    return ResultBean.failure("所属部门对应的班组名称已存在，请重新输入！");
                }
            }
            // 设置共通字段
            CommonUtils.setCommonInfo(mWorkgroup,request);
            mWorkgroupService.updateByPrimaryKey(mWorkgroup);
            return ResultBean.success("修改班组信息成功！");
        }catch (Exception e){
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            e.printStackTrace();
            return ResultBean.failure("新增班组信息异常！");
        }
    }

    /**
     * 删除班组信息
     *
     * @param mWorkgroup
     * @return
     */
    public ResultBean delWorkgroup(HttpServletRequest request,MWorkgroup mWorkgroup) {
        if(mWorkgroup.getId().isEmpty()){
            return ResultBean.failure("参数错误，请核对参数！");
        }
        try{
            MWorkgroup mWorkgroup1 = mWorkgroupService.selectByPrimaryKey(mWorkgroup.getId());
            if(mWorkgroup1 == null){
                return ResultBean.failure("删除班组信息失败，没有该班组对应的信息！");
            }
            // 删除数据
            mWorkgroup.setDelFlg("1");
            // 设置共通字段
            CommonUtils.setCommonInfo(mWorkgroup,request);
            mWorkgroupService.updateByPrimaryKey(mWorkgroup);
            // 删除用户角色表的关联字段
            Example.Criteria mUserRoleServiceCriteria = mUserRoleService.createCriteria();
            mUserRoleServiceCriteria.andEqualTo("delFlg",0);
            mUserRoleServiceCriteria.andEqualTo("char1",mWorkgroup.getWorkgroupCd());
            List<MUserRole> mUserRoles = mUserRoleService.selectByCondition(mUserRoleServiceCriteria);
            if(mUserRoles != null && !mUserRoles.isEmpty()){
                for(MUserRole mUserRole : mUserRoles){
                    mUserRole.setChar1(null);
                    mUserRole.setUpdUserId(mWorkgroup.getUpdUserId());
                    mUserRole.setUpdUserNm(mWorkgroup.getUpdUserNm());
                    mUserRole.setUpdEntKbn(mWorkgroup.getUpdEntKbn());
                    mUserRole.setUpdPgmId(mWorkgroup.getUpdPgmId());
                    CommonUtils.setCommonInfo(mUserRole,request);
                    mUserRoleService.updateByPrimaryKey(mUserRole);
                }
            }
            return ResultBean.success("删除班组信息成功！");
        }catch (Exception e){
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            e.printStackTrace();
            return ResultBean.failure("删除班组信息异常！");
        }
    }
}
