package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class CompanyAndEmployeeFacade {

    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private CompanyDao companyDao;

    private static Logger LOGGER = LoggerFactory.getLogger(CompanyAndEmployeeFacade.class);


    public List<Company> findCompanyByGivenFragment(String fragmentOfCompanyName) {
        LOGGER.info("Start finding company by fragment of the name...");
        List<Company> result = companyDao.findCompanyByFragment(fragmentOfCompanyName);
        LOGGER.info("System found " + result.size() + " with given fragment of companies name : ");
        return result;
    }

    public List<Employee> findEmployeeByGivenFragment( String fragmentOfEmployeeFirstname) {
        LOGGER.info("Start finding employees by given fragment of firstname");
        List<Employee> result = employeeDao.findEmployeeByFragment(fragmentOfEmployeeFirstname);
        LOGGER.info("System found " + result.size() + " employees with given fragment of firstname:");
        return result;
    }
}

