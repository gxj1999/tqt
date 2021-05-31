package com.soft.common.mybatis.extend.dao;

import com.soft.common.model.MUserRole;
import com.soft.common.mybatis.extend.entity.MRoleEx;
import com.soft.common.mybatis.extend.entity.MUserRoleEx;
import com.soft.common.mybatis.extend.entity.OrgTree;
import com.soft.common.mybatis.extend.entity.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleDao {
    List<MUserRole> selectRoleUser(String roleId);

    List<Role> getUserRole(@Param("userId") String userId);

    List<OrgTree> listRoleTree(@Param("cntrCd") String cntrCd, @Param("orgId") String orgId, @Param("roleNm") String roleNm);

    int checkLeaf(@Param("cntrCd") String cntrCd, @Param("orgId") String orgId);

    List<MUserRoleEx> selectMUserRoleList(@Param("userId") String userId,@Param("cntrCd") String cntrCd);

    List<MRoleEx> selectMRoleList(@Param("cntrCd") String cntrCd, @Param("orgId") String orgId, @Param("roleNm") String roleNm);
}
