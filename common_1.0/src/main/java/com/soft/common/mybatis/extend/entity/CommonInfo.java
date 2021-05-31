package com.soft.common.mybatis.extend.entity;

import lombok.Data;

import java.util.Date;

/**
 * Created by zwd on 2019/9/29.
 */
@Data
public class CommonInfo {
    private static final long serialVersionUID = 1L;
    /**
     * 更新次数
     */
    private Integer updCnt;

    /**
     * 删除区分
     */
    private String delFlg;

    /**
     * 登录时输入区分
     */
    private String addEntKbn;


    /**
     * 登录时端末ID
     */
    private String addTnmtId;

    /**
     * 登录日期
     */
    private Date addDt;

    /**
     * 更新时输入区分
     */
    private String updEntKbn;

    /**
     * 更新时程序ID
     */
    private String updPgmId;

    /**
     * 更新时用户ID
     */
    private String updUserId;

    /**
     * 更新时用户名称
     */
    private String updUserNm;

    /**
     * 更新时端末ID
     */
    private String updTnmtId;

    /**
     * 更新日期
     */
    private Date updDt;

    public Integer getUpdCnt() {
        return updCnt;
    }

    public void setUpdCnt(Integer updCnt) {
        this.updCnt = updCnt;
    }

    public String getDelFlg() {
        return delFlg;
    }

    public void setDelFlg(String delFlg) {
        this.delFlg = delFlg;
    }

    public String getAddEntKbn() {
        return addEntKbn;
    }

    public void setAddEntKbn(String addEntKbn) {
        this.addEntKbn = addEntKbn;
    }

    public String getAddTnmtId() {
        return addTnmtId;
    }

    public void setAddTnmtId(String addTnmtId) {
        this.addTnmtId = addTnmtId;
    }

    public Date getAddDt() {
        return addDt;
    }

    public void setAddDt(Date addDt) {
        this.addDt = addDt;
    }

    public String getUpdEntKbn() {
        return updEntKbn;
    }

    public void setUpdEntKbn(String updEntKbn) {
        this.updEntKbn = updEntKbn;
    }

    public String getUpdPgmId() {
        return updPgmId;
    }

    public void setUpdPgmId(String updPgmId) {
        this.updPgmId = updPgmId;
    }

    public String getUpdUserId() {
        return updUserId;
    }

    public void setUpdUserId(String updUserId) {
        this.updUserId = updUserId;
    }

    public String getUpdUserNm() {
        return updUserNm;
    }

    public void setUpdUserNm(String updUserNm) {
        this.updUserNm = updUserNm;
    }

    public String getUpdTnmtId() {
        return updTnmtId;
    }

    public void setUpdTnmtId(String updTnmtId) {
        this.updTnmtId = updTnmtId;
    }

    public Date getUpdDt() {
        return updDt;
    }

    public void setUpdDt(Date updDt) {
        this.updDt = updDt;
    }
}
