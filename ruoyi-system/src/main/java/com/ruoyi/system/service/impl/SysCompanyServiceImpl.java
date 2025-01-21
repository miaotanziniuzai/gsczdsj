package com.ruoyi.system.service.impl;

import com.ruoyi.system.domain.SysCompany;
import com.ruoyi.system.mapper.SysCompanyMapper;
import com.ruoyi.system.service.ISysCompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysCompanyServiceImpl implements ISysCompanyService {
    @Autowired
    private SysCompanyMapper companyMapper;

    @Override
    public List<SysCompany> selectCompanyList(SysCompany company) {
        return companyMapper.selectCompanyList(company);
    }

    @Override
    public SysCompany selectCompanyById(Long companyId) {
        return companyMapper.selectCompanyById(companyId);
    }

    @Override
    public int insertCompany(SysCompany company) {
        return companyMapper.insertCompany(company);
    }

    @Override
    public int updateCompany(SysCompany company) {
        return companyMapper.updateCompany(company);
    }

    @Override
    public int deleteCompanyById(Long companyId) {
        return companyMapper.deleteCompanyById(companyId);
    }

    @Override
    public int deleteCompanyByIds(Long[] companyIds) {
        return companyMapper.deleteCompanyByIds(companyIds);
    }
}