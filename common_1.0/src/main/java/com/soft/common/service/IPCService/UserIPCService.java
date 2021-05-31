package com.soft.common.service.IPCService;

import com.sjasoft.framework.annotation.SystemLog;
import com.sjasoft.framework.bean.ResultBean;
import com.sjasoft.framework.context.AppContext;
import com.sjasoft.framework.service.AbstractService;
import com.sjasoft.framework.util.StringUtils;
import com.soft.common.mapper.*;
import com.soft.common.model.*;
import com.soft.common.mybatis.extend.entity.UserBean;
import com.soft.common.service.CommonService;
import com.soft.common.service.MNumberService;
import com.soft.common.web.Util.CommonUtils;
import com.soft.common.web.service.MWorkgroupService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;
import java.util.UUID;

//import sun.security.util.Password;

@Service
public class UserIPCService extends AbstractService<MLogin> {

    protected Log logger = LogFactory.getLog(getClass());

    public static final String SESSION_KEY_LOGIN_ID = "login_user_id";

    @Resource
    private MLoginMapper mLoginDao;

    @Resource
    private MUserMapper mUserDao;

    @Resource
    private MRoleMapper mRoleDao;

    @Resource
    private MOrgMapper mOrgDao;

    @Resource
    private MCenterMapper mCenterDao;

    @Resource
    private MUserRoleMapper mUserRoleDao;

    @Resource
    private MWhMapper mWhDao;

    @Resource
    private MNumberService mNumberService;

    @Resource
    private CommonService commonService;
    @Resource
    private MWorkgroupMapper mWorkgroupDao;

    public UserIPCService() {
        super.setBaseMapper(mLoginDao);
    }

    @SystemLog("获得当前登录用户信息")
    public UserBean getLoginUser(HttpServletRequest request) {
        String id = (String) AppContext.getSession().getAttribute(SESSION_KEY_LOGIN_ID);
        if (id == null) return null;
        Example example = new Example(MLogin.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("userId", id);
        MLogin mLogin = mLoginDao.selectOneByExample(example);
        if (mLogin == null) {
            return null;
        }
        example = new Example(MUser.class);
        criteria = example.createCriteria();
        criteria.andEqualTo("userId", id);
        criteria.andEqualTo("cntrCd",mLogin.getCntrCd());
        criteria.andEqualTo("delFlg","0");
        MUser mUser = mUserDao.selectOneByExample(example);
        if (mUser == null) {
            return null;
        }
        UserBean userBean = new UserBean(mUser, mLogin);
        setWPFinfo(userBean);

        return userBean;
    }

    @SystemLog("获得当前登录用户信息")
    public UserBean getLoginUser() {
        String id = (String) AppContext.getSession().getAttribute(SESSION_KEY_LOGIN_ID);
        if (id == null) return null;
        Example example = new Example(MLogin.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("userId", id);
        MLogin mLogin = mLoginDao.selectOneByExample(example);
        if (mLogin == null) {
            return null;
        }
        example = new Example(MUser.class);
        criteria = example.createCriteria();
        criteria.andEqualTo("userId", id);
        criteria.andEqualTo("cntrCd",mLogin.getCntrCd());
        criteria.andEqualTo("delFlg","0");

        MUser mUser = mUserDao.selectOneByExample(example);
        if (mUser == null) {
            return null;
        }

        UserBean userBean = new UserBean(mUser, mLogin);
        setWPFinfo(userBean);

        return userBean;
    }

    @SystemLog("用户登录")
    public ResultBean login(HttpServletRequest request, String workId) {
        MUser mUser = getUserByWorkId(workId);
        if (mUser == null) {
            return ResultBean.failure("您所输入的工号不存在!", 2);
        }
        if ("1".equals(StringUtils.nullOrEmptyToString(mUser.getDisableFlg(), ""))) {
            return ResultBean.failure("当前用户名已被停用,无法登录!", 5);
        } else if ("2".equals(StringUtils.nullOrEmptyToString(mUser.getDisableFlg(), ""))) {
            return ResultBean.failure("当前用户名密码已经输错超过五次,请联系管理员!", 3);
        } else if ("3".equals(StringUtils.nullOrEmptyToString(mUser.getDisableFlg(), ""))) {
            return ResultBean.failure("您是新用户，请在邮件链接完善信息后登录!", "");
        }

        //若成功登录则更新用户登录表的【登录时间】，【前回登录时间】，【密码输入错误次数】等字段
        MLogin  mLogin = getLoginByUserId(mUser.getUserId());

        mLogin.setLsLoginDt(mLogin.getLoginDt());
        mLogin.setLoginDt(new Date());
        mLogin.setPswdErrNum(0);
        CommonUtils.setCommonInfo(mLogin, request);
        mLoginDao.updateByPrimaryKey(mLogin);

        String token = UUID.randomUUID().toString();
        request.getSession().setAttribute(token, mLogin.getUserId());
        request.getSession().setAttribute(SESSION_KEY_LOGIN_ID, mLogin.getUserId());

        UserBean userBean = new UserBean(mUser, mLogin);
        userBean.setToken(token);
        userBean.setUserUUid(mUser.getId());
        setWPFinfo(userBean);

        return ResultBean.success("登录成功", userBean);
    }

    @SystemLog("根据工号获取用户")
    public MUser getUserByWorkId(String workId) {
        Example example = new Example(MUser.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("workId", workId);
        criteria.andEqualTo("delFlg", "0");
        return mUserDao.selectOneByExample(example);
    }

    @SystemLog("根据用户获取登录账户")
    public MLogin getLoginByUserId(String userId) {
        Example example = new Example(MLogin.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("userId", userId);
        criteria.andEqualTo("delFlg", "0");
        return mLoginDao.selectOneByExample(example);
    }


    @SystemLog("根据用户名获取用户")
    public MUser getUserByName(String userNm) {
        Example example = new Example(MUser.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("userNm", userNm);
        return mUserDao.selectOneByExample(example);
    }

    @SystemLog("根据用户名获取用户")
    public MUser getUserByNameNotSelf(String userNm, String id) {
        Example example = new Example(MUser.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("userNm", userNm);
        criteria.andNotEqualTo("id", id);
        return mUserDao.selectOneByExample(example);
    }

    @SystemLog("根据用户名获取用户")
    public MLogin getUserByLoginId(String cntrCd, String loginId) {
        Example example = new Example(MLogin.class);
        Example.Criteria criteria = example.createCriteria();
        // del by zwd 20191114
//        if (!StringUtils.isNullOrEmpty(cntrCd)) {
//            criteria.andEqualTo("cntrCd", cntrCd);
//        }
        // del by zwd 20191114
        criteria.andEqualTo("loginId", loginId);
        criteria.andEqualTo("delFlg", "0");
        return mLoginDao.selectOneByExample(example);
    }

    @SystemLog("用户登出")
    public ResultBean logout(HttpServletRequest request) {
        request.getSession().invalidate();
        return ResultBean.success("登出成功");
    }

    public void createUser(UserBean mUser, HttpServletRequest request) {
        String userId = mNumberService.getMNumberList("USER_ID");
        mUser.setUserId(userId);
        mUser.setDisableFlg("0");
        mUser.setDelFlg("0");
//        mUser.setBirth();
        CommonUtils.setCommonInfo(mUser, request);
        mUserDao.insert(mUser);

        MLogin mLogin = new MLogin();
        mLogin.setCntrCd(mUser.getCntrCd());
        mLogin.setUserId(userId);
        if (StringUtils.isNullOrEmpty(mUser.getLoginId())) {
            mLogin.setLoginId(userId);
        } else {
            mLogin.setLoginId(mUser.getLoginId());
        }
        mLogin.setPswd(StringUtils.MD5("999999"));
        mLogin.setInitFlg("1");
        mLogin.setDelFlg("0");
        mLogin.setAddEntKbn(mUser.getAddEntKbn());
        mLogin.setAddPgmId(mUser.getAddPgmId());
        mLogin.setAddUserId(mUser.getAddUserId());
        mLogin.setAddUserNm(mUser.getAddUserNm());
        mLogin.setUpdEntKbn(mUser.getUpdEntKbn());
        mLogin.setUpdPgmId(mUser.getUpdPgmId());
        mLogin.setUpdUserId(mUser.getUpdUserId());
        mLogin.setUpdUserNm(mUser.getUpdUserNm());
        CommonUtils.setCommonInfo(mLogin, request);
        mLoginDao.insert(mLogin);
    }
    public void updateUser(HttpServletRequest request, UserBean mUser) {
        CommonUtils.setCommonInfo(mUser, request);
        mUserDao.updateByPrimaryKey(mUser);

        Example example = new Example(MLogin.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("userId", mUser.getUserId());
        criteria.andEqualTo("cntrCd", mUser.getCntrCd());
        MLogin mLogin = mLoginDao.selectOneByExample(example);
        mLogin.setLoginId(mUser.getLoginId());
        mLogin.setUpdPgmId(mUser.getUpdPgmId());
        mLogin.setUpdUserId(mUser.getUpdUserId());
        mLogin.setUpdUserNm(mUser.getUpdUserNm());
        CommonUtils.setCommonInfo(mLogin, request);
        mLoginDao.updateByPrimaryKey(mLogin);
    }
    public void deleteUser(HttpServletRequest request,UserBean mUser) {
        mUser.setDelFlg("1");
        CommonUtils.setCommonInfo(mUser, request);
        mUserDao.updateByPrimaryKey(mUser);

        Example example = new Example(MLogin.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("userId", mUser.getUserId());
        criteria.andEqualTo("cntrCd", mUser.getCntrCd());
        MLogin mLogin = mLoginDao.selectOneByExample(example);
        if (mLogin != null) {
            mLogin.setDelFlg("1");
            CommonUtils.setCommonInfo(mLogin, request);
            mLoginDao.updateByPrimaryKey(mLogin);
        }
    }

    @SystemLog("修改密码")
    public ResultBean changePwd(HttpServletRequest request, UserBean userBean){
        if(userBean.getOldPass().equals(userBean.getNewPass())){
            return ResultBean.failure("旧密码和新密码不能相同！！");
        }
//        UserBean userBeanDB = getLoginUser(request);
//        if (userBeanDB == null) {
//            return null;
//        }

        Example example = new Example(MLogin.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("loginId", userBean.getLoginId());
        criteria.andEqualTo("delFlg", "0");
        List<MLogin> mLoginDb = mLoginDao.selectByExample(example);
        if (mLoginDb.size() == 0) {
            return null;
        }
        MLogin mLogin = mLoginDb.get(0);
        if(!mLogin.getPswd().equals(StringUtils.MD5(userBean.getOldPass()))) {
            return ResultBean.failure("旧密码输入错误！");
        }
        if ((!StringUtils.isNullOrEmpty(mLogin.getLsPswd()) && mLogin.getLsPswd().equals(StringUtils.MD5(userBean.getNewPass())))
            || (!StringUtils.isNullOrEmpty(mLogin.getLsLsPswd()) && mLogin.getLsLsPswd().equals(StringUtils.MD5(userBean.getNewPass())))) {
            return ResultBean.failure("旧密码不能和前回相同！");
        } else{
            // 密码 前回密码 前前回密码 是否初期登录 前回密码修改时间
            mLogin.setPswd(StringUtils.MD5(userBean.getNewPass()));
            mLogin.setLsPswd(mLogin.getPswd());
            mLogin.setLsLsPswd(mLogin.getLsPswd());
            mLogin.setPswdErrNum(0);
            mLogin.setInitFlg("0");
            mLogin.setLsPswdDt(new Date());
            mLogin.setLsLoginDt(mLogin.getLogoutDt());
            mLogin.setLogoutDt(new Date());
            CommonUtils.setCommonInfo(mLogin, request);
            mLogin.setUpdEntKbn(userBean.getUpdEntKbn());
            mLogin.setUpdUserId(userBean.getUpdUserId());
            mLogin.setUpdPgmId(userBean.getUpdPgmId());
            mLogin.setUpdPgmId(userBean.getUpdPgmId());

            mLoginDao.updateByPrimaryKey(mLogin);

            this.logout(request);
        }
        return ResultBean.success("修改成功，请重新登录！");

    }

    /**
     * 修改密码
     * @param request
     * @param userBean
     * @return
     */
    @SystemLog("修改密码")
    public ResultBean changeByPwd(HttpServletRequest request,UserBean userBean){
        if(userBean.getOldPass().equals(userBean.getNewPass())){
            return ResultBean.failure("旧密码和新密码不能相同！！");
        }
        MLogin mLogin = getUserByLoginId(userBean.getCntrNm(),userBean.getLoginId());
        if(!mLogin.getPswd().equals(StringUtils.MD5(userBean.getOldPass()))) {
            return ResultBean.failure("旧密码输入错误！");
        }
        if(mLogin.getLsPswd() != null){
            if ( mLogin.getLsPswd().equals(StringUtils.MD5(userBean.getNewPass()))) {
                return ResultBean.failure("旧密码不能和前回相同！");
            }
        }

        if(mLogin.getLsLsPswd() != null){
            if ( mLogin.getLsLsPswd().equals(StringUtils.MD5(userBean.getNewPass()))) {
                return ResultBean.failure("旧密码不能和前前回相同！");
            }
        }
        // 密码 前回密码 前前回密码 是否初期登录 前回密码修改时间
        mLogin.setPswd(StringUtils.MD5(userBean.getNewPass()));
        mLogin.setLsPswd(mLogin.getPswd());
        mLogin.setLsLsPswd(mLogin.getLsPswd());
        mLogin.setPswdErrNum(0);
        mLogin.setInitFlg("0");
        mLogin.setLsPswdDt(new Date());
        mLogin.setLsLoginDt(mLogin.getLogoutDt());
        mLogin.setLogoutDt(new Date());
        CommonUtils.setCommonInfo(mLogin, request);
        mLogin.setUpdEntKbn(userBean.getUpdEntKbn());
        mLogin.setUpdUserId(userBean.getUpdUserId());
        mLogin.setUpdPgmId(userBean.getUpdPgmId());
        mLogin.setUpdPgmId(userBean.getUpdPgmId());
        mLoginDao.updateByPrimaryKey(mLogin);

        return ResultBean.success("修改成功，请重新登录！");
    }

    @SystemLog("取得WPF信息")
    private void setWPFinfo(UserBean userBean) {
        try {
            Example example = new Example(MCenter.class);
            Example.Criteria criteria = example.createCriteria();
            criteria.andEqualTo("id", userBean.getCntrCd());
            criteria.andEqualTo("delFlg", "0");
            MCenter center  = mCenterDao.selectOneByExample(example);
            userBean.setCntrNm(center.getCntrNm());
            // add by xhs 2020-05-25 start
            userBean.setCntrNmDis(center.getCntrNmDis());
            userBean.setAddr(center.getAddr());
            // add by xhs 2020-05-25 end

            example = new Example(MUserRole.class);
            criteria = example.createCriteria();
            criteria.andEqualTo("cntrCd", userBean.getCntrCd());
            criteria.andEqualTo("userId", userBean.getUserId());
            criteria.andEqualTo("defCpyFlg", "1");
            criteria.andEqualTo("delFlg", "0");
            MUserRole mUserRole = mUserRoleDao.selectOneByExample(example);
            if (mUserRole != null) {
                MRole role = mRoleDao.selectByPrimaryKey(mUserRole.getRoleId());
                if (role != null) {
                    userBean.setDefRoleId(role.getId());
                    MOrg org = mOrgDao.selectByPrimaryKey(role.getOrgId());
                    if (org != null) {
                        userBean.setOrgId(org.getId());
                        userBean.setOrgNm(org.getOrgNm());
                        MWh mwh  = mWhDao.selectByPrimaryKey(org.getWhCd());
                        if (mwh != null) {
                            userBean.setWhCd(mwh.getWhCdDis());
                            userBean.setWhId(mwh.getId());
                            userBean.setWhType(mwh.getWhType());
                            MGeneral wht = commonService.getGeneralData(userBean.getWhType(), "WH_TYPE");
                            if (wht != null) {
                                userBean.setWhTypeNm(wht.getGeneralNm());
                                //add wkl 4/4仓库微服务
                                userBean.setWhServer(wht.getChar1());
                            }

                        }
                    }
                }
                //判断班组是否存在
                if(!StringUtils.isNullOrEmpty(mUserRole.getChar1())){
                    //获取当前班组信息
                    example = new Example(MWorkgroup.class);
                    criteria = example.createCriteria();
                    //班组主键
                    criteria.andEqualTo("id", mUserRole.getChar1());
                    criteria.andEqualTo("delFlg", "0");
                    MWorkgroup mWorkgroup = mWorkgroupDao.selectOneByExample(example);
                    if(mWorkgroup != null){
                        userBean.setWorkgroupId(mWorkgroup.getId());
                        userBean.setWorkgroupNm(mWorkgroup.getWorkgroupNm());
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //add by xieshengjie 20191108 begin
    @SystemLog("获得当前登录用户信息")
    public UserBean getLoginUser(String id) {
        Example example = new Example(MLogin.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("id", id);
        MLogin mLogin = mLoginDao.selectOneByExample(example);
        if (mLogin == null) {
            return null;
        }
        example = new Example(MUser.class);
        criteria = example.createCriteria();
        criteria.andEqualTo("userId", mLogin.getUserId());
        criteria.andEqualTo("cntrCd",mLogin.getCntrCd());
        criteria.andEqualTo("delFlg","0");
        MUser mUser = mUserDao.selectOneByExample(example);
        if (mUser == null) {
            return null;
        }
        UserBean userBean = new UserBean(mUser, mLogin);
        setWPFinfo(userBean);

        return userBean;
    }
    //add by xieshengjie 20191108 end

    // add by xhs 2020-05-09 start
    @SystemLog("重置密码")
    @Transactional
    public ResultBean resetPwd(HttpServletRequest request,UserBean userBean){
        try{
            // 验证登录账号是否为空
            if(StringUtils.isEmpty(userBean.getLoginId())){
                return ResultBean.failure("登录账号不能为空！");
            }
            // 验证登录账号是否存在
            MLogin mLogin = null;
            try {
                mLogin = getUserByLoginId(null, userBean.getLoginId());
                if(mLogin == null){
                    return ResultBean.failure("账号不存在!");
                }
            } catch (Exception e) {
                e.printStackTrace();
                return ResultBean.failure("验证账号异常!");
            }
            try {
                // 更新密码为6个9
                mLogin.setPswd(StringUtils.MD5("999999"));
                // 更新密码输入错误次数
                mLogin.setPswdErrNum(0);
                // 设置共通字段
                CommonUtils.setCommonInfo(userBean, request);
                mLoginDao.updateByPrimaryKey(mLogin);
            } catch (Exception e) {
                e.printStackTrace();
                return ResultBean.failure("更新密码输入错误次数异常!");
            }
            try {
                // 更新用户状态为正常
                userBean.setDisableFlg("0");
                CommonUtils.setCommonInfo(userBean, request);
                mUserDao.updateByPrimaryKey(userBean);
            } catch (Exception e) {
                e.printStackTrace();
                return ResultBean.failure("更新用户状态异常!");
            }

        }catch (Exception e){
            e.printStackTrace();
            return ResultBean.failure("重置密码失败!");
        }
        return ResultBean.success("重置密码成功！");
    }
    // add by xhs 2020-05-09 end

}
