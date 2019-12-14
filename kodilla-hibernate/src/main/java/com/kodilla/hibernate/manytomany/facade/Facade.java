package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public final class Facade {
    private static final Logger LOGGER = LoggerFactory.getLogger(FacadeException.class);
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    public List<Company> getCompanyByPartialName(String partialName) throws FacadeException {
        List<Company> companyMatchingList = companyDao.findCompanyByPartName(partialName);
        boolean wasError = false;
        LOGGER.info("Searching for a company by it's partial name.");
        if (companyMatchingList.size() <= 0) {
            LOGGER.error(FacadeException.ERR_COMPANY_NOT_FOUND);
            wasError = true;
            if (wasError)
                LOGGER.info("Errors occured during process.");
            throw new FacadeException(FacadeException.ERR_COMPANY_NOT_FOUND);
        } else {
            return companyMatchingList;
        }
    }

    public List<Employee> findEmployeeByPartialLastname(String partialSurname) throws FacadeException {
        List<Employee> employeesMatchingList = employeeDao.findEmployeeByPartialLastname(partialSurname);
        boolean wasError = false;
        LOGGER.info("Searching for a employee by it's partial surname");
        if (employeesMatchingList.size() <= 0) {
            LOGGER.error(FacadeException.ERR_EMPL_NOT_FOUND);
            if (wasError)
                LOGGER.info("Errors occured during searching for an employee process.");
            throw new FacadeException(FacadeException.ERR_EMPL_NOT_FOUND);
        } else {
            return employeesMatchingList;
        }
    }
}
