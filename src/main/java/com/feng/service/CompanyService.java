package com.feng.service;

import com.feng.bean.Company;
import com.feng.dao.CompanyMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CompanyService {

    @Resource
    private CompanyMapper companyMapper;

    public Company getCompanyById(Integer userId){
        Company company = new Company();
        company.setId(Long.valueOf(String.valueOf(userId)));
        return companyMapper.selectOne(company);
    }
}
