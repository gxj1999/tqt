package com.soft.common.mybatis.extend.dao;

import com.soft.common.mybatis.extend.entity.MWhCloud;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MWhCloudDao {
/**
 * 查询仓库微服务配置信息
 * @param cntrCd     中心编号
 * @return
 */
public List<MWhCloud> selectMWhCloud(@Param("cntrCd") String cntrCd);

/**
 * 仓库Id查询微服务配置信息
 * @param id    仓库ID
 * @return
 */
public MWhCloud getMwhCloudById(@Param("id") String id);
}
