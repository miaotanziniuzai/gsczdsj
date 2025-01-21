package com.ruoyi.system.domain;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * 单位管理实体类
 */
public class SysCompany extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /** 单位ID */
    @Excel(name = "序号", cellType = Excel.ColumnType.NUMERIC)
    private Long chrId;

    /** 父级ID */
    @Excel(name = "父级ID")
    private Long parentId;

    /** 单位编码 */
    @Excel(name = "单位编码")
    private String chrCode;

    /** 单位名称 */
    @Excel(name = "单位名称")
    private String chrName;

    /** 是否底级 */
    @Excel(name = "是否底级", readConverterExp = "Y=是,N=否")
    private String isLeaf;

    /** 节点级别 */
    @Excel(name = "节点级别")
    private String levelNo;

    /** 区划编码 */
    @Excel(name = "区划编码")
    private String mofDivCode;

    /** 区划名称 */
    @Excel(name = "区划名称")
    private String mofDivName;

    /** 状态（0正常 1停用） */
    @Excel(name = "状态", readConverterExp = "0=正常,1=停用")
    private String status;

    /** 创建者 */
    @Excel(name = "创建者")
    private String createBy;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    /** 更新者 */
    @Excel(name = "更新者")
    private String updateBy;

    /** 更新时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "更新时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    /** 备注 */
    @Excel(name = "备注")
    private String remark;

    // ======= Getters and Setters =======

    public Long getChrId() {
        return chrId;
    }

    public void setChrId(Long chrId) {
        this.chrId = chrId;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getChrCode() {
        return chrCode;
    }

    public void setChrCode(String chrCode) {
        this.chrCode = chrCode;
    }

    public String getChrName() {
        return chrName;
    }

    public void setChrName(String chrName) {
        this.chrName = chrName;
    }

    public String getIsLeaf() {
        return isLeaf;
    }

    public void setIsLeaf(String isLeaf) {
        this.isLeaf = isLeaf;
    }

    public String getLevelNo() {
        return levelNo;
    }

    public void setLevelNo(String levelNo) {
        this.levelNo = levelNo;
    }

    public String getMofDivCode() {
        return mofDivCode;
    }

    public void setMofDivCode(String mofDivCode) {
        this.mofDivCode = mofDivCode;
    }

    public String getMofDivName() {
        return mofDivName;
    }

    public void setMofDivName(String mofDivName) {
        this.mofDivName = mofDivName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }


}