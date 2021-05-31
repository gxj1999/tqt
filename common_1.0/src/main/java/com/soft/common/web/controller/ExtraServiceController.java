package com.soft.common.web.controller;

import com.github.pagehelper.PageInfo;
import com.sjasoft.framework.annotation.SystemLog;
import com.sjasoft.framework.bean.ResultBean;
import com.sjasoft.framework.util.StringUtils;
import com.soft.common.model.*;
import com.soft.common.mybatis.extend.entity.*;
import com.soft.common.web.Util.CallFeignClientUtils;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import tk.mybatis.mapper.entity.Example;

import javax.management.ObjectName;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@Component
public class ExtraServiceController {
    @Autowired
    private CallFeignClientUtils callFeignClientUtils;

    // 其他服务名称
    @Value("${serviceNames}")
    private String serviceNames;

    // 获取服务数组
    public String[] getServiceNameArray() throws Exception{
        return serviceNames.split(",");
    }

    /**
     * 同步其他服务数据
     */
    public void postRequest(String api,Object object){
        try{
            for(String serviceName : getServiceNameArray()) {
                try{
                    if(StringUtils.isNullOrEmpty(serviceName)){
                       continue;
                    }
                    callFeignClientUtils.postJsonRequest("/services/"+ serviceName + "/api/extra/common/" + api,ResultBean.class,object);
                }catch (Exception ex){
                    ex.printStackTrace();
                }
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
    /**
     * 新增组织部门
     * @param mOrg
     */
    public void insertMOrg(MOrg mOrg){
        postRequest("insertMOrg",mOrg);
    }
    /**
     * 编辑组织部门信息
     * @param mOrg
     * @return
     */
    @SystemLog("编辑组织部门信息")
    public void updateMOrg( MOrg mOrg){
        postRequest("updateMOrg",mOrg);
    }

    /**
     *删除组织部门信息
     * @param mOrg   组织部门删除信息
     * @return
     */
    @SystemLog("删除组织部门信息")
    public void deleteMOrg(MOrg mOrg) {
        postRequest("deleteMOrg",mOrg);
    }

    /**
     * 新增仓库信息
     * @return
     */
    @SystemLog("新增仓库信息")
    public void insertMWh(Map<String,Object> map){
        postRequest("insertMWh",map);
    }
    /**
     * 编辑仓库信息
     * @return
     */
    @SystemLog("编辑仓库信息")
    @PostMapping(value = "updateMWh")
    public void updateMWh(Map<String,Object> map){
        postRequest("updateMWh",map);
    }
    /**
     *删除仓库信息
     * @param mWh
     * @return
     */
    @SystemLog("删除仓库信息")
    public void deleteMWh(MWh mWh) {
        postRequest("deleteMWh",mWh);
    }
    /**
     * 删除仓库区域
     * @param mZone
     * @return
     */
    @SystemLog("删除仓库区域")
    public void deleteMZone(MZone mZone) {
        postRequest("deleteMZone",mZone);
    }
    /**
     * 新增共通配置信息
     * @return
     */
    @SystemLog("新增共通配置信息")
    public void insertMGeneral(List<MGeneral> mGenerals ){
        postRequest("insertMGeneral",mGenerals);
    }
    /**
     * 编辑共通配置信息
     * @return
     */
    @SystemLog("编辑共通配置信息")
    public void updateMGeneral(Map<String,Object> map){
        postRequest("updateMGeneral",map);
    }
    /**
     *删除共通配置信息
     * @param mGeneral
     * @return
     */
    @SystemLog("删除共通配置信息")
    public void deleteMGeneral(MGeneral mGeneral) {
        postRequest("deleteMGeneral",mGeneral);
    }

    /**
     * 新增库位信息
     * @param mLoc
     * @return
     */
    @SystemLog("新增库位信息")
    public void insertMLoc(MLoc mLoc){
        postRequest("insertMLoc",mLoc);
    }
    /**
     * 编辑库位信息
     * @param mLoc
     * @return
     */
    @SystemLog("编辑库位信息")
    public void updateMLoc(MLoc mLoc){
        postRequest("updateMLoc",mLoc);
    }
    /**
     *删除库位信息
     * @param mLoc
     * @return
     */
    @SystemLog("删除库位信息")
    public void deleteMLoc(MLoc mLoc) {
        postRequest("deleteMLoc",mLoc);
    }

    /**
     * 新增客户信息
     * @param mCustomer
     * @return
     */
    @SystemLog("新增客户信息")
    public void insertMCustomer(MCustomer mCustomer){
        postRequest("insertMCustomer",mCustomer);
    }
    /**
     * 编辑客户信息
     * @param mCustomer
     * @return
     */
    @SystemLog("编辑客户信息")
    public void updateMCustomer(MCustomer mCustomer){
        postRequest("updateMCustomer",mCustomer);
    }
    /**
     *删除客户信息
     * @param mCustomer
     * @return
     */
    @SystemLog("删除客户信息")
    public void deleteMCustomer(MCustomer mCustomer) {
        postRequest("deleteMCustomer",mCustomer);
    }

    /**
     * 新增供应商信息
     * @return
     */
    @SystemLog("新增供应商信息")
    public void insertMSupplier(Map<String,Object> map){
        postRequest("insertMSupplier",map);
    }
    /**
     * 编辑供应商信息
     * @return
     */
    @SystemLog("编辑供应商信息")
    public void updateMSupplier(Map<String,Object> map){
        postRequest("updateMSupplier",map);
    }
    /**
     *删除供应商信息
     * @param mSupplier
     * @return
     */
    @SystemLog("删除供应商信息")
    public void deleteMSupplier(MSupplier mSupplier) {
        postRequest("deleteMSupplier",mSupplier);
    }
    /**
     * 删除供应商明细
     * @param mSupplierLine
     * @return
     */
    @SystemLog("删除供应商明细")
    public void deleteMSupplierLine(MSupplierLine mSupplierLine) {
        postRequest("deleteMSupplierLine",mSupplierLine);
    }

    /**
     * 新增用户信息
     * @return
     */
    @SystemLog("新增用户信息")
    public void insertMUser(MUser mUser){
        postRequest("insertMUser",mUser);
    }
    /**
     * 编辑用户信息
     * @return
     */
    @SystemLog("编辑用户信息")
    public void updateMUser(MUser mUser){
        postRequest("updateMUser",mUser);
    }

    /**
     *删除用户信息
     * @param mUser
     * @return
     */
    @SystemLog("删除用户信息")
    public void deleteMUser(MUser mUser) {
        postRequest("deleteMUser",mUser);
    }
    /**
     * 删除登录信息
     * @param mLogin
     * @return
     */
    @SystemLog("删除登录信息")
    public void deleteMLogin(MLogin mLogin) {
        postRequest("deleteMUser",mLogin);
    }

    /**
     * 新增外发工厂信息
     * @return
     */
    @SystemLog("新增外发工厂信息")
    public void insertMOutFactory(Map<String,Object> map){
        postRequest("insertMOutFactory",map);
    }

    /**
     * 编辑外发工厂信息
     * @return
     */
    @SystemLog("编辑外发工厂信息")
    public void updateMOutFactory(Map<String,Object> map){
        postRequest("updateMOutFactory",map);
    }

    /**
     *删除外发工厂信息
     * @param mOutFactory
     * @return
     */
    @SystemLog("删除外发工厂信息")
    public void deleteMOutFactory(MOutFactory mOutFactory) {
        postRequest("deleteMOutFactory",mOutFactory);
    }
    /**
     * 删除外发工厂明细
     * @param mOutFactoryLine
     * @return
     */
    @SystemLog("删除外发工厂明细")
    public void deleteMOutFactoryLine(MOutFactoryLine mOutFactoryLine) {
        postRequest("deleteMOutFactoryLine",mOutFactoryLine);
    }

    /**
     * 新增物流公司信息
     * @return
     */
    @SystemLog("新增物流公司信息")
    public void insertMCarrier(Map<String,Object> map){
        postRequest("insertMCarrier",map);
    }

    /**
     *删除物流公司信息
     * @param mCarrier
     * @return
     */
    @SystemLog("删除物流公司信息")
    public void deleteMCarrier(MCarrier mCarrier) {
        postRequest("deleteMCarrier",mCarrier);
    }
    /**
     * 删除物流公司明细
     * @param mCarrierLine
     * @return
     */
    @SystemLog("删除物流公司明细")
    @PostMapping(value = "deleteMCarrierLine")
    public void deleteMCarrierLine(MCarrierLine mCarrierLine) {
        postRequest("deleteMCarrierLine",mCarrierLine);
    }

    /**
     * 编辑物流公司信息
     * @return
     */
    @SystemLog("编辑物流公司信息")
    public void updateMCarrier(Map<String,Object> map){
        postRequest("updateMCarrier",map);
    }

    /**
     * 新增评价等级信息
     * @param mLevel
     * @return
     */
    @SystemLog("新增评价等级信息")
    public void insertMLevel(MLevel mLevel){
        postRequest("insertMLevel",mLevel);
    }
    /**
     * 编辑评价等级信息
     * @param mLevel
     * @return
     */
    @SystemLog("编辑评价等级信息")
    public void updateMLevel( MLevel mLevel){
        postRequest("updateMLevel",mLevel);
    }
    /**
     *删除评价等级信息
     * @param mLevel
     * @return
     */
    @SystemLog("删除评价等级信息")
    @PostMapping(value = "deleteMLevel")
    public void deleteMLevel(MLevel mLevel) {
        postRequest("deleteMLevel",mLevel);
    }

    /**
     * 新增箱信息
     * @param mBox
     * @return
     */
    @SystemLog("新增箱信息")
    public void insertMBox(MBox mBox){
        postRequest("insertMBox",mBox);
    }
    /**
     * 编辑箱信息
     * @param mBox
     * @return
     */
    @SystemLog("编辑箱信息")
    public void updateMBox(MBox mBox){
        postRequest("updateMBox",mBox);
    }
    /**
     *删除箱信息
     * @param mBox
     * @return
     */
    @SystemLog("删除箱信息")
    public void deleteMBox(MBox mBox) {
        postRequest("deleteMBox",mBox);
    }

    /**
     * 新增提示信息
     * @param mErrorinfo
     * @return
     */
    @SystemLog("新增提示信息")
    public void insertMErrorinfo(MErrorinfo mErrorinfo){
        postRequest("insertMErrorinfo",mErrorinfo);
    }
    /**
     * 编辑提示信息
     * @param mErrorinfo
     * @return
     */
    @SystemLog("编辑提示信息")
    public void updateMErrorinfo( MErrorinfo mErrorinfo){
        postRequest("updateMErrorinfo",mErrorinfo);
    }
    /**
     *删除提示信息
     * @param mErrorinfo
     * @return
     */
    @SystemLog("删除提示信息")
    public void deleteMErrorinfo(MErrorinfo mErrorinfo) {
        postRequest("deleteMErrorinfo",mErrorinfo);
    }

    /**
     * 新增商品信息
     * @param mproduct 商品信息
     * @return
     */
    @SystemLog("新增商品信息")
    public void insertMproduct(MProduct mproduct) {
        postRequest("insertMproduct",mproduct);
    }

    /**
     * 编辑商品信息
     * @param mproduct 商品信息
     * @return
     */
    @SystemLog("编辑商品信息")
    public void updateMproduct(MProduct mproduct) {
        postRequest("updateMproduct",mproduct);
    }
    /**
     * 删除商品信息
     * @param mProduct
     * @return
     */
    @SystemLog("删除商品信息")
    public void deleteMproduct(MProduct mProduct) {
        postRequest("deleteMproduct",mProduct);
    }

    /**
     * 新增商品分类信息
     * @param mProductClass
     * @return
     */
    @SystemLog("新增商品分类信息")
    public void insertMProductClass(MProductClass mProductClass) {
        postRequest("insertMProductClass",mProductClass);
    }
    /**
     * 删除商品分类信息
     * @param mProductClass    商品分类删除信息
     * @return
     */
    @SystemLog("删除商品分类信息")
    public void deleteMProductClass( MProductClass mProductClass) {
        postRequest("deleteMProductClass",mProductClass);
    }
    /**
     * 编辑商品分类信息
     * @param  mProductClass
     * @return
     */
    @SystemLog("编辑商品分类信息")
    public void updateMProductClass(MProductClass mProductClass) {
        postRequest("updateMProductClass",mProductClass);
    }

    /**
     * 新增中心信息
     * @param mCenter
     * @return
     */
    @SystemLog("新增中心信息")
    public void insertMCenter(MCenter mCenter) {
        postRequest("insertMCenter",mCenter);
    }
    /**
     * 编辑中心信息
     * @param  mCenter
     * @return
     */
    @SystemLog("编辑中心信息")
    public void updateMCenter(MCenter mCenter) {
        postRequest("updateMCenter",mCenter);
    }
    /**
     * 删除中心信息
     * @param mCenter
     * @return
     */
    @SystemLog("删除中心信息")
    public void deleteMCenter(MCenter mCenter) {
        postRequest("deleteMCenter",mCenter);
    }

    /**
     *删除生产流程信息
     * @param mManufProcess
     * @return
     */
    @SystemLog("删除生产流程信息")
    @PostMapping(value = "deleteManufProcess")
    public void deleteManufProcess(MManufProcess mManufProcess) {
        postRequest("deleteManufProcess",mManufProcess);
    }
    /**
     *删除标准流程信息
     * @param mStandardMp
     * @return
     */
    @SystemLog("删除标准流程信息")
    @PostMapping(value = "deleteStandardMp")
    public void deleteStandardMp(MStandardMp mStandardMp) {
        postRequest("deleteStandardMp",mStandardMp);
    }
    /**
     * 新增库位信息
     * @param mManufProcess
     * @return
     */
    @SystemLog("新增库位信息")
    public void updateManuf( MManufProcess mManufProcess){
        postRequest("updateManuf",mManufProcess);
    }
    /**
     * 新增库位信息
     * @param mManufProcess
     * @return
     */
    @SystemLog("新增库位信息")
    public void insertManuf( MManufProcess mManufProcess){
        postRequest("insertManuf",mManufProcess);
    }
    /**
     * 新增商品信息
     * @return
     */
    @SystemLog("新增商品信息")
    public void insertMproductNew(Map<String,Object> map){
        postRequest("insertMproductNew",map);
    }

    /**
     * 弹框保存并确定
     * @return
     */
    @SystemLog("弹框保存并确定")
    public void saveManufProcess(Map<String,Object> map){
        postRequest("saveManufProcess",map);
    }

    /**
     * 标准流程保存
     * @return
     */
    @SystemLog("标准流程保存")
    public void saveStandardMpAndLine(Map<String,Object> map){
        postRequest("saveStandardMpAndLine",map);
    }
    /**
     * 标准流程保存
     * @return
     */
    @SystemLog("标准流程保存")
    public void inStandardMpAndLine(Map<String,Object> map){
        postRequest("inStandardMpAndLine",map);
    }

    /**
     * 新增机台
     * @param mMachine
     * @return
     */
    @SystemLog("新增机台")
    public void insertMMachine(MMachine mMachine) {
        postRequest("insertMMachine", mMachine);
    }
    /**
     * 编辑机台
     * @param  mMachine
     * @return
     */
    @SystemLog("编辑机台")
    public void updateMMachine(MMachine mMachine) {
        postRequest("updateMMachine", mMachine);
    }
    /**
     * 删除机台
     * @param mMachine
     * @return
     */
    @SystemLog("删除机台")
    public void deleteMMachine(MMachine mMachine) {
        postRequest("deleteMMachine", mMachine);
    }

    /**
     * 批量新增商品信息
     * @param mProductExList 商品信息
     * @return
     */
    @SystemLog("批量新增商品信息")
    public void insertMproductList(List<MProductEx> mProductExList) {
        postRequest("insetMproductList",mProductExList);
    }


}
