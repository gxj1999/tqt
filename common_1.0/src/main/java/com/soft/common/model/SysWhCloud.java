package com.soft.common.model;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "sys_wh_cloud")
public class SysWhCloud implements Serializable {
    /**
     * 主键
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 中心编号
     */
    @Column(name = "CNTR_CD")
    private String cntrCd;

    /**
     * 仓库ID
     */
    @Column(name = "WH_ID")
    private String whId;

    /**
     * 微服务名称
     */
    @Column(name = "CLOUD_NM")
    private String cloudNm;

    /**
     * 删除区分
     */
    @Column(name = "DEL_FLG")
    private String delFlg;

    private static final long serialVersionUID = 1L;

    /**
     * 获取主键
     *
     * @return ID - 主键
     */
    public String getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 获取中心编号
     *
     * @return CNTR_CD - 中心编号
     */
    public String getCntrCd() {
        return cntrCd;
    }

    /**
     * 设置中心编号
     *
     * @param cntrCd 中心编号
     */
    public void setCntrCd(String cntrCd) {
        this.cntrCd = cntrCd == null ? null : cntrCd.trim();
    }

    /**
     * 获取仓库ID
     *
     * @return WH_ID - 仓库ID
     */
    public String getWhId() {
        return whId;
    }

    /**
     * 设置仓库ID
     *
     * @param whId 仓库ID
     */
    public void setWhId(String whId) {
        this.whId = whId == null ? null : whId.trim();
    }

    /**
     * 获取微服务名称
     *
     * @return CLOUD_NM - 微服务名称
     */
    public String getCloudNm() {
        return cloudNm;
    }

    /**
     * 设置微服务名称
     *
     * @param cloudNm 微服务名称
     */
    public void setCloudNm(String cloudNm) {
        this.cloudNm = cloudNm == null ? null : cloudNm.trim();
    }

    /**
     * 获取删除区分
     *
     * @return DEL_FLG - 删除区分
     */
    public String getDelFlg() {
        return delFlg;
    }

    /**
     * 设置删除区分
     *
     * @param delFlg 删除区分
     */
    public void setDelFlg(String delFlg) {
        this.delFlg = delFlg == null ? null : delFlg.trim();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        SysWhCloud other = (SysWhCloud) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCntrCd() == null ? other.getCntrCd() == null : this.getCntrCd().equals(other.getCntrCd()))
            && (this.getWhId() == null ? other.getWhId() == null : this.getWhId().equals(other.getWhId()))
            && (this.getCloudNm() == null ? other.getCloudNm() == null : this.getCloudNm().equals(other.getCloudNm()))
            && (this.getDelFlg() == null ? other.getDelFlg() == null : this.getDelFlg().equals(other.getDelFlg()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCntrCd() == null) ? 0 : getCntrCd().hashCode());
        result = prime * result + ((getWhId() == null) ? 0 : getWhId().hashCode());
        result = prime * result + ((getCloudNm() == null) ? 0 : getCloudNm().hashCode());
        result = prime * result + ((getDelFlg() == null) ? 0 : getDelFlg().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", cntrCd=").append(cntrCd);
        sb.append(", whId=").append(whId);
        sb.append(", cloudNm=").append(cloudNm);
        sb.append(", delFlg=").append(delFlg);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}