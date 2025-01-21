package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.SysCompany;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysCompanyMapper {
    /**
     * 查询单位列表
     */
    List<SysCompany> selectCompanyList(SysCompany company);

    /**
     * 通过ID查询单位
     */
    SysCompany selectCompanyById(Long companyId);

    /**
     * 新增单位
     */
    int insertCompany(SysCompany company);

    /**
     * 修改单位
     */
    int updateCompany(SysCompany company);

    /**
     * 删除单位
     */
    int deleteCompanyById(Long companyId);

    /**
     * 批量删除单位
     */
    int deleteCompanyByIds(Long[] companyIds);
}