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


    public void findByFragmentProcessor(String fragmentOfCompanyName,String fragmentOfEmployeeFirstname) throws CompanyAndEmployeeException {
        LOGGER.info("Start finding company by fragment of the name...");
        List<Company> companies = companyDao.findCompanyByFragment(fragmentOfCompanyName);
        if (companies.size() == 0) {
            LOGGER.error(CompanyAndEmployeeException.CANNOT_FIND_COMPANY_ERR);
            throw new CompanyAndEmployeeException(CompanyAndEmployeeException.CANNOT_FIND_COMPANY_ERR);
        }
        LOGGER.info("System found " + companies.size() + " with given fragment of companies name");

        LOGGER.info("Start finding employees by given fragment of firstname");
        List<Employee> employees = employeeDao.findEmployeeByFragment(fragmentOfEmployeeFirstname);
        if (employees.size() == 0) {
            LOGGER.error(CompanyAndEmployeeException.CANNOT_FIND_EMPLOYEE_ERR);
            throw new CompanyAndEmployeeException(CompanyAndEmployeeException.CANNOT_FIND_EMPLOYEE_ERR);
        }
        LOGGER.info("System found " + employees.size() + " employees with given fragment of firstname");
    }
}

