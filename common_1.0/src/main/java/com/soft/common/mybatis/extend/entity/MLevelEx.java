package com.soft.common.mybatis.extend.entity;


import com.soft.common.model.MLevel;
import lombok.Data;

/**
 * 仓库实体类
 *
 */
@Data
public class MLevelEx extends MLevel {
    private static final long serialVersionUID = 1L;
    //共通名称
    private String generalNm;

    //共通code
    private String generalCd;
    //评级类型名称
    private String levelTypeNm;

    public String getGeneralNm() {
        return generalNm;
    }

    public void setGeneralNm(String generalNm) {
        this.generalNm = generalNm;
    }

    public String getGeneralCd() {
        return generalCd;
    }

    public void setGeneralCd(String generalCd) {
        this.generalCd = generalCd;
    }

    public String getLevelTypeNm() {
        return levelTypeNm;
    }

    public void setLevelTypeNm(String levelTypeNm) {
        this.levelTypeNm = levelTypeNm;
    }
}
