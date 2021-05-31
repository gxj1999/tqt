package com.soft.common.mybatis.extend.entity;


import com.soft.common.model.MLoc;
import lombok.Data;

/**
 * 仓库实体类
 *
 */
@Data
public class MLocEx extends MLoc {
    private static final long serialVersionUID = 1L;
    private String allcNgClsNm;
    private String locTypeNM;
    //共通名称
    private String generalNm;

    //共通code
    private String generalCd;

    //仓库名称
    private String whNm;

    //区域名称
    private String zoneNm;

    public String getAllcNgClsNm() {
        return allcNgClsNm;
    }

    public void setAllcNgClsNm(String allcNgClsNm) {
        this.allcNgClsNm = allcNgClsNm;
    }

    public String getLocTypeNM() {
        return locTypeNM;
    }

    public void setLocTypeNM(String locTypeNM) {
        this.locTypeNM = locTypeNM;
    }

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

    public String getWhNm() {
        return whNm;
    }

    public void setWhNm(String whNm) {
        this.whNm = whNm;
    }

    public String getZoneNm() {
        return zoneNm;
    }

    public void setZoneNm(String zoneNm) {
        this.zoneNm = zoneNm;
    }
}
