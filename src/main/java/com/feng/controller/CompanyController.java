package com.feng.controller;

import com.feng.bean.Company;
import com.feng.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @RequestMapping("/company/{userId}")
    public Company getCompanyById(@PathVariable Integer userId){
        Company companyById = companyService.getCompanyById(userId);
        return companyById;
    }
}
