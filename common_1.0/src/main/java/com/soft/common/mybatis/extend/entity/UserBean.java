package com.soft.common.mybatis.extend.entity;

import com.soft.common.model.MLogin;
import com.soft.common.model.MUser;
import lombok.Data;
import org.springframework.beans.BeanUtils;

import java.util.List;

@Data
public class UserBean extends MUser {

    private static final long serialVersionUID = 1L;

    private String loginId;
    private String loginNm;
    private String pswd;
    private String lsPswd;
    private String lsLsPswd;
    private String oldPass;
    private String newPass;
    private String token;
    private String defRoleId;
    private String orgId;
    private String orgNm;
    private String whCd;
    private String whId;
    private String whType;
    private String whTypeNm;
    //add 4/4 wkl 仓库微服务
    private String whServer;
    private String whNm;
    private String cntrNm;
    //add 2020/8/28 wyy 班组信息
    private String workgroupId;
    private String workgroupNm;

    // add xhs 2020-04-25 start

    private String userUUid;
    /**
     * 中心名称
     */
    private String cntrNmDis;
    /**
     * 中心地址
     */
    private String addr;

    public String getUserUUid() {
        return userUUid;
    }

    public void setUserUUid(String userUUid) {
        this.userUUid = userUUid;
    }

    public String getWorkgroupId() {
        return workgroupId;
    }

    public void setWorkgroupId(String workgroupId) {
        this.workgroupId = workgroupId;
    }

    public String getWorkgroupNm() {
        return workgroupNm;
    }

    public void setWorkgroupNm(String workgroupNm) {
        this.workgroupNm = workgroupNm;
    }

    public String getCntrNmDis() {
        return cntrNmDis;
    }
    public void setCntrNmDis(String cntrNmDis) {
        this.cntrNmDis = cntrNmDis;
    }
    public String getAddr() {
        return addr;
    }
    public void setAddr(String addr) {
        this.addr = addr;
    }
    // add xhs 2020-04-25 end
    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getLoginNm() {
        return loginNm;
    }

    public void setLoginNm(String loginNm) {
        this.loginNm = loginNm;
    }

    public String getPswd() {
        return pswd;
    }

    public void setPswd(String pswd) {
        this.pswd = pswd;
    }

    public String getLsPswd() {
        return lsPswd;
    }

    public void setLsPswd(String lsPswd) {
        this.lsPswd = lsPswd;
    }

    public String getLsLsPswd() {
        return lsLsPswd;
    }

    public void setLsLsPswd(String lsLsPswd) {
        this.lsLsPswd = lsLsPswd;
    }

    public String getOldPass() {
        return oldPass;
    }

    public void setOldPass(String oldPass) {
        this.oldPass = oldPass;
    }

    public String getNewPass() {
        return newPass;
    }

    public void setNewPass(String newPass) {
        this.newPass = newPass;
    }

    public String getOrgNm() {
        return orgNm;
    }

    public void setOrgNm(String orgNm) {
        this.orgNm = orgNm;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getDefRoleId() {
        return defRoleId;
    }

    public void setDefRoleId(String defRoleId) {
        this.defRoleId = defRoleId;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getWhCd() {
        return whCd;
    }

    public void setWhCd(String whCd) {
        this.whCd = whCd;
    }

    public String getWhId() {
        return whId;
    }

    public void setWhId(String whId) {
        this.whId = whId;
    }

    public String getWhNm() {
        return whNm;
    }

    public void setWhNm(String whNm) {
        this.whNm = whNm;
    }

    public String getCntrNm() {
        return cntrNm;
    }

    public void setCntrNm(String cntrNm) {
        this.cntrNm = cntrNm;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public String getWhType() {
        return whType;
    }

    public void setWhType(String whType) {
        this.whType = whType;
    }

    public String getWhTypeNm() {
        return whTypeNm;
    }

    public void setWhTypeNm(String whTypeNm) {
        this.whTypeNm = whTypeNm;
    }
//    private List<String> roles = new ArrayList<String>();
    private List<Role> roles;
    public String getWhServer() {
        return whServer;
    }

    public void setWhServer(String whServer) {
        this.whServer = whServer;
    }
    public UserBean(MUser mUser,MLogin mLogin) {
        if (mUser != null) {
            BeanUtils.copyProperties(mUser, this);
            this.token = mUser.getId();
        }
        if (mLogin != null) {
            BeanUtils.copyProperties(mLogin, this);
        }
    }


}
