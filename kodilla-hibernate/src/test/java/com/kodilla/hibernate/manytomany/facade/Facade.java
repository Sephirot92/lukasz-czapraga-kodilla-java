package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public final class Facade {
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

//    public List<Company> getCompanyByPartialName(String partialName) throws NotFoundException {
//        List<Company> companyMatchingList = companyDao.findCompanyByPartName(partialName);
//        if (companyMatchingList.size() <= 0) {
//            throw new NotFoundException
//        } else {
//            return companyMatchingList;
//        }
//    }


}

