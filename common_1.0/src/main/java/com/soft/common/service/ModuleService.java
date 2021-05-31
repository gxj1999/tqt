package com.soft.common.service;

import com.sjasoft.framework.annotation.SystemLog;
import com.sjasoft.framework.service.AbstractService;
import com.sjasoft.framework.util.StringUtils;
import com.soft.common.mybatis.extend.dao.*;
import com.soft.common.mybatis.extend.entity.Module;
import com.soft.common.mapper.*;
import com.soft.common.model.*;
import com.soft.common.web.service.MModuleService;
import com.soft.common.web.service.MRoleModuleService;
import com.soft.common.web.Util.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class ModuleService extends AbstractService<MModule> {

    protected Log logger = LogFactory.getLog(getClass());

    @Resource
    private MModuleMapper mModuleDao;

    @Resource
    private ModuleDao moduleDao;

    @Resource
    private MRoleModuleMapper mRoleModuleDao;

    @Resource
    private MRoleMapper mRoleDao;

    @Resource
    private UserService userService;

    @Resource
    private MRoleModuleService mRoleModuleService;

    @Resource
    private MModuleService mModuleService;
    public void setBaseMapper() {
        super.setBaseMapper(mModuleDao);
    }

    /**
     * 根据ID获得模块项详情
     * @param id
     * @return
     */
    public MModule getModule(String id) {
        return this.selectByPrimaryKey(id);
    }

    /**
     * 根据编号获得模块项详情
     * @param code 模块项编号
     * @return
     */
// mod by zwd20191231 start
    public MModule getModuleByCode(String code) {
//    public MModule getModuleByCode(String code,String cntrCd) {
// mod by zwd20191231 end
        MModule mModule = new MModule();
        mModule.setModuleCd(code);
// del by zwd20191231
//        mModule.setCntrCd(cntrCd);
        mModule.setDelFlg("0");
        return this.selectOne(mModule);
    }

    /**
     * 获得模块列表
     * @param parentCode   父模块编号
     * @return
     */
    public List<MModule> listModule(String parentCode, String cntrCd) {
        return listModule(parentCode, cntrCd, null, null);
    }

    /**
     * 获得模块列表
     * @param parentCode   父模块编号
     * @param includeCodes 包含的模块编号(省略将获得全部)
     * @param excludeCodes 排除的模块编号
     * @return
     */
    public List<MModule> listModule(String parentCode, String cntrCd, String includeCodes, String excludeCodes) {
// mod by zwd20191231 start
        MModule parent = getModuleByCode(parentCode);
//        MModule parent = getModuleByCode(parentCode, cntrCd);
// mod by zwd20191231 end
        Criteria criteria = this.createCriteria();
        criteria.andEqualTo("parentId", parent.getId());
        if (!StringUtils.isNullOrEmpty(includeCodes)) {
            String[] codes = includeCodes.split(",");
            criteria.andIn("moduleCd", Arrays.asList(codes));
        }
        if (!StringUtils.isNullOrEmpty(excludeCodes)) {
            String[] codes = excludeCodes.split(",");
            criteria.andNotIn("moduleCd", Arrays.asList(codes));
        }
        return this.selectByCondition(criteria);
    }

    /**
     * 获得完整模块树(包含无效模块)
     * @return
     */
    public List<Module> listModuleTree() {
        Module module = new Module();
        return listModuleTree(module);
    }

    /**
     * 根据指定编号获得模块树
     * @param parentCode 模块编号
     * @return
     */
    public List<Module> listModuleTree(String parentCode, String cntrCd) {
// mod by zwd20191231 start
        MModule parent = getModuleByCode(parentCode);
// mod by zwd20191231 end
        Module module = new Module();
        module.setParentId(parent.getId());
        module.setEnabled("1");
        return listModuleTree(module);
    }

    /**
     * 根据指定模块树节点获得模块树
     * @param module 模块树节点
     * @return
     */
    public List<Module> listModuleTree(Module module) {

        return moduleDao.selectTree(module);
    }

    /**
     * 根据编号获得模块
     * @param parentId 父编号
     * @param code 编号
     * @return
     */
    public MModule getModuleByParent(String parentId, String code) {
        Criteria criteria = createCriteria();
        criteria.andEqualTo("parentId", parentId);
        criteria.andEqualTo("moduleCd", code);
        // add by zwd 20190102
        criteria.andEqualTo("delFlg", "0");
        List<MModule> sysModules = selectByCondition(criteria);
        if (sysModules.size() == 1) {
            return sysModules.get(0);
        }
        return null;
    }

    @SystemLog("创建模块")
    // mod by zwd 20191114 begin
//    public void createModule(HttpServletRequest request, MModule mModule, MUser mUser,String ip) {
    public void createModule(HttpServletRequest request, MModule mModule) {
        // mod by zwd 20191114 end
        if (StringUtils.isNullOrEmpty(mModule.getParentId())) {
            mModule.setParentId(null);
        }
        CommonUtils.setCommonInfo(mModule, request);
        mModuleService.insertSelective(mModule);
//        insertSelective((MModule)userService.setCreateInfo(mModule));
    }

    @SystemLog("修改模块")
    // mod by zwd 20191114 begin
//    public void updateModule(HttpServletRequest request, MModule mModule, MUser mUser,String ip) {
    public void updateModule(HttpServletRequest request, MModule mModule) {
     // mod by zwd 20191114 end

        if (StringUtils.isNullOrEmpty(mModule.getParentId())) {
            mModule.setParentId(null);
        }
        CommonUtils.setCommonInfo(mModule, request);
        mModuleService.updateByPrimaryKey(mModule);
//        updateByPrimaryKey((MModule)userService.setUpdateInfo(sysModule));
    }

    @SystemLog("删除模块")
    public void deleteModule(MModule module, HttpServletRequest request) {
        MModule mModule = selectByPrimaryKey(module);
        if(StringUtils.isNullOrEmpty(mModule.getParentId())){
// mod by zwd20191231 start
//            List<MModule> modules = listModule(mModule.getModuleCd(), mModule.getCntrCd());
            Example example = new Example(MModule.class);
            Criteria criteria = example.createCriteria();
            criteria.andEqualTo("parentId", mModule.getId());
            criteria.andEqualTo("delFlg", "0");
            List<MModule> children = mModuleDao.selectByExample(example);
            for (MModule child : children) {
// mod by zwd20191231 end
                deleteModule(child, request);
            }
        }
        mModule.setDelFlg("1");
        CommonUtils.setCommonInfo(mModule, request);
        updateByPrimaryKey(mModule);
        //mRoleModuleService.deleteByField("moduleId",mModule.getId());
    }

    /**
     * 根据角色编号获得角色模块
     * @param roleCode 角色编号
     * @return
     */
    @SystemLog("获得角色模块")
    public List<Module> listRoleModule(String roleCode, String cntrCd) {
        return moduleDao.selectRoleModule(roleCode, cntrCd, null);
    }

    /**
     * 更新角色模块
     * @param roleForm 画面提交数据
     * @param moduleIds 选择的模块ID
     */
    public void updateRoleModule(MRole roleForm, List<String> moduleIds, HttpServletRequest request ,String ip) {
        //删除该角色的全部权限
        Example example = new Example(MRoleModule.class);
        Criteria criteria = example.createCriteria();
        criteria.andEqualTo("roleId", roleForm.getId());
        mRoleModuleDao.deleteByExample(example);
        //重新添加权限
        for (String id : moduleIds) {
            MRoleModule mRoleModule = new MRoleModule();
            BeanUtils.copyProperties(roleForm, mRoleModule);
            mRoleModule.setRoleId(roleForm.getId());
            mRoleModule.setModuleId(id);
            mRoleModule.setRelationValue("ROLE_MODULE");
            mRoleModule.setId(null);
            CommonUtils.setCommonInfo(mRoleModule, request);
            mRoleModuleDao.insertSelective(mRoleModule);
        }
    }
    @SystemLog("编辑判断模块编号是否重复")
    public  boolean checkMoNoEdit(MModule mModule){
        Criteria criteria = mModuleService.createCriteria();
        criteria.andNotEqualTo("id",mModule.getId());
        criteria.andEqualTo("moduleCd",mModule.getModuleCd());
        // upd by zwd 20191231
//        criteria.andEqualTo("cntrCd",mModule.getCntrCd());
        // add by zwd 20190102
        criteria.andEqualTo("delFlg", "0");
        List<MModule> sysModules = mModuleService.selectByCondition(criteria);
        if(sysModules.size() > 0){
            return true;
        }
        return false;
    }
    @SystemLog("编辑判断模块编号是否重复")
    public  boolean checkModuleNoEdit(MModule sysModule){
        Criteria criteria = mModuleService.createCriteria();
        criteria.andNotEqualTo("id",sysModule.getId());
        criteria.andEqualTo("parentId",sysModule.getParentId());
        criteria.andEqualTo("moduleCd",sysModule.getModuleCd());
        // upd by zwd 20191231
//        criteria.andEqualTo("cntrCd",sysModule.getCntrCd());
        // add by zwd 20190102
        criteria.andEqualTo("delFlg", "0");
        List<MModule> sysModules = mModuleService.selectByCondition(criteria);
        if(sysModules.size() > 0){
            return true;
        }
        return false;
    }
    @SystemLog("创建判断模块文本是否重复")
    public  boolean checkModuleText(MModule sysModule){
        Criteria criteria = mModuleService.createCriteria();
        criteria.andEqualTo("parentId",sysModule.getParentId());
        criteria.andEqualTo("moduleNm",sysModule.getModuleNm());
        // upd by zwd 20191231
//        criteria.andEqualTo("cntrCd",sysModule.getCntrCd());
        // add by zwd 20190102
        criteria.andEqualTo("delFlg", "0");
        List<MModule> sysModules = mModuleService.selectByCondition(criteria);
        if(sysModules.size() > 0){
            return true;
        }
        return false;
    }
    @SystemLog("编辑判断模块名称是否重复")
    public  boolean checkMoTextEdit(MModule sysModule){
        Criteria criteria = mModuleService.createCriteria();
        criteria.andNotEqualTo("id",sysModule.getId());
        criteria.andEqualTo("moduleNm",sysModule.getModuleNm());
        // upd by zwd 20191231
//        criteria.andEqualTo("cntrCd",sysModule.getCntrCd());
        // add by zwd 20190102
        criteria.andEqualTo("delFlg", "0");
        List<MModule> sysModules = mModuleService.selectByCondition(criteria);
        if(sysModules.size() > 0){
            return true;
        }
        return false;
    }
    @SystemLog("编辑判断模块文本是否重复")
    public  boolean checkModuleTextEdit(MModule sysModule){
        Criteria criteria = mModuleService.createCriteria();
        criteria.andNotEqualTo("id",sysModule.getId());
        criteria.andEqualTo("parentId",sysModule.getParentId());
        criteria.andEqualTo("moduleNm",sysModule.getModuleNm());
        // upd by zwd 20191231
//        criteria.andEqualTo("cntrCd",sysModule.getCntrCd());
        // add by zwd 20190102
        criteria.andEqualTo("delFlg", "0");
        List<MModule> sysModules = mModuleService.selectByCondition(criteria);
        if(sysModules.size() > 0){
            return true;
        }
        return false;
    }


}
