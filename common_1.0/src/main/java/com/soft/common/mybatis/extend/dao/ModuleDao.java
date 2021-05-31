package com.soft.common.mybatis.extend.dao;

import com.soft.common.mybatis.extend.entity.Module;
import com.soft.common.mybatis.extend.entity.UpdateRelation;
import com.soft.common.model.MModule;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ModuleDao {
    /**
     * 获取模块
     * @param id 模块ID
     * @return
     */
    Module getModule(String id);

    /**
     * 获取模块树
     * @param module
     * @return
             */
    List<Module> selectTree(Module module);

    /**
     * 检索用户模块
     * @param userId 用户ID
     * @return
     */
    List<MModule> selectUserModule(String userId);

    /**
     * 检索角色模块
     * @param roleCode 角色编号
     * @param parentId 父模块ID
     * @return
     */
    List<Module> selectRoleModule(@Param("roleCode") String roleCode, @Param("cntrCd") String cntrCd, @Param("parentId") String parentId);
    /**
     * 更新角色权限
     */
     //void insertRoleModule(@Param("valueLeft") String valueLeft, @Param("creator")String creator, @Param("moduleId") String moduleId);
    void insertRoleModule(UpdateRelation updaterelation);
}
