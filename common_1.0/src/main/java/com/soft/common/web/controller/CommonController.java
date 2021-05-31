package com.soft.common.web.controller;

import com.github.pagehelper.PageInfo;
import com.sjasoft.framework.annotation.SystemLog;
import com.sjasoft.framework.bean.ResultBean;
import com.sjasoft.framework.util.StringUtils;
import com.soft.common.model.*;
import com.soft.common.mybatis.extend.entity.*;
import com.soft.common.service.*;
import com.soft.common.web.Util.CallFeignClientUtils;
import com.soft.common.web.Util.CommonUtils;
import com.soft.common.web.service.*;
import io.swagger.annotations.ApiOperation;
import net.sf.json.JSONArray;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.mapper.entity.Example;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.util.*;

@RestController
@RequestMapping(value = "/api/common")
public class CommonController {
    private static final Logger log = LogManager.getLogger(CommonController.class);
    @Autowired
    private CommonService commonService;
    @Autowired
    private MOrgService mOrgService;
    @Autowired
    private MWhService mWhService;
    @Autowired
    private MZoneService mZoneService;
    @Autowired
    private MGeneralService mGeneralService;
    @Autowired
    private MLocService mLocService;
    @Autowired
    private MCustomerService mCustomerService;
    @Autowired
    private MSupplierService mSupplierService;
    @Autowired
    private MSupplierLineService mSupplierLineService;
    @Autowired
    private MUserService mUserService;
    @Autowired
    private MLoginService mLoginService;
    @Autowired
    private MOutFactoryService mOutFactoryService;
    @Autowired
    private MOutFactoryLineService mOutFactoryLineService;
    @Autowired
    private MCarrierService mCarrierService;
    @Autowired
    private MCenterService mCenterService;
    @Autowired
    private MCarrierLineService mCarrierLineService;
    @Autowired
    private MLevelService mLevelService;
    @Autowired
    private MBoxService mBoxService;
    @Autowired
    private MErrorinfoService mErrorinfoService;
    @Autowired
    private MProductService mProductService;
    @Autowired
    private MProductClassService mProductClassService;
    @Autowired
    private LogService logService;
    @Autowired
    private MNumberService mNumberService;
    @Autowired
    private MGeneralListService mGeneralListService;
    @Autowired
    private UserService userService;
    @Autowired
    private MRoleService mRoleService;
    @Autowired
    private MRoleModuleService mRoleModuleService;
    @Autowired
    private CallFeignClientUtils callFeignClientUtils;
    @Autowired
    private ExtraServiceController extraServiceController;
    @Autowired
    private MMachineService mMachineService;
    @Autowired
    private MProductRelaService mProductRelaService;

    /**
     * 新增组织部门信息
     *
     * @param request
     * @param mOrg
     * @return
     */
    @SystemLog("新增组织部门信息")
    @PostMapping(value = "insertMOrg")
    public ResultBean insertMOrg(HttpServletRequest request, MOrg mOrg) {
        try {
            //判断组织部门名称是否存在
            Example.Criteria criteriaNm = mOrgService.createCriteria();
            criteriaNm.andEqualTo("delFlg", '0');
            criteriaNm.andEqualTo("orgNm", mOrg.getOrgNm());
            criteriaNm.andEqualTo("cntrCd", mOrg.getCntrCd());
            List<MOrg> sysOrg = mOrgService.selectByCondition(criteriaNm);
            if (sysOrg.size() > 0) {
                return ResultBean.failure("组织部门名称已存在！");
            }
            //判断组织部门简称是否存在
            if (!StringUtils.isNullOrEmpty(mOrg.getOrgAbbr())) {
                Example.Criteria criteriaJc = mOrgService.createCriteria();
                criteriaJc.andEqualTo("delFlg", '0');
                criteriaJc.andEqualTo("orgAbbr", mOrg.getOrgAbbr());
                // mod by zwd20190102
                criteriaJc.andEqualTo("cntrCd", mOrg.getCntrCd());
                sysOrg = mOrgService.selectByCondition(criteriaJc);
                if (sysOrg.size() > 0) {
                    return ResultBean.failure("组织部门简称已存在！");
                }
            }
            //判断组织部门英文名称是否存在
            if (!StringUtils.isNullOrEmpty(mOrg.getOrgEngNm())) {
                Example.Criteria criteriaEn = mOrgService.createCriteria();
                criteriaEn.andEqualTo("delFlg", '0');
                criteriaEn.andEqualTo("orgEngNm", mOrg.getOrgEngNm());
                // mod by zwd20190102
                criteriaEn.andEqualTo("cntrCd", mOrg.getCntrCd());
                sysOrg = mOrgService.selectByCondition(criteriaEn);
                if (sysOrg.size() > 0) {
                    return ResultBean.failure("组织部门英文名称已存在！");
                }
            }
            if (!StringUtils.isNullOrEmpty(mOrg.getOrgCdDis())) {
                Example.Criteria criteriaCd = mOrgService.createCriteria();
                criteriaCd.andEqualTo("delFlg", '0');
                criteriaCd.andEqualTo("orgCdDis", mOrg.getOrgCdDis());
                // mod by zwd20190102
                criteriaCd.andEqualTo("cntrCd", mOrg.getCntrCd());
                sysOrg = mOrgService.selectByCondition(criteriaCd);
                if (sysOrg.size() > 0) {
                    return ResultBean.failure("组织部门编号已存在！");
                }
            }
            mOrg = commonService.insertMOrg(request, mOrg);
            // 同步其他服务数据
            extraServiceController.insertMOrg(mOrg);
            return ResultBean.success("新增组织部门信息成功！");
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("新增组织部门信息失败！");
        }
    }

    /**
     * 编辑组织部门信息
     *
     * @param request
     * @param mOrg
     * @return
     */
    @SystemLog("编辑组织部门信息")
    @PostMapping(value = "updateMOrg")
    public ResultBean updateMOrg(HttpServletRequest request, MOrg mOrg) {
        try {
            //判断时效性
            Example.Criteria criteria = mOrgService.createCriteria();
            criteria.andEqualTo("id", mOrg.getId());
            List<MOrg> mOrgs = mOrgService.selectByCondition(criteria);
            if (!mOrg.getUpdCnt().equals(mOrgs.get(0).getUpdCnt())) {
                return ResultBean.failure("数据已被修改,请重试！");
            }
            //判断名称是否存在
            Example.Criteria criteriaNm = mOrgService.createCriteria();
            criteriaNm.andEqualTo("delFlg", '0');
            criteriaNm.andNotEqualTo("id", mOrg.getId());
            criteriaNm.andEqualTo("orgNm", mOrg.getOrgNm());
            // mod by zwd20190102
            criteriaNm.andEqualTo("cntrCd", mOrg.getCntrCd());
            List<MOrg> sysOrg = mOrgService.selectByCondition(criteriaNm);
            if (sysOrg.size() > 0) {
                return ResultBean.failure("组织部门名称已存在！");
            }
            //判断组织部门简称是否存在
            if (!StringUtils.isNullOrEmpty(mOrg.getOrgAbbr())) {
                Example.Criteria criteriaJc = mOrgService.createCriteria();
                criteriaJc.andEqualTo("delFlg", '0');
                criteriaJc.andNotEqualTo("id", mOrg.getId());
                criteriaJc.andEqualTo("orgAbbr", mOrg.getOrgAbbr());
                // mod by zwd20190102
                criteriaJc.andEqualTo("cntrCd", mOrg.getCntrCd());
                sysOrg = mOrgService.selectByCondition(criteriaJc);
                if (sysOrg.size() > 0) {
                    return ResultBean.failure("组织部门简称已存在！");
                }
            }
            //判断组织部门英文名称是否存在
            if (!StringUtils.isNullOrEmpty(mOrg.getOrgEngNm())) {
                Example.Criteria criteriaEn = mOrgService.createCriteria();
                criteriaEn.andEqualTo("delFlg", '0');
                criteriaEn.andNotEqualTo("id", mOrg.getId());
                criteriaEn.andEqualTo("orgEngNm", mOrg.getOrgEngNm());
                // mod by zwd20190102
                criteriaEn.andEqualTo("cntrCd", mOrg.getCntrCd());
                sysOrg = mOrgService.selectByCondition(criteriaEn);
                if (sysOrg.size() > 0) {
                    return ResultBean.failure("组织部门英文名称已存在！");
                }
            }
            if (!StringUtils.isNullOrEmpty(mOrg.getOrgCdDis())) {
                Example.Criteria criteriaCd = mOrgService.createCriteria();
                criteriaCd.andEqualTo("delFlg", '0');
                criteriaCd.andNotEqualTo("id", mOrg.getId());
                criteriaCd.andEqualTo("orgCdDis", mOrg.getOrgCdDis());
                // mod by zwd20190102
                criteriaCd.andEqualTo("cntrCd", mOrg.getCntrCd());
                sysOrg = mOrgService.selectByCondition(criteriaCd);
                if (sysOrg.size() > 0) {
                    return ResultBean.failure("组织部门编号已存在！");
                }
            }
            MOrg tempOrg = CommonUtils.clone(mOrg);
            commonService.updateMOrg(request, mOrg);
            //  同步其他服务数据
            extraServiceController.updateMOrg(tempOrg);
            return ResultBean.success("编辑组织部门信息成功！");
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("编辑组织部门信息失败！");
        }
    }

    /**
     * 删除组织部门信息
     *
     * @param mOrg 组织部门删除信息
     * @return
     */
    @SystemLog("删除组织部门信息")
    @PostMapping(value = "deleteMOrg")
    public ResultBean deleteMOrg(HttpServletRequest request, MOrg mOrg) {
        try {
            //判断时效性
            Example.Criteria criteria = mOrgService.createCriteria();
            criteria.andEqualTo("id", mOrg.getId());
            List<MOrg> mOrgs = mOrgService.selectByCondition(criteria);
            if (!mOrg.getUpdCnt().equals(mOrgs.get(0).getUpdCnt())) {
                return ResultBean.failure("数据已被修改,请重试！");
            }
            MOrg tempOrg = CommonUtils.clone(mOrg);
            commonService.deleteMOrg(request, mOrg);
            // 同步其他服务数据
            extraServiceController.deleteMOrg(tempOrg);
            return ResultBean.success("删除组织部门信息成功！");
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("删除组织部门信息失败！");
        }
    }

    /**
     * 获取组织部门信息
     *
     * @param page  当前页数
     * @param limit 分页数
     * @return 需求列表
     */
    @SystemLog("获取组织部门信息")
    @GetMapping(value = "getMOrgList")
    public ResultBean getMOrgList(Integer page, Integer limit, MOrgEx mOrgEx) {
        List<MOrgEx> mOrgExList = new ArrayList<>();
        try {
            mOrgExList = commonService.getMOrgList(page, limit, mOrgEx);
            return ResultBean.success("获取组织部门信息一览成功", new PageInfo<>(mOrgExList));
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("获取组织部门信息一览失败");
        }
    }

    /**
     * 获取组织部门明细
     *
     * @param orgId 组织部门编号
     * @return 需求列表
     */
    @SystemLog("获取组织部门明细")
    @GetMapping(value = "getMOrgLineList")
    public ResultBean getMOrgLineList(String orgId) {
        List<MOrgEx> mOrgLineExList = new ArrayList<>();
        try {
            mOrgLineExList = commonService.getMOrgLineList(orgId);
            return ResultBean.success("获取组织部门明细成功", mOrgLineExList);
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("获取组织部门明细失败");
        }
    }

    /**
     * 新增仓库信息
     *
     * @param request
     * @param mWh
     * @param mZones
     * @return
     */
    @SystemLog("新增仓库信息")
    @PostMapping(value = "insertMWh")
    public ResultBean insertMWh(HttpServletRequest request, MWh mWh, String mZones) {
        try {
            Example.Criteria criteriaNm = mWhService.createCriteria();
//            criteriaNm.andEqualTo("cntrCd",mWh.getCntrCd());
            criteriaNm.andEqualTo("delFlg", '0');
            criteriaNm.andEqualTo("whNm", mWh.getWhNm());
            List<MWh> sysWhs = mWhService.selectByCondition(criteriaNm);
            if (sysWhs.size() > 0) {
                return ResultBean.failure("仓库名称已存在！");
            }
            if (!StringUtils.isNullOrEmpty(mWh.getWhNmJc())) {
                Example.Criteria criteriaCd = mWhService.createCriteria();
//                criteriaCd.andEqualTo("cntrCd", mWh.getCntrCd());
                criteriaCd.andEqualTo("delFlg", '0');
                criteriaCd.andEqualTo("whNmJc", mWh.getWhNmJc());
                sysWhs = mWhService.selectByCondition(criteriaCd);
                if (sysWhs.size() > 0) {
                    return ResultBean.failure("仓库简称已存在！");
                }
            }
            //判断仓库表示用编号是否重复
            if (!StringUtils.isNullOrEmpty(mWh.getWhCdDis())) {
                Example.Criteria criteriaCd = mWhService.createCriteria();
//                criteriaCd.andEqualTo("cntrCd", mWh.getCntrCd());
                criteriaCd.andEqualTo("delFlg", '0');
                criteriaCd.andEqualTo("whCdDis", mWh.getWhCdDis());
                sysWhs = mWhService.selectByCondition(criteriaCd);
                if (sysWhs.size() > 0) {
                    return ResultBean.failure("仓库编号已存在！");
                }
            }
            JSONArray jsStrf = JSONArray.fromObject(mZones);
            List<MZone> mZoneLists = (List<MZone>) JSONArray.toCollection(jsStrf, MZone.class);
            Map<String, Object> tempMap = commonService.insertMWh(request, mWh, mZoneLists);
            // 同步其他服务数据
            extraServiceController.insertMWh(tempMap);
            return ResultBean.success("新增仓库信息成功！");
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("新增仓库信息失败！");
        }
    }

    /**
     * 编辑仓库信息
     *
     * @param request
     * @param mWh         仓库信息
     * @param mZoneUpdate 仓库区域更新信息JSON
     * @param mZoneInsert 仓库区域新增信息JSON
     * @return
     */
    @SystemLog("编辑仓库信息")
    @PostMapping(value = "updateMWh")
    @Transactional
    public ResultBean updateMWh(HttpServletRequest request, MWh mWh, String mZoneUpdate, String mZoneInsert) {
        try {
            // 深度复制
            MWh temMWh = CommonUtils.clone(mWh);
            //判断时效性
            Example.Criteria criteria = mWhService.createCriteria();
            criteria.andEqualTo("id", mWh.getId());
            List<MWh> mWhs = mWhService.selectByCondition(criteria);
            if (!mWh.getUpdCnt().equals(mWhs.get(0).getUpdCnt())) {
                return ResultBean.failure("数据已被修改,请重试！");
            }
            //判断仓库名称是否重复
            Example.Criteria criteriaNm = mWhService.createCriteria();
//            criteriaNm.andEqualTo("cntrCd",mWh.getCntrCd());
            criteriaNm.andNotEqualTo("id", mWh.getId());
            criteriaNm.andEqualTo("delFlg", '0');
            criteriaNm.andEqualTo("whNm", mWh.getWhNm());
            List<MWh> sysWhs = mWhService.selectByCondition(criteriaNm);
            if (sysWhs.size() > 0) {
                return ResultBean.failure("仓库名称已存在！");
            }
            //判断仓库简称是否重复
            if (!StringUtils.isNullOrEmpty(mWh.getWhNmJc())) {
                Example.Criteria criteriaJc = mWhService.createCriteria();
//                criteriaJc.andEqualTo("cntrCd", mWh.getCntrCd());
                criteriaJc.andNotEqualTo("id", mWh.getId());
                criteriaJc.andEqualTo("delFlg", '0');
                criteriaJc.andEqualTo("whNmJc", mWh.getWhNmJc());
                sysWhs = mWhService.selectByCondition(criteriaJc);
                if (sysWhs.size() > 0) {
                    return ResultBean.failure("仓库简称已存在！");
                }
            }
            //判断仓库表示用编号是否重复
            if (!StringUtils.isNullOrEmpty(mWh.getWhCdDis())) {
                Example.Criteria criteriaCd = mWhService.createCriteria();
//                criteriaCd.andEqualTo("cntrCd", mWh.getCntrCd());
                criteriaCd.andEqualTo("delFlg", '0');
                criteriaCd.andNotEqualTo("id", mWh.getId());
                criteriaCd.andEqualTo("whCdDis", mWh.getWhCdDis());
                sysWhs = mWhService.selectByCondition(criteriaCd);
                if (sysWhs.size() > 0) {
                    return ResultBean.failure("仓库编号已存在！");
                }
            }
            if (mZoneUpdate != null) {
                //仓库区域更新JSON
                JSONArray jsStrf = JSONArray.fromObject(mZoneUpdate);
                List<MZone> mZoneUpdates = (List<MZone>) JSONArray.toCollection(jsStrf, MZone.class);
                commonService.updateMWh(request, mWh, mZoneUpdates);
            } else {
                commonService.updateWh(request, mWh);
            }
            List<MZone> mZoneInserts = null;
            if (mZoneInsert != null) {
                //仓库区域新增JSON
                JSONArray jsStrf2 = JSONArray.fromObject(mZoneInsert);
                mZoneInserts = (List<MZone>) JSONArray.toCollection(jsStrf2, MZone.class);
                mZoneInserts = commonService.insertMZone(request, mZoneInserts);
            }

            // 同步其他服务数据
            Map<String, Object> tempMap = new HashMap<String, Object>();
            tempMap.put("mWh", temMWh);
            tempMap.put("mZoneUpdate", mZoneUpdate);
            tempMap.put("mZoneInsert", mZoneInserts);
            extraServiceController.updateMWh(tempMap);

            return ResultBean.success("编辑仓库信息成功！");
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("编辑仓库信息失败！");
        }
    }

    /**
     * 删除仓库信息
     *
     * @param mWh
     * @return
     */
    @SystemLog("删除仓库信息")
    @PostMapping(value = "deleteMWh")
    public ResultBean deleteMWh(HttpServletRequest request, MWh mWh) {
        try {
            Example.Criteria criteria = mWhService.createCriteria();
            criteria.andEqualTo("id", mWh.getId());
            List<MWh> mWhs = mWhService.selectByCondition(criteria);
            if (!mWh.getUpdCnt().equals(mWhs.get(0).getUpdCnt())) {
                return ResultBean.failure("数据已被修改,请重试！");
            }
            MWh tempWh = CommonUtils.clone(mWh);
            commonService.deleteMWh(request, mWh);
            // 同步其他服务数据
            extraServiceController.deleteMWh(tempWh);
            return ResultBean.success("删除仓库信息成功！");
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("删除仓库信息失败！");
        }
    }

    /**
     * 删除仓库区域
     *
     * @param mZone
     * @return
     */
    @SystemLog("删除仓库区域")
    @PostMapping(value = "deleteMZone")
    public ResultBean deleteMZone(HttpServletRequest request, MZone mZone) {
        try {
            Example.Criteria criteria = mZoneService.createCriteria();
            criteria.andEqualTo("id", mZone.getId());
            List<MZone> mZones = mZoneService.selectByCondition(criteria);
            if (!mZone.getUpdCnt().equals(mZones.get(0).getUpdCnt())) {
                return ResultBean.failure("数据已被修改,请重试！");
            }
            MZone temZone = CommonUtils.clone(mZone);
            commonService.deleteMZone(request, mZone);
            // 同步其他服务数据
            extraServiceController.deleteMZone(temZone);

            return ResultBean.success("删除仓库区域成功！");
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("删除仓库区域失败！");
        }
    }

    /**
     * 获取仓库信息
     *
     * @param page  当前页数
     * @param limit 分页数
     * @param mWhEx 画面数据
     * @return 需求列表
     */
    @SystemLog("获取仓库信息")
    @GetMapping(value = "getMWhList")
    public ResultBean getMWhList(Integer page, Integer limit, MWhEx mWhEx) {
        List<MWhEx> mWhExList = new ArrayList<>();
        try {
            mWhExList = commonService.getMWhList(page, limit, mWhEx);
            return ResultBean.success("获取仓库信息成功", new PageInfo<>(mWhExList));
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("获取仓库信息失败");
        }
    }

    @SystemLog("获取仓库下拉框")
    @GetMapping(value = "getWh")
    public ResultBean getWh(String cntrCd, String whType) {
        List<MWh> mWhList = new ArrayList<>();
        try {
            mWhList = commonService.getMWh(cntrCd, whType);
            return ResultBean.success("获取仓库成功", mWhList);
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("获取仓库失败");
        }
    }

    @SystemLog("获取库位下拉框")
    @GetMapping(value = "getLoc")
    public ResultBean getLoc(String cntrCd, String whId, String zoneId) {
        List<MLocEx> mLocExList = new ArrayList<>();
        try {
            mLocExList = commonService.getMLoc(cntrCd, whId, zoneId);
            return ResultBean.success("获取库位下拉框成功", mLocExList);
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("获取库位下拉框失败");
        }
    }

    @SystemLog("获取所有库位下拉框")
    @GetMapping(value = "getLocAll")
    public ResultBean getLocAll(String cntrCd, String whId, String zoneId) {
        List<MLoc> mLocList = new ArrayList<>();
        try {
            mLocList = commonService.getMLocAll(cntrCd, whId, zoneId);
            return ResultBean.success("获取所有库位下拉框成功", mLocList);
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("获取所有库位下拉框失败");
        }
    }

    @SystemLog("获取区域下拉框")
    @GetMapping(value = "getZone")
    public ResultBean getZone(String cntrCd, String whId) {
        List<MZone> mZoneList = new ArrayList<>();
        try {
            mZoneList = commonService.getZone(cntrCd, whId);
            return ResultBean.success("获取区域成功", mZoneList);
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("获取区域失败");
        }
    }

    @SystemLog("获取评级下拉框")
    @GetMapping(value = "getLevel")
    public ResultBean getLevel(String cntrCd, String levelType) {
        List<MLevel> mLevelList = new ArrayList<>();
        try {
            mLevelList = commonService.getLevel(cntrCd, levelType);
            return ResultBean.success("获取评级成功", mLevelList);
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("获取评级失败");
        }
    }

    /**
     * 获取仓库区域信息
     *
     * @param whId 仓库编号
     * @return 需求列表
     */
    @SystemLog("获取仓库区域信息")
    @GetMapping(value = "getMZone")
    public ResultBean getMZone(String whId) {
        List<MWhEx> mWhExList = new ArrayList<>();
        try {
            mWhExList = commonService.getMZone(whId);
            return ResultBean.success("获取仓库区域信息成功", mWhExList);
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("获取仓库区域信息失败");
        }
    }

    /**
     * 新增共通配置信息
     *
     * @param request
     * @param mGenerals
     * @return
     */
    @SystemLog("新增共通配置信息")
    @PostMapping(value = "insertMGeneral")
    public ResultBean insertMGeneral(HttpServletRequest request, String mGenerals) {
        try {
            JSONArray jsStrf = JSONArray.fromObject(mGenerals);
            List<MGeneral> mGeneralLists = (List<MGeneral>) JSONArray.toCollection(jsStrf, MGeneral.class);
            for (int m = 0; m < mGeneralLists.size(); m++) {
                //判断共通CODE是否重复
                Example.Criteria criteriaCd = mGeneralService.createCriteria();
                criteriaCd.andEqualTo("delFlg", '0');
                criteriaCd.andEqualTo("generalMasterType", mGeneralLists.get(m).getGeneralMasterType());
                criteriaCd.andEqualTo("generalMasterTypeNm", mGeneralLists.get(m).getGeneralMasterTypeNm());
                criteriaCd.andEqualTo("generalCd", mGeneralLists.get(m).getGeneralCd());
                List<MGeneral> sysGenerals = mGeneralService.selectByCondition(criteriaCd);
                if (sysGenerals.size() > 0) {
                    return ResultBean.failure("共通CODE已存在！");
                }
                //判断共通名称是否重复
                if (!StringUtils.isNullOrEmpty(mGeneralLists.get(m).getGeneralNm())) {
                    criteriaCd.andEqualTo("delFlg", '0');
                    criteriaCd.andEqualTo("generalMasterType", mGeneralLists.get(m).getGeneralMasterType());
                    criteriaCd.andEqualTo("generalMasterTypeNm", mGeneralLists.get(m).getGeneralMasterTypeNm());
                    criteriaCd.andEqualTo("generalNm", mGeneralLists.get(m).getGeneralNm());
                    sysGenerals = mGeneralService.selectByCondition(criteriaCd);
                    if (sysGenerals.size() > 0) {
                        return ResultBean.failure("共通名称已存在！");
                    }
                }
                //判断共通略称是否重复
                if (!StringUtils.isNullOrEmpty(mGeneralLists.get(m).getGeneralAbbr())) {
                    Example.Criteria criteriaAbbr = mGeneralService.createCriteria();
                    criteriaCd.andEqualTo("delFlg", '0');
                    criteriaCd.andEqualTo("generalMasterType", mGeneralLists.get(m).getGeneralMasterType());
                    criteriaCd.andEqualTo("generalMasterTypeNm", mGeneralLists.get(m).getGeneralMasterTypeNm());
                    criteriaCd.andEqualTo("generalAbbr", mGeneralLists.get(m).getGeneralAbbr());
                    sysGenerals = mGeneralService.selectByCondition(criteriaCd);
                    if (sysGenerals.size() > 0) {
                        return ResultBean.failure("共通略称已存在！");
                    }
                }
            }
            List<MGeneral> tmpList = commonService.insertMGeneral(request, mGeneralLists);
            // 同步其他服务数据
            extraServiceController.insertMGeneral(tmpList);

            return ResultBean.success("新增共通配置信息成功！");
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("新增共通配置信息失败！");
        }
    }

    /**
     * 编辑共通配置信息
     *
     * @param request
     * @param mGeneralInsert
     * @param mGeneralUpdate
     * @return
     */
    @SystemLog("编辑共通配置信息")
    @PostMapping(value = "updateMGeneral")
    @Transactional
    public ResultBean updateMGeneral(HttpServletRequest request, String mGeneralInsert, String mGeneralUpdate) {
        try {
            List<MGeneral> mGeneralInserts = new ArrayList<>();
            if (mGeneralInsert != null) {
                //共通CODE新增信息JSON
                JSONArray jsStrf1 = JSONArray.fromObject(mGeneralInsert);
                mGeneralInserts = (List<MGeneral>) JSONArray.toCollection(jsStrf1, MGeneral.class);
                for (int m = 0; m < mGeneralInserts.size(); m++) {
                    //判断共通CODE是否重复
                    Example.Criteria criteriaCd = mGeneralService.createCriteria();
                    criteriaCd.andEqualTo("delFlg", '0');
                    criteriaCd.andEqualTo("generalMasterType", mGeneralInserts.get(m).getGeneralMasterType());
                    criteriaCd.andEqualTo("generalMasterTypeNm", mGeneralInserts.get(m).getGeneralMasterTypeNm());
                    criteriaCd.andEqualTo("generalCd", mGeneralInserts.get(m).getGeneralCd());
                    List<MGeneral> sysGenerals = mGeneralService.selectByCondition(criteriaCd);
                    if (sysGenerals.size() > 0) {
                        return ResultBean.failure("共通CODE已存在！");
                    }
                    //判断共通名称是否重复
                    if (!StringUtils.isNullOrEmpty(mGeneralInserts.get(m).getGeneralNm())) {
                        Example.Criteria criteriaNm = mGeneralService.createCriteria();
                        criteriaNm.andEqualTo("delFlg", '0');
                        criteriaNm.andEqualTo("generalMasterType", mGeneralInserts.get(m).getGeneralMasterType());
                        criteriaNm.andEqualTo("generalMasterTypeNm", mGeneralInserts.get(m).getGeneralMasterTypeNm());
                        criteriaNm.andEqualTo("generalNm", mGeneralInserts.get(m).getGeneralNm());
                        sysGenerals = mGeneralService.selectByCondition(criteriaNm);
                        if (sysGenerals.size() > 0) {
                            return ResultBean.failure("共通名称已存在！");
                        }
                    }
                    //判断共通略称是否重复
                    if (!StringUtils.isNullOrEmpty(mGeneralInserts.get(m).getGeneralAbbr())) {
                        Example.Criteria criteriaJc = mGeneralService.createCriteria();
                        criteriaJc.andEqualTo("delFlg", '0');
                        criteriaJc.andEqualTo("generalMasterType", mGeneralInserts.get(m).getGeneralMasterType());
                        criteriaJc.andEqualTo("generalMasterTypeNm", mGeneralInserts.get(m).getGeneralMasterTypeNm());
                        criteriaJc.andEqualTo("generalAbbr", mGeneralInserts.get(m).getGeneralAbbr());
                        sysGenerals = mGeneralService.selectByCondition(criteriaJc);
                        if (sysGenerals.size() > 0) {
                            return ResultBean.failure("共通略称已存在！");
                        }
                    }
                }
                mGeneralInserts = commonService.insertMGeneral(request, mGeneralInserts);
            }
            if (mGeneralUpdate != null) {
                //共通CODE更新信息JSON
                JSONArray jsStrf2 = JSONArray.fromObject(mGeneralUpdate);
                List<MGeneral> mGeneralUpdates = (List<MGeneral>) JSONArray.toCollection(jsStrf2, MGeneral.class);
                for (int m = 0; m < mGeneralUpdates.size(); m++) {
                    //判断更新信息时效性
                    Example.Criteria criteria = mGeneralService.createCriteria();
                    criteria.andEqualTo("id", mGeneralUpdates.get(m).getId());
                    List<MGeneral> mGeneralList = mGeneralService.selectByCondition(criteria);
                    if (!mGeneralUpdates.get(m).getUpdCnt().equals(mGeneralList.get(0).getUpdCnt())) {
                        return ResultBean.failure("数据已被修改,请重试！");
                    }
                    //判断共通CODE是否重复
                    Example.Criteria criteriaCd = mGeneralService.createCriteria();
                    criteriaCd.andEqualTo("delFlg", '0');
                    criteriaCd.andNotEqualTo("id", mGeneralUpdates.get(m).getId());
                    criteriaCd.andEqualTo("generalMasterType", mGeneralUpdates.get(m).getGeneralMasterType());
                    criteriaCd.andEqualTo("generalMasterTypeNm", mGeneralUpdates.get(m).getGeneralMasterTypeNm());
                    criteriaCd.andEqualTo("generalCd", mGeneralUpdates.get(m).getGeneralCd());
                    List<MGeneral> sysGenerals = mGeneralService.selectByCondition(criteriaCd);
                    if (sysGenerals.size() > 0) {
                        return ResultBean.failure("共通CODE已存在！");
                    }
                    //判断共通名称是否重复
                    if (!StringUtils.isNullOrEmpty(mGeneralUpdates.get(m).getGeneralNm())) {
                        Example.Criteria criteriaNm = mGeneralService.createCriteria();
                        criteriaNm.andEqualTo("delFlg", '0');
                        criteriaNm.andNotEqualTo("id", mGeneralUpdates.get(m).getId());
                        criteriaNm.andEqualTo("generalMasterType", mGeneralUpdates.get(m).getGeneralMasterType());
                        criteriaNm.andEqualTo("generalMasterTypeNm", mGeneralUpdates.get(m).getGeneralMasterTypeNm());
                        criteriaNm.andEqualTo("generalNm", mGeneralUpdates.get(m).getGeneralNm());
                        sysGenerals = mGeneralService.selectByCondition(criteriaNm);
                        if (sysGenerals.size() > 0) {
                            return ResultBean.failure("共通名称已存在！");
                        }
                    }
                    //判断共通略称是否重复
                    if (!StringUtils.isNullOrEmpty(mGeneralUpdates.get(m).getGeneralAbbr())) {
                        Example.Criteria criteriaJc = mGeneralService.createCriteria();
                        criteriaJc.andEqualTo("delFlg", '0');
                        criteriaJc.andNotEqualTo("id", mGeneralUpdates.get(m).getId());
                        criteriaJc.andEqualTo("generalMasterType", mGeneralUpdates.get(m).getGeneralMasterType());
                        criteriaJc.andEqualTo("generalMasterTypeNm", mGeneralUpdates.get(m).getGeneralMasterTypeNm());
                        criteriaJc.andEqualTo("generalAbbr", mGeneralUpdates.get(m).getGeneralAbbr());
                        sysGenerals = mGeneralService.selectByCondition(criteriaJc);
                        if (sysGenerals.size() > 0) {
                            return ResultBean.failure("共通略称已存在！");
                        }
                    }
                }

                commonService.updateMGeneral(request, mGeneralUpdates);
                // 同步其他服务数据
                Map<String, Object> tempMap = new HashMap<String, Object>();
                tempMap.put("mGeneralInsert", mGeneralInserts);
                tempMap.put("mGeneralUpdate", mGeneralUpdate);
                extraServiceController.updateMGeneral(tempMap);
            }
            return ResultBean.success("编辑共通配置信息成功！");
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("编辑共通配置信息失败！");
        }
    }

    /**
     * 删除共通配置信息
     *
     * @param mGeneral
     * @return
     */
    @SystemLog("删除共通配置信息")
    @PostMapping(value = "deleteMGeneral")
    public ResultBean deleteMGeneral(HttpServletRequest request, MGeneral mGeneral) {
        try {
            Example.Criteria criteria = mGeneralService.createCriteria();
            criteria.andEqualTo("id", mGeneral.getId());
            List<MGeneral> mGenerals = mGeneralService.selectByCondition(criteria);
            if (!mGeneral.getUpdCnt().equals(mGenerals.get(0).getUpdCnt())) {
                return ResultBean.failure("数据已被修改,请重试！");
            }
            MGeneral tempGeneral = CommonUtils.clone(mGeneral);
            commonService.deleteMGeneral(request, mGeneral);
            // 同步其他服务数据
            extraServiceController.deleteMGeneral(tempGeneral);
            return ResultBean.success("删除共通配置信息成功！");
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("删除共通配置信息失败！");
        }
    }

    /**
     * 获取共通配置信息
     *
     * @param page                当前页数
     * @param limit               分页数
     * @param generalMasterTypeNm 共通区分名称
     * @param generalMasterType   共通区分
     * @return 需求列表
     */
    @SystemLog("获取共通配置信息")
    @GetMapping(value = "getMGeneral")
    public ResultBean getMGeneral(Integer page, Integer limit, String generalMasterTypeNm, String generalMasterType) {
        List<MGeneral> mGeneraList = new ArrayList<>();
        try {
            mGeneraList = commonService.getMGeneral(page, limit, generalMasterTypeNm, generalMasterType);
            return ResultBean.success("获取共通配置信息成功", new PageInfo<>(mGeneraList));
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("获取共通配置信息失败");
        }
    }

    /**
     * 获取共通配置明细
     *
     * @param generalMasterType
     * @return 需求列表
     */
    @SystemLog("获取共通配置明细")
    @GetMapping(value = "getMGeneralLine")
    public ResultBean getMGeneralLine(String generalMasterType) {
        List<MGeneral> mGeneraLineList = new ArrayList<>();
        try {
            mGeneraLineList = commonService.getMGeneralLine(generalMasterType);
            return ResultBean.success("获取共通配置明细成功", mGeneraLineList);
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("获取共通配置明细失败");
        }
    }

    /**
     * 新增库位信息
     *
     * @param request
     * @param mLoc
     * @return
     */
    @SystemLog("新增库位信息")
    @PostMapping(value = "insertMLoc")
    public ResultBean insertMLoc(HttpServletRequest request, MLoc mLoc) {
        try {
            //判断库位名称是否重复
            Example.Criteria criteriaNm = mLocService.createCriteria();
            criteriaNm.andEqualTo("cntrCd", mLoc.getCntrCd());
            criteriaNm.andEqualTo("whId", mLoc.getWhId());
            //criteriaNm.andEqualTo("zoneId", mLoc.getZoneId());// upda 20210126 gxj 修改新增库位，同仓库不同大区禁止添加相同的库位号
            criteriaNm.andEqualTo("delFlg", '0');
            criteriaNm.andEqualTo("locNm", mLoc.getLocNm());
            List<MLoc> sysLocs = mLocService.selectByCondition(criteriaNm);
            if (sysLocs.size() > 0) {
                return ResultBean.failure("库位名称已存在！");
            }
            //判断库位表示用编号是否为空
            if (StringUtils.isNullOrEmpty(mLoc.getLocCdDis())) {
                String aa = mNumberService.getMNumberList("LOC_CD");
                mLoc.setLocCdDis(aa);
            }
            //判断库位表示用编号是否重复
            Example.Criteria criteriaCd = mLocService.createCriteria();
            criteriaCd.andEqualTo("cntrCd", mLoc.getCntrCd());
            criteriaCd.andEqualTo("whId", mLoc.getWhId());
            criteriaCd.andEqualTo("zoneId", mLoc.getZoneId());
            criteriaCd.andEqualTo("delFlg", '0');
            criteriaCd.andEqualTo("locCdDis", mLoc.getLocCdDis());
            sysLocs = mLocService.selectByCondition(criteriaCd);
            if (sysLocs.size() > 0) {
                return ResultBean.failure("库位表示用编号已存在！");
            }
            MLoc tmpMloc = commonService.insertMLoc(request, mLoc);
            // 同步其他服务数据
            extraServiceController.insertMLoc(tmpMloc);
            return ResultBean.success("新增库位信息成功！");
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("新增库位信息失败！");
        }
    }

    /**
     * 编辑库位信息
     *
     * @param request
     * @param mLoc
     * @return
     */
    @SystemLog("编辑库位信息")
    @PostMapping(value = "updateMLoc")
    public ResultBean updateMLoc(HttpServletRequest request, MLoc mLoc) {
        try {
            Example.Criteria criteria = mLocService.createCriteria();
            criteria.andEqualTo("id", mLoc.getId());
            List<MLoc> mLocs = mLocService.selectByCondition(criteria);
            if (!mLoc.getUpdCnt().equals(mLocs.get(0).getUpdCnt())) {
                return ResultBean.failure("数据已被修改,请重试！");
            }
            Example.Criteria criteria2 = mLocService.createCriteria();
            criteria2.andEqualTo("cntrCd", mLoc.getCntrCd());
            criteria2.andEqualTo("whId", mLoc.getWhId());
            criteria2.andEqualTo("zoneId", mLoc.getZoneId());
            criteria2.andEqualTo("delFlg", '0');
            criteria2.andNotEqualTo("id", mLoc.getId());
            criteria2.andEqualTo("locNm", mLoc.getLocNm());
            List<MLoc> sysLocs = mLocService.selectByCondition(criteria2);
            if (sysLocs.size() > 0) {
                return ResultBean.failure("库位名称已存在！");
            }
            if (StringUtils.isNullOrEmpty(mLoc.getLocCdDis())) {
                String aa = mNumberService.getMNumberList("LOC_CD");
                mLoc.setLocCdDis(aa);
            }
            Example.Criteria criteriaCd = mLocService.createCriteria();
            criteriaCd.andEqualTo("cntrCd", mLoc.getCntrCd());
            criteriaCd.andEqualTo("whId", mLoc.getWhId());
            criteriaCd.andEqualTo("zoneId", mLoc.getZoneId());
            criteriaCd.andEqualTo("delFlg", '0');
            criteriaCd.andNotEqualTo("id", mLoc.getId());
            criteriaCd.andEqualTo("locCdDis", mLoc.getLocCdDis());
            sysLocs = mLocService.selectByCondition(criteriaCd);
            if (sysLocs.size() > 0) {
                return ResultBean.failure("库位表示用编号已存在！");
            }
            MLoc tempLoc = CommonUtils.clone(mLoc);
            commonService.updateMLoc(request, mLoc);
            // 同步其他服务数据
            extraServiceController.updateMLoc(tempLoc);
            return ResultBean.success("编辑库位信息成功！");
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("编辑库位信息失败！");
        }
    }

    /**
     * 删除库位信息
     *
     * @param mLoc
     * @return
     */
    @SystemLog("删除库位信息")
    @PostMapping(value = "deleteMLoc")
    public ResultBean deleteMLoc(HttpServletRequest request, MLoc mLoc) {
        try {
            Example.Criteria criteria = mLocService.createCriteria();
            criteria.andEqualTo("id", mLoc.getId());
            List<MLoc> mLocs = mLocService.selectByCondition(criteria);
            if (!mLoc.getUpdCnt().equals(mLocs.get(0).getUpdCnt())) {
                return ResultBean.failure("数据已被修改,请重试！");
            }
            MLoc tempLoc = CommonUtils.clone(mLoc);
            commonService.deleteMLoc(request, mLoc);
            // 同步其他服务数据
            extraServiceController.deleteMLoc(tempLoc);
            return ResultBean.success("删除库位信息成功！");
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("删除库位信息失败！");
        }
    }

    /**
     * 获取库位信息
     *
     * @param page     当前页数
     * @param limit    分页数
     * @param cntrCd   中心编号
     * @param whId     仓库编号
     * @param zoneId   区域编号
     * @param locType  库位类型
     * @param locCdDis 库位表示用编号
     * @param locNm    库位名称
     * @return 需求列表
     */
    @SystemLog("获取库位信息")
    @GetMapping(value = "getMLoc")
    public ResultBean getMLoc(Integer page, Integer limit, String cntrCd, String whId, String zoneId, String locType, String locCdDis, String locNm) {
        List<MLocEx> mLocExList = new ArrayList<>();
        try {
            mLocExList = commonService.getMLoc(page, limit, cntrCd, whId, zoneId, locType, locCdDis, locNm);
            return ResultBean.success("获取库位信息成功", new PageInfo<>(mLocExList));
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("获取库位信息失败");
        }
    }

    /**
     * 获取共通信息
     *
     * @return 需求列表
     */
    @SystemLog("获取共通信息")
    @GetMapping(value = "getGeneralList")
    //modify by xieshengjie 2019/11/28 begin
    //public ResultBean getGeneralList(String generalType)
    public ResultBean getGeneralList(String generalType,
                                     String char1, String char2, String char3,
                                     String char4, String char5, String char6,
                                     String char7, String char8, String char9,
                                     String char10
    ) {
        //modify by xieshengjie 2019/11/28 end
        List<MGeneral> mGeneralList = new ArrayList<>();
        try {
            //modify by xieshengjie 2019/11/28 begin
            //mGeneralList = mGeneralListService.selectGeneral(generalType);
            mGeneralList = mGeneralListService.selectGeneral(generalType, char1, char2, char3,
                char4, char5, char6,
                char7, char8, char9,
                char10);
            //modify by xieshengjie 2019/11/28 end
            return ResultBean.success("获取共通信息成功", mGeneralList);
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("获取共通信息失败");
        }
    }

    /**
     * @return
     * @author wyy
     * @date 2020/7/27
     * 获取打样执行状态(除未打样)
     */
    @SystemLog("获取打样执行状态")
    @GetMapping(value = "getProofingCls")
    public ResultBean getProofingCls(String generalType) {
        List<MGeneral> mGeneralList = new ArrayList<>();
        try {
            mGeneralList = mGeneralListService.selectGeneral(generalType);
            return ResultBean.success("获取共通信息成功", mGeneralList);
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("获取共通信息失败");
        }
    }

    /**
     * 获取库位明细
     *
     * @param locId 库位编号
     * @return 需求列表
     */
    @SystemLog("获取库位明细")
    @GetMapping(value = "getMLocList")
    public ResultBean getMLocLine(String locId) {
        List<MLocEx> mLocExList = new ArrayList<>();
        try {
            mLocExList = commonService.getMLocList(locId);
            return ResultBean.success("获取库位明细成功", mLocExList);
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("获取库位明细失败");
        }
    }

    /**
     * 新增客户信息
     *
     * @param request
     * @param mCustomer
     * @return
     */
    @SystemLog("新增客户信息")
    @PostMapping(value = "insertMCustomer")
    public ResultBean insertMCustomer(HttpServletRequest request, MCustomer mCustomer) {
        try {
            Example.Criteria criteriaNm = mCustomerService.createCriteria();
//            criteriaNm.andEqualTo("cntrCd",mCustomer.getCntrCd());
            criteriaNm.andEqualTo("delFlg", '0');
            criteriaNm.andEqualTo("customerNm", mCustomer.getCustomerNm());
            List<MCustomer> sysCustomers = mCustomerService.selectByCondition(criteriaNm);
            if (sysCustomers.size() > 0) {
                return ResultBean.failure("客户名称已存在！");
            }
            if (!StringUtils.isNullOrEmpty(mCustomer.getCustomerNmEn())) {
                Example.Criteria criteriaNmEn = mCustomerService.createCriteria();
//                criteriaNmEn.andEqualTo("cntrCd", mCustomer.getCntrCd());
                criteriaNmEn.andEqualTo("delFlg", '0');
                criteriaNmEn.andEqualTo("customerNmEn", mCustomer.getCustomerNmEn());
                sysCustomers = mCustomerService.selectByCondition(criteriaNmEn);
                if (sysCustomers.size() > 0) {
                    return ResultBean.failure("客户英文名称已存在！");
                }
            }
//            if (!StringUtils.isNullOrEmpty(mCustomer.getCustomerJc())) {
//                Example.Criteria criteriaJc = mCustomerService.createCriteria();
////                criteriaJc.andEqualTo("cntrCd", mCustomer.getCntrCd());
//                criteriaJc.andEqualTo("delFlg", '0');
//                criteriaJc.andEqualTo("customerJc", mCustomer.getCustomerJc());
//                sysCustomers = mCustomerService.selectByCondition(criteriaJc);
//                if (sysCustomers.size() > 0) {
//                    return ResultBean.failure("客户简称已存在！");
//                }
//            }
            //判断客户表示用编号是否为空
            if (StringUtils.isNullOrEmpty(mCustomer.getCustomerCdDis())) {
                String customerCdDis = mNumberService.getMNumberList("CUSTOMER_CD_DIS");
                mCustomer.setCustomerCdDis(customerCdDis);
            }
            //判断客户表示用编号是否重复
            Example.Criteria criteriaCd = mCustomerService.createCriteria();
            criteriaCd.andEqualTo("delFlg", '0');
            criteriaCd.andEqualTo("customerCdDis", mCustomer.getCustomerCdDis());
            sysCustomers = mCustomerService.selectByCondition(criteriaCd);
            if (sysCustomers.size() > 0) {
                return ResultBean.failure("客户表示用编号已存在！");
            }
            mCustomer = commonService.insertMCustomer(request, mCustomer);
            // 同步其他服务数据
            extraServiceController.insertMCustomer(mCustomer);
            return ResultBean.success("新增客户信息成功！");
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("新增客户信息失败！");
        }
    }

    /**
     * 编辑客户信息
     *
     * @param request
     * @param mCustomer
     * @return
     */
    @SystemLog("编辑客户信息")
    @PostMapping(value = "updateMCustomer")
    public ResultBean updateMCustomer(HttpServletRequest request, MCustomer mCustomer) {
        try {
            Example.Criteria criteria = mCustomerService.createCriteria();
            criteria.andEqualTo("id", mCustomer.getId());
            List<MCustomer> mCustomers = mCustomerService.selectByCondition(criteria);
            if (!mCustomer.getUpdCnt().equals(mCustomers.get(0).getUpdCnt())) {
                return ResultBean.failure("数据已被修改,请重试！");
            }
            Example.Criteria criteriaNM = mCustomerService.createCriteria();
//            criteriaNM.andEqualTo("cntrCd",mCustomer.getCntrCd());
            criteriaNM.andNotEqualTo("id", mCustomer.getId());
            criteriaNM.andEqualTo("customerNm", mCustomer.getCustomerNm());
            criteriaNM.andEqualTo("delFlg", '0');
            List<MCustomer> sysCustomers = mCustomerService.selectByCondition(criteriaNM);
            if (sysCustomers.size() > 0) {
                return ResultBean.failure("客户名称已存在！");
            }
            if (!StringUtils.isNullOrEmpty(mCustomer.getCustomerNmEn())) {
                Example.Criteria criteriaNmEn = mCustomerService.createCriteria();
//                criteriaNmEn.andEqualTo("cntrCd", mCustomer.getCntrCd());
                criteriaNmEn.andNotEqualTo("id", mCustomer.getId());
                criteriaNmEn.andEqualTo("delFlg", '0');
                criteriaNmEn.andEqualTo("customerNmEn", mCustomer.getCustomerNmEn());
                sysCustomers = mCustomerService.selectByCondition(criteriaNmEn);
                if (sysCustomers.size() > 0) {
                    return ResultBean.failure("客户英文名称已存在！");
                }
            }
//            if (!StringUtils.isNullOrEmpty(mCustomer.getCustomerJc())) {
//                Example.Criteria criteriaJc = mCustomerService.createCriteria();
////                criteriaJc.andEqualTo("cntrCd", mCustomer.getCntrCd());
//                criteriaJc.andNotEqualTo("id", mCustomer.getId());
//                criteriaJc.andEqualTo("delFlg", '0');
//                criteriaJc.andEqualTo("customerJc", mCustomer.getCustomerJc());
//                sysCustomers = mCustomerService.selectByCondition(criteriaJc);
//                if (sysCustomers.size() > 0) {
//                    return ResultBean.failure("客户简称已存在！");
//                }
//            }
            if (StringUtils.isNullOrEmpty(mCustomer.getCustomerCdDis())) {
                String customerCdDis = mNumberService.getMNumberList("CUSTOMER_CD_DIS");
                mCustomer.setCustomerCdDis(customerCdDis);
            }
            Example.Criteria criteriaCd = mCustomerService.createCriteria();
//            criteriaCd.andEqualTo("cntrCd",mCustomer.getCntrCd());
            criteriaCd.andNotEqualTo("id", mCustomer.getId());
            criteriaCd.andEqualTo("delFlg", '0');
            criteriaCd.andEqualTo("customerCdDis", mCustomer.getCustomerCdDis());
            sysCustomers = mCustomerService.selectByCondition(criteriaCd);
            if (sysCustomers.size() > 0) {
                return ResultBean.failure("客户编号已存在！");
            }
            MCustomer tempCustomer1 = CommonUtils.clone(mCustomer);
            commonService.updateMCustomer(request, mCustomer);
            // 同步其他服务数据
            extraServiceController.updateMCustomer(tempCustomer1);
            return ResultBean.success("编辑客户信息成功！");
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("编辑客户信息失败！");
        }
    }

    /**
     * 删除客户信息
     *
     * @param mCustomer
     * @return
     */
    @SystemLog("删除客户信息")
    @PostMapping(value = "deleteMCustomer")
    public ResultBean deleteMCustomer(HttpServletRequest request, MCustomer mCustomer) {
        try {
            Example.Criteria criteria = mCustomerService.createCriteria();
            criteria.andEqualTo("id", mCustomer.getId());
            List<MCustomer> mCustomers = mCustomerService.selectByCondition(criteria);
            if (!mCustomer.getUpdCnt().equals(mCustomers.get(0).getUpdCnt())) {
                return ResultBean.failure("数据已被修改,请重试！");
            }
            MCustomer tempCustomer = CommonUtils.clone(mCustomer);
            commonService.deleteMCustomer(request, mCustomer);
            // 同步其他服务数据
            extraServiceController.deleteMCustomer(tempCustomer);
            return ResultBean.success("删除客户信息成功！");
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("删除客户信息失败！");
        }
    }

    /**
     * 获取客户信息
     *
     * @param page          当前页数
     * @param limit         分页数
     * @param customerCdDis 客户表示用编号
     * @param customerNm    客户名称
     * @param customerJc    客户简称
     * @param customerType  客户种类
     * @param customerNmEn  客户英文名称
     * @param levelId       客户评价等级
     * @param cntryCd       国家编号
     * @param paymentType   结算方式
     * @return 需求列表
     */
    @SystemLog("获取客户信息")
    @GetMapping(value = "getMCustomer")
    public ResultBean getMCustomer(Integer page, Integer limit, String customerCdDis, String customerNm, String customerJc, String customerType, String customerNmEn, String levelId, String cntryCd, String paymentType, String Id) {
        List<MCustomerEx> mCustomerExList = new ArrayList<>();
        try {
            mCustomerExList = commonService.getMCustomer(page, limit, customerCdDis, customerNm, customerJc, customerType, customerNmEn, levelId, cntryCd, paymentType, Id);
            return ResultBean.success("获取客户信息成功", new PageInfo<>(mCustomerExList));
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("获取客户信息失败");
        }
    }

    /**
     * 获取客户明细
     *
     * @param customerId 客户编号
     * @return 需求列表
     */
    @SystemLog("获取客户明细")
    @GetMapping(value = "getMCustomerLine")
    public ResultBean getMCustomerLine(String customerId) {
        List<MCustomerEx> mCustomerLineList = new ArrayList<>();
        try {
            mCustomerLineList = commonService.getMCustomerLine(customerId);
            return ResultBean.success("获取客户明细成功", mCustomerLineList);
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("获取客户明细失败");
        }
    }

    /**
     * 获取客户评价信息
     *
     * @param page       当前页数
     * @param limit      分页数
     * @param customerId 客户编号
     * @return 需求列表
     */
    @SystemLog("获取客户评价信息")
    @GetMapping(value = "getTCustomerAppraise")
    public ResultBean getTCustomerAppraise(Integer page, Integer limit, String customerId) {
        List<TCustomerAppraiseList> tCustomerAppraiseList = new ArrayList<>();
        try {
            tCustomerAppraiseList = commonService.getTCustomerAppraise(page, limit, customerId);
            return ResultBean.success("获取客户评价信息成功", new PageInfo<>(tCustomerAppraiseList));
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("获取客户评价信息失败");
        }
    }

    /**
     * 获取供应商评价信息
     *
     * @param page       当前页数
     * @param limit      分页数
     * @param supplierId 供应商编号
     * @return 需求列表
     */
    @SystemLog("获取供应商评价信息")
    @GetMapping(value = "getTSupplierAppraise")
    public ResultBean getTSupplierAppraise(Integer page, Integer limit, String supplierId) {
        List<TSupplierAppraiseList> tSupplierAppraiseList = new ArrayList<>();
        try {
            tSupplierAppraiseList = commonService.getTSupplierAppraise(page, limit, supplierId);
            return ResultBean.success("获取供应商评价信息成功", new PageInfo<>(tSupplierAppraiseList));
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("获取供应商评价信息失败");
        }
    }

    /**
     * 新增供应商信息
     *
     * @param request
     * @param mSupplier
     * @param mSupplierLines
     * @return
     */
    @SystemLog("新增供应商信息")
    @PostMapping(value = "insertMSupplier")
    public ResultBean insertMSupplier(HttpServletRequest request, MSupplier mSupplier, String mSupplierLines) {
        try {
            Example.Criteria criteriaNm = mSupplierService.createCriteria();
            criteriaNm.andEqualTo("cntrCd", mSupplier.getCntrCd());
            criteriaNm.andEqualTo("supplierNm", mSupplier.getSupplierNm());
            criteriaNm.andEqualTo("delFlg", '0');
            List<MSupplier> sysSuppliers = mSupplierService.selectByCondition(criteriaNm);
            if (sysSuppliers.size() > 0) {
                return ResultBean.failure("供应商名称已存在！");
            }
            if (!StringUtils.isNullOrEmpty(mSupplier.getSupplierNmEn())) {
                Example.Criteria criteriaNmEn = mSupplierService.createCriteria();
                criteriaNmEn.andEqualTo("cntrCd", mSupplier.getCntrCd());
                criteriaNmEn.andEqualTo("supplierNmEn", mSupplier.getSupplierNmEn());
                criteriaNmEn.andEqualTo("delFlg", '0');
                sysSuppliers = mSupplierService.selectByCondition(criteriaNmEn);
                if (sysSuppliers.size() > 0) {
                    return ResultBean.failure("供应商英文名称已存在！");
                }
            }
            if (!StringUtils.isNullOrEmpty(mSupplier.getSupplierJc())) {
                Example.Criteria criteriaJc = mSupplierService.createCriteria();
                criteriaJc.andEqualTo("cntrCd", mSupplier.getCntrCd());
                criteriaJc.andEqualTo("supplierJc", mSupplier.getSupplierJc());
                criteriaJc.andEqualTo("delFlg", '0');
                sysSuppliers = mSupplierService.selectByCondition(criteriaJc);
                if (sysSuppliers.size() > 0) {
                    return ResultBean.failure("供应商简称已存在！");
                }
            }

            if (StringUtils.isNullOrEmpty(mSupplier.getSupplierCdDis())) {
                String supplierCdDis = mNumberService.getMNumberList("SUPPLIER_CD_DIS");
                mSupplier.setSupplierCdDis(supplierCdDis);
            }
            //判断供应商表示用编号是否重复
            Example.Criteria criteriaCd = mSupplierService.createCriteria();
            criteriaCd.andEqualTo("supplierCdDis", mSupplier.getSupplierCdDis());
            criteriaCd.andEqualTo("delFlg", '0');
            sysSuppliers = mSupplierService.selectByCondition(criteriaCd);
            if (sysSuppliers.size() > 0) {
                return ResultBean.failure("供应商表示用编号已存在！");
            }
            JSONArray jsStrf = JSONArray.fromObject(mSupplierLines);
            List<MSupplierLineEx> mSupplierLineLists = (List<MSupplierLineEx>) JSONArray.toCollection(jsStrf, MSupplierLineEx.class);

            // 同步其他服务数据
            Map<String, Object> tempMap = commonService.insertMSupplier(request, mSupplier, mSupplierLineLists);
            extraServiceController.insertMSupplier(tempMap);

            return ResultBean.success("新增供应商信息成功！");
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("新增供应商信息失败！");
        }
    }

    /**
     * 编辑供应商信息
     *
     * @param request
     * @param mSupplier           供应商
     * @param mSupplierLineupdate 供应商明细编辑
     * @param mSupplierLineinsert 供应商明细新增
     * @return
     */
    @SystemLog("编辑供应商信息")
    @PostMapping(value = "updateMSupplier")
    public ResultBean updateMSupplier(HttpServletRequest request, MSupplier mSupplier, String mSupplierLineupdate, String mSupplierLineinsert) {
        try {
            MSupplier tempSupplier = CommonUtils.clone(mSupplier);
            Example.Criteria criteria = mSupplierService.createCriteria();
            criteria.andEqualTo("id", mSupplier.getId());
            List<MSupplier> mSuppliers = mSupplierService.selectByCondition(criteria);
            if (!mSupplier.getUpdCnt().equals(mSuppliers.get(0).getUpdCnt())) {
                return ResultBean.failure("数据已被修改,请重试！");
            }
            Example.Criteria criteriaNm = mSupplierService.createCriteria();
            criteriaNm.andEqualTo("cntrCd", mSupplier.getCntrCd());
            criteriaNm.andNotEqualTo("id", mSupplier.getId());
            criteriaNm.andEqualTo("delFlg", '0');
            criteriaNm.andEqualTo("supplierNm", mSupplier.getSupplierNm());
            List<MSupplier> sysSuppliers = mSupplierService.selectByCondition(criteriaNm);
            if (sysSuppliers.size() > 0) {
                return ResultBean.failure("供应商名称已存在！");
            }
            if (!StringUtils.isNullOrEmpty(mSupplier.getSupplierNmEn())) {
                Example.Criteria criteriaNmEn = mSupplierService.createCriteria();
                criteriaNmEn.andEqualTo("cntrCd", mSupplier.getCntrCd());
                criteriaNmEn.andNotEqualTo("id", mSupplier.getId());
                criteriaNmEn.andEqualTo("supplierNmEn", mSupplier.getSupplierNmEn());
                criteriaNmEn.andEqualTo("delFlg", '0');
                sysSuppliers = mSupplierService.selectByCondition(criteriaNmEn);
                if (sysSuppliers.size() > 0) {
                    return ResultBean.failure("供应商英文名称已存在！");
                }
            }
            if (!StringUtils.isNullOrEmpty(mSupplier.getSupplierJc())) {
                Example.Criteria criteriaJc = mSupplierService.createCriteria();
                criteriaJc.andEqualTo("cntrCd", mSupplier.getCntrCd());
                criteriaJc.andNotEqualTo("id", mSupplier.getId());
                criteriaJc.andEqualTo("supplierJc", mSupplier.getSupplierJc());
                criteriaJc.andEqualTo("delFlg", '0');
                sysSuppliers = mSupplierService.selectByCondition(criteriaJc);
                if (sysSuppliers.size() > 0) {
                    return ResultBean.failure("供应商简称已存在！");
                }
            }
            if (StringUtils.isNullOrEmpty(mSupplier.getSupplierCdDis())) {
                String supplierCdDis = mNumberService.getMNumberList("SUPPLIER_CD_DIS");
                mSupplier.setSupplierCdDis(supplierCdDis);
            }
            Example.Criteria criteriaCd = mSupplierService.createCriteria();
            criteriaCd.andEqualTo("cntrCd", mSupplier.getCntrCd());
            criteriaCd.andNotEqualTo("id", mSupplier.getId());
            criteriaCd.andEqualTo("supplierCdDis", mSupplier.getSupplierCdDis());
            criteriaCd.andEqualTo("delFlg", '0');
            sysSuppliers = mSupplierService.selectByCondition(criteriaCd);
            if (sysSuppliers.size() > 0) {
                return ResultBean.failure("供应商表示用编号已存在！");
            }
            if (mSupplierLineupdate != null) {
                JSONArray jsStrf1 = JSONArray.fromObject(mSupplierLineupdate);
                List<MSupplierLineEx> mSupplierLineupdates = (List<MSupplierLineEx>) JSONArray.toCollection(jsStrf1, MSupplierLineEx.class);
                commonService.updateMSupplier(request, mSupplier, mSupplierLineupdates);
            } else {
                commonService.updateSupplier(request, mSupplier);
            }
            List<MSupplierLineEx> mSupplierLineinserts = new ArrayList<>();
            if (mSupplierLineinsert != null) {
                JSONArray jsStrf2 = JSONArray.fromObject(mSupplierLineinsert);
                mSupplierLineinserts = (List<MSupplierLineEx>) JSONArray.toCollection(jsStrf2, MSupplierLineEx.class);
                commonService.insertMSupplierLine(request, mSupplierLineinserts, mSupplier.getId());
            }
            // 同步其他服务数据
            Map<String, Object> tempMap = new HashMap<String, Object>();
            tempMap.put("mSupplier", tempSupplier);
            tempMap.put("mSupplierLineupdate", mSupplierLineupdate);
            tempMap.put("mSupplierLineinsert", mSupplierLineinserts);
            extraServiceController.updateMSupplier(tempMap);
            return ResultBean.success("编辑供应商信息成功！");
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("编辑供应商信息失败！");
        }
    }

    /**
     * 删除供应商信息
     *
     * @param mSupplier
     * @return
     */
    @SystemLog("删除供应商信息")
    @PostMapping(value = "deleteMSupplier")
    public ResultBean deleteMSupplier(HttpServletRequest request, MSupplier mSupplier) {
        try {
            Example.Criteria criteria = mSupplierService.createCriteria();
            criteria.andEqualTo("id", mSupplier.getId());
            List<MSupplier> mSuppliers = mSupplierService.selectByCondition(criteria);
            if (!mSupplier.getUpdCnt().equals(mSuppliers.get(0).getUpdCnt())) {
                return ResultBean.failure("数据已被修改,请重试！");
            }
            MSupplier tempSupplier = CommonUtils.clone(mSupplier);
            commonService.deleteMSupplier(request, mSupplier);
            // 同步其他服务数据
            extraServiceController.deleteMSupplier(tempSupplier);
            return ResultBean.success("删除供应商信息成功！");
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("删除供应商信息失败！");
        }
    }

    /**
     * 删除供应商明细
     *
     * @param mSupplierLine
     * @return
     */
    @SystemLog("删除供应商明细")
    @PostMapping(value = "deleteMSupplierLine")
    public ResultBean deleteMSupplierLine(HttpServletRequest request, MSupplierLine mSupplierLine) {
        try {
            Example.Criteria criteria = mSupplierLineService.createCriteria();
            criteria.andEqualTo("id", mSupplierLine.getId());
            List<MSupplierLine> mSupplierLines = mSupplierLineService.selectByCondition(criteria);
            if (!mSupplierLine.getUpdCnt().equals(mSupplierLines.get(0).getUpdCnt())) {
                return ResultBean.failure("数据已被修改,请重试！");
            }
            MSupplierLine tempSupplierLine = CommonUtils.clone(mSupplierLine);
            commonService.deleteMSupplierLine(request, mSupplierLine);
            // 同步其他服务数据
            extraServiceController.deleteMSupplierLine(tempSupplierLine);
            return ResultBean.success("删除供应商明细成功！");
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("删除供应商明细失败！");
        }
    }

    /**
     * 获取供应商信息
     *
     * @param page          当前页数
     * @param limit         分页数
     * @param supplierCdDis 供应商表示用编号
     * @param supplierNm    供应商名称
     * @param supplierJc    供应商简称
     * @param supplierType  供应商种类
     * @param supplierNmEn  供应商英文名称
     * @param levelId       供应商评价等级
     * @param cntryCd       国家编号
     * @param paymentType   结算方式
     * @return 需求列表
     */
    @SystemLog("获取供应商信息")
    @GetMapping(value = "getMSupplier")
    public ResultBean getMSupplier(Integer page, Integer limit, String supplierCdDis, String supplierNm, String supplierJc, String supplierType, String supplierNmEn, String levelId, String cntryCd, String paymentType) {
        List<MSupplierEx> mSupplierExList = new ArrayList<>();
        try {
            mSupplierExList = commonService.getMSupplier(page, limit, supplierCdDis, supplierNm, supplierJc, supplierType, supplierNmEn, levelId, cntryCd, paymentType);
            return ResultBean.success("获取供应商信息成功", new PageInfo<>(mSupplierExList));
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("获取供应商信息失败");
        }
    }

    /**
     * 获取供应商明细
     *
     * @param supplierId 供应商编号
     * @return 需求列表
     */
    @SystemLog("获取供应商明细")
    @GetMapping(value = "getMSupplierLine")
    public ResultBean getMSupplierLine(String supplierId) {
        List<MSupplierEx> mSupplierLineList = new ArrayList<>();
        try {
            mSupplierLineList = commonService.getMSupplierLine(supplierId);
            return ResultBean.success("获取供应商明细成功", mSupplierLineList);
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("获取供应商明细失败");
        }
    }

    /**
     * 新增用户信息
     *
     * @param request
     * @param mUser
     * @param mLogin
     * @return
     */
    @SystemLog("新增用户信息")
    @PostMapping(value = "insertMUser")
    public ResultBean insertMUser(HttpServletRequest request, MUser mUser, MLogin mLogin) {
        try {
            Example.Criteria criteriaNm = mUserService.createCriteria();
            criteriaNm.andEqualTo("cntrCd", mUser.getCntrCd());
            criteriaNm.andEqualTo("delFlg", '0');
            criteriaNm.andEqualTo("userNm", mUser.getUserNm());
            List<MUser> sysUsers = mUserService.selectByCondition(criteriaNm);
            if (sysUsers.size() > 0) {
                return ResultBean.failure("用户名称已存在！");
            }
            Example.Criteria criteriaCd = mUserService.createCriteria();
            criteriaCd.andEqualTo("cntrCd", mUser.getCntrCd());
            criteriaCd.andEqualTo("delFlg", '0');
            criteriaCd.andEqualTo("userId", mUser.getUserId());
            sysUsers = mUserService.selectByCondition(criteriaCd);
            if (sysUsers.size() > 0) {
                return ResultBean.failure("用户编号已存在！");
            }
            mUser = commonService.insertMUser(request, mUser);
            mLogin = commonService.insertMLogin(request, mUser.getUserId(), mLogin);

            return ResultBean.success("新增用户信息成功！");
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("新增用户信息失败！");
        }
    }

    /**
     * 编辑用户信息
     *
     * @param request
     * @param mUser
     * @param mLogin
     * @return
     */
    @SystemLog("编辑用户信息")
    @PostMapping(value = "updateMUser")
    public ResultBean updateMUser(HttpServletRequest request, MUser mUser, MLogin mLogin) {
        try {
            MUser tempUser = CommonUtils.clone(mUser);
            MLogin tempLogin = CommonUtils.clone(mLogin);
            Example.Criteria criteria = mUserService.createCriteria();
            criteria.andEqualTo("id", mUser.getId());
            List<MUser> mUsers = mUserService.selectByCondition(criteria);
            if (!mUser.getUpdCnt().equals(mUsers.get(0).getUpdCnt())) {
                return ResultBean.failure("数据已被修改,请重试！");
            }
            Example.Criteria criteriaNm = mUserService.createCriteria();
            criteriaNm.andEqualTo("cntrCd", mUser.getCntrCd());
            criteriaNm.andNotEqualTo("id", mUser.getId());
            criteriaNm.andEqualTo("delFlg", '0');
            criteriaNm.andEqualTo("userNm", mUser.getUserNm());
            List<MUser> sysUsers = mUserService.selectByCondition(criteriaNm);
            if (sysUsers.size() > 0) {
                return ResultBean.failure("用户名称已存在！");
            }
            Example.Criteria criteriaCd = mUserService.createCriteria();
            criteriaCd.andEqualTo("cntrCd", mUser.getCntrCd());
            criteriaCd.andNotEqualTo("id", mUser.getId());
            criteriaCd.andEqualTo("delFlg", '0');
            criteriaCd.andEqualTo("userId", mUser.getUserId());
            sysUsers = mUserService.selectByCondition(criteriaCd);
            if (sysUsers.size() > 0) {
                return ResultBean.failure("用户编号已存在！");
            }
            if (mUser != null) {
                commonService.updateMUser(request, mUser);
            }
            if (mLogin != null) {
                commonService.updateMLogin(request, mUser.getUserId(), mLogin);
            }

            return ResultBean.success("编辑用户信息成功！");
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("编辑用户信息失败！");
        }
    }

    /**
     * 删除用户信息
     *
     * @param mUser
     * @return
     */
    @SystemLog("删除用户信息")
    @PostMapping(value = "deleteMUser")
    public ResultBean deleteMUser(HttpServletRequest request, MUser mUser) {
        try {
            Example.Criteria criteria = mUserService.createCriteria();
            criteria.andEqualTo("id", mUser.getId());
            List<MUser> mUsers = mUserService.selectByCondition(criteria);
            if (!mUser.getUpdCnt().equals(mUsers.get(0).getUpdCnt())) {
                return ResultBean.failure("数据已被修改,请重试！");
            }
            MUser tempUser = CommonUtils.clone(mUser);
            commonService.deleteMUser(request, mUser);
            // 同步其他服务数据
            extraServiceController.deleteMUser(tempUser);
            return ResultBean.success("删除用户信息成功！");
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("删除用户信息失败！");
        }
    }

    /**
     * 删除登录信息
     *
     * @param mLogin
     * @return
     */
    @SystemLog("删除登录信息")
    @PostMapping(value = "deleteMLogin")
    public ResultBean deleteMLogin(HttpServletRequest request, MLogin mLogin) {
        try {
            Example.Criteria criteria = mLoginService.createCriteria();
            criteria.andEqualTo("id", mLogin.getId());
            List<MLogin> mLogins = mLoginService.selectByCondition(criteria);
            if (!mLogin.getUpdCnt().equals(mLogins.get(0).getUpdCnt())) {
                return ResultBean.failure("数据已被修改,请重试！");
            }
            MLogin tempLogin = CommonUtils.clone(mLogin);
            commonService.deleteMLogin(request, mLogin);
            // 同步其他服务数据
            extraServiceController.deleteMLogin(tempLogin);
            return ResultBean.success("删除登录信息成功！");
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("删除登录信息失败！");
        }
    }

    /**
     * 获取用户信息
     *
     * @param page    当前页数
     * @param limit   分页数
     * @param cntrCd  中心编号
     * @param workId  工号
     * @param loginId 登录账户
     * @param userNm  用户名称
     * @return 需求列表
     */
    @SystemLog("获取用户信息")
    @GetMapping(value = "getMUser")
    public ResultBean getMUser(Integer page, Integer limit, String userId, String cntrCd, String workId, String loginId, String userNm, String userNmEn, String roleNm, String orgNm) {
        List<MUserEx> mUserExList = new ArrayList<>();
        try {
            mUserExList = commonService.getMUser(page, limit, userId, cntrCd, workId, loginId, userNm, userNmEn, roleNm, orgNm);
            return ResultBean.success("获取用户信息成功", new PageInfo<>(mUserExList));
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("获取用户信息失败");
        }
    }

    /**
     * 获取登录信息
     *
     * @param userId 用户ID
     * @return 需求列表
     */
    @SystemLog("获取登录信息")
    @GetMapping(value = "getMLogin")
    public ResultBean getMLogin(String userId) {
        List<MUserEx> mUserExList = new ArrayList<>();
        try {
            mUserExList = commonService.getMLogin(userId);
            return ResultBean.success("获取登录信息成功", mUserExList);
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("获取登录信息失败");
        }
    }

    /**
     * 新增外发工厂信息
     *
     * @param request
     * @param mOutFactory
     * @param mOutFactoryLines
     * @return
     */
    @SystemLog("新增外发工厂信息")
    @PostMapping(value = "insertMOutFactory")
    public ResultBean insertMOutFactory(HttpServletRequest request, MOutFactory mOutFactory, String mOutFactoryLines) {
        try {
            Example.Criteria criteriaNm = mOutFactoryService.createCriteria();
            criteriaNm.andEqualTo("cntrCd", mOutFactory.getCntrCd());
            criteriaNm.andEqualTo("delFlg", '0');
            criteriaNm.andEqualTo("outFactoryNm", mOutFactory.getOutFactoryNm());
            List<MOutFactory> sysOutFactorys = mOutFactoryService.selectByCondition(criteriaNm);
            if (sysOutFactorys.size() > 0) {
                return ResultBean.failure("外发工厂名称已存在！");
            }
            if (!StringUtils.isNullOrEmpty(mOutFactory.getOutFactoryNmEn())) {
                Example.Criteria criteriaNmEn = mOutFactoryService.createCriteria();
                criteriaNmEn.andEqualTo("cntrCd", mOutFactory.getCntrCd());
                criteriaNmEn.andEqualTo("delFlg", '0');
                criteriaNmEn.andEqualTo("outFactoryNmEn", mOutFactory.getOutFactoryNmEn());
                sysOutFactorys = mOutFactoryService.selectByCondition(criteriaNmEn);
                if (sysOutFactorys.size() > 0) {
                    return ResultBean.failure("外发工厂英文名称已存在！");
                }
            }
            if (!StringUtils.isNullOrEmpty(mOutFactory.getOutFactoryJc())) {
                Example.Criteria criteriaNmJc = mOutFactoryService.createCriteria();
                criteriaNmJc.andEqualTo("cntrCd", mOutFactory.getCntrCd());
                criteriaNmJc.andEqualTo("delFlg", '0');
                criteriaNmJc.andEqualTo("outFactoryJc", mOutFactory.getOutFactoryJc());
                sysOutFactorys = mOutFactoryService.selectByCondition(criteriaNmJc);
                if (sysOutFactorys.size() > 0) {
                    return ResultBean.failure("外发工厂简称已存在！");
                }
            }

            if (StringUtils.isNullOrEmpty(mOutFactory.getOutFactoryCdDis())) {
                String outFactoryCdDis = mNumberService.getMNumberList("OUT_FACTORY_CD_DIS");
                mOutFactory.setOutFactoryCdDis(outFactoryCdDis);
            }
            Example.Criteria criteriaCd = mOutFactoryService.createCriteria();
            criteriaCd.andEqualTo("delFlg", '0');
            criteriaCd.andEqualTo("outFactoryCdDis", mOutFactory.getOutFactoryCdDis());
            sysOutFactorys = mOutFactoryService.selectByCondition(criteriaCd);
            if (sysOutFactorys.size() > 0) {
                return ResultBean.failure("外发工厂表示用编号已存在！");
            }
            JSONArray jsStrf = JSONArray.fromObject(mOutFactoryLines);
            List<MOutFactoryLineEx> mOutFactoryLists = (List<MOutFactoryLineEx>) JSONArray.toCollection(jsStrf, MOutFactoryLineEx.class);
            // 同步其他服务数据
            Map<String, Object> tempMap = commonService.insertMOutFactory(request, mOutFactory, mOutFactoryLists);
            extraServiceController.insertMOutFactory(tempMap);
            return ResultBean.success("新增外发工厂信息成功！");
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("新增外发工厂信息失败！");
        }
    }

    /**
     * 编辑外发工厂信息
     *
     * @param request
     * @param mOutFactory
     * @param mOutFactoryLineupdate
     * @param mOutFactoryLineinsert
     * @return
     */
    @SystemLog("编辑外发工厂信息")
    @PostMapping(value = "updateMOutFactory")
    public ResultBean updateMOutFactory(HttpServletRequest request, MOutFactory mOutFactory, String mOutFactoryLineupdate, String mOutFactoryLineinsert) {
        try {
            MOutFactory tempOutFactory = CommonUtils.clone(mOutFactory);
            Example.Criteria criteria = mOutFactoryService.createCriteria();
            criteria.andEqualTo("id", mOutFactory.getId());
            List<MOutFactory> mOutFactories = mOutFactoryService.selectByCondition(criteria);
            if (!mOutFactory.getUpdCnt().equals(mOutFactories.get(0).getUpdCnt())) {
                return ResultBean.failure("数据已被修改,请重试！");
            }
            Example.Criteria criteriaNm = mOutFactoryService.createCriteria();
            criteriaNm.andEqualTo("cntrCd", mOutFactory.getCntrCd());
            criteriaNm.andNotEqualTo("id", mOutFactory.getId());
            criteriaNm.andEqualTo("delFlg", '0');
            criteriaNm.andEqualTo("outFactoryNm", mOutFactory.getOutFactoryNm());
            List<MOutFactory> sysOutFactorys = mOutFactoryService.selectByCondition(criteriaNm);
            if (sysOutFactorys.size() > 0) {
                return ResultBean.failure("外发工厂名称已存在！");
            }
            if (!StringUtils.isNullOrEmpty(mOutFactory.getOutFactoryNmEn())) {
                Example.Criteria criteriaNmEn = mOutFactoryService.createCriteria();
                criteriaNmEn.andEqualTo("cntrCd", mOutFactory.getCntrCd());
                criteriaNmEn.andNotEqualTo("id", mOutFactory.getId());
                criteriaNmEn.andEqualTo("delFlg", '0');
                criteriaNmEn.andEqualTo("outFactoryNmEn", mOutFactory.getOutFactoryNmEn());
                sysOutFactorys = mOutFactoryService.selectByCondition(criteriaNmEn);
                if (sysOutFactorys.size() > 0) {
                    return ResultBean.failure("外发工厂英文名称已存在！");
                }
            }
            if (!StringUtils.isNullOrEmpty(mOutFactory.getOutFactoryJc())) {
                Example.Criteria criteriaNmJc = mOutFactoryService.createCriteria();
                criteriaNmJc.andEqualTo("cntrCd", mOutFactory.getCntrCd());
                criteriaNmJc.andNotEqualTo("id", mOutFactory.getId());
                criteriaNmJc.andEqualTo("delFlg", '0');
                criteriaNmJc.andEqualTo("outFactoryJc", mOutFactory.getOutFactoryJc());
                sysOutFactorys = mOutFactoryService.selectByCondition(criteriaNmJc);
                if (sysOutFactorys.size() > 0) {
                    return ResultBean.failure("外发工厂简称已存在！");
                }
            }
            if (StringUtils.isNullOrEmpty(mOutFactory.getOutFactoryCdDis())) {
                String outFactoryCdDis = mNumberService.getMNumberList("OUT_FACTORY_CD_DIS");
                mOutFactory.setOutFactoryCdDis(outFactoryCdDis);
            }
            Example.Criteria criteriaCd = mOutFactoryService.createCriteria();
            criteriaCd.andEqualTo("cntrCd", mOutFactory.getCntrCd());
            criteriaCd.andNotEqualTo("id", mOutFactory.getId());
            criteriaCd.andEqualTo("delFlg", '0');
            criteriaCd.andEqualTo("outFactoryCdDis", mOutFactory.getOutFactoryCdDis());
            sysOutFactorys = mOutFactoryService.selectByCondition(criteriaCd);
            if (sysOutFactorys.size() > 0) {
                return ResultBean.failure("外发工厂表示用编号已存在！");
            }
            if (mOutFactoryLineupdate != null) {
                JSONArray jsStrf1 = JSONArray.fromObject(mOutFactoryLineupdate);
                List<MOutFactoryLineEx> mOutFactoryLineupdates = (List<MOutFactoryLineEx>) JSONArray.toCollection(jsStrf1, MOutFactoryLineEx.class);
                commonService.updateMOutFactoryr(request, mOutFactory, mOutFactoryLineupdates);
            } else {
                commonService.updateOutFactory(request, mOutFactory);
            }
            List<MOutFactoryLineEx> mOutFactoryLineinserts = new ArrayList<>();
            if (mOutFactoryLineinsert != null) {
                JSONArray jsStrf2 = JSONArray.fromObject(mOutFactoryLineinsert);
                mOutFactoryLineinserts = (List<MOutFactoryLineEx>) JSONArray.toCollection(jsStrf2, MOutFactoryLineEx.class);
                commonService.insertMOutFactoryLine(request, mOutFactoryLineinserts, mOutFactory.getId());
            }
            // 同步其他服务数据
            Map<String, Object> tempMap = new HashMap<String, Object>();
            tempMap.put("mOutFactory", tempOutFactory);
            tempMap.put("mOutFactoryLineUpdate", mOutFactoryLineupdate);
            tempMap.put("mOutFactoryLineInsert", mOutFactoryLineinserts);
            extraServiceController.updateMOutFactory(tempMap);
            return ResultBean.success("编辑外发工厂信息成功！");
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("编辑外发工厂信息失败！");
        }
    }

    /**
     * 删除外发工厂信息
     *
     * @param mOutFactory
     * @return
     */
    @SystemLog("删除外发工厂信息")
    @PostMapping(value = "deleteMOutFacfory")
    public ResultBean deleteMOutFactory(HttpServletRequest request, MOutFactory mOutFactory) {
        try {
            Example.Criteria criteria = mOutFactoryService.createCriteria();
            criteria.andEqualTo("id", mOutFactory.getId());
            List<MOutFactory> mOutFactories = mOutFactoryService.selectByCondition(criteria);
            if (!mOutFactory.getUpdCnt().equals(mOutFactories.get(0).getUpdCnt())) {
                return ResultBean.failure("数据已被修改,请重试！");
            }
            MOutFactory tempOutFactory = CommonUtils.clone(mOutFactory);
            commonService.deleteMOutFactory(request, mOutFactory);
            // 同步其他服务数据
            extraServiceController.deleteMOutFactory(tempOutFactory);
            return ResultBean.success("删除外发工厂信息成功！");
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("删除外发工厂信息失败！");
        }
    }

    /**
     * 删除外发工厂明细
     *
     * @param mOutFactoryLine
     * @return
     */
    @SystemLog("删除外发工厂明细")
    @PostMapping(value = "deleteMOutFactoryLine")
    public ResultBean deleteMOutFactoryLine(HttpServletRequest request, MOutFactoryLine mOutFactoryLine) {
        try {
            Example.Criteria criteria = mOutFactoryLineService.createCriteria();
            criteria.andEqualTo("id", mOutFactoryLine.getId());
            List<MOutFactoryLine> mOutFactoryLines = mOutFactoryLineService.selectByCondition(criteria);
            if (!mOutFactoryLine.getUpdCnt().equals(mOutFactoryLines.get(0).getUpdCnt())) {
                return ResultBean.failure("数据已被修改,请重试！");
            }
            MOutFactoryLine tempOutFactoryLine = CommonUtils.clone(mOutFactoryLine);
            commonService.deleteMOutFactoryLine(request, mOutFactoryLine);
            // 同步其他服务数据
            extraServiceController.deleteMOutFactoryLine(tempOutFactoryLine);
            return ResultBean.success("删除外发工厂明细成功！");
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("删除外发工厂明细失败！");
        }
    }

    /**
     * 获取外发工厂信息
     *
     * @param page            当前页数
     * @param limit           分页数
     * @param outFactoryCdDis 外发工厂表示用编号
     * @param outFactoryNm    外发工厂名称
     * @param outFactoryNmEn  外发工厂英文名称
     * @param outFactoryJc    外发工厂简称
     * @param outFactoryType  外发工厂商种类
     * @param levelId         外发工厂评价等级
     * @param cntryCd         国家编号
     * @param paymentType     结算方式
     * @return 需求列表
     */
    @SystemLog("获取外发工厂信息")
    @GetMapping(value = "getMOutFactory")
    public ResultBean getMOutFactory(Integer page, Integer limit, String outFactoryCdDis, String outFactoryNm, String outFactoryNmEn, String outFactoryJc, String outFactoryType, String levelId, String cntryCd, String paymentType) {
        List<MOutFactoryEx> mOutFactoryExList = new ArrayList<>();
        try {
            mOutFactoryExList = commonService.getMOutFactory(page, limit, outFactoryCdDis, outFactoryNm, outFactoryNmEn, outFactoryJc, outFactoryType, levelId, cntryCd, paymentType);
            return ResultBean.success("获取外发工厂信息成功", new PageInfo<>(mOutFactoryExList));
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("获取外发工厂信息失败");
        }
    }

    /**
     * 获取外发工厂明细
     *
     * @param outFactoryId 外发工厂编号
     * @return 需求列表
     */
    @SystemLog("获取外发工厂明细")
    @GetMapping(value = "getMOutFactoryLine")
    public ResultBean getMOutFactoryLine(String outFactoryId) {
        List<MOutFactoryEx> mOutFactoryLineExList = new ArrayList<>();
        try {
            mOutFactoryLineExList = commonService.getMOutFactoryLine(outFactoryId);
            return ResultBean.success("获取外发工厂明细成功", mOutFactoryLineExList);
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("获取外发工厂明细失败");
        }
    }

    /**
     * 获取外发工厂明细
     *
     * @param outFactoryId 外发工厂编号
     * @return 需求列表
     */
    @SystemLog("获取外发工厂评价")
    @GetMapping(value = "getMOutFactoryAppraise")
    public ResultBean getMOutFactoryAppraise(String outFactoryId) {
        List<TFactoryAppraiseList> mOutFactoryLineList = new ArrayList<>();
        try {
            mOutFactoryLineList = commonService.getTFactoryAppraise(outFactoryId);
            return ResultBean.success("获取外发工厂评价成功", mOutFactoryLineList);
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("获取外发工厂评价失败");
        }
    }

    /**
     * 新增物流公司信息
     *
     * @param request
     * @param mCarrier
     * @param mCarrierLines
     * @return
     */
    @SystemLog("新增物流公司信息")
    @PostMapping(value = "insertMCarrier")
    public ResultBean insertMCarrier(HttpServletRequest request, MCarrier mCarrier, String mCarrierLines) {
        try {
            Example.Criteria criteriaNm = mCarrierService.createCriteria();
            criteriaNm.andEqualTo("cntrCd", mCarrier.getCntrCd());
            criteriaNm.andEqualTo("delFlg", '0');
            criteriaNm.andEqualTo("carrierNm", mCarrier.getCarrierNm());
            List<MCarrier> sysCarriers = mCarrierService.selectByCondition(criteriaNm);
            if (sysCarriers.size() > 0) {
                return ResultBean.failure("物流公司名称已存在！");
            }
            if (!StringUtils.isNullOrEmpty(mCarrier.getCarrierNmEn())) {
                Example.Criteria criteriaNmEn = mCarrierService.createCriteria();
                criteriaNmEn.andEqualTo("cntrCd", mCarrier.getCntrCd());
                criteriaNmEn.andEqualTo("delFlg", '0');
                criteriaNmEn.andEqualTo("carrierNm", mCarrier.getCarrierNm());
                sysCarriers = mCarrierService.selectByCondition(criteriaNmEn);
                if (sysCarriers.size() > 0) {
                    return ResultBean.failure("物流公司英文名称已存在！");
                }
            }
            if (!StringUtils.isNullOrEmpty(mCarrier.getCarrierJc())) {
                Example.Criteria criteriaNmJc = mCarrierService.createCriteria();
                criteriaNmJc.andEqualTo("cntrCd", mCarrier.getCntrCd());
                criteriaNmJc.andEqualTo("delFlg", '0');
                criteriaNmJc.andEqualTo("carrierNm", mCarrier.getCarrierNm());
                sysCarriers = mCarrierService.selectByCondition(criteriaNmJc);
                if (sysCarriers.size() > 0) {
                    return ResultBean.failure("物流公司简称已存在！");
                }
            }
            if (StringUtils.isNullOrEmpty(mCarrier.getCarrierCdDis())) {
                String carrierCdDis = mNumberService.getMNumberList("CARRIER_CD_DIS");
                mCarrier.setCarrierCdDis(carrierCdDis);
            }
            Example.Criteria criteriaCd = mCarrierService.createCriteria();
            criteriaCd.andEqualTo("delFlg", '0');
            criteriaCd.andEqualTo("carrierCdDis", mCarrier.getCarrierCdDis());
            sysCarriers = mCarrierService.selectByCondition(criteriaCd);
            if (sysCarriers.size() > 0) {
                return ResultBean.failure("物流公司表示用编号已存在！");
            }
            JSONArray jsStrf = JSONArray.fromObject(mCarrierLines);
            List<MCarrierLine> mCarrierLineLists = (List<MCarrierLine>) JSONArray.toCollection(jsStrf, MCarrierLine.class);
            Map<String, Object> tempMap = commonService.insertMCarrier(request, mCarrier, mCarrierLineLists);
            // 同步其他服务数据
            extraServiceController.insertMCarrier(tempMap);
            return ResultBean.success("新增物流公司信息成功！");
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("新增物流公司信息失败！");
        }
    }

    /**
     * 删除物流公司信息
     *
     * @param mCarrier
     * @return
     */
    @SystemLog("删除物流公司信息")
    @PostMapping(value = "deleteMCarrier")
    public ResultBean deleteMCarrier(HttpServletRequest request, MCarrier mCarrier) {
        try {
            Example.Criteria criteria = mCarrierService.createCriteria();
            criteria.andEqualTo("id", mCarrier.getId());
            List<MCarrier> mCarriers = mCarrierService.selectByCondition(criteria);
            if (!mCarrier.getUpdCnt().equals(mCarriers.get(0).getUpdCnt())) {
                return ResultBean.failure("数据已被修改,请重试！");
            }
            MCarrier tempCarrier = CommonUtils.clone(mCarrier);
            commonService.deleteMCarrier(request, mCarrier);
            // 同步其他服务数据
            extraServiceController.deleteMCarrier(tempCarrier);
            return ResultBean.success("删除物流公司信息成功！");
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("删除物流公司信息失败！");
        }
    }

    /**
     * 删除物流公司明细
     *
     * @param mCarrierLine
     * @return
     */
    @SystemLog("删除物流公司明细")
    @PostMapping(value = "deleteMCarrierLine")
    public ResultBean deleteMCarrierLine(HttpServletRequest request, MCarrierLine mCarrierLine) {
        try {
            Example.Criteria criteria = mCarrierLineService.createCriteria();
            criteria.andEqualTo("id", mCarrierLine.getId());
            List<MCarrierLine> mCarrierLines = mCarrierLineService.selectByCondition(criteria);
            if (!mCarrierLine.getUpdCnt().equals(mCarrierLines.get(0).getUpdCnt())) {
                return ResultBean.failure("数据已被修改,请重试！");
            }
            MCarrierLine tempCarrierLine = CommonUtils.clone(mCarrierLine);
            commonService.deleteMCarrierLine(request, mCarrierLine);
            // 同步其他服务数据
            extraServiceController.deleteMCarrierLine(tempCarrierLine);
            return ResultBean.success("删除物流公司明细成功！");
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("删除物流公司明细失败！");
        }
    }

    /**
     * 编辑物流公司信息
     *
     * @param request
     * @param mCarrier
     * @param mCarrierLineupdate
     * @param mCarrierLineinsert
     * @return
     */
    @SystemLog("编辑物流公司信息")
    @PostMapping(value = "updateMCarrier")
    public ResultBean updateMCarrier(HttpServletRequest request, MCarrier mCarrier, String mCarrierLineupdate, String mCarrierLineinsert) {
        try {
            MCarrier tempCarrier = CommonUtils.clone(mCarrier);
            Example.Criteria criteria = mCarrierService.createCriteria();
            criteria.andEqualTo("id", mCarrier.getId());
            List<MCarrier> mCarriers = mCarrierService.selectByCondition(criteria);
            if (!mCarrier.getUpdCnt().equals(mCarriers.get(0).getUpdCnt())) {
                return ResultBean.failure("数据已被修改,请重试！");
            }
            Example.Criteria criteriaNm = mCarrierService.createCriteria();
            criteriaNm.andEqualTo("cntrCd", mCarrier.getCntrCd());
            criteriaNm.andNotEqualTo("id", mCarrier.getId());
            criteriaNm.andEqualTo("carrierNm", mCarrier.getCarrierNm());
            criteriaNm.andEqualTo("delFlg", '0');
            List<MCarrier> sysCarriers = mCarrierService.selectByCondition(criteriaNm);
            if (sysCarriers.size() > 0) {
                return ResultBean.failure("物流公司名称已存在！");
            }
            if (!StringUtils.isNullOrEmpty(mCarrier.getCarrierNmEn())) {
                Example.Criteria criteriaNmEn = mCarrierService.createCriteria();
                criteriaNmEn.andEqualTo("cntrCd", mCarrier.getCntrCd());
                criteriaNmEn.andNotEqualTo("id", mCarrier.getId());
                criteriaNmEn.andEqualTo("delFlg", '0');
                criteriaNmEn.andEqualTo("carrierNmEn", mCarrier.getCarrierNmEn());
                sysCarriers = mCarrierService.selectByCondition(criteriaNmEn);
                if (sysCarriers.size() > 0) {
                    return ResultBean.failure("物流公司英文名称已存在！");
                }
            }
            if (!StringUtils.isNullOrEmpty(mCarrier.getCarrierJc())) {
                Example.Criteria criteriaNmJc = mCarrierService.createCriteria();
                criteriaNmJc.andEqualTo("cntrCd", mCarrier.getCntrCd());
                criteriaNmJc.andNotEqualTo("id", mCarrier.getId());
                criteriaNmJc.andEqualTo("delFlg", '0');
                criteriaNmJc.andEqualTo("carrierJc", mCarrier.getCarrierJc());
                sysCarriers = mCarrierService.selectByCondition(criteriaNmJc);
                if (sysCarriers.size() > 0) {
                    return ResultBean.failure("物流公司简称已存在！");
                }
            }
            if (StringUtils.isNullOrEmpty(mCarrier.getCarrierCdDis())) {
                String carrierCdDis = mNumberService.getMNumberList("CARRIER_CD_DIS");
                mCarrier.setCarrierCdDis(carrierCdDis);
            }
            Example.Criteria criteriaCd = mCarrierService.createCriteria();
            criteriaCd.andEqualTo("cntrCd", mCarrier.getCntrCd());
            criteriaCd.andNotEqualTo("id", mCarrier.getId());
            criteriaCd.andEqualTo("delFlg", '0');
            criteriaCd.andEqualTo("carrierCdDis", mCarrier.getCarrierCdDis());
            sysCarriers = mCarrierService.selectByCondition(criteriaCd);
            if (sysCarriers.size() > 0) {
                return ResultBean.failure("物流公司表示用编号已存在！");
            }
            if (mCarrierLineupdate != null) {
                JSONArray jsStrf1 = JSONArray.fromObject(mCarrierLineupdate);
                List<MCarrierLineEx> mCarrierLineupdates = (List<MCarrierLineEx>) JSONArray.toCollection(jsStrf1, MCarrierLineEx.class);
                commonService.updateMCarrier(request, mCarrier, mCarrierLineupdates);
            } else {
                commonService.updateCarrier(request, mCarrier);
            }
            List<MCarrierLineEx> mCarrierLineinserts = new ArrayList<>();
            if (mCarrierLineinsert != null) {
                JSONArray jsStrf2 = JSONArray.fromObject(mCarrierLineinsert);
                mCarrierLineinserts = (List<MCarrierLineEx>) JSONArray.toCollection(jsStrf2, MCarrierLineEx.class);
                commonService.insertMCarrierLine(request, mCarrierLineinserts, mCarrier.getId());
            }
            // 同步其他服务数据
            Map<String, Object> tempMap = new HashMap<String, Object>();
            tempMap.put("mCarrier", tempCarrier);
            tempMap.put("mCarrierLineupdate", mCarrierLineupdate);
            tempMap.put("mCarrierLineinsert", mCarrierLineinserts);
            // 同步其他服务数据
            extraServiceController.updateMCarrier(tempMap);
            return ResultBean.success("编辑物流公司信息成功！");
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("编辑物流公司信息失败！");
        }
    }

    /**
     * 获取物流公司信息
     *
     * @param page         当前页数
     * @param limit        分页数
     * @param carrierCdDis 物流公司表示用编号
     * @param carrierNm    物流公司名称
     * @param carrierNmEn  物流公司英文名称
     * @param carrierJc    物流公司简称
     * @param carrierType  物流公司商种类
     * @param levelId      物流公司评价等级
     * @param cntryCd      国家编号
     * @param paymentType  结算方式
     * @return 需求列表
     */
    @SystemLog("获取物流公司信息")
    @GetMapping(value = "getMCarrier")
    public ResultBean getMCarrier(Integer page, Integer limit, String carrierCdDis, String carrierNm, String carrierNmEn, String carrierJc, String carrierType, String levelId, String cntryCd, String paymentType) {
        List<MCarrierEx> mCarrierExList = new ArrayList<>();
        try {
            mCarrierExList = commonService.getMCarrier(page, limit, carrierCdDis, carrierNm, carrierNmEn, carrierJc, carrierType, levelId, cntryCd, paymentType);
            return ResultBean.success("获取物流公司信息成功", new PageInfo<>(mCarrierExList));
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("获取物流公司信息失败");
        }
    }

    /**
     * 获取物流公司明细
     *
     * @param carrierId 物流公司编号
     * @return 需求列表
     */
    @SystemLog("获取物流公司明细")
    @GetMapping(value = "getMCarrierLine")
    public ResultBean getMCarrierLine(String carrierId) {
        List<MCarrierEx> mCarrierLineExList = new ArrayList<>();
        try {
            mCarrierLineExList = commonService.getMCarrierLine(carrierId);
            return ResultBean.success("获取物流公司明细成功", mCarrierLineExList);
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("获取物流公司明细失败");
        }
    }

    /**
     * 新增评价等级信息
     *
     * @param request
     * @param mLevel
     * @return
     */
    @SystemLog("新增评价等级信息")
    @PostMapping(value = "insertMLevel")
    public ResultBean insertMLevel(HttpServletRequest request, MLevel mLevel) {
        try {
            mLevel = commonService.insertMLevel(request, mLevel);
            // 同步其他服务数据
            extraServiceController.insertMLevel(mLevel);
            return ResultBean.success("新增评价等级信息成功！");
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("新增评价等级信息失败！");
        }
    }

    /**
     * 编辑评价等级信息
     *
     * @param request
     * @param mLevel
     * @return
     */
    @SystemLog("编辑评价等级信息")
    @PostMapping(value = "updateMLevel")
    public ResultBean updateMLevel(HttpServletRequest request, MLevel mLevel) {
        try {
            MLevel tempLevel = CommonUtils.clone(mLevel);
            Example.Criteria criteria = mLevelService.createCriteria();
            criteria.andEqualTo("id", mLevel.getId());
            List<MLevel> mLevels = mLevelService.selectByCondition(criteria);
            if (!mLevel.getUpdCnt().equals(mLevels.get(0).getUpdCnt())) {
                return ResultBean.failure("数据已被修改,请重试！");
            }
            commonService.updateMLevel(request, mLevel);
            // 同步其他服务数据
            extraServiceController.updateMLevel(tempLevel);
            return ResultBean.success("编辑评价等级信息成功！");
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("编辑评价等级信息失败！");
        }
    }

    /**
     * 删除评价等级信息
     *
     * @param mLevel
     * @return
     */
    @SystemLog("删除评价等级信息")
    @PostMapping(value = "deleteMLevel")
    public ResultBean deleteMLevel(HttpServletRequest request, MLevel mLevel) {
        try {
            Example.Criteria criteria = mLevelService.createCriteria();
            criteria.andEqualTo("id", mLevel.getId());
            List<MLevel> mLevels = mLevelService.selectByCondition(criteria);
            if (!mLevel.getUpdCnt().equals(mLevels.get(0).getUpdCnt())) {
                return ResultBean.failure("数据已被修改,请重试！");
            }
            MLevel tempLevel = CommonUtils.clone(mLevel);
            commonService.deleteMLevel(request, mLevel);
            // 同步其他服务数据
            extraServiceController.deleteMLevel(tempLevel);
            return ResultBean.success("删除评价等级信息成功！");
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("删除评价等级信息失败！");
        }
    }

    /**
     * 获取评价等级信息
     *
     * @param page    当前页数
     * @param limit   分页数
     * @param cntrCd  中心编号
     * @param levelNm 评价等级名称
     * @return 需求列表
     */
    @SystemLog("获取评价等级信息")
    @GetMapping(value = "getMLevel")
    public ResultBean getMLevel(Integer page, Integer limit, String cntrCd, String levelNm, String levelType) {
        List<MLevel> mLevelList = new ArrayList<>();
        try {
            mLevelList = commonService.getMLevel(page, limit, cntrCd, levelNm, levelType);
            return ResultBean.success("获取评价等级信息成功", new PageInfo<>(mLevelList));
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("获取评价等级信息失败");
        }
    }

    /**
     * 获取评价等级信息
     *
     * @param levelId 评价等级编号
     * @return 需求列表
     */
    @SystemLog("获取评价明细")
    @GetMapping(value = "getMLevelLine")
    public ResultBean getMLevelLine(String levelId) {
        try {
            MLevelEx mLevelLineList = commonService.getMLevelLine(levelId);
            return ResultBean.success("获取评价明细成功", new PageInfo<List<MLevelEx>>(new ArrayList(Collections.singleton(mLevelLineList))));
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("获取评价明细失败");
        }
    }

    /**
     * 新增箱信息
     *
     * @param request
     * @param mBox
     * @return
     */
    @SystemLog("新增箱信息")
    @PostMapping(value = "insertMBox")
    public ResultBean insertMBox(HttpServletRequest request, MBox mBox) {
        try {
            Example.Criteria criteriaNm = mBoxService.createCriteria();
            criteriaNm.andEqualTo("cntrCd", mBox.getCntrCd());
            criteriaNm.andEqualTo("delFlg", '0');
            criteriaNm.andEqualTo("boxNm", mBox.getBoxNm());
            List<MBox> sysBoxes = mBoxService.selectByCondition(criteriaNm);
            if (sysBoxes.size() > 0) {
                return ResultBean.failure("箱名称已存在！");
            }
            mBox = commonService.insertMBox(request, mBox);
            // 同步其他服务数据
            extraServiceController.insertMBox(mBox);
            return ResultBean.success("新增箱信息成功！");
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("新增箱信息失败！");
        }
    }

    /**
     * 编辑箱信息
     *
     * @param request
     * @param mBox
     * @return
     */
    @SystemLog("编辑箱信息")
    @PostMapping(value = "updateMBox")
    public ResultBean updateMBox(HttpServletRequest request, MBox mBox) {
        try {
            MBox tempBox = CommonUtils.clone(mBox);
            Example.Criteria criteria = mBoxService.createCriteria();
            criteria.andEqualTo("id", mBox.getId());
            List<MBox> mBoxes = mBoxService.selectByCondition(criteria);
            if (!mBox.getUpdCnt().equals(mBoxes.get(0).getUpdCnt())) {
                return ResultBean.failure("数据已被修改,请重试！");
            }
            Example.Criteria criteriaNm = mBoxService.createCriteria();
            criteriaNm.andEqualTo("cntrCd", mBox.getCntrCd());
            criteriaNm.andNotEqualTo("id", mBox.getId());
            criteriaNm.andEqualTo("delFlg", '0');
            criteriaNm.andEqualTo("boxNm", mBox.getBoxNm());
            List<MBox> sysBoxes = mBoxService.selectByCondition(criteriaNm);
            if (sysBoxes.size() > 0) {
                return ResultBean.failure("箱名称已存在！");
            }
            commonService.updateMBox(request, mBox);
            // 同步其他服务数据
            extraServiceController.updateMBox(tempBox);
            return ResultBean.success("编辑箱信息成功！");
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("编辑箱信息失败！");
        }
    }

    /**
     * 删除箱信息
     *
     * @param mBox
     * @return
     */
    @SystemLog("删除箱信息")
    @PostMapping(value = "deleteMBox")
    public ResultBean deleteMBox(HttpServletRequest request, MBox mBox) {
        try {
            Example.Criteria criteria = mBoxService.createCriteria();
            criteria.andEqualTo("id", mBox.getId());
            List<MBox> mBoxes = mBoxService.selectByCondition(criteria);
            if (!mBox.getUpdCnt().equals(mBoxes.get(0).getUpdCnt())) {
                return ResultBean.failure("数据已被修改,请重试！");
            }
            MBox tempBox = CommonUtils.clone(mBox);
            commonService.deleteMBox(request, mBox);
            // 同步其他服务数据
            extraServiceController.deleteMBox(tempBox);
            return ResultBean.success("删除箱信息成功！");
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("删除箱信息失败！");
        }
    }

    /**
     * 获取箱信息
     *
     * @param page   当前页数
     * @param limit  分页数
     * @param cntrCd 中心编号
     * @param boxId  箱编号
     * @param boxNm  箱名称
     * @return 需求列表
     */
    @SystemLog("获取箱信息")
    @GetMapping(value = "getMBox")
    public ResultBean getMBox(Integer page, Integer limit, String cntrCd, String boxId, String boxNm) {
        List<MBox> mBoxList = new ArrayList<>();
        try {
            mBoxList = commonService.getMBox(page, limit, cntrCd, boxId, boxNm);
            return ResultBean.success("获取箱信息成功", new PageInfo<>(mBoxList));
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("获取箱信息失败");
        }
    }

    /**
     * 获取箱编辑信息
     *
     * @param boxId 箱编号
     * @return 需求列表
     */
    @SystemLog("获取箱编辑信息")
    @GetMapping(value = "getMBoxList")
    public ResultBean getMBoxList(String boxId) {
        List<MBox> mBoxLIneList = new ArrayList<>();
        try {
            commonService.getMBoxList(boxId);
            return ResultBean.success("获取箱编辑信息成功");
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("获取箱编辑信息失败");
        }
    }

    /**
     * 新增提示信息
     *
     * @param request
     * @param mErrorinfo
     * @return
     */
    @SystemLog("新增提示信息")
    @PostMapping(value = "insertMErrorinfo")
    public ResultBean insertMErrorinfo(HttpServletRequest request, MErrorinfo mErrorinfo) {
        try {
            mErrorinfo = commonService.insertMErrorinfo(request, mErrorinfo);
            // 同步其他服务数据
//            extraServiceController.insertMErrorinfo(mErrorinfo);
            return ResultBean.success("新增提示信息成功！");
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("新增提示信息失败！");
        }
    }

    /**
     * 编辑提示信息
     *
     * @param request
     * @param mErrorinfo
     * @return
     */
    @SystemLog("编辑提示信息")
    @PostMapping(value = "updateMErrorinfo")
    public ResultBean updateMErrorinfo(HttpServletRequest request, MErrorinfo mErrorinfo) {
        try {
            Example.Criteria criteria = mErrorinfoService.createCriteria();
            criteria.andEqualTo("id", mErrorinfo.getId());
            List<MErrorinfo> mErrorinfos = mErrorinfoService.selectByCondition(criteria);
            if (!mErrorinfo.getUpdCnt().equals(mErrorinfos.get(0).getUpdCnt())) {
                return ResultBean.failure("数据已被修改,请重试！");
            }
            commonService.updateMErrorinfo(request, mErrorinfo);
            // 同步其他服务数据
//            extraServiceController.updateMErrorinfo(mErrorinfo);
            return ResultBean.success("编辑提示信息成功！");
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("编辑提示信息失败！");
        }
    }

    /**
     * 删除提示信息
     *
     * @param mErrorinfo
     * @return
     */
    @SystemLog("删除提示信息")
    @PostMapping(value = "deleteMErrorinfo")
    public ResultBean deleteMErrorinfo(HttpServletRequest request, MErrorinfo mErrorinfo) {
        try {
            Example.Criteria criteria = mErrorinfoService.createCriteria();
            criteria.andEqualTo("id", mErrorinfo.getId());
            List<MErrorinfo> mErrorinfos = mErrorinfoService.selectByCondition(criteria);
            if (!mErrorinfo.getUpdCnt().equals(mErrorinfos.get(0).getUpdCnt())) {
                return ResultBean.failure("数据已被修改,请重试！");
            }
            commonService.deleteMErrorinfo(request, mErrorinfo);
            // 同步其他服务数据
//            extraServiceController.deleteMErrorinfo(mErrorinfo);
            return ResultBean.success("删除提示信息成功！");
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("删除提示信息失败！");
        }
    }

    /**
     * 获取提示信息
     *
     * @param page    当前页数
     * @param limit   分页数
     * @param errId   提示信息ID
     * @param errInfo 提示信息内容
     * @return 需求列表
     */
    @SystemLog("获取提示信息")
    @GetMapping(value = "getMErrorinfo")
    public ResultBean getMErrorinfo(Integer page, Integer limit, String errId, String errInfo) {
        List<MErrorinfo> mErrorinfoList = new ArrayList<>();
        try {
            mErrorinfoList = commonService.getMErrorinfo(page, limit, errId, errInfo);
            return ResultBean.success("获取提示信息成功", new PageInfo<>(mErrorinfoList));
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("获取提示信息失败");
        }
    }

    /**
     * 获取提示编辑信息
     *
     * @param errId 提示信息ID
     * @return 需求列表
     */
    @SystemLog("获取提示编辑信息")
    @GetMapping(value = "getMErrorinfoList")
    public ResultBean getMErrorinfoList(String errId) {
        List<MErrorinfo> mErrorinfoLineList = new ArrayList<>();
        try {
            commonService.getMErrorinfoList(errId);
            return ResultBean.success("获取提示编辑信息成功");
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("获取提示编辑信息失败");
        }
    }

    /**
     * 获取日志信息
     *
     * @param page       当前页数
     * @param limit      分页数
     * @param cntrCd     中心编号
     * @param objStartDt 対象開始日付
     * @param objEndDt   対象終了日付
     * @param logStatus  日志状态
     * @param logComment 日志内容
     * @param skriKbn    最新区分
     * @param pgmId      程序ID
     * @return 需求列表
     */
    @SystemLog("获取日志信息")
    @GetMapping(value = "getTLog")
    public ResultBean getTLog(Integer page, Integer limit, String cntrCd, String objStartDt, String objEndDt, String logStatus, String logComment, String skriKbn, String pgmId) {
        List<TLog> tLogList = new ArrayList<>();
        try {
            tLogList = commonService.getTLog(page, limit, cntrCd, objStartDt, objEndDt, logStatus, logComment, skriKbn, pgmId);
            return ResultBean.success("获取日志信息成功", new PageInfo<>(tLogList));
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("获取日志信息失败");
        }
    }

    /**
     * 新增商品信息
     *
     * @param request
     * @param mproduct 商品信息
     * @return numberOfShares
     */
    @SystemLog("新增商品信息")
    @PostMapping(value = "insertMproduct")
    public ResultBean insertMproduct(HttpServletRequest request, MProductEx mproduct, String mProdRelas) {
        try {
            Example.Criteria criteriaNm = mProductService.createCriteria();
//            criteriaNm.andEqualTo("cntrCd",mproduct.getCntrCd());
            criteriaNm.andEqualTo("delFlg", '0');
            criteriaNm.andEqualTo("prodNm", mproduct.getProdNm());
            List<MProduct> sysProducts = mProductService.select(criteriaNm);
            if (sysProducts.size() > 0) {
                return ResultBean.failure("商品名称已存在！");
            }
            if (!StringUtils.isNullOrEmpty(mproduct.getProdCdDis())) {
                Example.Criteria criteriaNmCd = mProductService.createCriteria();
//                criteriaNmCd.andEqualTo("cntrCd", mproduct.getCntrCd());
                criteriaNmCd.andEqualTo("delFlg", '0');
                criteriaNmCd.andEqualTo("prodCdDis", mproduct.getProdCdDis());
                sysProducts = mProductService.select(criteriaNmCd);
                if (sysProducts.size() > 0) {
                    return ResultBean.failure("商品编号已存在！");
                }
            }
            if (!StringUtils.isNullOrEmpty(mproduct.getProdJc())) {
                Example.Criteria criteriaNmJc = mProductService.createCriteria();
//                criteriaNmJc.andEqualTo("cntrCd", mproduct.getCntrCd());
                criteriaNmJc.andEqualTo("delFlg", '0');
                criteriaNmJc.andEqualTo("prodJc", mproduct.getProdJc());
                sysProducts = mProductService.select(criteriaNmJc);
                if (sysProducts.size() > 0) {
                    return ResultBean.failure("商品简称已存在！");
                }
            }
            if (!StringUtils.isNullOrEmpty(mproduct.getProdNmEn())) {
                Example.Criteria criteriaNmEn = mProductService.createCriteria();
//                criteriaNmEn.andEqualTo("cntrCd", mproduct.getCntrCd());
                criteriaNmEn.andEqualTo("delFlg", '0');
                criteriaNmEn.andEqualTo("prodNmEn", mproduct.getProdNmEn());
                sysProducts = mProductService.select(criteriaNmEn);
                if (sysProducts.size() > 0) {
                    return ResultBean.failure("商品英文名称已存在！");
                }
            }
            if (StringUtils.isNullOrEmpty(mproduct.getProdCdDis())) {
                String prodCdDis = mNumberService.getMNumberList("PROD_CD_DIS");
                mproduct.setProdCdDis(prodCdDis);
            }
            // add by xhs 2020-09-22 start
            // 只有纱线会有成分比例，其他的没有成分比例,不用拼接/
            if ("01".equals(mproduct.getProdType())) {
                ResultBean rs = commonService.getYarnInfo(mproduct, mProdRelas);
                if (!rs.isSuccess()) {
                    return rs;
                }
                mproduct = (MProductEx) rs.getData();
            }
            // add by xhs 2020-09-22 end
            mproduct = commonService.insertMproduct(request, mproduct);
            // 同步其他服务数据
            extraServiceController.insertMproduct(mproduct);

            //判断新增商品是否是纱类
            if (null != mproduct.getProdType() && !"".equals(mproduct.getProdType()) && "01".equals(mproduct.getProdType())) {
                commonService.insertMProductRelaList(request, mproduct, mProdRelas);
                //TODO  同步
            }
            return ResultBean.success("新增商品成功！", mproduct);
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("新增商品失败！");
        }
    }

    /**
     * 新增商品信息
     * by wkl
     *
     * @param request
     * @param productClassAndHead 商品信息
     * @return
     */
    @ApiOperation("新增商品信息")
    @PostMapping(value = "insertMproductNew")
    public ResultBean insertMproductNew(HttpServletRequest request, ProductClassAndHead productClassAndHead, String mProductClasses) {
        try {
            List<MProductClassExRatio> mProductClassListNew = (List<MProductClassExRatio>) com.alibaba.fastjson.JSONArray.parseArray(mProductClasses, MProductClassExRatio.class);
            if (mProductClassListNew == null) {
                return ResultBean.failure("无数据！");
            }
            //给mProductClassList以id默认排序（为了拼接时字段可以按顺序拼接）
//            List<MProductClassExRatio> mProductClassListNew = new ArrayList<>();
//            mProductClassListNew = mProductClassList.stream().sorted((s1, s2) -> s2.getRatio().compareTo(s1.getRatio())).collect(Collectors.toList());
//            mProductClassListNew =  mProductClassList.stream().sorted(Comparator.comparing(MProductClassExRatio::getRatio).thenComparing(MProductClassExRatio::getId,Comparator.reverseOrder())).collect(toList());
//            Comparator<MProductClassExRatio> byRatio = Comparator.comparing(MProductClassExRatio::getRatio);//按照成分比例升序
//            Comparator<MProductClassExRatio> byId = Comparator.comparing(MProductClassExRatio::getId);//按照id升序
//
//            mProductClassListNew.sort(byRatio.thenComparing(byId));

            //纱支

            String yarncount = "";
            Integer num = 0;
            if (StringUtils.isNullOrEmpty(productClassAndHead.getNumberOfShares())) {
                num = 1;
            } else {
                num = Integer.parseInt(productClassAndHead.getNumberOfShares());
            }

            //如果纱支后半为空 只拼前半和股数（40S/1） 否则全拼（300D/96F*2）
            if (StringUtils.isNullOrEmpty(productClassAndHead.getYarnCountB())) {
                yarncount = productClassAndHead.getYarnCountF() + productClassAndHead.getYarnCountFunitNm() + "/" + num.toString();
            } else if (num == 1) {
                yarncount = productClassAndHead.getYarnCountF() + productClassAndHead.getYarnCountFunitNm() + "/" + productClassAndHead.getYarnCountB() + productClassAndHead.getYarnCountBunitNm();
            } else {
                yarncount = productClassAndHead.getYarnCountF() + productClassAndHead.getYarnCountFunitNm() + "/" + productClassAndHead.getYarnCountB() + productClassAndHead.getYarnCountBunitNm() + "*" + num.toString();
            }
            // add by xhs 2020-06-01 start
            // 并线 0和1不显示
            if (!org.springframework.util.StringUtils.isEmpty(productClassAndHead.getChar1())) {
                if (Integer.parseInt(productClassAndHead.getChar1()) >= 2) {
                    yarncount = yarncount + "*" + Integer.parseInt(productClassAndHead.getChar1());
                }
            }
            // add by xhs 2020-06-01 end

            //新增商品表
            MProduct mProduct = new MProduct();
            //纱比
            String ratio = "";
            //商品名
            String prodNmBuf = "";
            //拼接用商品名
            String strprodNm = "";

            List<String> ratios = new ArrayList();
            List<String> prodNmBufs = new ArrayList();

            for (int i = 0; i < mProductClassListNew.size(); i++) {
                if (mProductClassListNew.size() == 1) {
                    ratio = mProductClassListNew.get(i).getRatio();
                    prodNmBuf = mProductClassListNew.get(i).getProdClassNm();
                }
                ratios.add(mProductClassListNew.get(i).getRatio());
                prodNmBufs.add(mProductClassListNew.get(i).getProdClassNm());

            }
            if (ratios.size() == 1) {
                mProduct.setRatio(ratio);
                strprodNm = prodNmBuf;
            } else if (mProductClassListNew.size() > 1) {
                String str2 = String.join("/", ratios);
                strprodNm = String.join("/", prodNmBufs);
                mProduct.setRatio(str2);
            }
            //商品名称（纱支_+纱类+_纱比）拼接
            String prodNm = yarncount + "_" + strprodNm + "_" + mProduct.getRatio();
//            //判断商品名是否重复
//            Example.Criteria criteriaNmJc = mProductService.createCriteria();
//            criteriaNmJc.andEqualTo("delFlg", '0');
//            criteriaNmJc.andEqualTo("prodNm", prodNm);
//            List<MProduct> sysProducts = mProductService.select(criteriaNmJc);
//            if (sysProducts.size() > 0) {
//                return ResultBean.failure("商品已存在！",sysProducts);
//            }
            //根据拼接的纱支筛选商品信息
            Example.Criteria criteriaNmJc = mProductService.createCriteria();
            criteriaNmJc.andEqualTo("delFlg", '0');
//            if(mProduct.getRatio().equals("100")){
//                criteriaNmJc.andEqualTo("ratio", mProduct.getRatio());
//            }
            criteriaNmJc.andEqualTo("yarnCount", yarncount);
            List<MProduct> sysProducts = mProductService.select(criteriaNmJc);
            //是否存在
            boolean isExist = true;
            //有数据时
            if (sysProducts.size() > 0) {
                //外层循环商品信息
                outer:
                for (MProduct mProductId : sysProducts) {
                    //内层循环前端纱支纱比的list
                    inner:
                    for (int i = 0; i < mProductClassListNew.size(); i++) {
                        //根据商品主键查询分类表
                        Example.Criteria criteriaNm = mProductRelaService.createCriteria();
                        criteriaNm.andEqualTo("delFlg", '0');
                        criteriaNm.andEqualTo("prodId", mProductId.getId());
                        criteriaNm.andEqualTo("ratio", mProductClassListNew.get(i).getRatio());
                        criteriaNm.andEqualTo("prodClassId", mProductClassListNew.get(i).getId());
                        List<MProductRela> sysProductRela = mProductRelaService.select(criteriaNm);
                        //有数据继续循环 存在为true
                        if (sysProductRela.size() > 0) {
                            isExist = true;
                            continue inner;
                        } else { //无 存在为false并跳出循环
                            isExist = false;
                            break inner;
                        }
                    }
                    //如果存在为true 并跳出外层循环
                    if (isExist == true) {
                        return ResultBean.failure("商品已存在！", sysProducts);
                    }
                }
            }
            //纱支
            mProduct.setYarnCount(yarncount);
            //商品名称
            mProduct.setProdNm(prodNm);
            Map<String, Object> tempMap = commonService.insertMproductNew(request, mProduct, productClassAndHead, mProductClassListNew);
            // 同步其他服务数据
            extraServiceController.insertMproductNew(tempMap);

            return ResultBean.success("新增商品成功！", mProduct);
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("新增商品失败！");
        }
    }


    /**
     * 编辑商品信息
     *
     * @param request
     * @param mproduct 商品信息
     * @return
     */
    @SystemLog("编辑商品信息")
    @PostMapping(value = "updateMproduct")
    public ResultBean updateMproduct(HttpServletRequest request, MProductEx mproduct, String mProdRelaInsert, String mProdRelaUpdate) {
        try {
            MProduct tempProduct = CommonUtils.clone(mproduct);
            Example.Criteria criteria = mProductService.createCriteria();
            criteria.andEqualTo("id", mproduct.getId());
            List<MProduct> mProducts = mProductService.select(criteria);
            if (!mproduct.getUpdCnt().equals(mProducts.get(0).getUpdCnt())) {
                return ResultBean.failure("数据已被修改,请重试！");
            }
            Example.Criteria criteriaNmCd = mProductService.createCriteria();
            criteriaNmCd.andNotEqualTo("id", mproduct.getId());
            criteriaNmCd.andEqualTo("delFlg", '0');
            criteriaNmCd.andEqualTo("prodCdDis", mproduct.getProdCdDis());
            List<MProduct> sysProducts = mProductService.select(criteriaNmCd);
            if (sysProducts.size() > 0) {
                return ResultBean.failure("商品编号已存在！");
            }
            Example.Criteria criteriaNm = mProductService.createCriteria();
            criteriaNm.andEqualTo("cntrCd", mproduct.getCntrCd());
            criteriaNm.andNotEqualTo("id", mproduct.getId());
            criteriaNm.andEqualTo("delFlg", '0');
            criteriaNm.andEqualTo("prodNm", mproduct.getProdNm());
            sysProducts = mProductService.select(criteriaNm);
            if (sysProducts.size() > 0) {
                return ResultBean.failure("商品名称已存在！");
            }
            if (!StringUtils.isNullOrEmpty(mproduct.getProdJc())) {
                Example.Criteria criteriaNmJc = mProductService.createCriteria();
                criteriaNmJc.andEqualTo("cntrCd", mproduct.getCntrCd());
                criteriaNmJc.andNotEqualTo("id", mproduct.getId());
                criteriaNmJc.andEqualTo("delFlg", '0');
                criteriaNmJc.andEqualTo("prodJc", mproduct.getProdJc());
                sysProducts = mProductService.select(criteriaNmJc);
                if (sysProducts.size() > 0) {
                    return ResultBean.failure("商品简称已存在！");
                }
            }
            if (!StringUtils.isNullOrEmpty(mproduct.getProdNmEn())) {
                Example.Criteria criteriaNmEn = mProductService.createCriteria();
                criteriaNmEn.andEqualTo("cntrCd", mproduct.getCntrCd());
                criteriaNmEn.andNotEqualTo("id", mproduct.getId());
                criteriaNmEn.andEqualTo("delFlg", '0');
                criteriaNmEn.andEqualTo("prodNmEn", mproduct.getProdNmEn());
                sysProducts = mProductService.select(criteriaNmEn);
                if (sysProducts.size() > 0) {
                    return ResultBean.failure("商品英文名称已存在！");
                }
            }
            if (StringUtils.isNullOrEmpty(mproduct.getProdCdDis())) {
                String prodCdDis = mNumberService.getMNumberList("PROD_CD_DIS");
                mproduct.setProdCdDis(prodCdDis);
            }
            Example.Criteria criteriaCd = mProductService.createCriteria();
            criteriaCd.andEqualTo("cntrCd", mproduct.getCntrCd());
            criteriaCd.andNotEqualTo("id", mproduct.getId());
            criteriaCd.andEqualTo("delFlg", '0');
            criteriaCd.andEqualTo("prodCdDis", mproduct.getProdCdDis());
            sysProducts = mProductService.select(criteriaCd);
            if (sysProducts.size() > 0) {
                return ResultBean.failure("商品表示用编号已存在！");
            }
            // add by xhs 2020-09-22 start
            // 只有纱线会有成分比例，其他的没有成分比例,不用拼接/
            if ("01".equals(mproduct.getProdType())) {
                ResultBean rs = commonService.getYarnInfo(mproduct, mProdRelaUpdate);
                if (!rs.isSuccess()) {
                    return rs;
                }
                mproduct = (MProductEx) rs.getData();
            }
            // add by xhs 2020-09-22 end

            commonService.updateMproduct(request, mproduct, mProdRelaInsert, mProdRelaUpdate);
            // 同步其他服务数据   TODO 同步
            // update by xhs 2020-06-02 start
//            extraServiceController.updateMproduct(tempProduct);
            extraServiceController.updateMproduct(mproduct);
            // update by xhs 2020-06-02 end
            return ResultBean.success("编辑商品信息成功！");
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("编辑商品信息失败！");
        }
    }

    /**
     * 删除商品信息
     *
     * @param mProduct
     * @return
     */
    @SystemLog("删除商品信息")
    @PostMapping(value = "deleteMproduct")
    public ResultBean deleteMproduct(HttpServletRequest request, MProduct mProduct) {
        try {
            MProduct tempProduct = CommonUtils.clone(mProduct);
            Example.Criteria criteria = mProductService.createCriteria();
            criteria.andEqualTo("id", mProduct.getId());
            List<MProduct> mProducts = mProductService.select(criteria);
            if (!mProduct.getUpdCnt().equals(mProducts.get(0).getUpdCnt())) {
                return ResultBean.failure("数据已被修改,请重试！");
            }
            commonService.deleteMproduct(request, mProduct);
            // 同步其他服务数据   TODO  同步
            extraServiceController.deleteMproduct(tempProduct);
            return ResultBean.success("删除商品信息成功！");
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("删除商品息失败！");
        }
    }

    /**
     * 获取商品信息
     *
     * @param page       当前页数
     * @param limit      分页数
     * @param prodCdDis  商品表示用编号
     * @param prodNm     商品名称
     * @param prodJc     商品简称
     * @param prodNmEn   商品英文名称
     * @param prodType   商品种类
     * @param assetModel 规格型号
     * @param yarnCount  纱支
     * @param ratio      成分比例
     * @return 需求列表
     */
    @SystemLog("获取商品信息")
    @GetMapping(value = "getMproductList")
    public ResultBean getMproductList(Integer page, Integer limit, String prodCdDis, String prodNm, String prodJc, String prodNmEn, String prodType, String assetModel, String yarnCount, String ratio) {
        List<MProductEx> mproductExList = new ArrayList<>();
        Integer pageInt = page;
        Integer limitInt = limit;
        if (page == null) {
            pageInt = 1;
        }
        if (limit == null) {
            limitInt = 0;
        }
        try {
            mproductExList = commonService.getMproductList(pageInt, limitInt, prodCdDis, prodNm, prodJc, prodNmEn, prodType, assetModel, yarnCount, ratio);
            return ResultBean.success("获取商品信息一览成功", new PageInfo<>(mproductExList));
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("获取商品信息一览失败");
        }
    }

    /**
     * 获取商品信息
     *
     * @param prodId 商品名称
     * @return 需求列表
     */
    @SystemLog("获取商品明细")
    @GetMapping(value = "getMproductLineList")
    public ResultBean getMproductLineList(String prodId) {
        List<MProductEx> mproductLineList = new ArrayList<>();
        try {
            mproductLineList = commonService.getMproductLineList(prodId);
            return ResultBean.success("获取商品明细成功", mproductLineList);
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("获取商品明细失败");
        }
    }

    /**
     * 获取商品信息
     *
     * @param prodType       商品分类：01
     * @param cntrCd         中心
     * @param prodClassNmStr 指定的分类商品
     * @return 需求列表
     */
    @ApiOperation("获取分类商品")
    @PostMapping(value = "getMproductListByClass")
    public ResultBean getMproductListByClass(HttpServletRequest request, String prodType, String cntrCd, String yarnCount, String ratio, String prodClassNmStr) {
        List<MProductEx> mProductExLists = new ArrayList<>();
        List<String> prodClassNm = null;
        if (!StringUtils.isNullOrEmpty(prodClassNmStr)) {
            prodClassNm = com.alibaba.fastjson.JSONArray.parseArray(prodClassNmStr).toJavaList(String.class);
        }
        try {
            mProductExLists = commonService.getMproductListByClass(prodType, cntrCd, yarnCount, ratio, prodClassNm);
            return ResultBean.success("获取分类商品成功", mProductExLists);
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("获取分类商品失败");
        }
    }

    /**
     * 新增商品分类信息
     *
     * @param request
     * @param mProductClass
     * @return
     */
    @SystemLog("新增商品分类信息")
    @PostMapping(value = "insertMProductClass")
    public ResultBean insertMProductClass(HttpServletRequest request, MProductClass mProductClass) {
        try {
            if (!commonService.checkProdCdDisExist(mProductClass)) {
                return ResultBean.failure("商品分类编号已存在！");
            }
            if (!commonService.checkProdNmExist(mProductClass)) {
                return ResultBean.failure("商品分类名称已存在！");
            }
            if (!commonService.checkProdJcExist(mProductClass)) {
                return ResultBean.failure("商品分类简称已存在！");
            }
            if (!commonService.checkProdNmEnExist(mProductClass)) {
                return ResultBean.failure("商品分类英文名称已存在！");
            }
            if (StringUtils.isNullOrEmpty(mProductClass.getProdClassCdDis())) {
                String prodClassCdDis = mNumberService.getMNumberList("PROD_CLASS_CD_DIS");
                mProductClass.setProdClassCdDis(prodClassCdDis);
            }
            mProductClass = commonService.insertMProductClass(request, mProductClass);
            // 同步其他服务数据
            extraServiceController.insertMProductClass(mProductClass);
            return ResultBean.success("新增商品分类成功！");
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("新增商品分类失败！");
        }
    }

    /**
     * 删除商品分类信息
     *
     * @param mProductClass 商品分类删除信息
     * @return
     */
    @SystemLog("删除商品分类信息")
    @PostMapping(value = "deleteMProductClass")
    public ResultBean deleteMProductClass(HttpServletRequest request, MProductClass mProductClass) {
        try {
            // 检查当前商品分类是否使用
            if (!commonService.isDeleteProduct(mProductClass.getId())) {
                return ResultBean.failure("当前商品分类已使用，请删除该商品分类的商品");
            }
            //判断时效性
            Example.Criteria criteria = mProductClassService.createCriteria();
            criteria.andEqualTo("id", mProductClass.getId());
            List<MProductClass> mProductClasses = mProductClassService.select(criteria);
            if (!mProductClass.getUpdCnt().equals(mProductClasses.get(0).getUpdCnt())) {
                return ResultBean.failure("数据已被修改,请重试！");
            }
            MProductClass tempProductClass = CommonUtils.clone(mProductClass);
            commonService.deleteMProductClass(request, mProductClass);
            // 同步其他服务数据
            extraServiceController.deleteMProductClass(tempProductClass);
            return ResultBean.success("删除商品分类信息成功！");
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("删除商品分类信息失败！");
        }
    }

    @SystemLog("获取商品分类级别下拉框")
    @GetMapping(value = "classLevelDropDown")
    public ResultBean queryClassLevelDropDown(String prodType) {
        try {
            return ResultBean.success("获取商品分类级别下拉框成功！", commonService.selectClassLevelDropDown(prodType));
        } catch (Exception e) {
            e.printStackTrace();
            return ResultBean.failure("获取商品分类级别下拉框失败！");
        }
    }

    @SystemLog("获取商品分类父类下拉框")
    @GetMapping(value = "classParentDropDown")
    public ResultBean queryClassParent() {
        try {
            return ResultBean.success("获取商品分类父类下拉框成功！", commonService.selectClassParentDropDown());
        } catch (Exception e) {
            e.printStackTrace();
            return ResultBean.failure("获取商品分类父类下拉框失败！");
        }
    }

    @SystemLog("获取商品子类级别下拉框")
    @GetMapping(value = "classChildDropDown")
    public ResultBean queryClassChild(String parentClass) {
        try {
            return ResultBean.success("获取商品分类子类下拉框成功！", commonService.selectClassChildDropDown(parentClass));
        } catch (Exception e) {
            e.printStackTrace();
            return ResultBean.failure("获取商品分类子类下拉框失败！");
        }
    }

    /**
     * 编辑商品分类信息
     *
     * @param request
     * @param mProductClass
     * @return
     */
    @SystemLog("编辑商品分类信息")
    @PostMapping(value = "updateMProductClass")
    public ResultBean updateMProductClass(HttpServletRequest request, MProductClass mProductClass) {
        try {
            Example.Criteria criteria = mProductClassService.createCriteria();
            criteria.andEqualTo("id", mProductClass.getId());
            List<MProductClass> mProductClasses = mProductClassService.select(criteria);
            if (!mProductClass.getUpdCnt().equals(mProductClasses.get(0).getUpdCnt())) {
                return ResultBean.failure("数据已被修改,请重试！");
            }
            if (!commonService.checkProdCdDisExist(mProductClass)) {
                return ResultBean.failure("商品分类编号已存在！");
            }
            if (!commonService.checkProdNmExist(mProductClass)) {
                return ResultBean.failure("商品分类名称已存在！");
            }
            if (!commonService.checkProdJcExist(mProductClass)) {
                return ResultBean.failure("商品分类简称已存在！");
            }
            if (!commonService.checkProdNmEnExist(mProductClass)) {
                return ResultBean.failure("商品分类英文名称已存在！");
            }
            if (StringUtils.isNullOrEmpty(mProductClass.getProdClassCdDis())) {
                String prodClassCdDis = mNumberService.getMNumberList("PROD_CLASS_CD_DIS");
                mProductClass.setProdClassCdDis(prodClassCdDis);
            }
            MProductClass tempProductClass = CommonUtils.clone(mProductClass);
            commonService.updateMProductClass(request, mProductClass);
            // 同步其他服务数据
            extraServiceController.updateMProductClass(tempProductClass);
            return ResultBean.success("编辑商品分类信息成功！");
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("编辑商品分类信息失败！");
        }

    }

    /**
     * 获取商品分类信息
     *
     * @param prodClassNm 商品分类名称
     * @return 需求列表
     */
    @ApiOperation("获取商品分类信息")
    @GetMapping(value = "getMProductClassListNew")      //TODO  获取商品分类信息
    public ResultBean getMProductClassListNew(String prodClassNm, String prodType) {
        List<MProductClassEx> mProductClassExList = new ArrayList<>();
        try {
            mProductClassExList = commonService.getMProductClassLine(prodClassNm, prodType);
            return ResultBean.success("获取商品分类信息一览成功", mProductClassExList);
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("获取商品分类信息一览失败");
        }
    }

    /**
     * 获取商品分类信息
     *
     * @param prodId 商品主键
     * @return 需求列表
     */
    @ApiOperation("获取纱类纱比信息")
    @GetMapping(value = "getYarnRatio")
    public ResultBean getYarnRatio(String prodId) {
        List<MProductEx> mProductExList = new ArrayList<>();
        try {
            mProductExList = commonService.getYarnRatio(prodId);
            return ResultBean.success("获取纱类纱比信息成功", mProductExList);
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("获取纱类纱比信息失败");
        }
    }

    /**
     * 获取商品分类信息
     *
     * @param page           当前页数
     * @param limit          分页数
     * @param prodClassCdDis 商品分类表示用编号
     * @param prodClassNm    商品分类名称
     * @param prodClassJc    商品分类简称
     * @param prodClassNmEn  商品分类英文名称
     * @param prodType       商品种类
     * @return 需求列表
     */
    @SystemLog("获取商品分类信息")
    @GetMapping(value = "getMProductClassList")
    public ResultBean getMProductClassList(Integer page, Integer limit, String prodClassCdDis, String prodClassNm, String prodClassJc, String prodClassNmEn, String prodType, String classLevel) {
        List<MProductClassEx> mProductClassExList = new ArrayList<>();
        try {
            mProductClassExList = commonService.getMProductClassList(page, limit, prodClassCdDis, prodClassNm, prodClassJc, prodClassNmEn, prodType, classLevel);
            return ResultBean.success("获取商品分类信息一览成功", new PageInfo<>(mProductClassExList));
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("获取商品分类信息一览失败");
        }
    }

    /**
     * 获取商品分类明细
     *
     * @param prodClassId 商品分类编号
     * @return 需求列表
     */
    @SystemLog("获取商品分类信息")
    @GetMapping(value = "getMProductClassLineList")
    public ResultBean getMProductClassLineList(String prodClassId) {
        List<MProductClassEx> mProductClassExList = new ArrayList<>();
        try {
            mProductClassExList = commonService.getMProductClassLineList(prodClassId);
            return ResultBean.success("获取商品分类明细成功", mProductClassExList);
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("获取商品分类明细失败");
        }
    }

    /**
     * 新增中心信息
     *
     * @param request
     * @param mCenter
     * @return
     */
    @SystemLog("新增中心信息")
    @PostMapping(value = "insertMCenter")
    public ResultBean insertMCenter(HttpServletRequest request, MCenter mCenter) {
        try {
            Example.Criteria criteriaNm = mCenterService.createCriteria();
            criteriaNm.andEqualTo("delFlg", '0');
            criteriaNm.andEqualTo("cntrNm", mCenter.getCntrNm());
            List<MCenter> mCenters = mCenterService.selectByCondition(criteriaNm);
            if (mCenters.size() > 0) {
                return ResultBean.failure("中心名称已存在！");
            }
            if (StringUtils.isNullOrEmpty(mCenter.getCntrCdDis())) {
                String cntrCdDis = mNumberService.getMNumberList("CNTR_CD_DIS");
                mCenter.setCntrCdDis(cntrCdDis);
            }
            mCenter = commonService.insertMCenter(request, mCenter);
            // 同步其他服务数据
            extraServiceController.insertMCenter(mCenter);
            return ResultBean.success("新增中心成功！");
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("新增中心失败！");
        }
    }

    /**
     * 编辑中心信息
     *
     * @param request
     * @param mCenter
     * @return
     */
    @SystemLog("编辑中心信息")
    @PostMapping(value = "updateMCenter")
    public ResultBean updateMCenter(HttpServletRequest request, MCenter mCenter) {
        try {
            Example.Criteria criteria = mCenterService.createCriteria();
            criteria.andEqualTo("id", mCenter.getId());
            List<MCenter> mCenters = mCenterService.selectByCondition(criteria);
            if (!mCenter.getUpdCnt().equals(mCenters.get(0).getUpdCnt())) {
                return ResultBean.failure("数据已被修改,请重试！");
            }
            Example.Criteria criteriaNm = mCenterService.createCriteria();
            criteriaNm.andNotEqualTo("id", mCenter.getId());
            criteriaNm.andEqualTo("delFlg", '0');
            criteriaNm.andEqualTo("cntrNm", mCenter.getCntrNm());
            mCenters = mCenterService.selectByCondition(criteriaNm);
            if (mCenters.size() > 0) {
                return ResultBean.failure("中心名称已存在！");
            }
            if (StringUtils.isNullOrEmpty(mCenter.getCntrCdDis())) {
                String cntrCdDis = mNumberService.getMNumberList("CNTR_CD_DIS");
                mCenter.setCntrCdDis(cntrCdDis);
            }
            Example.Criteria criteriaCd = mCenterService.createCriteria();
            criteriaCd.andNotEqualTo("id", mCenter.getId());
            criteriaCd.andEqualTo("delFlg", '0');
            criteriaCd.andEqualTo("cntrCdDis", mCenter.getCntrCdDis());
            mCenters = mCenterService.selectByCondition(criteriaCd);
            if (mCenters.size() > 0) {
                return ResultBean.failure("中心表示用编号已存在！");
            }
            MCenter tempCenter = CommonUtils.clone(mCenter);
            commonService.updateMCenter(request, tempCenter);
            // 同步其他服务数据
            extraServiceController.updateMCenter(mCenter);
            return ResultBean.success("编辑中心信息成功！");
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("编辑中心信息失败！");
        }
    }

    /**
     * 删除中心信息
     *
     * @param mCenter
     * @return
     */
    @SystemLog("删除中心信息")
    @PostMapping(value = "deleteMCenter")
    public ResultBean deleteMCenter(HttpServletRequest request, MCenter mCenter) {
        try {
            Example.Criteria criteria = mCenterService.createCriteria();
            criteria.andEqualTo("id", mCenter.getId());
            List<MCenter> mCenters = mCenterService.selectByCondition(criteria);
            if (!mCenter.getUpdCnt().equals(mCenters.get(0).getUpdCnt())) {
                return ResultBean.failure("数据已被修改,请重试！");
            }
            MCenter tempCenter = CommonUtils.clone(mCenter);
            commonService.deleteMCenter(request, mCenter);
            // 同步其他服务数据
            extraServiceController.deleteMCenter(tempCenter);
            return ResultBean.success("删除中心信息成功！");
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("删除中心息失败！");
        }
    }

    @SystemLog("获取中心列表")
    @GetMapping(value = "getMCenterList")
    public ResultBean getMCenterList(String centerType) {
        List<MCenter> mCenterList = new ArrayList<>();
        try {
            mCenterList = commonService.getMCenter(centerType);
            return ResultBean.success("取得中心列表成功", mCenterList);
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("取得中心列表失败");
        }
    }

    @SystemLog("获取商品分类下拉框")
    @GetMapping(value = "getMProductClass")
    public ResultBean getMProductClass(String cntrCd, String prodType) {
        List<MProductClass> mProductClassList = new ArrayList<>();
        try {
            mProductClassList = commonService.getMProductClass(cntrCd, prodType);
            return ResultBean.success("获取商品分类成功", mProductClassList);
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("获取商品分类失败");
        }
    }

    /**
     * 获取人员信息
     *
     * @param
     * @return 需求列表
     */
    @SystemLog("获取人员信息")
    @GetMapping(value = "getMUserList")
    public ResultBean getMUserList(Integer page, Integer limit, MUserEx mUserEx) {
        List<MUserEx> mUserExList = new ArrayList<>();
        try {
            mUserExList = commonService.getMUserList(page, limit, mUserEx);
            return ResultBean.success("获取人员信息一览成功", new PageInfo<>(mUserExList));
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("获取人员信息一览失败");
        }
    }


    @SystemLog("编辑角色主表")
    @PostMapping(value = "updateMRole")
    public ResultBean updateMRole(HttpServletRequest request, MRole mRole, String mRoleModules) {
        try {
            //判断时效性
            if (!StringUtils.isNullOrEmpty(mRole.getId())) {
                Example.Criteria criteria = mRoleService.createCriteria();
                criteria.andEqualTo("id", mRole.getId());
                List<MRole> mRoles = mRoleService.selectByCondition(criteria);
                if (!mRole.getUpdCnt().equals(mRoles.get(0).getUpdCnt())) {
                    return ResultBean.failure("数据已被修改,请重试！");
                }
            }
            //判断角色名称是否重复
            Example.Criteria criteriaNm = mRoleService.createCriteria();
            criteriaNm.andEqualTo("cntrCd", mRole.getCntrCd());
            criteriaNm.andEqualTo("orgId", mRole.getOrgId());
            criteriaNm.andEqualTo("delFlg", '0');
            criteriaNm.andEqualTo("roleNm", mRole.getRoleNm());
            criteriaNm.andNotEqualTo("id", mRole.getId());
            List<MRole> sysWhs = mRoleService.selectByCondition(criteriaNm);
            if (sysWhs.size() > 0) {
                return ResultBean.failure("角色名称已存在！");
            }
            commonService.updateMRole(request, mRole, mRoleModules);
            return ResultBean.success("编辑角色主表成功！");
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("编辑角色主表失败！");
        }
    }

    /**
     * 采番
     *
     * @param bizCd
     * @return
     */
    @SystemLog("编辑角色主表")
    @GetMapping(value = "getMNumberList")
    public ResultBean getMNumberList(String bizCd) {
        try {
            if (StringUtils.isNullOrEmpty(bizCd)) {
                return ResultBean.failure("采番失败，无效采番code");
            }
            return ResultBean.success("采番成功", mNumberService.getMNumberList(bizCd));
        } catch (Exception ex) {
            return ResultBean.failure("采番失败");
        }
    }
    //del by xieshengjie 2019/11/28 begin 前端无调用,废接口
//    @SystemLog("获取共通下拉框")
//    @GetMapping(value = "getMGenerals")
//    public ResultBean getMGenerals(String generalType) {
//        List<MGeneral> mGenerals = new ArrayList<>();
//        try {
//            mGenerals = mGeneralListService.selectGeneral(generalType);
//            return ResultBean.success("获取共通下拉框成功", mGenerals);
//        } catch (Exception ex) {
//            ex.printStackTrace();
//            return ResultBean.failure("获取共通下拉框失败");
//        }
//    }
    //del by xieshengjie 2019/11/28 end 前端无调用,废接口


    /**
     * 新增机台
     *
     * @param request
     * @param mMachineEx
     * @return
     */
    @SystemLog("新增机台")
    @PostMapping(value = "insertMMachine")
    public ResultBean insertMMachine(HttpServletRequest request, MMachineEx mMachineEx) {
        try {
            if (!commonService.checkMachineCd(mMachineEx)) {
                return ResultBean.failure("机台号已存在！");
            }
            if (!commonService.checkMachineNm(mMachineEx)) {
                return ResultBean.failure("机台名称已存在！");
            }
            if (!commonService.checkMachineNmEn(mMachineEx)) {
                return ResultBean.failure("机台英文名已存在！");
            }
            if (!commonService.checkMachineJc(mMachineEx)) {
                return ResultBean.failure("机台简称已存在！");
            }
            mMachineEx.setNum1(CommonUtils.nullToZero(mMachineEx.getProdShortOverRange()).divide(BigDecimal.valueOf(100)));
            mMachineEx = commonService.insertMMachine(request, mMachineEx);
            // 同步其他服务数据
            extraServiceController.insertMMachine(mMachineEx);
            return ResultBean.success("编辑机台成功！");
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("编辑机台失败！");
        }
    }

    /**
     * 编辑机台
     *
     * @param request
     * @param mMachineEx
     * @return
     */
    @SystemLog("编辑机台")
    @PostMapping(value = "updateMMachine")
    public ResultBean updateMMachine(HttpServletRequest request, MMachineEx mMachineEx) {
        try {
            if (!commonService.checkMachineCd(mMachineEx)) {
                return ResultBean.failure("机台号已存在！");
            }
            if (!commonService.checkMachineNm(mMachineEx)) {
                return ResultBean.failure("机台名称已存在！");
            }
            if (!commonService.checkMachineNmEn(mMachineEx)) {
                return ResultBean.failure("机台英文名已存在！");
            }
            if (!commonService.checkMachineJc(mMachineEx)) {
                return ResultBean.failure("机台简称已存在！");
            }
            mMachineEx.setNum1(CommonUtils.nullToZero(mMachineEx.getProdShortOverRange()).divide(BigDecimal.valueOf(100)));
            mMachineEx = commonService.updateMMachine(request, mMachineEx);
            // 同步其他服务数据
            extraServiceController.updateMMachine(mMachineEx);
            return ResultBean.success("编辑机台成功！");
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("编辑机台失败！");
        }
    }

    /**
     * 删除机台
     *
     * @param mMachineEx
     * @return
     */
    @SystemLog("删除机台")
    @PostMapping(value = "deleteMMachine")
    public ResultBean deleteMMachine(HttpServletRequest request, MMachineEx mMachineEx) {
        try {
            Example.Criteria criteria = mMachineService.createCriteria();
            criteria.andEqualTo("id", mMachineEx.getId());
            List<MMachine> machines = mMachineService.select(criteria);
            if (machines.size() == 0 || !mMachineEx.getUpdCnt().equals(machines.get(0).getUpdCnt())) {
                return ResultBean.failure("数据已被修改,请重试！");
            }
            commonService.deleteMMachine(request, mMachineEx);
            // 同步其他服务数据
            extraServiceController.deleteMMachine(mMachineEx);
            return ResultBean.success("删除机台成功！");
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("删除机台失败！");
        }
    }

    @SystemLog("获取机台列表")
    @GetMapping(value = "getMachineList")
    public ResultBean getMachineList(Integer page, Integer limit, MMachineEx mMachineEx) {
        List<MMachineEx> mMachineExList = new ArrayList<>();
        try {
            mMachineExList = commonService.getMachineList(page, limit, mMachineEx);
            for(MMachineEx ex : mMachineExList){
                ex.setProdShortOverRange(CommonUtils.nullToZero(ex.getProdShortOverRange()).multiply(BigDecimal.valueOf(100)));
            }
            return ResultBean.success("取得机台列表成功", new PageInfo<>(mMachineExList));
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("取得机台列表失败");
        }
    }

    @SystemLog("获取机台明细")
    @GetMapping(value = "getMachineDetail")
    public ResultBean getMachineDetail(MMachineEx mMachineEx) {
        try {
            List<MMachineEx> mMachineExList = new ArrayList<>();
            mMachineExList = commonService.getMachineList(1, 0, mMachineEx);
            for(MMachineEx ex : mMachineExList){
                ex.setProdShortOverRange(CommonUtils.nullToZero(ex.getProdShortOverRange()).multiply(BigDecimal.valueOf(100)));
            }
            return ResultBean.success("取得机台明细成功",mMachineExList);
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResultBean.failure("取得机台明细失败");
        }
    }


    // add by xhs 2020-05-21 start
    @SystemLog("获取中心信息")
    @GetMapping(value = "getCenterList")
    public ResultBean getCenterList(Integer page, Integer limit, MCenter center) {
        ResultBean centerList = commonService.getCenterList(page, limit, center);
        return centerList;
    }

    @SystemLog("新增中心信息")
    @PostMapping(value = "setCenterList")
    public ResultBean setCenterList(HttpServletRequest request, MCenter center) {
        ResultBean resultBean = commonService.setCenterList(request, center);
        return resultBean;
    }

    @SystemLog("修改中心信息")
    @PostMapping(value = "updCenterList")
    public ResultBean updCenterList(HttpServletRequest request, MCenter center) {
        ResultBean resultBean = commonService.updCenterList(request, center);
        return resultBean;
    }

    @SystemLog("删除中心信息")
    @PostMapping(value = "delCenterList")
    public ResultBean delCenterList(HttpServletRequest request, MCenter center) {
        ResultBean resultBean = commonService.delCenterList(request, center);
        return resultBean;
    }

    // add by xhs 2020-05-21 end

    /**
     * add by xhs 2020-08-07
     *
     * @param request
     * @param machineCd 机台号
     * @return
     */
    @SystemLog("查询机台信息")
    @GetMapping("/getMachine")
    public ResultBean getMachine(HttpServletRequest request, String machineCd) {
        ResultBean machine = commonService.getMachine(machineCd);
        return machine;
    }

    /**
     * add by xhs 2020-10-19
     * 批量新增商品信息
     *
     * @param request
     * @param mProductExList 商品信息
     * @param mProdRelas     商品与商品分类信息
     * @return
     */
    public ResultBean insetMproductList(HttpServletRequest request, List<MProductEx> mProductExList, String mProdRelas) {
        log.debug("------------------开始批量新增商品信息------------------");
        List<MProductEx> productExes = new ArrayList<>();
        // 判断List是否为空
        if (mProductExList != null && !mProductExList.isEmpty()) {
            for (MProductEx productEx : mProductExList) {
                try {
                    Example.Criteria criteriaNm = mProductService.createCriteria();
                    criteriaNm.andEqualTo("delFlg", '0');
                    criteriaNm.andEqualTo("prodNm", productEx.getProdNm());
                    List<MProduct> sysProducts = mProductService.select(criteriaNm);
                    // 如果商品名称已存在，获取它的商品Id
                    if (sysProducts.size() > 0) {
                        for (MProduct product : sysProducts) {
                            if(productEx.getProdNm().equals(product.getProdNm())){
                                productEx.setId(product.getId());
                            }
                        }
                    }else{
                        if (StringUtils.isNullOrEmpty(productEx.getProdCdDis())) {
                            String prodCdDis = mNumberService.getMNumberList("PROD_CD_DIS");
                            productEx.setProdCdDis(prodCdDis);
                        }
                        // add by xhs 2020-09-22 end
                        productEx = commonService.insertMproduct(request, productEx);
                        // 新增成功的数据添加到list，用来同步其他服务的数据
                        productExes.add(productEx);
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                    return ResultBean.failure("新增商品异常！");
                }
            }
            // 同步其他服务数据
            extraServiceController.insertMproductList(productExes);
            log.debug("------------------批量新增商品信息结束------------------");
            return ResultBean.success("新增商品成功！",mProductExList);
        } else {
            return ResultBean.failure("参数有误，新增商品失败");
        }
    }
}
