package com.soft.common.service;

import com.alibaba.fastjson.JSONArray;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sjasoft.framework.annotation.SystemLog;
import com.sjasoft.framework.bean.ResultBean;
import com.sjasoft.framework.util.StringUtils;
import com.soft.common.mapper.*;
import com.soft.common.model.*;
import com.soft.common.mybatis.extend.dao.*;
import com.soft.common.mybatis.extend.entity.*;
import com.soft.common.web.Util.CommonUtils;
import com.soft.common.web.service.*;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.*;

@Service
public class CommonService {
    @Resource
    private MOrgMapper mOrgDao;
    @Resource
    private TLogMapper tLogDao;
    @Resource
    private MWhMapper mWhDao;
    @Resource
    private SysWhCloudMapper sysWhCloudDao;
    @Resource
    private MZoneMapper mZoneDao;
    @Resource
    private MLocMapper mLocDao;
    @Resource
    private MGeneralMapper mGeneralDao;
    @Resource
    private MCustomerMapper mCustomerDao;
    @Resource
    private MCenterListDao mCenterListDao;
    @Resource
    private MCenterMapper mCenterDao;
    @Resource
    private MSupplierMapper mSupplierDao;
    @Resource
    private MSupplierLineMapper mSupplierLineDao;
    @Resource
    private MOutFactoryMapper mOutFactoryDao;
    @Resource
    private MOutFactoryLineMapper mOutFactoryLineDao;
    @Resource
    private TFactoryAppraiseListDao tFactoryAppraiseListDao;
    @Resource
    private MCarrierMapper mCarrierDao;
    @Resource
    private MCarrierLineMapper mCarrierLineDao;
    @Resource
    private MCarrierLineListDao mCarrieLineListDao;
    @Resource
    private MLevelMapper mLevelDao;
    @Resource
    private MBoxMapper mBoxDao;
    @Resource
    private MErrorinfoMapper mErrorinfoDao;
    @Resource
    private MOrgListDao mOrgListDao;
    @Resource
    private MWhListDao mWhListDao;
    @Resource
    private MGeneralListDao mGeneralListDao;
    @Resource
    private MLocListDao mLocListDao;
    @Resource
    private MCustomerListao mCustomerListDao;
    @Resource
    private TCustomerAppraiseListDao tCustomerAppraiseListDao;
    @Resource
    private TSupplierAppraiseListDao tSupplierAppraiseListDao;
    @Resource
    private MSupplierListDao mSupplierListDao;
    @Resource
    private MOutFactoryListDao mOutFactoryListDao;
    @Resource
    private MOutFactoryLineListDao mOutFactoryLineListDao;
    @Resource
    private MCarrierListDao mCarrierListDao;
    @Resource
    private MLevelListDao mLevelListDao;
    @Resource
    private MBoxListDao mBoxListDao;
    @Resource
    private MErrorinfoListDao mErrorinfoListDao;
    @Resource
    private TLogListDao tLogListDao;
    @Resource
    private MProductMapper mProductDao;
    @Resource
    private MUserMapper mUserDao;
    @Resource
    private MRoleMapper mRoleDao;
    @Resource
    private MRoleModuleMapper mRoleModuleDao;
    @Resource
    private MUserListDao mUserListDao;
    @Resource
    private MLoginMapper mLoginDao;
    @Resource
    private MProductListDao mProductListDao;
    @Resource
    private MproductClassListDao mproductClassListDao;
    @Resource
    private MProductClassMapper mProductClassDao;
    @Resource
    private MOrgService sysOrgService;
    @Resource
    private MWhService sysWhService;
    @Resource
    private MLocService sysLocService;
    @Resource
    private MZoneService sysZoneService;
    @Resource
    private MLevelService sysMlevelService;
    @Resource
    private MProductClassService sysMProductClassService;
    @Resource
    private MRoleService mRoleService;
    @Resource
    private MProductService mProductService;
    @Resource
    private MProductRelaService mProductRelaService;
    @Resource
    private MNumberService mNumberService;
    @Resource
    private MProductClassService mProductClassService;
    @Resource
    private MProductRelaMapper mProductRelaMapper;
    @Resource
    private MMachineService mMachineService;
    @Resource
    private MMachineMapper mMachineMapper;
    @Resource
    private MMachineListDao mMachineListDao;

    /**
     * 新增组织部门订单
     *
     * @param mOrg 组织部门
     * @return
     */
    @SystemLog("新增组织部门信息")
    public MOrg insertMOrg(HttpServletRequest request,MOrg mOrg) {
        CommonUtils.setCommonInfo(mOrg, request);
        mOrgDao.insertSelective(mOrg);
        return mOrg;
    }

    /**
     * 编辑组织部门信息
     *
     * @param mOrg 组织部门
     * @return
     */
    @SystemLog("编辑组织部门信息")
    public MOrg updateMOrg(HttpServletRequest request,MOrg mOrg) {
        CommonUtils.setCommonInfo(mOrg, request);
        mOrgDao.updateByPrimaryKey(mOrg);
        return mOrg;
    }

    /**
     * 删除组织部门信息
     * @param mOrg
     * @return
     */
    @SystemLog("删除组织部门明细")
    public MOrg deleteMOrg(HttpServletRequest request,MOrg mOrg) {
        CommonUtils.setCommonInfo(mOrg, request);
        mOrg.setDelFlg("1");
        mOrgDao.updateByPrimaryKey(mOrg);
        return mOrg;
    }
    /**
     * 获取组织部门信息
     *
     * @param page   当前页数
     * @param limit  分页数
     * @return 需求列表
     */
    @SystemLog("获取组织部门信息")
    public List<MOrgEx> getMOrgList(Integer page, Integer limit, MOrgEx mOrgEx) {
        PageHelper.startPage(page, limit);
        return mOrgListDao.selectMOrg(mOrgEx.getCntrCd(),
            mOrgEx.getOrgCdDis(),
            mOrgEx.getOrgNm(),
            mOrgEx.getOrgAbbr(),
            mOrgEx.getOrgEngNm());
    }
    /**
     * 获取组织部门明细
     *
     * @param orgId  组织部门编号
     * @return 需求列表
     */
    @SystemLog("获取组织部门明细")
    public List<MOrgEx> getMOrgLineList(String orgId) {
        return mOrgListDao.selectMOrgLine(orgId);
    }
    /**
     * 新增仓库信息
     * @param mWh 仓库
     * @return
     */
    @SystemLog("新增仓库信息")
    @Transactional
    /* modify by xieshengjie 2019/11/25 begin */
    /* public ResultBean insertMWh(HttpServletRequest request,MWh mWh, List<MZone> mZoneLists) { */
    public Map<String, Object> insertMWh(HttpServletRequest request, MWh mWh, List<MZone> mZoneLists) {
        Map<String, Object> maptemp = new HashMap<String, Object>();
        List<MZone> lstemp = new ArrayList<>();
        /* modify by xieshengjie 2019/11/25 end */
        CommonUtils.setCommonInfo(mWh, request);
        maptemp.put("mWh", mWh);
        mWhDao.insertSelective(mWh);
        // 仓库微服务
        insertSysWhCloud(request, mWh);

        if (mZoneLists.size() > 0) {
            for (MZone mZone : mZoneLists) {
                CommonUtils.setCommonInfo(mZone, request);
                mZone.setWhId(mWh.getId());
                mZoneDao.insertSelective(mZone);
                /* add by xieshengjie 2019/11/25 begin */
                lstemp.add(mZone);
                /* add by xieshengjie 2019/11/25 end */
            }
        }
        /* modify by xieshengjie 2019/11/25 begin */
        //return ResultBean.success("新增仓库信息成功！");
        maptemp.put("mZones", lstemp);
        return maptemp;
        /* modify by xieshengjie 2019/11/25 end */
    }

    /**
     * 插入仓库微服务配置
     * @param mWh 仓库
     * @return
     */
    @SystemLog("插入仓库微服务配置")
    @Transactional
    public void insertSysWhCloud(HttpServletRequest request,MWh mWh) {
        SysWhCloud sysWhCloud = new SysWhCloud();
        sysWhCloud.setWhId(mWh.getId());
        sysWhCloud.setCntrCd(mWh.getCntrCd());
        String cloudNm = null;
        MGeneral data = getGeneralData(mWh.getWhType(), "WH_TYPE");
        if (data != null) {
            cloudNm = data.getChar1();
        }
        sysWhCloud.setCloudNm(cloudNm);
        sysWhCloudDao.insertSelective(sysWhCloud);
    }


    /**
     * 插入仓库微服务配置
     * @param mWh 仓库
     * @return
     */
    @SystemLog("更新仓库微服务配置")
    @Transactional
    public void updateSysWhCloud(HttpServletRequest request,MWh mWh) {
        // 取得仓库云服务类
        Example example = new Example(SysWhCloud.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("whId", mWh.getId());
        criteria.andEqualTo("delFlg", "0");
        List<SysWhCloud> cloudList = sysWhCloudDao.selectByExample(example);
        if (cloudList.size() > 0) {
            // 画面入力值更新仓库云服务类
            SysWhCloud sysWhCloud = cloudList.get(0);
            sysWhCloud.setWhId(mWh.getId());
            sysWhCloud.setCntrCd(mWh.getCntrCd());
            String cloudNm = null;
            MGeneral data = getGeneralData(mWh.getWhType(), "WH_TYPE");
            if (data != null) {
                cloudNm = data.getChar1();
            }
            sysWhCloud.setCloudNm(cloudNm);
            sysWhCloud.setDelFlg(mWh.getDelFlg());
            sysWhCloudDao.updateByPrimaryKey(sysWhCloud);
        }

    }

    /**
     * 新增仓库区域
     * @param zoneLists 仓库区域
     * @return
     */
    @SystemLog("新增仓库区域")
    @Transactional
    /* modify by xieshengjie 2019/11/25 begin */
    //public void insertMZone(HttpServletRequest request,List<MZone> zoneLists) {
    public List<MZone> insertMZone(HttpServletRequest request,List<MZone> zoneLists) {
        List<MZone> lsttemp = new ArrayList<>();
        /* modify by xieshengjie 2019/11/25 end */
        for(MZone mZone:zoneLists) {
            CommonUtils.setCommonInfo(mZone, request);
            mZoneDao.insertSelective(mZone);
            /* add by xieshengjie 2019/11/25 begin */
            lsttemp.add(mZone);
            /* add by xieshengjie 2019/11/25 end */
        }
        /* add by xieshengjie 2019/11/25 begin */
        return lsttemp;
        /* add by xieshengjie 2019/11/25 end */
    }

    /**
     * 编辑仓库信息
     *
     * @param mWh 仓库
     * @return
     */
    @SystemLog("编辑仓库信息")
    @Transactional
    public MWh updateMWh(HttpServletRequest request,MWh mWh ,List<MZone> mZoneLists) {
        CommonUtils.setCommonInfo(mWh, request);
        mWhDao.updateByPrimaryKey(mWh);
        // 仓库微服务
        updateSysWhCloud(request, mWh);

        for (MZone mZone : mZoneLists) {
            //若DelFlg为0 更新操作，否则删除
            if (mZone.getDelFlg().equals("0")) {
                CommonUtils.setCommonInfo(mZone, request);
                mZoneDao.updateByPrimaryKey(mZone);
            } else {
                deleteMZone(request, mZone);
            }
        }
        return mWh;
    }

    /**
     * 编辑仓库
     * @param mWh 仓库
     * @return
     */
    @SystemLog("编辑仓库")
    @Transactional
    public MWh updateWh(HttpServletRequest request,MWh mWh) {
        CommonUtils.setCommonInfo(mWh, request);
        mWhDao.updateByPrimaryKey(mWh);
        return mWh;
    }

    /**
     * 删除仓库信息
     *
     * @param mWh
     * @return
     */
    @SystemLog("删除仓库信息")
    public MWh deleteMWh(HttpServletRequest request,MWh mWh) {
        CommonUtils.setCommonInfo(mWh, request);
        mWh.setDelFlg("1");
        mWhDao.updateByPrimaryKey(mWh);
        // 仓库云服务
        updateSysWhCloud(request, mWh);

        // add by zwd 20200103
        Example example = new Example(MZone.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("whId", mWh.getId());
        criteria.andEqualTo("delFlg", "0");
        List<MZone> mZoneLists = mZoneDao.selectByExample(example);
        for (MZone mZone : mZoneLists) {
            deleteMZone(request, mZone);
        }
        return mWh;
    }

    /**
     * 删除仓库区域
     *
     * @param mZone
     * @return
     */
    @SystemLog("删除仓库区域")
    public MZone deleteMZone(HttpServletRequest request,MZone mZone) {
        //查询原始数据
        MZone mZoneOld= mZoneDao.selectByPrimaryKey(mZone.getId());
        CommonUtils.setCommonInfo(mZone,mZoneOld, request);
        mZoneOld.setDelFlg("1");
        mZoneDao.updateByPrimaryKey(mZoneOld);
        return mZoneOld;
    }

    /**
     * 获取仓库信息
     *
     * @param page   当前页数
     * @param limit  分页数
     * @param mWhEx 画面数据
     * @return 需求列表
     */
    @SystemLog("获取仓库信息")
    public List<MWhEx> getMWhList(Integer page, Integer limit, MWhEx mWhEx) {
        PageHelper.startPage(page, limit);
        return mWhListDao.selectMWh(mWhEx.getId(), mWhEx.getCntrCd(), mWhEx.getWhCdDis(), mWhEx.getWhNm(), mWhEx.getWhNmJc(), mWhEx.getWhType());
    }


    /**
     * 获取仓库区域信息
     * @param whId 仓库编号
     * @return 需求列表
     */
    @SystemLog("获取仓库区域信息")
    public List<MWhEx> getMZone(String whId) {
        return mWhListDao.selectMZone(whId);
    }

    /**
     * 新增共通配置信息
     *
     * @param mGeneralInserts 共通配置
     * @return
     */
    @SystemLog("新增共通配置信息")
    @Transactional
    /* modfiy by xieshengjie 2019/11/25 begin */
    //public void insertMGeneral(HttpServletRequest request,List<MGeneral> mGeneralInserts) {
    public List<MGeneral> insertMGeneral(HttpServletRequest request,List<MGeneral> mGeneralInserts) {
        List<MGeneral> lsttemp = new ArrayList<>();
        /* modfiy by xieshengjie 2019/11/25 begin */
        for (MGeneral mGeneral : mGeneralInserts) {
            CommonUtils.setCommonInfo(mGeneral, request);
            mGeneralDao.insertSelective(mGeneral);
            /* add by xieshengjie 2019/11/25 begin */
            lsttemp.add(mGeneral);
            /* add by xieshengjie 2019/11/25 end */
        }
        /* add by xieshengjie 2019/11/25 begin */
        return lsttemp;
        /* add by xieshengjie 2019/11/25 end */
    }


    /**
     * 编辑共通配置信息
     *
     * @param mGeneralUpdates 共通配置
     * @return
     */
    @SystemLog("编辑共通配置信息")
    @Transactional
    public void updateMGeneral(HttpServletRequest request,List<MGeneral> mGeneralUpdates) {
        for (MGeneral mGeneral : mGeneralUpdates) {
            if(mGeneral.getDelFlg().equals("0")){
                CommonUtils.setCommonInfo(mGeneral, request);
                mGeneralDao.updateByPrimaryKey(mGeneral);
            }else {
                deleteMGeneral(request,mGeneral);
            }
        }
    }

    /**
     * 删除共通配置信息
     *
     * @param mGeneral
     * @return
     */
    @SystemLog("删除共通配置信息")
    public MGeneral deleteMGeneral(HttpServletRequest request,MGeneral mGeneral) {
        //查询原始数据
        MGeneral mGeneralOld= mGeneralDao.selectByPrimaryKey(mGeneral.getId());
        CommonUtils.setCommonInfo(mGeneral,mGeneralOld, request);
        mGeneralOld.setDelFlg("1");
        mGeneralDao.updateByPrimaryKey(mGeneralOld);
        return mGeneralOld;
    }

    /**
     * 获取共通配置信息
     *
     * @param page      当前页数
     * @param limit     分页数
     * @param generalMasterType 共通区分
     * @param generalMasterTypeNm 共通区分名称
     * @return 需求列表
     */
    @SystemLog("获取共通配置信息")
    public List<MGeneral> getMGeneral(Integer page, Integer limit, String generalMasterTypeNm, String generalMasterType) {
        PageHelper.startPage(page, limit);
        return mGeneralListDao.selectMGeneral(generalMasterTypeNm, generalMasterType);
    }
    /**
     * 获取共通配置明细
     *
     * @param generalMasterType
     * @return 需求列表
     */
    @SystemLog("获取共通配置明细")
    public List<MGeneral> getMGeneralLine(String generalMasterType) {
        return mGeneralListDao.selectMGeneralLine(generalMasterType);
    }
    /**
     * 获取共通配置明细
     *
     * @param generalMasterType
     * @return 需求列表
     */
    @SystemLog("获取共通配置明细")
    public MGeneral getGeneralData(String generalCd, String generalMasterType) {
        Optional<MGeneral> optional = getMGeneralLine(generalMasterType).stream().filter(item -> item.getGeneralCd().equals(generalCd)).findFirst();
        if (optional.isPresent()) return optional.get();
        return null;
    }
    /**
     * 新增库位信息
     *
     * @param mLoc 库位
     * @return
     */
    @SystemLog("新增库位信息")
    public MLoc insertMLoc(HttpServletRequest request,MLoc mLoc) {
        CommonUtils.setCommonInfo(mLoc, request);
        mLocDao.insertSelective(mLoc);
        return mLoc;
    }

    /**
     * 编辑库位信息
     *
     * @param mLoc 库位
     * @return
     */
    @SystemLog("编辑库位信息")
    public MLoc updateMLoc(HttpServletRequest request,MLoc mLoc) {
        CommonUtils.setCommonInfo(mLoc, request);
        mLocDao.updateByPrimaryKey(mLoc);
        return mLoc;
    }

    /**
     * 删除库位信息
     *
     * @param mLoc
     * @return
     */
    @SystemLog("删除库位信息")
    public MLoc deleteMLoc(HttpServletRequest request,MLoc mLoc) {
        CommonUtils.setCommonInfo(mLoc, request);
        mLoc.setDelFlg("1");
        mLocDao.updateByPrimaryKey(mLoc);
        return mLoc;
    }

    /**
     * 获取库位信息
     *
     * @param page    当前页数
     * @param limit   分页数
     * @param cntrCd  中心编号
     * @param whId    仓库编号
     * @param zoneId  区域编号
     * @param locType 库位类型
     * @param locCdDis 库位表示用编号
     * @param locNm    库位名称
     * @return 需求列表
     */
    @SystemLog("获取库位信息")
    public List<MLocEx> getMLoc(Integer page, Integer limit, String cntrCd, String whId, String zoneId, String locType, String locCdDis, String locNm) {
        PageHelper.startPage(page, limit);
        return mLocListDao.selectMLoc(cntrCd, whId, zoneId, locType,locCdDis,locNm);
    }

    /**
     * 获取库位明细
     *
     * @param locId 库位编号
     * @return 需求列表
     */
    @SystemLog("获取库位明细")
    public List<MLocEx> getMLocList(String locId) {
        return mLocListDao.selectMLocList(locId);
    }

    /**
     * 新增客户信息
     * @param mCustomer 客户
     * @return
     */
    @SystemLog("新增客户信息")
    public MCustomer insertMCustomer(HttpServletRequest request,MCustomer mCustomer) {
        CommonUtils.setCommonInfo(mCustomer, request);
        mCustomerDao.insertSelective(mCustomer);
        return mCustomer;
    }

    /**
     * 编辑客户信息
     * @param mCustomer 客户
     * @return
     */
    @SystemLog("编辑客户信息")
    public MCustomer updateMCustomer(HttpServletRequest request,MCustomer mCustomer) {
        CommonUtils.setCommonInfo(mCustomer, request);
        mCustomerDao.updateByPrimaryKey(mCustomer);
        return mCustomer;
    }

    /**
     * 删除客户信息
     *
     * @param mCustomer
     * @return
     */
    @SystemLog("删除客户信息")
    public MCustomer deleteMCustomer(HttpServletRequest request,MCustomer mCustomer) {
        CommonUtils.setCommonInfo(mCustomer, request);
        mCustomer.setDelFlg("1");
        mCustomerDao.updateByPrimaryKey(mCustomer);
        return mCustomer;
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
    public List<TCustomerAppraiseList> getTCustomerAppraise(Integer page, Integer limit, String customerId) {
        PageHelper.startPage(page, limit);
        return tCustomerAppraiseListDao.selectTCustomerAppraise(customerId);
    }
    /**
     * 获取供应商评价信息
     *
     * @param page       当前页数
     * @param limit      分页数
     * @param supplierrId 供应商编号
     * @return 需求列表
     */
    @SystemLog("获取供应商评价信息")
    public List<TSupplierAppraiseList> getTSupplierAppraise(Integer page, Integer limit, String supplierrId) {
        PageHelper.startPage(page, limit);
        return tSupplierAppraiseListDao.selectTSupplierAppraise(supplierrId);
    }
    /**
     * 获取客户信息
     *
     * @param page         当前页数
     * @param limit        分页数
     * @param customerCdDis  客户表示用编号
     * @param customerNm   客户名称
     * @param customerJc    客户简称
     * @param customerType 客户种类
     * @param customerNmEn    客户英文名称
     * @param levelId          客户评价等级
     * @param cntryCd          国家编号
     * @param paymentType     结算方式
     * @return 需求列表
     */
    @SystemLog("获取客户信息")
    public List<MCustomerEx> getMCustomer(Integer page, Integer limit, String customerCdDis, String customerNm, String customerJc, String customerType, String customerNmEn, String levelId, String cntryCd, String paymentType,String Id) {
        PageHelper.startPage(page, limit);
        return mCustomerListDao.selectMCustomer(customerCdDis, customerNm,customerJc, customerType,customerNmEn,levelId,cntryCd,paymentType,Id);
    }

    /**
     * 获取客户评价信息
     *
     * @param customerId 客户编号
     * @return 需求列表
     */
    @SystemLog("获取客户明细")
    public List<MCustomerEx> getMCustomerLine(String customerId) {
        return mCustomerListDao.selectMCustomeLineList(customerId);
    }

    /**
     * 新增供应商信息
     *
     * @param mSupplier 供应商
     * @return
     */
    @SystemLog("新增供应商信息")
    @Transactional
    /* modify by xieshengjie 2019/11/25 begin */
    //public MSupplier insertMSupplier(HttpServletRequest request,MSupplier mSupplier , List<MSupplierLineEx> mSupplierLineLists) {
    public Map<String, Object> insertMSupplier(HttpServletRequest request,MSupplier mSupplier , List<MSupplierLineEx> mSupplierLineLists) {
        Map<String, Object> maptemp = new HashMap<String, Object>();
        List<MSupplierLineEx> lsttemp = new ArrayList<>();
        /* modify by xieshengjie 2019/11/25 end */
        CommonUtils.setCommonInfo(mSupplier, request);
        /* add by xieshengjie 2019/11/25 begin */
        maptemp.put("mSupplier", mSupplier);
        /* add by xieshengjie 2019/11/25 end */
        mSupplierDao.insertSelective(mSupplier);
        for(MSupplierLineEx mSupplierLine:mSupplierLineLists) {
            CommonUtils.setCommonInfo(mSupplierLine, request);
            mSupplierLine.setSupplierId(mSupplier.getId());
            mSupplierLineDao.insertSelective(mSupplierLine);
            /* add by xieshengjie 2019/11/25 begin */
            lsttemp.add(mSupplierLine);
            /* add by xieshengjie 2019/11/25 end */
        }
        /*add by xieshengjie 2019/11/25 begin*/
        maptemp.put("mSupplierLine", lsttemp);
        /*add by xieshengjie 2019/11/25 end*/
        /* modfiy by xieshengjie 2019/11/25 begin */
        return maptemp;
        //return mSupplier;
        /* modfiy by xieshengjie 2019/11/25 end */
    }

    /**
     * 新增供应商明细
     *
     * @param
     * @param mSupplierLineinserts 供应商明细
     * @return
     */
    @SystemLog("新增供应商明细")
    @Transactional
    /* modify by xieshengjie 2019/11/25 bgin */
    //public void insertMSupplierLine(HttpServletRequest request, List<MSupplierLineEx> mSupplierLineinserts ,String id) {
    public Map<String, Object> insertMSupplierLine(HttpServletRequest request, List<MSupplierLineEx> mSupplierLineinserts ,String id) {
        Map<String, Object> maptemp = new HashMap<String, Object>();
        List<MSupplierLineEx> lsttemp = new ArrayList<>();
        maptemp.put("id", id);
        /* modify by xieshengjie 2019/11/25 end */
        for(MSupplierLineEx mSupplierLine:mSupplierLineinserts) {
            CommonUtils.setCommonInfo(mSupplierLine, request);
            mSupplierLine.setSupplierId(id);
            mSupplierLineDao.insertSelective(mSupplierLine);
            /*add by xieshengjie 2019/11/25 begin*/
            lsttemp.add(mSupplierLine);
            /*add by xieshengjie 2019/11/25 end*/
        }
        /* add by xieshengjie 2019/11/25 begin */
        maptemp.put("mSupplierLineinserts", lsttemp);
        return maptemp;
        /* add by xieshengjie 2019/11/25 end */
    }

    /**
     * 编辑仓库信息
     *
     * @param mSupplier 供应商
     * @return
     */
    @SystemLog("编辑供应商信息")
    @Transactional
    public MSupplier updateMSupplier(HttpServletRequest request,MSupplier mSupplier , List<MSupplierLineEx> mSupplierLineupdates) {
        CommonUtils.setCommonInfo(mSupplier, request);
        mSupplierDao.updateByPrimaryKey(mSupplier);
        for(MSupplierLine mSupplierLine:mSupplierLineupdates) {
            if(mSupplierLine.getDelFlg().equals("0")){
                CommonUtils.setCommonInfo(mSupplierLine, request);
                mSupplierLineDao.updateByPrimaryKey(mSupplierLine);
            }else {
                deleteMSupplierLine(request,mSupplierLine);
            }
        }
        return mSupplier;
    }

    /**
     * 编辑供应商明细
     *
     * @param mSupplier 供应商
     * @return
     */
    @SystemLog("编辑供应商明细")
    @Transactional
    public MSupplier updateSupplier(HttpServletRequest request, MSupplier mSupplier) {
        CommonUtils.setCommonInfo(mSupplier, request);
        mSupplierDao.updateByPrimaryKey(mSupplier);
        return mSupplier;
    }

    /**
     * 删除供应商信息
     *
     * @param mSupplier
     * @return
     */
    @SystemLog("删除供应商信息")
    public MSupplier deleteMSupplier(HttpServletRequest request,MSupplier mSupplier) {
        CommonUtils.setCommonInfo(mSupplier, request);
        mSupplier.setDelFlg("1");
        mSupplierDao.updateByPrimaryKey(mSupplier);
        // add by zwd 20200103
        Example example = new Example(MSupplierLine.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("supplierId", mSupplier.getId());
        criteria.andEqualTo("delFlg", "0");
        List<MSupplierLine> mSuppliers = mSupplierLineDao.selectByExample(example);
        for (MSupplierLine mSupplierLine : mSuppliers) {
            deleteMSupplierLine(request, mSupplierLine);
        }
        return mSupplier;
    }

    /**
     * 删除供应商明细
     *
     * @param mSupplierLine
     * @return
     */
    @SystemLog("删除供应商明细")
    public MSupplierLine deleteMSupplierLine(HttpServletRequest request,MSupplierLine mSupplierLine) {
        MSupplierLine mSupplierLineOld= mSupplierLineDao.selectByPrimaryKey(mSupplierLine.getId());
        CommonUtils.setCommonInfo(mSupplierLine,mSupplierLineOld, request);
        mSupplierLineOld.setDelFlg("1");
        mSupplierLineDao.updateByPrimaryKey(mSupplierLineOld);
        return mSupplierLineOld;
    }

    /**
     * 获取供应商信息
     *
     * @param page         当前页数
     * @param limit        分页数
     * @param supplierCdDis  供应商表示用编号
     * @param supplierNm   供应商名称
     * @param supplierJc    供应商简称
     * @param supplierType 供应商种类
     * @param supplierNmEn    供应商英文名称
     * @param levelId          供应商评价等级
     * @param cntryCd          国家编号
     * @param paymentType     结算方式
     * @return 需求列表
     */
    @SystemLog("获取供应商信息")
    public List<MSupplierEx> getMSupplier(Integer page, Integer limit, String supplierCdDis, String supplierNm, String supplierJc, String supplierType, String supplierNmEn, String levelId, String cntryCd, String paymentType) {
        PageHelper.startPage(page, limit);
        return mSupplierListDao.selectMSupplier(supplierCdDis,  supplierNm, supplierJc,supplierType,supplierNmEn,levelId,cntryCd,paymentType);
    }

    /**
     * 获取供应商明细
     *
     * @param supplierId 供应商编号
     * @return 需求列表
     */
    @SystemLog("获取供应商明细")
    public List<MSupplierEx> getMSupplierLine(String supplierId) {
        return mSupplierListDao.selectMSupplierLine(supplierId);
    }

    /**
     * 新增用户信息
     *
     * @param mUser 系统用户
     * @return
     */
    @SystemLog("新增用户信息")
    public MUser insertMUser(HttpServletRequest request,MUser mUser) {
        CommonUtils.setCommonInfo(mUser, request);
        mUserDao.insertSelective(mUser);
        return mUser;
    }

    /**
     * 新增登录信息
     *
     * @param userId 用户ID
     * @param mLogin 用户登录
     * @return
     */
    @SystemLog("新增登录信息")
    public MLogin insertMLogin(HttpServletRequest request,String userId, MLogin mLogin) {
        CommonUtils.setCommonInfo(mLogin, request);
        mLogin.setUserId(userId);
        mLoginDao.insertSelective(mLogin);
        return mLogin;
    }

    /**
     * 编辑用户信息
     *
     * @param mUser 系统用户
     * @return
     */
    @SystemLog("编辑用户信息")
    public MUser updateMUser(HttpServletRequest request,MUser mUser) {
        CommonUtils.setCommonInfo(mUser, request);
        mUserDao.updateByPrimaryKey(mUser);
        return mUser;
    }

    /**
     * 编辑登录信息
     *
     * @param userId 用户编号
     * @param mLogin 供应商明细
     * @return
     */
    @SystemLog("编辑登录明细")
    public MLogin updateMLogin(HttpServletRequest request,String userId, MLogin mLogin) {
        CommonUtils.setCommonInfo(mLogin, request);
        mLogin.setUserId(userId);
        mLoginDao.updateByPrimaryKey(mLogin);
        return mLogin;
    }

    /**
     * 删除用户信息
     *
     * @param mUser
     * @return
     */
    @SystemLog("删除用户信息")
    public MUser deleteMUser(HttpServletRequest request,MUser mUser) {
        CommonUtils.setCommonInfo(mUser, request);
        mUser.setDelFlg("1");
        mUserDao.updateByPrimaryKey(mUser);
        return mUser;
    }

    /**
     * 删除登录信息
     *
     * @param mLogin
     * @return
     */
    @SystemLog("删除登录信息")
    public MLogin deleteMLogin(HttpServletRequest request,MLogin mLogin) {
        CommonUtils.setCommonInfo(mLogin, request);
        mLogin.setDelFlg("1");
        mLoginDao.updateByPrimaryKey(mLogin);
        return mLogin;
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
    public List<MUserEx> getMUser(Integer page, Integer limit, String userId, String cntrCd, String workId, String loginId, String userNm, String userNmEn,String roleNm,String orgNm) {
        PageHelper.startPage(page, limit);
        return mUserListDao.selectMUser(userId, cntrCd, workId, loginId, userNm, userNmEn,roleNm,orgNm);
    }
    /**
     * 新增中心
     *
     * @param mCenter 中心
     * @return
     */
    @SystemLog("新增中心")
    public MCenter insertMCenter(HttpServletRequest request,MCenter mCenter) {
        CommonUtils.setCommonInfo(mCenter, request);
        mCenterDao.insertSelective(mCenter);
        return mCenter;
    }
    /**
     * 编辑中心信息
     *
     * @param mCenter 中心
     * @return
     */
    @SystemLog("编辑中心信息")
    public MCenter updateMCenter(HttpServletRequest request,MCenter mCenter) {
        CommonUtils.setCommonInfo(mCenter, request);
        mCenterDao.updateByPrimaryKey(mCenter);
        return mCenter;
    }
    /**
     * 删除中心信息
     *
     * @param mCenter
     * @return
     */
    @SystemLog("删除供应商信息")
    public MCenter deleteMCenter(HttpServletRequest request,MCenter mCenter) {
        CommonUtils.setCommonInfo(mCenter, request);
        mCenter.setDelFlg("1");
        mCenterDao.updateByPrimaryKey(mCenter);
        return mCenter;
    }
    /**
     * 获取中心
     *
     * @param cntrType 中心类型
     * @return
     */
    @SystemLog("获取中心列表")
    public List<MCenter> getMCenter(String cntrType) {
        return mCenterListDao.selectMCenter(cntrType);
    }

    /**
     * 获取登录信息
     *
     * @param userId 用户ID
     * @return 需求列表
     */
    @SystemLog("获取登录信息")
    public List<MUserEx> getMLogin(String userId) {
        return mUserListDao.selectMUserLine(userId);
    }

    /**
     * 新增外发工厂信息
     *
     * @param mOutFactory 外发工厂
     * @return
     */
    @SystemLog("新增外发工厂信息")
    @Transactional
    /* modify by xieshengjie 2019/11/25 begin */
    //public MOutFactory insertMOutFactory(HttpServletRequest request,MOutFactory mOutFactory,List<MOutFactoryLine> mOutFactoryLineLists) {
    public Map<String, Object> insertMOutFactory(HttpServletRequest request,MOutFactory mOutFactory,List<MOutFactoryLineEx> mOutFactoryLineLists) {
        Map<String, Object> maptemp = new HashMap<String, Object>();
        List<MOutFactoryLine> lsttemp = new ArrayList<>();
        /* modify by xieshengjie 2019/11/25 end */
        CommonUtils.setCommonInfo(mOutFactory, request);
        mOutFactoryDao.insertSelective(mOutFactory);
        /* add by xieshengjie 2019/11/25 begin */
        maptemp.put("mOutFactory", mOutFactory);
        /* add by xieshengjie 2019/11/25 end */
        int i = 0;
        for(MOutFactoryLineEx mOutFactoryLine:mOutFactoryLineLists) {
            i++;
            mOutFactoryLine.setOutFactoryLineNum(lpad(String.valueOf(i), 4, "0"));
            CommonUtils.setCommonInfo(mOutFactoryLine, request);
            mOutFactoryLine.setOutFactoryId(mOutFactory.getId());
            mOutFactoryLineDao.insertSelective(mOutFactoryLine);
            /* add by xieshengjie 2019/11/25 begin */
            lsttemp.add(mOutFactoryLine);
            /* add by xieshengjie 2019/11/25 end */
        }
        /* modify by xieshengjie 2019/11/25 begin */
        //return mOutFactory;
        maptemp.put("mOutFactoryLineLists",lsttemp);
        return maptemp;
        /* modify by xieshengjie 2019/11/25 begin */
    }

    /**
     * 新增外发工厂明细
     *
     * @param id
     * @param mOutFactoryLineinserts 外发工厂明细
     * @return
     */
    @SystemLog("新增外发工厂明细")
    @Transactional
    /* modify by xieshengjei 2019/11/25 begin */
    //public void insertMOutFactoryLine(HttpServletRequest request, List<MOutFactoryLineEx>  mOutFactoryLineinserts , String id) {
    public List<MOutFactoryLine> insertMOutFactoryLine(HttpServletRequest request, List<MOutFactoryLineEx>  mOutFactoryLineinserts , String id) {
        List<MOutFactoryLine> lsttemp = new ArrayList<>();
        /* modify by xieshengjei 2019/11/25 end */
        for(MOutFactoryLine mOutFactoryLine:mOutFactoryLineinserts) {
            CommonUtils.setCommonInfo(mOutFactoryLine, request);
            mOutFactoryLine.setOutFactoryId(id);
            mOutFactoryLineDao.insertSelective(mOutFactoryLine);
            /* add by xieshengjie 2019/11/25 begin */
            lsttemp.add(mOutFactoryLine);
            /* add by xieshengjie 2019/11/25 end */
        }
        /* modify by xieshengjie 2019/11/25 begin */
        //return ;
        return lsttemp;
        /* modify by xieshengjie 2019/11/25 end */
    }

    /**
     * 编辑外发工厂信息
     *
     * @param mOutFactory 外发工厂
     * @return
     */
    @SystemLog("编辑外发工厂信息")
    @Transactional
    public MOutFactory updateMOutFactoryr(HttpServletRequest request,MOutFactory mOutFactory ,List<MOutFactoryLineEx> mOutFactoryLineLists) {
        CommonUtils.setCommonInfo(mOutFactory, request);
        mOutFactoryDao.updateByPrimaryKey(mOutFactory);
        int i = 0;
        for(MOutFactoryLine mOutFactoryLine:mOutFactoryLineLists) {
            i++;
            mOutFactoryLine.setOutFactoryLineNum(lpad(String.valueOf(i), 4, "0"));
            mOutFactoryLine.setOutFactoryId(mOutFactory.getId());
            CommonUtils.setCommonInfo(mOutFactoryLine, request);
            if (mOutFactoryLineDao.selectByPrimaryKey(mOutFactoryLine.getId()) != null) {
                if(mOutFactoryLine.getDelFlg().equals("0")){
                    CommonUtils.setCommonInfo(mOutFactoryLine, request);
                    mOutFactoryLineDao.updateByPrimaryKey(mOutFactoryLine);
                }else {
                    deleteMOutFactoryLine(request,mOutFactoryLine);
                }
            } else {
                mOutFactoryLine.setOutFactoryLineNum(lpad(String.valueOf(i), 4, "0"));
                CommonUtils.setCommonInfo(mOutFactoryLine, request);
                mOutFactoryLine.setOutFactoryId(mOutFactory.getId())    ;
                mOutFactoryLineDao.insertSelective(mOutFactoryLine);
            }
            mOutFactoryLineDao.updateByPrimaryKey(mOutFactoryLine);
        }
        return mOutFactory;
    }

    /**
     * 编辑外发工厂明细
     * @param mOutFactory 外发工厂明细
     * @return
     */
    @SystemLog("编辑外发工厂明细")
    @Transactional
    public MOutFactory updateOutFactory(HttpServletRequest request, MOutFactory mOutFactory) {
        CommonUtils.setCommonInfo(mOutFactory, request);
        mOutFactoryDao.updateByPrimaryKey(mOutFactory);
        return mOutFactory;
    }

    /**
     * 删除外发工厂信息
     *
     * @param mOutFactory
     * @return
     */
    @SystemLog("删除外发工厂信息")
    public MOutFactory deleteMOutFactory(HttpServletRequest request,MOutFactory mOutFactory) {
        CommonUtils.setCommonInfo(mOutFactory, request);
        mOutFactory.setDelFlg("1");
        mOutFactoryDao.updateByPrimaryKey(mOutFactory);
        // add by zwd 20200103
        Example example = new Example(MOutFactoryLine.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("outFactoryId", mOutFactory.getId());
        criteria.andEqualTo("delFlg", "0");
        List<MOutFactoryLine> mOutFactoryLines = mOutFactoryLineDao.selectByExample(example);
        for (MOutFactoryLine mOutFactoryLine : mOutFactoryLines) {
            deleteMOutFactoryLine(request, mOutFactoryLine);
        }
        return mOutFactory;
    }

    /**
     * 删除外发工厂明细
     *
     * @param mOutFactoryLine
     * @return
     */
    @SystemLog("删除外发工厂明细")
    public MOutFactoryLine deleteMOutFactoryLine(HttpServletRequest request,MOutFactoryLine mOutFactoryLine) {
        MOutFactoryLine mOutFactoryLineOld= mOutFactoryLineDao.selectByPrimaryKey(mOutFactoryLine.getId());
        CommonUtils.setCommonInfo(mOutFactoryLine,mOutFactoryLineOld, request);
        mOutFactoryLineOld.setDelFlg("1");
        mOutFactoryLineDao.updateByPrimaryKey(mOutFactoryLineOld);
        return mOutFactoryLineOld;
    }

    /**
     * 获取外发工厂信息
     *
     * @param page           当前页数
     * @param limit          分页数
    //     * @param outFactoryId   外发工厂编号zwd deleted 0923
     * @param outFactoryCdDis   外发工厂表示用编号
     * @param outFactoryNm      外发工厂名称
     * @param outFactoryNmEn    外发工厂英文名称
     * @param outFactoryJc      外发工厂简称
     * @param outFactoryType    外发工厂商种类
     * @param levelId            外发工厂评价等级
     * @param cntryCd            国家编号
     * @param paymentType       结算方式
     * @return 需求列表
     */
    @SystemLog("获取外发工厂信息")
    public List<MOutFactoryEx> getMOutFactory(Integer page, Integer limit,
                                              // String outFactoryId, zwd deleted 0923
                                              String outFactoryCdDis, String outFactoryNm, String outFactoryNmEn, String outFactoryJc, String outFactoryType , String levelId, String cntryCd , String paymentType) {
        PageHelper.startPage(page, limit);
        return mOutFactoryListDao.selectMOutFactory(
            // String outFactoryId, zwd deleted 0923
            outFactoryCdDis,outFactoryNm,outFactoryNmEn,outFactoryJc,outFactoryType,levelId,cntryCd,paymentType);
    }

    /**
     * 获取外发工厂明细
     *
     * @param outFactoryId 外发工厂编号
     * @return 需求列表
     */
    @SystemLog("获取外发工厂明细")
    public List<MOutFactoryEx> getMOutFactoryLine(String outFactoryId) {
        return mOutFactoryListDao.selectMOutFactoryLine(outFactoryId);
    }

    /**
     * 获取外发工厂明细
     *
     * @param outFactoryId 外发工厂编号
     * @return 需求列表
     */
    @SystemLog("获取外发工厂明细")
    public List<TFactoryAppraiseList> getTFactoryAppraise(String outFactoryId) {
        return tFactoryAppraiseListDao.selectTFactoryAppraise(outFactoryId);
    }

    /**
     * 新增物流公司信息
     *
     * @param mCarrier 物流公司
     * @return
     */
    @SystemLog("新增物流公司信息")
    @Transactional
    /* modify by xieshengjie 2019/11/25 begin */
    //public MCarrier insertMCarrier(HttpServletRequest request,MCarrier mCarrier , List<MCarrierLine> mCarrierLineLists) {
    public Map<String, Object> insertMCarrier(HttpServletRequest request,MCarrier mCarrier , List<MCarrierLine> mCarrierLineLists) {
        Map<String, Object> maptemp = new HashMap<String, Object>();
        List<MCarrierLine> lsttemp = new ArrayList<>();
        /* modify by xieshengjie 2019/11/25 begin */
        CommonUtils.setCommonInfo(mCarrier, request);
        mCarrierDao.insertSelective(mCarrier);
        /* add by xieshengjie 2019/11/25 begin */
        maptemp.put("mCarrier", mCarrier);
        /* add by xieshengjie 2019/11/25 end */
        for(MCarrierLine mCarrierLine:mCarrierLineLists) {
            CommonUtils.setCommonInfo(mCarrierLine, request);
            mCarrierLine.setCarrierId(mCarrier.getId());
            mCarrierLineDao.insertSelective(mCarrierLine);
            /* add by xieshengjie 2019/11/25 begin */
            lsttemp.add(mCarrierLine);
            /* add by xieshengjie 2019/11/25 end */
        }
        /* modify by xieshengjie 2019/11/25 begin */
        maptemp.put("mCarrierLineLists", lsttemp);
        return maptemp;

        //return mCarrier;
        /* modify by xieshengjie 2019/11/25 end */
    }

    /**
     * 新增物流公司明细
     *
     * @param id
     * @param mCarrierLineinserts 物流公司明细
     * @return
     */
    @SystemLog("新增物流公司明细")
    @Transactional
    /* modify by xieshengjie 2019/11/25 begin */
    //public void insertMCarrierLine(HttpServletRequest request,List<MCarrierLineEx> mCarrierLineinserts,String id) {
    public List<MCarrierLine> insertMCarrierLine(HttpServletRequest request,List<MCarrierLineEx> mCarrierLineinserts,String id) {
        List<MCarrierLine> lsttemp = new ArrayList<>();
        /* modify by xieshengjie 2019/11/25 end */
        for(MCarrierLine mCarrierLine:mCarrierLineinserts) {
            CommonUtils.setCommonInfo(mCarrierLine, request);
            mCarrierLine.setCarrierId(id);
            mCarrierLineDao.insertSelective(mCarrierLine);
            /* add by xieshengjie 2019/11/25 begin */
            lsttemp.add(mCarrierLine);
            /* add by xieshengjie 2019/11/25 end */
        }
        /* modify by xieshengjie 2019/11/25 begin */
        return lsttemp;
        //return ;
        /* modify by xieshengjie 2019/11/25 begin */
    }

    /**
     * 删除物流公司信息
     *
     * @param mCarrier
     * @return
     */
    @SystemLog("删除物流公司信息")
    public MCarrier deleteMCarrier(HttpServletRequest request,MCarrier mCarrier) {
        CommonUtils.setCommonInfo(mCarrier, request);
//        mCarrier.setUpdDt(new Date());
        mCarrier.setDelFlg("1");
//        mCarrier.setAddTnmtId(ip);
//        mCarrier.setUpdCnt(mCarrier.getUpdCnt()+1);
        mCarrierDao.updateByPrimaryKey(mCarrier);
        // add by zwd 20200103
        Example example = new Example(MCarrierLine.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("carrierId", mCarrier.getId());
        criteria.andEqualTo("delFlg", "0");
        List<MCarrierLine> mCarrierLines = mCarrierLineDao.selectByExample(example);
        for (MCarrierLine mCarrierLine : mCarrierLines) {
            deleteMCarrierLine(request, mCarrierLine);
        }
        return mCarrier;
    }

    /**
     * 删除物流公司明细
     *
     * @param mCarrierLine
     * @return
     */
    @SystemLog("删除物流公司明细")
    public MCarrierLine deleteMCarrierLine(HttpServletRequest request,MCarrierLine mCarrierLine) {
        MCarrierLine mCarrierLineOld= mCarrierLineDao.selectByPrimaryKey(mCarrierLine.getId());
        CommonUtils.setCommonInfo(mCarrierLine,mCarrierLineOld, request);
        mCarrierLineOld.setDelFlg("1");
        mCarrierLineDao.updateByPrimaryKey(mCarrierLineOld);
        return mCarrierLineOld;
    }

    /**
     * 编辑物流公司信息
     *
     * @param mCarrier 物流公司
     * @return
     */
    @SystemLog("编辑物流公司信息")
    @Transactional
    public MCarrier updateMCarrier(HttpServletRequest request,MCarrier mCarrier ,List<MCarrierLineEx> mCarrierLineLists) {
        CommonUtils.setCommonInfo(mCarrier, request);
        mCarrierDao.updateByPrimaryKey(mCarrier);
        for(MCarrierLine mCarrierLine:mCarrierLineLists) {
            if(mCarrierLine.getDelFlg().equals("0")){
                CommonUtils.setCommonInfo(mCarrierLine, request);
                mCarrierLineDao.updateByPrimaryKey(mCarrierLine);
            }else {
                deleteMCarrierLine(request,mCarrierLine);
            }
        }
        return mCarrier;
    }

    /**
     * 编辑物流公司
     *
     * @param mCarrier 物流公司
     * @return
     */
    @SystemLog("编辑物流公司")
    @Transactional
    public MCarrier updateCarrier(HttpServletRequest request, MCarrier mCarrier) {
        CommonUtils.setCommonInfo(mCarrier, request);
        mCarrierDao.updateByPrimaryKey(mCarrier);
        return mCarrier;
    }

    /**
     * 获取物流公司信息
     *
     * @param page        当前页数
     * @param limit       分页数
     * @param carrierCdDis      物流公司表示用编号
     * @param carrierNm         物流公司名称
     * @param carrierNmEn       物流公司英文名称
     * @param carrierJc         物流公司简称
     * @param carrierType       物流公司商种类
     * @param levelId            物流公司评价等级
     * @param cntryCd            国家编号
     * @param paymentType       结算方式
     * @return 需求列表
     */
    @SystemLog("获取物流公司信息")
    public List<MCarrierEx> getMCarrier(Integer page, Integer limit, String carrierCdDis,String carrierNm,String carrierNmEn,String carrierJc, String carrierType,String levelId ,String cntryCd ,String paymentType) {
        PageHelper.startPage(page, limit);
        return mCarrierListDao.selectMCarrier(carrierCdDis,carrierNm,carrierNmEn,carrierJc,carrierType,levelId,cntryCd,paymentType);
    }

    /**
     * 获取物流公司明细
     *
     * @param carrierId 物流公司编号
     * @return 需求列表
     */
    @SystemLog("获取物流公司明细")
    public List<MCarrierEx> getMCarrierLine(String carrierId) {
        return mCarrierListDao.selectMCarrierLine(carrierId);
//        return mCarrierListDao.selectMCarrierLine(carrierId);
    }

    /**
     * 新增评价等级信息
     *
     * @param mLevel 评价等级
     * @return
     */
    @SystemLog("新增评价等级信息")
    public MLevel insertMLevel(HttpServletRequest request,MLevel mLevel) {
        CommonUtils.setCommonInfo(mLevel, request);
        mLevelDao.insertSelective(mLevel);
        return mLevel;
    }

    /**
     * 编辑评价等级信息
     *
     * @param mLevel 评价等级
     * @return
     */
    @SystemLog("编辑评价等级信息")
    public MLevel updateMLevel(HttpServletRequest request,MLevel mLevel) {
        CommonUtils.setCommonInfo(mLevel, request);
        mLevelDao.updateByPrimaryKey(mLevel);
        return mLevel;
    }

    /**
     * 删除评价等级信息
     *
     * @param mLevel
     * @return
     */
    @SystemLog("删除评价等级信息")
    public MLevel deleteMLevel(HttpServletRequest request,MLevel mLevel) {
        CommonUtils.setCommonInfo(mLevel, request);
        mLevel.setDelFlg("1");
        mLevelDao.updateByPrimaryKey(mLevel);
        return mLevel;
    }

    /**
     * 获取评价信息
     *
     * @param page    当前页数
     * @param limit   分页数
     * @param cntrCd  中心编号
     * @param levelNm 评价等级名称
     * @return 需求列表
     */
    @SystemLog("获取评价信息")
    public List<MLevel> getMLevel(Integer page, Integer limit, String cntrCd, String levelNm ,String levelType) {
        PageHelper.startPage(page, limit);
        return mLevelListDao.selectMLevel(cntrCd, levelNm,levelType);
    }

    /**
     * 获取评价明细
     *
     * @param levelId 评价等级编号
     * @return 需求列表
     */
    @SystemLog("获取评价明细")
    public MLevelEx getMLevelLine(String levelId) {
        return mLevelListDao.selectMLevelLineList(levelId);
    }

    /**
     * 新增箱信息
     *
     * @param mBox 箱
     * @return
     */
    @SystemLog("新增箱信息")
    public MBox insertMBox(HttpServletRequest request,MBox mBox) {
        CommonUtils.setCommonInfo(mBox, request);
        mBoxDao.insertSelective(mBox);
        return mBox;
    }

    /**
     * 编辑箱信息
     *
     * @param mBox 箱
     * @return
     */
    @SystemLog("编辑箱信息")
    public MBox updateMBox(HttpServletRequest request,MBox mBox) {
        CommonUtils.setCommonInfo(mBox, request);
        mBoxDao.updateByPrimaryKey(mBox);
        return mBox;
    }

    /**
     * 删除箱信息
     *
     * @param mBox
     * @return
     */
    @SystemLog("删除箱信息")
    public MBox deleteMBox(HttpServletRequest request,MBox mBox) {
        CommonUtils.setCommonInfo(mBox, request);
        mBox.setDelFlg("1");
        mBoxDao.updateByPrimaryKey(mBox);
        return mBox;
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
    public List<MBox> getMBox(Integer page, Integer limit, String cntrCd, String boxId, String boxNm) {
        PageHelper.startPage(page, limit);
        return mBoxListDao.selectMBox(cntrCd, boxId, boxNm);
    }
    /**
     * 获取箱编辑信息
     * @param boxId  箱编号
     * @return 需求列表
     */
    @SystemLog("获取箱编辑信息")
    public List<MBox> getMBoxList(String boxId) {
        return mBoxListDao.selectMBoxList(boxId);
    }
    /**
     * 新增提示信息
     *
     * @param mErrorinfo 提示信息
     * @return
     */
    @SystemLog("新增提示信息")
    public MErrorinfo insertMErrorinfo(HttpServletRequest request,MErrorinfo mErrorinfo) {
        CommonUtils.setCommonInfo(mErrorinfo, request);
        mErrorinfoDao.insertSelective(mErrorinfo);
        return mErrorinfo;
    }

    /**
     * 编辑提示信息
     *
     * @param mErrorinfo 提示信息
     * @return
     */
    @SystemLog("编辑箱信息")
    public MErrorinfo updateMErrorinfo(HttpServletRequest request,MErrorinfo mErrorinfo) {
        CommonUtils.setCommonInfo(mErrorinfo, request);
        mErrorinfoDao.updateByPrimaryKey(mErrorinfo);
        return mErrorinfo;
    }

    /**
     * 删除提示信息
     *
     * @param mErrorinfo
     * @return
     */
    @SystemLog("删除提示信息")
    public MErrorinfo deleteMErrorinfo(HttpServletRequest request,MErrorinfo mErrorinfo ){
        CommonUtils.setCommonInfo(mErrorinfo, request);
        mErrorinfo.setDelFlg("1");
        mErrorinfoDao.updateByPrimaryKey(mErrorinfo);
        return mErrorinfo;
    }

    /**
     * 获取提示编辑信息
     * @param errId   提示信息ID
     * @return 需求列表
     */
    @SystemLog("获取提示编辑信息")
    public List<MErrorinfo> getMErrorinfoList(String errId) {
        return mErrorinfoListDao.selectMErrorinfoList(errId);
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
    public List<MErrorinfo> getMErrorinfo(Integer page, Integer limit, String errId, String errInfo) {
        PageHelper.startPage(page, limit);
        return mErrorinfoListDao.selectMErrorinfo( errId, errInfo);
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
    public List<TLog> getTLog(Integer page, Integer limit, String cntrCd, String objStartDt, String objEndDt, String logStatus, String logComment, String skriKbn, String pgmId) {
        PageHelper.startPage(page, limit);
        return tLogListDao.selectTLog(cntrCd, objStartDt, objEndDt, logStatus, logComment, skriKbn, pgmId);
    }

    /**
     * 新增商品信息  纱织类
     * @param request
     * @param mproduct
     * @param mProdRelas
     */
    public void insertMProductRelaList(HttpServletRequest request, MProduct mproduct, String mProdRelas) {
        if (!StringUtils.isNullOrEmpty(mProdRelas)) {
            //获取商品主键
            String prodId = mproduct.getId();
            //新增商品信息与商品与商品分类关系表
            List<MProductRela> mProductRelas = JSONArray.parseArray(mProdRelas, MProductRela.class);
            for (MProductRela mProductRela : mProductRelas) {
                Example.Criteria criteriaNmJc = mProductRelaService.createCriteria();
                criteriaNmJc.andEqualTo("delFlg", '0');
                criteriaNmJc.andEqualTo("prodId", prodId);
                criteriaNmJc.andEqualTo("prodClassId", mProductRela.getProdClassId());
                List<MProductRela> select = mProductRelaService.select(criteriaNmJc);
                if (select.size()>0) {
                    continue;
                }
                MProductRela mProductRelaNew = new MProductRela();
                BeanUtils.copyProperties(mproduct, mProductRelaNew);
                mProductRelaNew.setProdClassId(mProductRela.getProdClassId());
                mProductRelaNew.setRatio(mProductRela.getRatio());
                mProductRelaNew.setProdId(prodId);
                mProductRelaNew.setId(null);
                CommonUtils.setCommonInfo(mProductRelaNew, request);
                mProductRelaMapper.insertSelective(mProductRelaNew);

            }

        }
    }

    /**
     * 新增商品信息
     *
     * @param mProduct
     * @return
     */
    @SystemLog("新增商品信息")
    public MProductEx insertMproduct(HttpServletRequest request,MProductEx mProduct) {
        CommonUtils.setCommonInfo(mProduct, request);
        mProductDao.insertSelective(mProduct);
        return mProduct;
    }
    public ResultBean getYarnInfo(MProductEx productClassAndHead, String mProdRelas) {
        List<MProductRelaEx> mProdRelaList = (List<MProductRelaEx>) com.alibaba.fastjson.JSONArray.parseArray(mProdRelas, MProductRelaEx.class);
        if(mProdRelaList == null){
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
        // upadte by xhs 2020-05-06 start
        String num = "";
//        Integer num = 0;
        if(StringUtils.isNullOrEmpty(productClassAndHead.getNumberOfShares())){
//            num = 1;
            num = "1";
        }else{
//            num =Integer.parseInt(productClassAndHead.getNumberOfShares());
            num = productClassAndHead.getNumberOfShares();
            // upadte by xhs 2020-05-06 end
        }

        // update by xhs 2020-06-03 start
//        //如果纱支后半为空 只拼前半和股数（40S/1） 否则全拼（300D/96F*2）
//        if(StringUtils.isNullOrEmpty(productClassAndHead.getYarnCountB())){
//            yarncount = productClassAndHead.getYarnCountF()+productClassAndHead.getYarnCountFUnitNm()+"/"+ num.toString();
//        }
        // update by xhs 2020-06-03 end

        // add by xhs 2020-06-01 start
        // 存在并线 （并线 0和1不显示）大于等于2的时候要显示股数
         if(!org.springframework.util.StringUtils.isEmpty(productClassAndHead.getChar1())){
            if(Integer.parseInt(productClassAndHead.getChar1()) >= 2){
                //如果纱支后半为空 且并线大于2 的情况下  拼前半和股数,并线（32S/1*2）
                if(StringUtils.isNullOrEmpty(productClassAndHead.getYarnCountB())){
                    yarncount = productClassAndHead.getYarnCountF()+productClassAndHead.getYarnCountFUnitNm()+"/"+ num  + "*" + Integer.parseInt(productClassAndHead.getChar1());;
                }else {
                    //如果纱支后半不为空 且并线大于2 的情况下  拼纱支和股数,并线（32S/2s*1*2）
                    yarncount = productClassAndHead.getYarnCountF() + productClassAndHead.getYarnCountFUnitNm() + "/" + productClassAndHead.getYarnCountB() + productClassAndHead.getYarnCountBUnitNm() + "*" +num  + "*" + Integer.parseInt(productClassAndHead.getChar1());
                }
            }else {
                // 并线小于2 且 纱支后半为空且单股的时候 只拼前半（40S/1）
                if("1".equals(num)) {
                    // 单股不拼接
                    if(StringUtils.isNullOrEmpty(productClassAndHead.getYarnCountB())){
                        yarncount = productClassAndHead.getYarnCountF() + productClassAndHead.getYarnCountFUnitNm() + "/" + num;
                    }else {
                        // 如果纱支后半不为空且单股的时候 只拼纱支（40S/2s）
                        yarncount = productClassAndHead.getYarnCountF() + productClassAndHead.getYarnCountFUnitNm() + "/" + productClassAndHead.getYarnCountB() + productClassAndHead.getYarnCountBUnitNm();
                    }

                }else{
                    // 并线小于2 且 纱支后半为空且多股的时候 拼前半和股数（40S/2）
                    if(StringUtils.isNullOrEmpty(productClassAndHead.getYarnCountB())){
                        yarncount = productClassAndHead.getYarnCountF() + productClassAndHead.getYarnCountFUnitNm() + "/" + num;
                    }else {
                        // 并线小于2 且 纱支后半不为空且多股的时候 拼纱支和股数（40S/2s*2）
                        yarncount = productClassAndHead.getYarnCountF()+productClassAndHead.getYarnCountFUnitNm()+"/"+productClassAndHead.getYarnCountB()+productClassAndHead.getYarnCountBUnitNm()+"*"+num;
                    }
                }
            }
        }
         // 不存在并线
         if(org.springframework.util.StringUtils.isEmpty(productClassAndHead.getChar1())){
             // 不存在并线，且纱支后半为空 只拼前半和股数（40S/1） 否则全拼（300D/96F*2）
             if(StringUtils.isNullOrEmpty(productClassAndHead.getYarnCountB())){
                 // 单股不拼接
                 if("1".equals(num)){
                     yarncount = productClassAndHead.getYarnCountF()+productClassAndHead.getYarnCountFUnitNm() + "/" + num;
                 }else{
                     yarncount = productClassAndHead.getYarnCountF()+productClassAndHead.getYarnCountFUnitNm()+"/"+ num;
                 }
             }else {
                 // 单股不拼接
                 // 不存在并线 且纱支后半不为空，单股  拼纱支（300D/96F）
                 if("1".equals(num)){
                     yarncount = productClassAndHead.getYarnCountF() + productClassAndHead.getYarnCountFUnitNm() + "/" + productClassAndHead.getYarnCountB() + productClassAndHead.getYarnCountBUnitNm();
                 }else{
                     // 不存在并线 且纱支后半不为空，多股  拼纱支和股数（300D/96F*2）
                     yarncount = productClassAndHead.getYarnCountF() + productClassAndHead.getYarnCountFUnitNm() + "/" + productClassAndHead.getYarnCountB() + productClassAndHead.getYarnCountBUnitNm()+"*"+ num;
                 }
             }
         }
        // add by xhs 2020-06-01 end
        //新增商品表
        MProductEx mProduct = new MProductEx();
        BeanUtils.copyProperties(productClassAndHead, mProduct);
        //纱比
        String ratio = "";
        //商品名
        String prodNmBuf = "";
        //拼接用商品名
        String strprodNm = "";
        List<String> ratios = new ArrayList();
        List<String> prodNmBufs = new ArrayList();
        for(int i=0; i<mProdRelaList.size(); i++) {
            if (mProdRelaList.size() == 1) {
                ratio = mProdRelaList.get(i).getRatio();
                prodNmBuf = mProdRelaList.get(i).getProdClassNm();
            }
            ratios.add(mProdRelaList.get(i).getRatio());
            prodNmBufs.add(mProdRelaList.get(i).getProdClassNm());
        }
        if(ratios.size() == 1){
            mProduct.setRatio(ratio);
            strprodNm = prodNmBuf;
        }else if (mProdRelaList.size()>1){
            String str2 = String.join("/", ratios);
            strprodNm =  String.join("/", prodNmBufs);
            mProduct.setRatio(str2);
        }
        //商品名称（纱支_+纱类+_纱比）拼接
        String prodNm = yarncount+"_"+strprodNm+"_"+mProduct.getRatio();
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
            outer:for(MProduct mProductId:sysProducts){
                //内层循环前端纱支纱比的list
                inner:for(int i= 0; i < mProdRelaList.size(); i++){
                    //根据商品主键查询分类表
                    Example.Criteria criteriaNm = mProductRelaService.createCriteria();
                    criteriaNm.andEqualTo("delFlg", '0');
                    criteriaNm.andEqualTo("prodId", mProductId.getId());
                    criteriaNm.andEqualTo("ratio", mProdRelaList.get(i).getRatio());
                    criteriaNm.andEqualTo("prodClassId", mProdRelaList.get(i).getProdClassId());
                    criteriaNm.andNotEqualTo("id", mProdRelaList.get(i).getId());
                    List<MProductRela> sysProductRela = mProductRelaService.select(criteriaNm);
                    //有数据继续循环 存在为true
                    if(sysProductRela.size()>0){
                        isExist = true;
                        continue inner;
                    }else { //无 存在为false并跳出循环
                        isExist = false;
                        break inner;
                    }
                }
                //如果存在为true 并跳出外层循环
                if(isExist == true){
                    return ResultBean.failure("商品已存在！");
                }
            }
        }
        //纱支
        mProduct.setYarnCount(yarncount);
        //商品名称
        mProduct.setProdNm(prodNm);

        return ResultBean.success("名称生成成功！", mProduct);
    }

    /**
     * 新增商品信息
     * @param productClassAndHead
     * @return
     */
    @SystemLog("新增商品信息")
    public Map<String, Object> insertMproductNew(HttpServletRequest request,MProduct mProduct,ProductClassAndHead productClassAndHead,List<MProductClassExRatio> mProductClassListNew) {
//        if(mProductClassList == null){
//            return ResultBean.failure("无数据！");
//        }
//        //给mProductClassList以id默认排序（为了拼接时字段可以按顺序拼接）
//        List<MProductClassExRatio> mProductClassListNew = new ArrayList<>();
//        mProductClassListNew = mProductClassList.stream().sorted((s1, s2) -> s1.getId().compareTo(s2.getId())).collect(Collectors.toList());
//        //纱支
//        String yarncount = "";
//        Integer num = 0;
//        if(!StringUtils.isNullOrEmpty(productClassAndHead.getNumberOfShares())){
//             num = Integer.parseInt(productClassAndHead.getNumberOfShares());
//        }
//        //如果纱支后半为空 只拼前半和股数（40S/1） 否则全拼（300D/96F*2）
//        if(StringUtils.isNullOrEmpty(productClassAndHead.getYarnCountB())&& StringUtils.isNullOrEmpty(productClassAndHead.getNumberOfShares())){
//            yarncount = productClassAndHead.getYarnCountF()+productClassAndHead.getYarnCountFunitNm()+"/"+1;
//        }else if(StringUtils.isNullOrEmpty(productClassAndHead.getNumberOfShares())|| num == 1){
//            yarncount =  productClassAndHead.getYarnCountF()+productClassAndHead.getYarnCountFunitNm()+"/"+productClassAndHead.getYarnCountB()+productClassAndHead.getYarnCountBunitNm();
//        }else if (!StringUtils.isNullOrEmpty(productClassAndHead.getYarnCountB())&&num>1){
//            yarncount = productClassAndHead.getYarnCountF()+productClassAndHead.getYarnCountFunitNm()+"/"+productClassAndHead.getYarnCountB()+productClassAndHead.getYarnCountBunitNm()+"*"+productClassAndHead.getNumberOfShares();
//        }else if(num>1){
//            yarncount = productClassAndHead.getYarnCountF()+productClassAndHead.getYarnCountFunitNm()+"/"+productClassAndHead.getNumberOfShares();
//        }
//        //新增商品表
//        MProduct mProduct = new MProduct();
//        //纱比
//        String ratio = "";
//        //商品名
//        String prodNmBuf = "";
//        //拼接用商品名
//        String strprodNm = "";
//        List<String> ratios = new ArrayList();
//        List<String> prodNmBufs = new ArrayList();
//        for(int i=0; i<mProductClassListNew.size(); i++) {
//            if (mProductClassListNew.size() == 1) {
//                ratio = mProductClassListNew.get(i).getRatio();
//                prodNmBuf = mProductClassListNew.get(i).getProdClassNm();
//            }
//            ratios.add(mProductClassListNew.get(i).getRatio());
//            prodNmBufs.add(mProductClassListNew.get(i).getProdClassNm());
//        }
//        if(ratios.size() == 1){
//            mProduct.setRatio(ratio);
//            strprodNm = prodNmBuf;
//        }else if (mProductClassListNew.size()>1){
//            String str2 = String.join("/", ratios);
//            strprodNm =  String.join("/", prodNmBufs);
//            mProduct.setRatio(str2);
//        }
//        //商品名称（纱支_+纱类+_纱比）拼接
//        String prodNm = yarncount+"_"+strprodNm+"_"+mProduct.getRatio();
//        //判断商品名是否重复
//        Example.Criteria criteriaNmJc = mProductService.createCriteria();
//        criteriaNmJc.andEqualTo("delFlg", '0');
//        criteriaNmJc.andEqualTo("prodNm", prodNm);
//        List<MProduct> sysProducts = mProductService.select(criteriaNmJc);
//        if (sysProducts.size() > 0) {
//            return ResultBean.failure("商品已存在！",sysProducts);
//        }
        Map<String, Object> maptemp = new HashMap<String, Object>();
        List<MProductRela> lstemp = new ArrayList<>();
        //采番
        mProduct.setProdCdDis(mNumberService.getMNumberList("PROD_CD_DIS"));
        mProduct.setCntrCd(mProductClassListNew.get(0).getCntrCd());
        //商品种类 纱线
        mProduct.setProdType("01");
        //纱支后半
        mProduct.setYarnCountB(productClassAndHead.getYarnCountB());
        //纱支前半
        mProduct.setYarnCountF(productClassAndHead.getYarnCountF());
        //纱支后半单位
        mProduct.setYarnCountBUnit(productClassAndHead.getYarnCountBunit());
        //纱支前半单位
        mProduct.setYarnCountFUnit(productClassAndHead.getYarnCountFunit());
        //股数
        mProduct.setNumberOfShares(productClassAndHead.getNumberOfShares());
        //共通字段
        mProduct.setAddPgmId(mProductClassListNew.get(0).getAddPgmId());
        mProduct.setAddEntKbn(mProductClassListNew.get(0).getAddEntKbn());
        mProduct.setAddUserId(mProductClassListNew.get(0).getAddUserId());
        mProduct.setAddUserNm(mProductClassListNew.get(0).getAddUserNm());
        mProduct.setUpdPgmId(mProductClassListNew.get(0).getAddPgmId());
        mProduct.setUpdEntKbn(mProductClassListNew.get(0).getAddEntKbn());
        mProduct.setUpdUserId(mProductClassListNew.get(0).getAddUserId());
        mProduct.setUpdUserNm(mProductClassListNew.get(0).getAddUserNm());
        CommonUtils.setCommonInfo(mProduct, request);
        mProductService.insertSelective(mProduct);
        //同步商品信息
        maptemp.put("mProduct", mProduct);
        for(int i=0;i<mProductClassListNew.size();i++){
            //商品与商品分类关系
            MProductRela mProductRela = new MProductRela();
            mProductRela.setCntrCd(mProductClassListNew.get(i).getCntrCd());
            //商品分类主键
            mProductRela.setProdClassId(mProductClassListNew.get(i).getId());
            //成分比例
            mProductRela.setRatio(mProductClassListNew.get(i).getRatio());
            //商品主键
            mProductRela.setProdId(mProduct.getId());
            mProductRela.setAddPgmId(mProductClassListNew.get(i).getAddPgmId());
            mProductRela.setAddEntKbn(mProductClassListNew.get(i).getAddEntKbn());
            mProductRela.setAddUserId(mProductClassListNew.get(i).getAddUserId());
            mProductRela.setAddUserNm(mProductClassListNew.get(i).getAddUserNm());
            mProductRela.setUpdPgmId(mProductClassListNew.get(i).getAddPgmId());
            mProductRela.setUpdEntKbn(mProductClassListNew.get(i).getAddEntKbn());
            mProductRela.setUpdUserId(mProductClassListNew.get(i).getAddUserId());
            mProductRela.setUpdUserNm(mProductClassListNew.get(i).getAddUserNm());
            CommonUtils.setCommonInfo(mProductRela, request);
            mProductRelaService.insertSelective(mProductRela);
            lstemp.add(mProductRela);
        }
        maptemp.put("mProducts", lstemp);
        return maptemp;
    }
    /**
     * 删除商品信息
     *
     * @param mProduct
     * @return
     */
    @SystemLog("删除商品信息")
    public MProduct deleteMproduct(HttpServletRequest request,MProduct mProduct) {
        CommonUtils.setCommonInfo(mProduct, request);
        mProduct.setDelFlg("1");
        mProductDao.updateByPrimaryKey(mProduct);

        //纱类的情况下维护中间表
        //获取商品主键
        String prodId = mProduct.getId();
        Example.Criteria criteriaNmJc = mProductRelaService.createCriteria();
        criteriaNmJc.andEqualTo("delFlg", '0');
        criteriaNmJc.andEqualTo("prodId", prodId);
        List<MProductRela> select = mProductRelaService.select(criteriaNmJc);
        if (select.size()>0) {
            for (MProductRela mProductRela : select) {
                mProductRela.setDelFlg("1");
                mProductRelaMapper.updateByPrimaryKey(mProductRela);
            }
        }

        return mProduct;
    }

    /**
     * 编辑商品信息
     *
     * @param mProduct 商品信息
     * @return
     */
    @SystemLog("编辑商品信息")
    public MProduct updateMproduct(HttpServletRequest request,MProduct mProduct,String mProdRelaInsert,String mProdRelaUpdate) {
        //维护商品表
        String prodId = mProduct.getId();
        CommonUtils.setCommonInfo(mProduct, request);
        mProductDao.updateByPrimaryKey(mProduct);
        //维护中间表
        List<MProductRela> mProdRelaUpdates = JSONArray.parseArray(mProdRelaUpdate, MProductRela.class);
        List<MProductRela> mProdRelaInserts = JSONArray.parseArray(mProdRelaInsert, MProductRela.class);
        //1.更新的情况
        if(mProdRelaUpdates.size()>0){
            for (MProductRela prodRelaUpdate : mProdRelaUpdates) {
                prodRelaUpdate.setProdId(prodId);
                mProductRelaService.updateByPrimaryKey(prodRelaUpdate);
            }
        }
        //2.新增的情况
        if(mProdRelaInserts.size()>0){
            for (MProductRela prodRelaInsert : mProdRelaInserts) {
                MProductRela mProductRelaNew = new MProductRela();
                BeanUtils.copyProperties(prodRelaInsert, mProductRelaNew);
                mProductRelaNew.setProdClassId(prodRelaInsert.getProdClassId());
                mProductRelaNew.setRatio(prodRelaInsert.getRatio());
                mProductRelaNew.setProdId(prodId);
                mProductRelaNew.setId(null);
                CommonUtils.setCommonInfo(mProductRelaNew, request);
                mProductRelaMapper.insertSelective(mProductRelaNew);
            }
        }
        return mProduct;
    }

    /**
     * 获取商品信息
     *
     * @param page     当前页数
     * @param limit    分页数
     * @param prodCdDis  商品表示用编号
     * @param prodNm     商品名称
     * @param prodJc     商品简称
     * @param prodNmEn   商品英文名称
     * @param prodType   商品种类
     * @param assetModel   规格型号
     * @param yarnCount     纱支
     * @param ratio      成分比例
     * @return 需求列表
     */
    @SystemLog("获取商品信息")
    public List<MProductEx> getMproductList(Integer page, Integer limit, String prodCdDis, String prodNm, String prodJc, String prodNmEn, String prodType, String assetModel, String yarnCount, String ratio ) {
        PageHelper.startPage(page, limit);
        return mProductListDao.selectmproduct(prodCdDis,prodNm,prodJc,prodNmEn, prodType, assetModel,yarnCount,ratio);
    }

    /**
     * 获取商品分类下的商品信息（纱线选择画面）
     *
     * @param prodType 商品种类
     * @param cntrCd   中心编号
     * @return 商品列表
     */
    @SystemLog("获取分类下商品信息")
    public List<MProductEx> getMproductListByClass(String prodType, String cntrCd,String yarnCount,String ratio, List<String> prodClassNm) {
        return mProductListDao.selectMProductByClassNew(prodType, cntrCd,yarnCount,ratio, prodClassNm);
    }
    /**
     * 获取商品明细
     *
     * @param prodId 商品名称
     * @return 需求列表
     */
    @SystemLog("获取商品明细")
    public List<MProductEx> getMproductLineList(String prodId) {
        return mProductListDao.selectMproductLine(prodId);
    }

    /**
     * 检查商品分类编号存在
     *
     * @param mProductClass
     * @return
     */
    @SystemLog("检查商品分类编号存在")
    public boolean checkProdCdDisExist(MProductClass mProductClass) {
        if (StringUtils.isNullOrEmpty(mProductClass.getProdClassCdDis())) return true;
        Example.Criteria criteriaCd = mProductClassService.createCriteria();
        criteriaCd.andEqualTo("delFlg", '0');
        if (!StringUtils.isNullOrEmpty(mProductClass.getId())) criteriaCd.andNotEqualTo("id", mProductClass.getId());
        criteriaCd.andEqualTo("prodClassCdDis", mProductClass.getProdClassCdDis());
        List<MProductClass> sysProductClasses = mProductClassService.select(criteriaCd);
        if (sysProductClasses.size() > 0) {
            return false;
        }
        return true;
    }

    /**
     * 检查商品分类名称存在
     *
     * @param mProductClass
     * @return
     */
    @SystemLog("检查商品分类名称存在")
    public boolean checkProdNmExist(MProductClass mProductClass) {
        if (StringUtils.isNullOrEmpty(mProductClass.getProdClassNm())) return true;
        Example.Criteria criteriaNm = mProductClassService.createCriteria();
        criteriaNm.andEqualTo("delFlg", '0');
        criteriaNm.andEqualTo("prodType", mProductClass.getProdType());
        if (StringUtils.isNullOrEmpty(mProductClass.getParentClass())) criteriaNm.andEqualTo("path", "/");
        else criteriaNm.andEqualTo("parentClass", mProductClass.getParentClass());
        if (!StringUtils.isNullOrEmpty(mProductClass.getId())) criteriaNm.andNotEqualTo("id", mProductClass.getId());
        criteriaNm.andEqualTo("prodClassNm", mProductClass.getProdClassNm());
        List<MProductClass> sysProductClasses = mProductClassService.select(criteriaNm);
        if (sysProductClasses.size() > 0) {
            return false;
        }
        return true;
    }

    /**
     * 检查商品分类名称存在
     *
     * @param mProductClass
     * @return
     */
    @SystemLog("检查商品分类简称存在")
    public boolean checkProdJcExist(MProductClass mProductClass) {
        if (StringUtils.isNullOrEmpty(mProductClass.getProdClassJc())) return true;
        Example.Criteria criteriaNmJc = mProductClassService.createCriteria();
        criteriaNmJc.andEqualTo("delFlg", '0');
        criteriaNmJc.andEqualTo("prodType", mProductClass.getProdType());
        if (StringUtils.isNullOrEmpty(mProductClass.getParentClass())) criteriaNmJc.andEqualTo("path", "/");
        else criteriaNmJc.andEqualTo("parentClass", mProductClass.getParentClass());
        if (!StringUtils.isNullOrEmpty(mProductClass.getId())) criteriaNmJc.andNotEqualTo("id", mProductClass.getId());
        criteriaNmJc.andEqualTo("prodClassJc", mProductClass.getProdClassJc());
        List<MProductClass> sysProductClasses = mProductClassService.select(criteriaNmJc);
        if (sysProductClasses.size() > 0) {
            return false;
        }
        return true;
    }

    /**
     * 检查商品分类英文名存在
     *
     * @param mProductClass
     * @return
     */
    @SystemLog("检查商品分类英文名存在")
    public boolean checkProdNmEnExist(MProductClass mProductClass) {
        if (StringUtils.isNullOrEmpty(mProductClass.getProdClassNmEn())) return true;
        Example.Criteria criteriaNmEn = mProductClassService.createCriteria();
        criteriaNmEn.andEqualTo("delFlg", '0');
        criteriaNmEn.andEqualTo("prodType", mProductClass.getProdType());
        if (StringUtils.isNullOrEmpty(mProductClass.getParentClass())) criteriaNmEn.andEqualTo("path", "/");
        else criteriaNmEn.andEqualTo("parentClass", mProductClass.getParentClass());
        if (!StringUtils.isNullOrEmpty(mProductClass.getId())) criteriaNmEn.andNotEqualTo("id", mProductClass.getId());
        criteriaNmEn.andEqualTo("prodClassNmEn", mProductClass.getProdClassNmEn());
        List<MProductClass> sysProductClasses = mProductClassService.select(criteriaNmEn);
        if (sysProductClasses.size() > 0) {
            return false;
        }
        return true;
    }
    /**
     * 新增商品分类信息
     *
     * @param mProductClass
     * @return
     */
    @SystemLog("新增商品分类信息")
    public MProductClass insertMProductClass(HttpServletRequest request,MProductClass mProductClass) {
        mProductClass.setDelFlg("0");
        CommonUtils.setCommonInfo(mProductClass, request);
        mProductClassDao.insert(mProductClass);
        return mProductClass;
    }

    /**
     * 删除商品分类信息
     *
     * @param mProductClass
     * @return
     */
    @SystemLog("删除商品分类信息")
    public MProductClass deleteMProductClass(HttpServletRequest request,MProductClass mProductClass) {
        CommonUtils.setCommonInfo(mProductClass, request);
        mProductClass.setDelFlg("1");
        mProductClassDao.updateByPrimaryKey(mProductClass);
        return mProductClass;
    }

    /**
     * 获取商品分类级别下拉框
     *
     * @return
     */
    public List<MLevelProductClass> selectClassLevelDropDown(String prodType) {
        return mproductClassListDao.selectLevel(prodType);
    }

    /**
     * 获取商品分类父类下拉框
     *
     * @return
     */
    public List<MLevelProductClass> selectClassParentDropDown() {
        return mproductClassListDao.selectParent();
    }
    /**
     * 获取商品分类子类下拉框
     *
     * @return
     */
    public List<MLevelProductClass> selectClassChildDropDown(String parentClass) {
        return mproductClassListDao.selectChild(parentClass);
    }
    /**
     * 编辑商品分类信息
     *
     * @param mProductClass 商品分类信息
     * @return
     */
    @SystemLog("编辑商品分类信息")
    public MProductClass updateMProductClass(HttpServletRequest request,MProductClass mProductClass) {
        CommonUtils.setCommonInfo(mProductClass, request);
        mProductClassDao.updateByPrimaryKey(mProductClass);
        return mProductClass;
    }

    @SystemLog("获取商品分类信息")
    public List<MProductClassEx> getMProductClassLine(String prodClassNm, String prodType) {
        return mproductClassListDao.selectMProductClassNew(prodClassNm, prodType);
    }
    @SystemLog("获取纱类纱比信息")
    public List<MProductEx> getYarnRatio(String prodId) {
        return mProductListDao.selectMProduct(prodId);
    }
    /**
     * 获取商品分类信息
     *
     * @param page        当前页数
     * @param limit       分页数
     * @param prodClassCdDis 商品分类表示用编号
     * @param prodClassNm    商品分类名称
     * @param prodClassJc    商品分类简称
     * @param prodClassNmEn  商品分类英文名称
     * @param prodType    商品种类
     * @return 需求列表
     */
    @SystemLog("获取商品分类信息")
    public List<MProductClassEx> getMProductClassList(Integer page, Integer limit, String prodClassCdDis, String prodClassNm, String prodClassJc, String prodClassNmEn, String prodType,String classLevel) {
        PageHelper.startPage(page, limit);
        return mproductClassListDao.selectMProductClass(prodClassCdDis,prodClassNm,prodClassJc,prodClassNmEn,prodType);
    }
    /**
     * 获取商品分类信息
     *
     * @param prodClassId 商品分类编号
     * @return 需求列表
     */
    @SystemLog("获取商品分类信息")
    public List<MProductClassEx> getMProductClassLineList(String prodClassId) {
        return mproductClassListDao.selectMProductClassLine(prodClassId);
    }
    @SystemLog("获取仓库信息下拉框")
    public List<MWh> getMWh(String cntrCd,String whType) {
        Example.Criteria criteria = sysWhService.createCriteria();
        criteria.andEqualTo("cntrCd",cntrCd);
        criteria.andEqualTo("delFlg",'0');
        if(whType != null && whType != ""){
            List<String> list= Arrays.asList(whType.split(","));
            Iterable iter = list;
            criteria.andIn("whType",iter);
        }
        List<MWh> sysWh = sysWhService.selectByCondition(criteria,"whCdDis");
        return sysWh;
    }
    @SystemLog("获取库位下拉框")
    public List<MLocEx> getMLoc(String cntrCd, String whId , String zoneId) {
        return mLocListDao.selectLocList(cntrCd,whId,zoneId);
    }
    @SystemLog("获取所有库位下拉框")
    public List<MLoc> getMLocAll(String cntrCd,String whId ,String zoneId) {
        Example.Criteria criteria = sysLocService.createCriteria();
        if(!StringUtils.isNullOrEmpty(cntrCd)) {
            criteria.andEqualTo("cntrCd", cntrCd);
        }
        if(!StringUtils.isNullOrEmpty(whId)) {
            criteria.andEqualTo("whId", whId);
        }
        if(!StringUtils.isNullOrEmpty(zoneId)) {
            criteria.andEqualTo("zoneId", zoneId);
        }
        criteria.andEqualTo("delFlg",'0');
        List<MLoc> sysLoc = sysLocService.selectByCondition(criteria,"locCdDis");
        return sysLoc;
    }
    @SystemLog("获取区域信息下拉框")
    public List<MZone> getZone(String cntrCd,String whId) {
        Example.Criteria criteria = sysZoneService.createCriteria();
        criteria.andEqualTo("cntrCd",cntrCd);
        criteria.andEqualTo("whId",whId);
        criteria.andEqualTo("delFlg",'0');
        List<MZone> sysZone = sysZoneService.selectByCondition(criteria,"zoneCdDis");
        return sysZone;
    }
    @SystemLog("获取评级下拉框")
    public List<MLevel> getLevel(String cntrCd,String levelType) {
        Example.Criteria criteria = sysMlevelService.createCriteria();
        criteria.andEqualTo("cntrCd",cntrCd);
        criteria.andEqualTo("levelType",levelType);
        criteria.andEqualTo("delFlg",'0');
        List<MLevel> sysMlevel = sysMlevelService.selectByCondition(criteria,"pointUpperLimit");
        return sysMlevel;
    }
    private String lpad(String s, int n, String replace) {
        while (s.length() < n) {
            s = replace + s;
        }
        return s;
    }
    @SystemLog("获取商品分类下拉框")
    public List<MProductClass> getMProductClass(String cntrCd,String prodType) {
        Example.Criteria criteria = sysMProductClassService.createCriteria();
        // del by zwd 20200108
//        criteria.andEqualTo("cntrCd",cntrCd);
        if (!StringUtils.isNullOrEmpty(prodType)){
            criteria.andEqualTo("prodType",prodType);
        }
        criteria.andEqualTo("delFlg",'0');
        List<MProductClass> sysProductClass = sysMProductClassService.select(criteria,"prodClassCdDis");
        return sysProductClass;
    }
    /**
     * 获取人员信息
     * @param mUserEx   画面数据
     * @return 需求列表
     */
    @SystemLog("获取人员信息")
    public List<MUserEx> getMUserList(Integer page, Integer limit, MUserEx mUserEx) {
        PageHelper.startPage(page, limit);
        return mUserListDao.selectMUserList(mUserEx.getCntrCd(), mUserEx.getUserId(), mUserEx.getUserNm(), mUserEx.getUserNmEn(), mUserEx.getLoginId(),mUserEx.getRoleNm());
    }


    @SystemLog("编辑角色")
    @Transactional
    public MRole updateMRole(HttpServletRequest request,MRole mRole,  String mRoleModules) {
        if (StringUtils.isNullOrEmpty(mRole.getId())){
            //新增角色表
            CommonUtils.setCommonInfo(mRole, request);
            mRoleDao.insertSelective(mRole);
        }else {
            //更新角色表，删除角色与模块关系表
            CommonUtils.setCommonInfo(mRole, request);
            mRoleDao.updateByPrimaryKey(mRole);
            Example example = new Example(MRoleModule.class);
            Example.Criteria criteria = example.createCriteria();
            criteria.andEqualTo("roleId", mRole.getId());
            mRoleModuleDao.deleteByExample(example);
        }
        if (!StringUtils.isNullOrEmpty(mRoleModules)) {
            //新增角色与模块关系表
            List<String> moduleIds = com.alibaba.fastjson.JSONArray.parseArray(mRoleModules).toJavaList(String.class);
            for (String id : moduleIds) {
                MRoleModule mRoleModule = new MRoleModule();
                BeanUtils.copyProperties(mRole, mRoleModule);
                mRoleModule.setRoleId(mRole.getId());
                mRoleModule.setModuleId(id);
                mRoleModule.setRelationValue("ROLE_MODULE");
                mRoleModule.setId(null);
                CommonUtils.setCommonInfo(mRoleModule, request);
                mRoleModuleDao.insertSelective(mRoleModule);
            }
        }
        return mRole;
    }

    /**
     * 查询商品 商品分类是否可删除
     * @param prodClassId
     * @return true：可删除 false：不可删除
     */
    @SystemLog("检验商品分类是否可删除")
    public boolean isDeleteProduct(String prodClassId){
        Example.Criteria criteria = mProductService.createCriteria();
        criteria.andEqualTo("prodClassId",prodClassId);
        criteria.andEqualTo("delFlg","0");
        List<MProduct> products = mProductService.select(criteria);
        if(products.size()== 0){
            return true;
        }
        return false;
    }

    /**
     * 检查机台名称存在
     *
     * @param mMachineEx
     * @return
     */
    @SystemLog("检查机台名称存在")
    public boolean checkMachineNm(MMachineEx mMachineEx) {
        if (StringUtils.isNullOrEmpty(mMachineEx.getMachineNm())) return true;
        Example.Criteria criteriaNm = mMachineService.createCriteria();
        criteriaNm.andEqualTo("delFlg", '0');
        criteriaNm.andEqualTo("machineNm", mMachineEx.getMachineNm());
        if (!StringUtils.isNullOrEmpty(mMachineEx.getId())) criteriaNm.andNotEqualTo("id", mMachineEx.getId());
        List<MMachine> list = mMachineService.select(criteriaNm);
        if (list.size() > 0) {
            return false;
        }
        return true;
    }

    /**
     * 检查机台号存在
     *
     * @param mMachineEx
     * @return
     */
    @SystemLog("检查机台号存在")
    public boolean checkMachineCd(MMachineEx mMachineEx) {
        if (StringUtils.isNullOrEmpty(mMachineEx.getMachineCd())) return true;
        Example.Criteria criteriaCd = mMachineService.createCriteria();
        criteriaCd.andEqualTo("delFlg", '0');
        criteriaCd.andEqualTo("machineCd", mMachineEx.getMachineCd());
        if (!StringUtils.isNullOrEmpty(mMachineEx.getId())) criteriaCd.andNotEqualTo("id", mMachineEx.getId());
        List<MMachine> list = mMachineService.select(criteriaCd);
        if (list.size() > 0) {
            return false;
        }
        return true;
    }


    /**
     * 检查机台英文名存在
     *
     * @param mMachineEx
     * @return
     */
    @SystemLog("检查机台英文名存在")
    public boolean checkMachineNmEn(MMachineEx mMachineEx) {
        if (StringUtils.isNullOrEmpty(mMachineEx.getMachineNmEn())) return true;
        Example.Criteria criteriaNmEn = mMachineService.createCriteria();
        criteriaNmEn.andEqualTo("delFlg", '0');
        criteriaNmEn.andEqualTo("machineNmEn", mMachineEx.getMachineNmEn());
        if (!StringUtils.isNullOrEmpty(mMachineEx.getId())) criteriaNmEn.andNotEqualTo("id", mMachineEx.getId());
        List<MMachine> list = mMachineService.select(criteriaNmEn);
        if (list.size() > 0) {
            return false;
        }
        return true;
    }
    /**
     * 检查机台简称存在
     *
     * @param mMachineEx
     * @return
     */
    @SystemLog("检查机台简称存在")
    public boolean checkMachineJc(MMachineEx mMachineEx) {
        if (StringUtils.isNullOrEmpty(mMachineEx.getMachineJc())) return true;
        Example.Criteria criteriaJc = mMachineService.createCriteria();
        criteriaJc.andEqualTo("delFlg", '0');
        criteriaJc.andEqualTo("machineJc", mMachineEx.getMachineJc());
        if (!StringUtils.isNullOrEmpty(mMachineEx.getId())) criteriaJc.andNotEqualTo("id", mMachineEx.getId());
        List<MMachine> list = mMachineService.select(criteriaJc);
        if (list.size() > 0) {
            return false;
        }
        return true;
    }

    /**
     * 新增机台
     *
     * @param mMachineEx 机台
     * @return
     */
    @SystemLog("新增机台")
    public MMachineEx insertMMachine(HttpServletRequest request, MMachineEx mMachineEx) {
        CommonUtils.setCommonInfo(mMachineEx, request);
        mMachineEx.setDelFlg("0");
        mMachineMapper.insert(mMachineEx);
        return mMachineEx;
    }

    /**
     * 编辑机台
     *
     * @param mMachineEx 机台
     * @return
     */
    @SystemLog("编辑机台")
    public MMachineEx updateMMachine(HttpServletRequest request,MMachineEx mMachineEx) {
        CommonUtils.setCommonInfo(mMachineEx, request);
        mMachineMapper.updateByPrimaryKey(mMachineEx);
        return mMachineEx;
    }

    /**
     * 删除机台
     * @param mMachineEx
     * @return
     */
    @SystemLog("删除机台")
    public MMachineEx deleteMMachine(HttpServletRequest request,MMachineEx mMachineEx) {
        CommonUtils.setCommonInfo(mMachineEx, request);
        mMachineEx.setDelFlg("1");
        mMachineMapper.updateByPrimaryKey(mMachineEx);
        return mMachineEx;
    }
    /**
     * 获取组织部门信息
     *
     * @param page   当前页数
     * @param limit  分页数
     * @return 需求列表
     */
    @SystemLog("获取组织部门信息")
    public List<MMachineEx> getMachineList(Integer page, Integer limit, MMachineEx mMachineEx) {
        PageHelper.startPage(page, limit);
        return mMachineListDao.getMachineList(mMachineEx.getCntrCd(),
            mMachineEx.getMachineCd(),
            mMachineEx.getMachineNm(),
            mMachineEx.getMachineType(),
            mMachineEx.getAssetModel(),
            mMachineEx.getId());
    }

    @SystemLog("查询中心信息")
    public ResultBean getCenterList(Integer page, Integer limit,MCenter center){
        try {
            PageHelper.startPage(page, limit);
            List<MCenter> centrList = mCenterListDao.getCentrList(center.getCntrCdDis(), center.getCntrNm(), center.getCntrNmDis(), center.getCntrType());
            if(centrList.size() < 0){
                return ResultBean.success("暂无数据！",new PageInfo<>(centrList));
            }
            return ResultBean.success("获取中心信息成功！",new PageInfo<>(centrList));
        } catch (Exception e) {
            e.printStackTrace();
            return ResultBean.failure("获取中心信息异常！");
        }
    }

    @SystemLog("新增中心信息")
    public ResultBean setCenterList(HttpServletRequest request,MCenter center){
        if(center == null){
            return ResultBean.failure("请输入正确的参数");
        }
        try {
            List<MCenter> centrList = mCenterListDao.getCentrList(center.getCntrCdDis(), null, null, null);
            if(centrList.size() > 0){
                return ResultBean.failure("中心编号不能重复");
            }
            CommonUtils.setCommonInfo(center, request);
            mCenterDao.insertSelective(center);
            return ResultBean.success("新增中心信息成功！");
        } catch (Exception e) {
            e.printStackTrace();
            return ResultBean.failure("新增中心信息异常");
        }

    }

    @SystemLog("修改中心信息")
    public ResultBean updCenterList(HttpServletRequest request,MCenter center){
        if(center == null){
            return ResultBean.failure("请输入正确的参数");
        }
        try {
            CommonUtils.setCommonInfo(center, request);
            mCenterDao.updateByPrimaryKey(center);
            return ResultBean.success("修改中心信息成功！");
        } catch (Exception e) {
            e.printStackTrace();
            return ResultBean.failure("修改中心信息异常");
        }

    }

    @SystemLog("删除中心信息")
    public ResultBean delCenterList(HttpServletRequest request,MCenter center){
        try {
            if(Strings.isBlank(center.getId())){
                return ResultBean.failure("请输入正确的参数");
            }
            MCenter mCenter = mCenterDao.selectByPrimaryKey(center.getId());
            if(mCenter != null){
                mCenter.setDelFlg("1");
                CommonUtils.setCommonInfo(mCenter, request);
                mCenterDao.updateByPrimaryKey(mCenter);
                return ResultBean.success("删除中心信息成功！");
            }
            return ResultBean.failure("删除中心信息失败");
        } catch (Exception e) {
            e.printStackTrace();
            return ResultBean.failure("删除中心信息异常");
        }
    }

    /**
     * add by xhs 2020-08-07
     * @param machineCd 机台号
     * @return
     */
    public ResultBean getMachine(String machineCd){
        Example.Criteria criteria = mMachineService.createCriteria();
        criteria.andEqualTo("machineNm", machineCd);
        criteria.andEqualTo("delFlg", 0);
        List<MMachine> machines = mMachineService.select(criteria);
        if(machines.size() > 0){
            return ResultBean.success("查询机台号成功！",new PageInfo<>(machines));
        }else {
            return ResultBean.failure("该机台号没有对应的机台信息！");
        }
    }
}
