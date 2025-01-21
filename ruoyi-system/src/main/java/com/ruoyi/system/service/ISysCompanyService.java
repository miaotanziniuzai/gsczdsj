package com.ruoyi.system.service;

import com.ruoyi.system.domain.SysCompany;

import java.util.List;

public interface ISysCompanyService {
    List<SysCompany> selectCompanyList(SysCompany company);

    SysCompany selectCompanyById(Long companyId);

    int insertCompany(SysCompany company);

    int updateCompany(SysCompany company);

    int deleteCompanyById(Long companyId);

    int deleteCompanyByIds(Long[] companyIds);
}